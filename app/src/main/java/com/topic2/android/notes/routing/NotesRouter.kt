package com.topic2.android.notes.routing

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Класс, определяющий все возможные экраны в приложении.
 */
sealed class Screen {
  object Notes : Screen()
  object SaveNote : Screen()
  object Trash : Screen()
}

/**
 * Позволяет менять экран в [MainActivity]
 *
 * Также отслеживает текущий экран.
 */
object NotesRouter {
  var currentScreen: Screen by mutableStateOf(Screen.Notes)

  fun navigateTo(destination: Screen) {
    currentScreen = destination
  }
}
