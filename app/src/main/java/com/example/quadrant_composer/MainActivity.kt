package com.example.quadrant_composer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant_composer.ui.theme.Quadrant_composerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quadrant_composerTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    QuadrantLayout(modifier = Modifier.fillMaxWidth())
                }
            }
        }
    }
}

// une case de la grille : en-tête + texte explicatif, sur un fond colore
@Composable
fun QuadrantCard(
    heading: String,
    detail: String,
    tint: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(tint)
            .padding(16.dp), // espace interieur uniforme
        contentAlignment = Alignment.Center // centre le contenu dans la case
    ) {
        Column {
            Text(
                text = heading,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = detail,
                textAlign = TextAlign.Justify
            )
        }
    }
}

// dispose les 4 cases en grille 2x2
@Composable
fun QuadrantLayout(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                heading = stringResource(R.string.quad_text_heading),
                detail = stringResource(R.string.quad_text_detail),
                tint = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                heading = stringResource(R.string.quad_image_heading),
                detail = stringResource(R.string.quad_image_detail),
                tint = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                heading = stringResource(R.string.quad_row_heading),
                detail = stringResource(R.string.quad_row_detail),
                tint = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                heading = stringResource(R.string.quad_column_heading),
                detail = stringResource(R.string.quad_column_detail),
                tint = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantLayoutPreview() {
    Quadrant_composerTheme {
        QuadrantLayout(modifier = Modifier.fillMaxWidth())
    }
}