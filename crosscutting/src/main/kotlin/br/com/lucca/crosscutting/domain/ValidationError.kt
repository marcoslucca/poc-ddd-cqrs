package br.com.lucca.crosscutting.domain

import arrow.core.Nel

sealed class ValidationError(val message: String) {

    data class DoesNotContain(val value: String) : ValidationError("Did not contain $value")

    data class MaxLength(val value: Int) : ValidationError("Exceeded length of $value")

    data class NotAnEmail(val reasons: Nel<ValidationError>) : ValidationError("Not a valid email")
}