package com.kurly.ft.tomatomato.model.dto

data class SlackUrlVerificationRequest(
    val token: String?,
    val challenge: String?,
    val type: String?
)