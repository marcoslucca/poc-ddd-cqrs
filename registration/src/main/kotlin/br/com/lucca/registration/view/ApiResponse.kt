package br.com.lucca.registration.view

import br.com.lucca.crosscutting.domain.Notification

data class ApiResponse(val id: String? = null,
                       val notifications: List<Notification>? = emptyList())