package com.educordovi.horoscapp.data.providers

import com.educordovi.horoscapp.domain.model.HoroscopeInfo
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Aries
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Leo
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Libra
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.educordovi.horoscapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}