package com.nicootech.open_api_android_app.di.auth

import com.nicootech.open_api_android_app.api.auth.OpenApiAuthService
import com.nicootech.open_api_android_app.persistence.AccountPropertiesDao
import com.nicootech.open_api_android_app.persistence.AuthTokenDao
import com.nicootech.open_api_android_app.repository.auth.AuthRepository
import com.nicootech.open_api_android_app.session.SessionManager
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule{

    // TEMPORARY
    @AuthScope
    @Provides
    fun provideFakeApiService(): OpenApiAuthService{
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz")
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService
    ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager
        )
    }

}
