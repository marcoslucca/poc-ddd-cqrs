package br.com.lucca.patient.infrastructure.repository

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.hibernate.envers.Audited
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Audited
@Table(name = "person")
data class PersonEntity(
        @Id
        @Column(updatable = false, nullable = false, unique = true)
        val id: String,

        @Column(nullable = false)
        val name: String,

        @Column(nullable = false)
        val age: Int,

        @CreationTimestamp
        @Column(updatable = false, nullable = false)
        var createdAt: LocalDateTime? = null,

        @UpdateTimestamp
        var updatedAt: LocalDateTime? = null
)