package com.artemissoftware.pokedexneo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PokedexNeoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //--Timber.plant(Timber.DebugTree())
    }
}