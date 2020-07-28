package br.com.lucca.patient.infrastructure.repository

import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<PersonEntity, String>