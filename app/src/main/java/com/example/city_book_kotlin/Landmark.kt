package com.example.city_book_kotlin

import java.io.Serializable

class Landmark(val name: String, val country: String, val image: Int) : Serializable{
    override fun toString(): String {
        return name
    }
}