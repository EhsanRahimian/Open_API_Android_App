package com.nicootech.open_api_android_app.repository.auth

import com.nicootech.open_api_android_app.api.auth.OpenApiAuthService
import com.nicootech.open_api_android_app.persistence.AccountPropertiesDao
import com.nicootech.open_api_android_app.persistence.AuthTokenDao
import com.nicootech.open_api_android_app.session.SessionManager

class AuthRepository
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)
{

}