package com.kurly.ft.tomatomato.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding

@ConfigurationProperties(prefix = "slack")
data class SlackConfig @ConstructorBinding constructor(
    val appId: String,
    val clientId: String,
    val clientSecret: String,
    val signingSecret: String,
    val verificationToken: String
)
