package de.javaakademie.streamup.ws;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.event.Observes;
import javax.json.Json;
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.log4j.Logger;

import de.javaakademie.streamup.Chunk;

/**
 * StreamingEndpoint.
 *
 * @author Guido.Oelmann
 */
@ServerEndpoint(value = "/stream", encoders = { MessageEncoder.class }, decoders = { MessageDecoder.class })
public class StreamingEndpoint {

	private static final Logger log = Logger.getLogger(StreamingEndpoint.class);

	private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());

	@OnOpen
	public void onOpen(Session session) {
		sessions.add(session);

		Message message = new Message(Json.createObjectBuilder().add("type", "text").add("data", "User has connected").build());

		for (Session s : sessions) {
			try {
				s.getBasicRemote().sendObject(message);
			} catch (IOException | EncodeException ex) {
				ex.printStackTrace();
			}
		}
		log.debug(session.getId() + " has connected");
	}

	@OnMessage
	public void onMessage(Message message, Session session) {
		for (Session s : sessions) {
			try {
				s.getBasicRemote().sendObject(message);
			} catch (IOException | EncodeException ex) {
				ex.printStackTrace();
			}
		}
	}

	@OnClose
	public void onClose(Session session) {
		sessions.remove(session);

		Message message = new Message(Json.createObjectBuilder().add("type", "text").add("data", "User has disconnected").build());

		for (Session s : sessions) {
			try {
				s.getBasicRemote().sendObject(message);
			} catch (IOException | EncodeException ex) {
				ex.printStackTrace();
			}
		}
		log.debug("User disconnected");
	}

	@OnError
	public void onError(Session session, Throwable t) {
		log.error(t.getMessage());
	}

	public void onChunk(@Observes @Chunk ByteBuffer buffer) {
		for (Session session : sessions) {
			try {
				session.getBasicRemote().sendBinary(buffer);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
