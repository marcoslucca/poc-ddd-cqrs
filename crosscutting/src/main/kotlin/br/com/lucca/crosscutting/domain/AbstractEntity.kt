package br.com.lucca.crosscutting.domain

import java.time.LocalDateTime

abstract class AbstractEntity<T> : ValidatorAware<T> {
    val createdAt: LocalDateTime? = null
    val updatedAt: LocalDateTime? = null
}
