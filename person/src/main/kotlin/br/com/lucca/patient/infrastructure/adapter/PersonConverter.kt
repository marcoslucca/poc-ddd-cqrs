package br.com.lucca.patient.infrastructure.adapter

import br.com.lucca.crosscutting.domain.PlatformId
import br.com.lucca.patient.domain.Person
import br.com.lucca.patient.infrastructure.repository.PersonEntity
import org.springframework.stereotype.Component

@Component
class PersonConverter {

    fun entityToDomain(entity: PersonEntity) =
            Person(PlatformId.fromString(entity.id), entity.name, entity.age)

    fun domainToEntity(person: Person) =
            PersonEntity(person.id.toString(), person.name, person.age)
}