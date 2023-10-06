package com.example.horoscapp.ui.detail

import android.gesture.Prediction

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Success(val prediction: String, val sign:String):HoroscopeDetailState()
}