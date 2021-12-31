package com.nicootech.open_api_android_app.ui.auth

import androidx.lifecycle.ViewModel
import com.nicootech.open_api_android_app.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
): ViewModel()
{

}