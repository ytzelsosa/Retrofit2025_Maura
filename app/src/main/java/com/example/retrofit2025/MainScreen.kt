package com.example.retrofit2025

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

/* 
Course 
name: Retrofit2025
by Master Ivàn Azamar Palma
System Computing Engineering 
copylef
14/10/2025  at 12:43
*/
@Preview(showBackground = true)
@Composable
fun MainPreview(){
    JCRetrofitTheme{
MainView(Modifier.padding(top=24.dp))
    }
}

@Composable
fun Main(
    modifier: Modifier,
    inProgress: Boolean = false,
    onGoUsers:()->Unit,
    onClick: () -> Unit){
     var emailValue by remember() { mutableStateOf("") }
     var passwordValue by remember() { mutableStateOf("") }

    Box(modifier){
        Column(Modifier.fillMaxSize()){
            Text(stringResource(R.string.main_login_title))
        }
    }
}