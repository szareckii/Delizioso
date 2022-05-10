package com.zareckii.delizioso.ui.screens.login.models

sealed class LoginEvent {
    object ActionClicked : LoginEvent()
    data class EmailChanged(val value: String) : LoginEvent()

}
