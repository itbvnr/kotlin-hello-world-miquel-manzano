package ExercicisCompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*


data class Message(val text: String)
@Composable
fun AlertDialog() {

    Column {
        var text by remember { mutableStateOf("") }
        TextField(text,
            label = { Text("write here") },
            onValueChange = {
                text = it
            })
        var showDialog by remember { mutableStateOf(false) }
        if(showDialog)
            AlertDialog(
                onDismissRequest={showDialog = false},
                confirmButton={},
                text = {Text("Dialog contents")}
            )
    }
}