package br.com.lucca.crosscutting.domain

import java.util.UUID

data class PlatformId(val prefix: String, val value: UUID) {

    override fun toString() = "$prefix$DELIMITER${value.toString().toUpperCase()}"

    companion object {
        private const val DELIMITER = "-"

        fun generate(prefix: String) =
                PlatformId(prefix, UUID.randomUUID())

        fun fromString(id: String) =
                PlatformId(id.substringBefore(DELIMITER), UUID.fromString(id.substringAfter(DELIMITER)))
    }
}
