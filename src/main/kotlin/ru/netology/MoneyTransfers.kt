package ru.netology

fun main() {
    val percentage = 100_00
    val commissionPercentage = 75
    val minComission = 35_00
    val amount = 10002_00
    val comissionPercentageResult = amount * commissionPercentage / percentage

    if (comissionPercentageResult < minComission)
        println("Комиссия составит минимальную фикс. ставку: $minComission коп.")
    else println("Комиссия составит 0,75% от суммы: $comissionPercentageResult коп.")
}