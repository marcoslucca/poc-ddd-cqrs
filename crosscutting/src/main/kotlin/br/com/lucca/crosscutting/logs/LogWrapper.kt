package br.com.lucca.crosscutting.logs

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class LogWrapper(clazz: String) {

    private val logger: Logger = LoggerFactory.getLogger(clazz)

    fun info(message: String, throwable: Throwable? = null) = logger.info(message, throwable)

    fun debug(message: String, throwable: Throwable? = null) = logger.debug(message, throwable)

    fun trace(message: String, throwable: Throwable? = null) = logger.trace(message, throwable)

    fun error(message: String, throwable: Throwable? = null) = logger.error(message, throwable)
}
