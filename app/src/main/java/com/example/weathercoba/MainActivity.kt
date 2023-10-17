package com.example.weathercoba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weathercoba.ui.theme.WeatherCobaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherCobaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Alif Nur Rachman", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        BoxHeader()
        Spacer(modifier = Modifier.padding(15.dp))
        Lokasi()
        Spacer(modifier = Modifier.padding(20.dp))
        DataUV()
    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.bg),
                contentDescription ="",
                modifier = Modifier.size(150.dp))
            Text(text = "Rain", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Lokasi(){
    Text(text = "19 C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
        )
    Row {
        Image(painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(40.dp)
            )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp)
    }
    Text(text = "Kasihan, Kabupaten Bantul Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray

        )
}

@Composable
fun DataUV(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()

        )
        {
            Spacer(modifier = Modifier.padding(30.dp))
            Row {
                Text(text = "Humidity")
                Spacer(modifier = Modifier.padding(80.dp,0.dp))
                Text(text = "UV Index")
            }
            Row {
                Spacer(modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp))
                Text(text = "98%", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.padding(90.dp,0.dp))
                Text(text = "9 / 10", fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row {
                Text(text = "Sunrise")
                Spacer(modifier = Modifier.padding(90.dp,0.dp))
                Text(text = "Sunset")
            }
            Row {
                Text(text = "05.00 AM", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.padding(80.dp,0.dp))
                Text(text = "05.40 PM", fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.padding(30.dp))
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherCobaTheme {
        Home()
    }
}