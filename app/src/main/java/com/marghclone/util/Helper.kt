package com.marghclone.util

import com.marghclone.domain.model.Quote

object Helper {

    private fun generateDummyQuoteList(vararg imageUrl: String): List<Quote> {
        val dummyList = mutableListOf<Quote>()
        for ((index, url) in imageUrl.withIndex()) {
            val expenseInfo = Quote(
                id = index + 1,
                imageUrl = url
            )
            dummyList.add(expenseInfo)
        }
        return dummyList
    }

    val dummyQuoteList: List<Quote> = generateDummyQuoteList(
        "https://i.pinimg.com/originals/c0/f4/47/c0f447d9d8a262cff0f691f0e73e45de.jpg",
        "https://i.pinimg.com/originals/cd/55/ad/cd55ada383bb924b5079eaa550b67969.jpg",
        "https://i.pinimg.com/originals/fa/39/bd/fa39bdcbe438257e0656a3e1726f9df3.jpg",
        "https://i.pinimg.com/originals/c0/f4/47/c0f447d9d8a262cff0f691f0e73e45de.jpg",
        "https://i.pinimg.com/originals/cd/55/ad/cd55ada383bb924b5079eaa550b67969.jpg",
        "https://i.pinimg.com/originals/fa/39/bd/fa39bdcbe438257e0656a3e1726f9df3.jpg",
        "https://i.pinimg.com/originals/c0/f4/47/c0f447d9d8a262cff0f691f0e73e45de.jpg",
        "https://i.pinimg.com/originals/cd/55/ad/cd55ada383bb924b5079eaa550b67969.jpg",
        "https://i.pinimg.com/originals/fa/39/bd/fa39bdcbe438257e0656a3e1726f9df3.jpg",
        "https://i.pinimg.com/originals/c0/f4/47/c0f447d9d8a262cff0f691f0e73e45de.jpg",
        "https://i.pinimg.com/originals/cd/55/ad/cd55ada383bb924b5079eaa550b67969.jpg",
        "https://i.pinimg.com/originals/fa/39/bd/fa39bdcbe438257e0656a3e1726f9df3.jpg",
    )
}