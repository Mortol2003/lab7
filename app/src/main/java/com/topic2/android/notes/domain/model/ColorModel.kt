package com.topic2.android.notes.domain.model

import com.topic2.android.notes.data.database.model.ColorDbModel

/**
 * Класс модели для одного цвета
 */
data class ColorModel(
  val id: Long,
  val name: String,
  val hex: String
) {

  companion object {

    val DEFAULT = with(ColorDbModel.DEFAULT_COLOR) { ColorModel(id, name, hex) }
  }
}
