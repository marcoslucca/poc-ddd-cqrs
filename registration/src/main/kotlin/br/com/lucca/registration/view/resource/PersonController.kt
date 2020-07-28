package br.com.lucca.registration.view.resource

import br.com.lucca.crosscutting.logs.LogWrapper
import br.com.lucca.patient.domain.command.RegisterPerson
import br.com.lucca.patient.domain.command.RegisterPersonHandler
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid
import kotlin.reflect.full.memberProperties

@RestController
@RequestMapping("/limit-management")
class PersonController(
        private val registerPersonHandler: RegisterPersonHandler
) {
    private val logger = LogWrapper(PersonController::class.java.toString())

    @PostMapping
    fun register(@Valid @RequestBody request: PersonRequest): ResponseEntity<Response> {
        logger.info("starting register person $request")

        return registerPersonHandler.handle(RegisterPerson(request.asMap()))
                .fold(
                        { ResponseEntity.badRequest().body(LimitResponse(notifications = it)) },
                        { ResponseEntity.ok(LimitResponse(id = it.id.toString())) }
                )
    }

}

inline fun <reified T : Any> T.asMapNotNull() : Map<String, Any> {
    asMap()
}

inline fun <reified T : Any> T.asMap() : Map<String, Any?> {
    val props = T::class.memberProperties.associateBy { it.name }
    val associateWith: Map<String, Any?> = props.keys.associateWith { props[it]?.get(this) }

    associateWith
            .

    return associateWith
}