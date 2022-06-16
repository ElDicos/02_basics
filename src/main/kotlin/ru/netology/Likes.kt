package ru.netology

fun main() {
    val likes = 111
    val lastNumberEleven = likes % 100
    val amountLastNumber = likes % 10

    if (likes === 0)
        println("Пока никому не понравилось")
    else if (lastNumberEleven === 11)
        println("Понрвилось $likes людям")
    else if (amountLastNumber === 1)
        println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}