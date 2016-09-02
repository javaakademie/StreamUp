package de.javaakademie.streamup.ws;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import org.apache.log4j.Logger;

/**
 * MessageEncoder.
 *
 * @author Guido.Oelmann
 */
public class MessageEncoder implements Encoder.Text<Message> {

	private static final Logger log = Logger.getLogger(MessageEncoder.class);

	@Override
	public String encode(Message message) throws EncodeException {
		return message.getJson().toString();
	}

	@Override
	public void init(EndpointConfig config) {
		log.debug("Init");
	}

	@Override
	public void destroy() {
		log.debug("destroy");
	}

}