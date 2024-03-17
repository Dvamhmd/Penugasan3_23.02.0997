package com.example.hapgrad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hapgrad.ui.theme.HapGradTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HapGradTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UcapanSelamat(
                        pesan = "Happy Graduation Anne",
                        doa = "Semoga segala cita-citamu tercapai & mendapatkan jodoh yang baik\n"+
                        "Lupakan masa lalu dan terus melangkah\nSemangatt!!",
                        pengirim = "Dava",
                    )
                }
            }
        }
    }
}

@Composable
fun UcapanSelamat(pesan: String, doa: String, pengirim: String){
    Surface(color = Color.White) {
        Image(
            painter = painterResource(id = R.drawable.wedding_letter_7375738_1920),
            contentDescription = "",
            contentScale = ContentScale.Crop,
        )


        Column(
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "\n\n\n\n~Selamat & Sukses~",
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(30.dp)
            )

            Box (
                contentAlignment = Alignment.TopEnd
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.frame_6543266_1280),
                        contentDescription = "",
                        alpha = 0.3f
                    )
                    Column {
                        Text(
                            text = pesan,
                            color = Color.Black,
                            fontSize = 80.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.ExtraBold,
                            style = TextStyle(
                                shadow = Shadow(
                                    color = Color.Gray,
                                    offset = Offset(5.0f,10.0f),
                                    blurRadius = 5.0f
                                )
                            ),
                            lineHeight = 70.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .heightIn(min = 250.dp)
                        )
                        Text(
                            text = doa,
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            lineHeight = 28.sp,
                        )
                    }

                }
                Image(
                    painter = painterResource(id = R.drawable.aaa),
                    contentDescription = "",
                    alpha = 0.9f,
                    modifier = Modifier
                        .size(150.dp)
                )
            }


        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = "salam hangat",
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                modifier = Modifier
                    .align(alignment = Alignment.End)

            )
            Text(
                text = pengirim,
                color = Color.Black,
                fontFamily = FontFamily.Cursive,
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .height(80.dp)
            )
        }


    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HapGradTheme {
        UcapanSelamat(
            pesan = "Happy Graduation Anne",
            doa = "Semoga segala cita-citamu tercapai & mendapatkan jodoh yang baik\n"+
                    "Lupakan masa lalu dan terus melangkah\nSemangatt!!",
            pengirim = "Dava",
        )
    }
}