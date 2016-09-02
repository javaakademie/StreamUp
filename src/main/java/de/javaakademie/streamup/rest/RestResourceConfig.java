package de.javaakademie.streamup.rest;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * RestResourceConfig.
 *
 * @author Guido.Oelmann
 */
@ApplicationPath("/rest")
public class RestResourceConfig extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		return Collections.emptySet();
	}
}
