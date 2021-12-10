package com.coolkosta.examwork


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

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
            Zodiac("Aries", R.drawable.aries, "https://uznayvse.ru/goroskop/oven-all-today.html"),
            Zodiac("Taurus", R.drawable.taurus, "https://uznayvse.ru/goroskop/telec-all-today.html"),
            Zodiac("Gemini", R.drawable.gemini, "https://uznayvse.ru/goroskop/bliznecy-all-today.html"),
            Zodiac("Cancer", R.drawable.cancer, "https://uznayvse.ru/goroskop/rak-all-today.html"),
            Zodiac("Leo", R.drawable.leo, "https://uznayvse.ru/goroskop/lev-all-today.html"),
            Zodiac("Virgo", R.drawable.virgo, "https://uznayvse.ru/goroskop/deva-all-today.html"),
            Zodiac("Libra", R.drawable.libra, "https://uznayvse.ru/goroskop/vesy-all-today.html"),
            Zodiac("Scorpio", R.drawable.scorpio, "https://uznayvse.ru/goroskop/scorpion-all-today.html"),
            Zodiac("Sagittarius", R.drawable.sagittarius, "https://uznayvse.ru/goroskop/strelec-all-today.html"),
            Zodiac("Capricorn", R.drawable.capricorn, "https://uznayvse.ru/goroskop/kozerog-all-today.html"),
            Zodiac("Aquarius", R.drawable.aquarius, "https://uznayvse.ru/goroskop/vodolei-all-today.html"),
            Zodiac("Pisces", R.drawable.pisces, "https://uznayvse.ru/goroskop/ryby-all-today.html")
        )

        zodiacRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        zodiacRecyclerView.adapter = ZodiacAdapter(zodiacList)



        return view
    }


}