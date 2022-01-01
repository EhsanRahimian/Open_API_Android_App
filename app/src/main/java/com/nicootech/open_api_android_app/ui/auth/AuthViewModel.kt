package com.nicootech.open_api_android_app.ui.auth

import androidx.lifecycle.ViewModel
import com.nicootech.open_api_android_app.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
): ViewModel()
{

}