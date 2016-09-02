package de.javaakademie.streamup.ws;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import org.apache.log4j.Logger;

/**
 * MessageDecoder.
 *
 * @author Guido.Oelmann
 */
public class MessageDecoder implements Decoder.Text<Message> {

	private static final Logger log = Logger.getLogger(MessageDecoder.class);

	@Override
	public Message decode(String string) throws DecodeException {
		JsonObject json = Json.createReader(new StringReader(string)).readObject();
		return new Message(json);
	}

	@Override
	public boolean willDecode(String string) {
		try {
			Json.createReader(new StringReader(string)).read();
			return true;
		} catch (JsonException e) {
			log.debug(e.getMessage());
			return false;
		}
	}

	@Override
	public void init(EndpointConfig config) {
		log.debug("init");
	}

	@Override
	public void destroy() {
		log.debug("destroy");
	}

}
