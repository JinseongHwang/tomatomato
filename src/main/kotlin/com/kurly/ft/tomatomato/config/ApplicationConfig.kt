package com.kurly.ft.tomatomato.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(SlackConfig::class)
class ApplicationConfig