package br.com.lucca.patient.infrastructure.adapter

import arrow.core.Option
import br.com.lucca.crosscutting.extension.toOption
import br.com.lucca.patient.domain.Person
import br.com.lucca.patient.domain.adapter.PersonAdapter
import br.com.lucca.patient.infrastructure.repository.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonAdapterImpl(
        private val repository: PersonRepository,
        private val converter: PersonConverter
) : PersonAdapter {

    override fun save(person: Person) =
            Option.just(repository.saveAndFlush(converter.domainToEntity(person)))
                    .map { converter.entityToDomain(it) }

    override fun findById(personId: String) =
            repository.findById(personId).toOption().map { converter.entityToDomain(it) }
}