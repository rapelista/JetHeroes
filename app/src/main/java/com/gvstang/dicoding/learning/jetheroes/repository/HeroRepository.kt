package com.gvstang.dicoding.learning.jetheroes.repository

import com.gvstang.dicoding.learning.jetheroes.ui.model.Hero
import com.gvstang.dicoding.learning.jetheroes.ui.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}