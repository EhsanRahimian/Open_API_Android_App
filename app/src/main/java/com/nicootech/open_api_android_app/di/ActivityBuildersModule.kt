package com.nicootech.open_api_android_app.di

import com.nicootech.open_api_android_app.di.auth.AuthFragmentBuildersModule
import com.nicootech.open_api_android_app.di.auth.AuthModule
import com.nicootech.open_api_android_app.di.auth.AuthScope
import com.nicootech.open_api_android_app.di.auth.AuthViewModelModule
import com.nicootech.open_api_android_app.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}
