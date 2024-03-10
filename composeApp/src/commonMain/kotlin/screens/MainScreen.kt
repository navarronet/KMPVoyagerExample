package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

object MainScreen : Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Voyager Example") },
                )
            }
        )
        {
            Row {
                Button(onClick = { navigator.push(ProfileScreen) }) {
                    Text("Profile")
                }

                Button(onClick = { navigator.push(SettingsScreen) }) {
                    Text("Settings")
                }
            }

        }
    }
}

