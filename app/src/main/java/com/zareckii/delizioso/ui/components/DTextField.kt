package com.zareckii.delizioso.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zareckii.delizioso.ui.theme.AppTheme

@Composable
fun DTextField(
    modifier: Modifier = Modifier,
    value: String,
    placeHolder: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        modifier = modifier,
        value = value,
        placeholder = {
            Text(
                modifier = Modifier.padding(start = 9.dp),
                text = placeHolder,
                style = TextStyle(
                    color = AppTheme.colors.primaryTextColor,
                    fontSize = 12.sp
                )
            )
        },
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = AppTheme.colors.secondaryBackground,
            textColor = AppTheme.colors.primaryTextColor,
            disabledIndicatorColor = AppTheme.colors.primaryBackground,
            errorIndicatorColor = AppTheme.colors.secondaryBackground,
            focusedIndicatorColor = AppTheme.colors.secondaryBackground,
            unfocusedIndicatorColor = AppTheme.colors.secondaryBackground
        ),
        onValueChange = onValueChange
    )
}

@Composable
@Preview
fun DTextFieldPreview() {
    Surface(
        modifier = Modifier.size(200.dp),
        color = AppTheme.colors.primaryBackground,
    ) {
        DTextField(
            value = "",
            placeHolder = "First Name",
            onValueChange = {

            }
        )
    }
}