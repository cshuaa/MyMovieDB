package com.example.mymoviedb.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.mymoviedb.model.Movie
import com.example.mymoviedb.utils.Constants

@Composable
fun MovieDetailScreen(movie: Movie,
                      modifier: Modifier = Modifier) {
    Column {
        Box {
            AsyncImage(
                model = Constants.BACKDROP_IMAGE_BASE_URL + Constants.BACKDROP_IMAGE_BASE_WIDTH + movie.backdropPath,
                contentDescription = movie.title,
                modifier = Modifier,
                contentScale = ContentScale.Crop
            )
        }

        Text(
            text = movie.title,
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.size(8.dp))

        Text(
            text = movie.releaseDate,
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.size(8.dp))

        Text(
            text = movie.overview,
            style = MaterialTheme.typography.bodySmall,
            overflow = TextOverflow.Ellipsis

        )
        Spacer(modifier = Modifier.size(8.dp))

    }
}