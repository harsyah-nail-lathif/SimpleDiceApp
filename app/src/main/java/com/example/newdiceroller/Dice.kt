package com.example.newdiceroller

class Dice(val number: Int) {

    fun roll(): Int{
        return (1..number).random()
    }
}