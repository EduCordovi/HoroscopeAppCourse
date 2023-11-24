package com.educordovi.horoscapp.domain

import com.educordovi.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing: String): PredictionModel?
}