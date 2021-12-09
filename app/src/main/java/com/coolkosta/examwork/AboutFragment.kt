package com.coolkosta.examwork

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val telegramImageButton: ImageButton = view.findViewById(R.id.telegram_image_button)
        val githubImageButton: ImageButton = view.findViewById(R.id.github_image_button)

        telegramImageButton.setOnClickListener {
            val linkBrowser = Uri.parse("https://t.me/Coolkosta")
            val linkBrowserIntent = Intent(Intent.ACTION_VIEW, linkBrowser)
            startActivity(linkBrowserIntent)
        }

        githubImageButton.setOnClickListener {
            val linkBrowser = Uri.parse("https://github.com/coolkosta/My-Exam.git")
            val linkBrowserIntent = Intent(Intent.ACTION_VIEW, linkBrowser)
            startActivity(linkBrowserIntent)
        }


        return view
    }


}