package com.educordovi.horoscapp.ui.horoscope

import com.educordovi.horoscapp.data.providers.HoroscopeProvider
import com.educordovi.horoscapp.motherobject.HoroscopeModerObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    private lateinit var viewModel:HoroscopeViewModel

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider
    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is create then horoscope are loaded`(){
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
        verify {  }

    }

}