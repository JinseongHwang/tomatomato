package com.kurly.ft.tomatomato.repository

import com.kurly.ft.tomatomato.model.entity.TomatoDocument
import org.springframework.data.mongodb.repository.MongoRepository

interface TomatoRepository : MongoRepository<TomatoDocument, String>