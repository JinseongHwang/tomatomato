package com.kurly.ft.tomatomato.controller

import com.kurly.ft.tomatomato.model.dto.SlackUrlVerificationRequest
import com.kurly.ft.tomatomato.model.dto.SlackUrlVerificationResponse
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/api/slack")
class SlackController {

    // https://api.slack.com/events/url_verification
    @PostMapping("/verify")
    fun urlVerification(
        @RequestBody body: SlackUrlVerificationRequest
    ): ResponseEntity<SlackUrlVerificationResponse> {
        logger.info { body.toString() }
        val response = SlackUrlVerificationResponse(body.challenge ?: "")
        return ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body(response)
    }
}