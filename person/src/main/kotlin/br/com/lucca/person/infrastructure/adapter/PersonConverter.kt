package br.com.lucca.person.infrastructure.adapter

import br.com.lucca.crosscutting.domain.PlatformId
import br.com.lucca.person.domain.Person
import br.com.lucca.person.infrastructure.repository.PersonEntity
import org.springframework.stereotype.Component

@Component
class PersonConverter {

    fun entityToDomain(entity: PersonEntity) =
            Person(PlatformId.fromString(entity.id), entity.name, "lastname", entity.age)

    fun domainToEntity(person: Person) =
            PersonEntity(person.id.toString(), person.name, person.age)
}