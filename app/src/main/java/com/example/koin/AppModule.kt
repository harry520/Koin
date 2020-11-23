package com.example.koin

import org.koin.core.module.Module
import org.koin.dsl.module

object AppModule {
    fun getModule(): Module = module {
        single {
            DataStore(get())
        }
    }
}