package br.com.lucca.patient.domain.command

import br.com.lucca.crosscutting.logs.LogWrapper
import br.com.lucca.patient.domain.adapter.PersonAdapter
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional(propagation = Propagation.REQUIRED)
class RegisterPersonHandler(private val adapter: PersonAdapter) {
    private val logger = LogWrapper(RegisterPersonHandler::class.java.toString())

    fun handle(command: RegisterPerson) =
            command.mapToDomain().validate()
                    .map { personCommand ->
                        logger.info("Saving a person with uuid ${personCommand.id}")
                        adapter.save(personCommand)
                                .map { personSaved ->
                                    logger.info("person ${personSaved.id} successfully saved")
                                    personSaved
                                }
                    }
}
