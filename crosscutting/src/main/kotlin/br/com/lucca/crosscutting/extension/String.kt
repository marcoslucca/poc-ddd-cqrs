package br.com.lucca.crosscutting.extension

import arrow.core.invalid
import arrow.core.nel
import arrow.core.valid
import br.com.lucca.crosscutting.domain.ValidationError

fun String.validateBlank(message: String, field: String? = null) =
        when {
            this.isBlank() -> ValidationError.DoesNotContain(message).nel().invalid()
            else -> this.valid()
        }