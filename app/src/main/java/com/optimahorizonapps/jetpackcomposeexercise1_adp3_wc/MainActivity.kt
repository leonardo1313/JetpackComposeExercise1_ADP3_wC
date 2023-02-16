package com.optimahorizonapps.jetpackcomposeexercise1_adp3_wc

import android.graphics.Paint
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.optimahorizonapps.jetpackcomposeexercise1_adp3_wc.ui.theme.JetpackComposeExercise1_ADP3_wCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExercise1_ADP3_wCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TextScreen()
                }
            }
        }
    }
}

@Composable
fun TextScreen() {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth())
        Text(
            text = stringResource(R.string.title_text),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp))
        Text(
            text = stringResource(R.string.first_text),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify)
        Text(
            text = stringResource(R.string.second_text),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(16.dp),
            textAlign = TextAlign.Justify)
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeExercise1_ADP3_wCTheme {
        TextScreen()
    }
}