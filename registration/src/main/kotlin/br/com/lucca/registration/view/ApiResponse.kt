package br.com.lucca.registration.view

data class ApiResponse(val id: String? = null,
                       val notifications: List<Notification>? = emptyList())