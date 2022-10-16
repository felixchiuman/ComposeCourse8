package com.felix.composecourse8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.felix.composecourse8.data.HeroesRepository.heroes
import com.felix.composecourse8.ui.theme.ComposeCourse8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourse8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HeroesApp()
                }
            }
        }
    }
}

@Composable
fun HeroesApp() {
    Scaffold(
        topBar = { TopBar() }
    ) {
        LazyColumn(
            modifier = Modifier.background(MaterialTheme.colors.background)
        ){
            items(heroes){
                HeroCard(hero = it)
            }
        }
    }
}

@Preview
@Composable
fun HeroesAppPrev() {
    ComposeCourse8Theme {
        HeroesApp()
    }
}
