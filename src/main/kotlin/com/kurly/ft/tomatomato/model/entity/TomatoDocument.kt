package com.kurly.ft.tomatomato.model.entity

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tomato")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class TomatoDocument(
    @Id
    val id: String,
    var slackUserId: String,
    var receivedCount: Long,
    var givenCount: Long
)