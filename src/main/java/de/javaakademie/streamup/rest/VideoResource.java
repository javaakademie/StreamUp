package de.javaakademie.streamup.rest;

import java.io.InputStream;
import java.nio.ByteBuffer;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.common.io.ByteStreams;

import de.javaakademie.streamup.Chunk;

/**
 * VideoResource.
 *
 * @author Guido.Oelmann
 */
@Path("/video")
public class VideoResource {

	private static final Logger log = Logger.getLogger(VideoResource.class);

	@Inject
	@Chunk
	private Event<ByteBuffer> chunkEvent;

	@POST
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postChunk(InputStream chunk) {
		try {

			byte[] bytes = ByteStreams.toByteArray(chunk);
			ByteBuffer buf = ByteBuffer.wrap(bytes);

			chunkEvent.fire(buf);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return Response.status(Response.Status.CREATED).build();
	}

}