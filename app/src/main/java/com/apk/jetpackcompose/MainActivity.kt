package com.apk.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apk.jetpackcompose.ui.theme.JetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ){
                        ImageCard(painter = painterResource(id = R.drawable.card), contentDescription = "my card", title = "This is my picture")
                    }

                }
            }
        }
    }
}
@Composable
fun ImageCard(painter: Painter, contentDescription:String,title:String){
    Card(
        modifier =Modifier.wrapContentWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(20.dp),
    ) {
        Box(
            modifier = Modifier.height(200.dp),

        ) {
            Image(painter = painter, contentDescription = contentDescription)
            Box (
                modifier = Modifier
                    .matchParentSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart

            ){
                Text(text = title,
                    color = Color.Red,
                    fontSize = 21.sp,
                    fontWeight = FontWeight(76)


                    )
            }
        }
    }
}
@Preview
@Composable
fun ImageCardPreview(){
    ImageCard(painter = painterResource(id = R.drawable.card), contentDescription = "my card", title = "This is an aerial photograph")
}
