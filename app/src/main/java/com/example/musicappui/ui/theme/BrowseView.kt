package com.example.musicappui.ui.theme


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun BrowseScreen() {
    val categories = listOf(
        "Pop",
        "Rock",
        "Metal",
        "EDM",
        "Hip Hop",
        "Jazz",
        "Funky",
        "Blues",
        "Classical Music"
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(16.dp)
    )
    {
        items(categories) { category ->
            CategoryItem(category)
        }
    }
}

@Composable
fun CategoryItem(category:String){
    Card(

        modifier = Modifier
            .padding(8.dp)
            .size(180.dp)
            .aspectRatio(1f),
            border = BorderStroke(3.dp, color = androidx.compose.ui.graphics.Color.DarkGray)
    ){
            Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
        Text(
            text = category,
            style = MaterialTheme.typography.bodyMedium,
            modifier=Modifier.padding(8.dp)
        )
    }
}}


