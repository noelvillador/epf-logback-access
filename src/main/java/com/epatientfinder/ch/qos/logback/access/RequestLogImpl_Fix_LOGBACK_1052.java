package com.epatientfinder.ch.qos.logback.access;

import ch.qos.logback.access.jetty.RequestLogImpl;
import org.eclipse.jetty.util.component.LifeCycle;

/**
 * Temporary fix until addressed in Logback Access.
 *
 * See https://github.com/qos-ch/logback/pull/269
 */
public class RequestLogImpl_Fix_LOGBACK_1052 extends RequestLogImpl implements LifeCycle {
}