package br.com.lucca.person.domain.adapter

import arrow.core.Option
import br.com.lucca.person.domain.Person

interface PersonAdapter {

    fun save(person: Person): Option<Person>

    fun findById(personId: String): Option<Person>
}