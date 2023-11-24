package com.educordovi.horoscapp.data

import android.util.Log
import com.educordovi.horoscapp.data.network.HoroscopeApiService
import com.educordovi.horoscapp.domain.Repository
import com.educordovi.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sing: String): PredictionModel? {
        // Peticion de retrifit aca

        runCatching { apiService.getHoroscope(sing) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("EduCordovi", "Ha ocurrido un error ${it.message}") }

        return null
    }
}