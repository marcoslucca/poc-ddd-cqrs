package br.com.lucca.registration.view.resource

import br.com.lucca.crosscutting.logs.LogWrapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/limit-management")
class PersonController(
) {
    private val logger = LogWrapper(PersonController::class.java.toString())

//    @PostMapping
//    fun register(@Valid @RequestBody request: PersonRequest): ResponseEntity<Response> {
//        logger.info("starting register person $request")
//
//        return registerPersonHandler.handle(RegisterPerson(request.asMap()))
//                .fold(
//                        { ResponseEntity.badRequest().body(LimitResponse(notifications = it)) },
//                        { ResponseEntity.ok(LimitResponse(id = it.id.toString())) }
//                )
//    }

}