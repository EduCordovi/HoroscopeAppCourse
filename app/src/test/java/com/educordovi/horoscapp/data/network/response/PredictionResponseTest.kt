package com.educordovi.horoscapp.data.network.response

import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test

class PredictionResponseTest{
    @Test
    fun `toDomain should return a correct predictionModel`(){
        //Given
        val horoscopeResponse = PredictionResponse("date", "prediction", "taurus")

        //When
        val predictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }
}