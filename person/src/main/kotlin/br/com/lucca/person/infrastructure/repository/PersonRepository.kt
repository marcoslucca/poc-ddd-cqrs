package br.com.lucca.person.infrastructure.repository

import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<PersonEntity, String>