package ExercicisCompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HelloWorldApp() {
    Column {
        var text2 = remember { mutableStateOf("miaw") }
        var text = "Boton"
        Button(onClick = {
            text2.value = "miaw miaw miw miaw"
        }){
            Text(text   )
        }
        Text(text2.value)
    }
}