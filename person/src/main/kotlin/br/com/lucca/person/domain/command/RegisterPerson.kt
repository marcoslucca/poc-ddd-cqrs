package br.com.lucca.person.domain.command

import br.com.lucca.person.domain.Person

data class RegisterPerson(val properties: Map<String, Any>) {

    fun mapToDomain() =
            Person(
                    name = properties["name"] as String,
                    lastName = properties["lastName"] as String,
                    age = properties["age"] as Int
            )
}