package com.zareckii.delizioso.ui.screens.login.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.zareckii.delizioso.R
import com.zareckii.delizioso.ui.components.DTextField
import com.zareckii.delizioso.ui.screens.login.models.LoginViewState
import com.zareckii.delizioso.ui.theme.AppTheme

@Composable
fun SignInView(
    viewState: LoginViewState,
    onTextFieldChange: (String) -> Unit
) {
    Column {
        DTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            value = viewState.emailValue,
            placeHolder = stringResource(R.string.email_address),
            onValueChange = onTextFieldChange
        )
    }
}