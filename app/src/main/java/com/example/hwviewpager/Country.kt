package com.example.hwviewpager

class Country(
    val name: String,
    val capital: String,
    val population: Int,
    val area: Int,
    val populationDensity: Double = population.toDouble() / area
)