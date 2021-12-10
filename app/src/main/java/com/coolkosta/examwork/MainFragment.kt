package com.coolkosta.examwork

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {
    lateinit var zodiacRecyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)

        zodiacRecyclerView = view.findViewById(R.id.zodiac_recycler_view)

        val zodiacList: List<Zodiac> = listOf(
            Zodiac("Aries", R.drawable.aries),
            Zodiac("Taurus", R.drawable.taurus),
            Zodiac("Gemini", R.drawable.gemini),
            Zodiac("Cancer", R.drawable.cancer),
            Zodiac("Leo", R.drawable.leo),
            Zodiac("Virgo", R.drawable.virgo),
            Zodiac("Libra", R.drawable.libra),
            Zodiac("Scorpio", R.drawable.scorpio),
            Zodiac("Sagittarius", R.drawable.sagittarius),
            Zodiac("Capricorn", R.drawable.capricorn),
            Zodiac("Aquarius", R.drawable.aquarius),
            Zodiac("Pisces", R.drawable.pisces)
        )

        zodiacRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        zodiacRecyclerView.adapter = ZodiacAdapter(zodiacList)



        return view
    }


}