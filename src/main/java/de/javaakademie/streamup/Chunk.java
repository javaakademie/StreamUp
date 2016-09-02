package de.javaakademie.streamup;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Chunk Annotation.
 *
 * @author Guido.Oelmann
 */
@Qualifier
@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
public @interface Chunk {
}