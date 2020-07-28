package br.com.lucca.patient.domain.command

import br.com.lucca.patient.domain.Person

data class RegisterPerson(val properties: Map<String, Any>) {

    fun mapToDomain() =
            Person(
                    name = properties["name"] as String,
                    lastName = properties["lastName"] as String,
                    age = properties["age"] as Int
            )
}