package com.cogitator.androidcleanarchitecture.di.component

import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import android.content.SharedPreferences
import com.cogitator.androidcleanarchitecture.CleanAndroidApp
import com.cogitator.androidcleanarchitecture.di.module.AppModule
import com.cogitator.androidcleanarchitecture.di.module.NetModule
import com.cogitator.androidcleanarchitecture.model.network.ApiHelper
import dagger.Component
import org.xml.sax.ErrorHandler
import javax.inject.Singleton

/**
 * @author Ankit Kumar on 01/10/2018
 */

@Singleton
@Component(modules = [AppModule::class, NetModule::class])
interface ApplicationComponent {

    fun inject(app: CleanAndroidApp)

    fun app(): Application

    fun factory(): ViewModelProvider.Factory
    fun context(): Context

    fun preferences(): SharedPreferences
    fun errorHandler(): ErrorHandler
    fun apiHelper(): ApiHelper

}