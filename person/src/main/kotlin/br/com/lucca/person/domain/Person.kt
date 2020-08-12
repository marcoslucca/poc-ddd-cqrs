package br.com.lucca.person.domain

import arrow.core.Nel
import arrow.core.Validated
import arrow.core.extensions.nonemptylist.semigroup.semigroup
import arrow.core.extensions.validated.applicative.applicative
import arrow.core.fix
import br.com.lucca.crosscutting.domain.AbstractEntity
import br.com.lucca.crosscutting.domain.PlatformId
import br.com.lucca.crosscutting.domain.ValidationError
import br.com.lucca.crosscutting.extension.validateBlank

data class Person(
        val id: PlatformId? = null,
        val name: String,
        val lastName: String,
        val age: Int
) : AbstractEntity<Person>() {

    override fun validate() =
            Validated.applicative<Nel<ValidationError>>(Nel.semigroup())
                    .mapN(
                            name.validateBlank("Name can not be empty"),
                            lastName.validateBlank("Last name can not be empty")
                    ) {
                        this.copy()
                    }.fix()
}