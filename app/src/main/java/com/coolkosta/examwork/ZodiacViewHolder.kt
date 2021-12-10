package com.coolkosta.examwork

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZodiacViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val zodiacImageView: ImageView = itemView.findViewById(R.id.zodiac_image_view)
    private val zodiacNameTextView: TextView = itemView.findViewById(R.id.zodiac_name_text_view)

    fun bind(zodiac: Zodiac) {
        zodiacNameTextView.text = zodiac.zodiacName
        zodiacImageView.setImageResource(zodiac.zodiacPicture)
    }
}