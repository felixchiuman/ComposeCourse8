package com.felix.composecourse8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felix.composecourse8.ui.theme.ComposeCourse8Theme

@Composable
fun TopBar(
    modifier: Modifier = Modifier
        .fillMaxWidth()) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(56.dp),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = ("SuperHero"),
            color = MaterialTheme.colors.onSurface,
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TopBarPrev() {
    ComposeCourse8Theme {
        TopBar()
    }
}