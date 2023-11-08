package com.topic2.android.notes

import android.app.Application
import com.topic2.android.notes.dependencyinjection.DependencyInjector

/**
 * Класс приложения, отвечающий за инициализацию и выполнение зависимостей.
 */
class NotesApplication : Application() {

  lateinit var dependencyInjector: DependencyInjector

  override fun onCreate() {
    super.onCreate()
    initDependencyInjector()
  }

  private fun initDependencyInjector() {
    dependencyInjector = DependencyInjector(this)
  }
}
