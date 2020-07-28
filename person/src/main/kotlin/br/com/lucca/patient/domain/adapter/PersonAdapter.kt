package br.com.lucca.patient.domain.adapter

import arrow.core.Option
import br.com.lucca.patient.domain.Person

interface PersonAdapter {

    fun save(person: Person): Option<Person>

    fun findById(personId: String): Option<Person>
}