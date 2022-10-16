package com.felix.composecourse8

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felix.composecourse8.model.Hero
import com.felix.composecourse8.ui.theme.ComposeCourse8Theme

@Composable
fun HeroCard(hero: Hero, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(16.dp),
        elevation = 2.dp,
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HeroContent(heroName = hero.nameRes, heroDesc = hero.descriptionRes, modifier = modifier.weight(1f))
            HeroImg(heroImg = hero.imageRes)
        }
    }
}

@Composable
fun HeroContent(@StringRes heroName: Int, @StringRes heroDesc: Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = heroName),
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = stringResource(id = heroDesc),
            fontSize = 16.sp,
        )
    }
}

@Composable
fun HeroImg(@DrawableRes heroImg: Int, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(72.dp)
            .clip(RoundedCornerShape(8.dp)),
        painter = painterResource(id = heroImg),
        contentDescription = "hero image",
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.Crop
    )
}


@Preview(showBackground = true)
@Composable
fun HeroCardPreview() {
    ComposeCourse8Theme {
        HeroCard(hero = Hero(R.string.hero1, R.string.description1, R.drawable.android_superhero1))
    }
}