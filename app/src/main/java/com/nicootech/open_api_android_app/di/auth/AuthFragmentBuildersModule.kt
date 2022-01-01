package com.nicootech.open_api_android_app.di.auth

import com.nicootech.open_api_android_app.ui.auth.ForgotPasswordFragment
import com.nicootech.open_api_android_app.ui.auth.LauncherFragment
import com.nicootech.open_api_android_app.ui.auth.LoginFragment
import com.nicootech.open_api_android_app.ui.auth.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

}