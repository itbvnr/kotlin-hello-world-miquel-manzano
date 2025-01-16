package ExercicisCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.app_name
import m78exercices.composeapp.generated.resources.myImage
import m78exercices.composeapp.generated.resources.resourceKey
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun Resource() {
    Column {
        val stringValue = stringResource(Res.string.resourceKey)
        Text(stringValue)
        Image(
            painter = painterResource(Res.drawable.myImage),
            contentDescription = null
        )
    }
}