package br.com.lucca.crosscutting.domain

import arrow.core.Nel
import arrow.core.Validated

interface ValidatorAware<T> {

    fun validate(): Validated<Nel<ValidationError>, T>

    fun isValid() = validate().isValid
}
