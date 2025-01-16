package ExercicisCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import kotlinx.datetime.Month
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.myImage
import org.jetbrains.compose.resources.painterResource

@Composable
fun Contact() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(Res.drawable.myImage),
                modifier = Modifier.clip(CircleShape).size(Dp(150f)),
                contentDescription = null
            )
            Text("Maria Casserres")
            Box(Modifier.background(Color.LightGray, RoundedCornerShape(percent = 10)).padding(Dp(10f))){
                Column(modifier = Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("marta@exemple.com")
                    Text("934578484")
                }
            }
        }
    }
}