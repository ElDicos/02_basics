package ru.netology

fun main() {
    val purchaseAmount = 100_000_00L
    val isMeloman = true
    val amountWithoutDiscount = 1000_00
    val amountStandartDiscount = 10_000_00
    val maxDiscountPercentage = 500
    val melomanDiscountPercentage = 100
    val persentage = 100_00
    val standartDiscount = 100_00
    val maxDiscount = purchaseAmount * maxDiscountPercentage / persentage
    var midCost = 0L

    if (purchaseAmount <= amountWithoutDiscount)
        midCost = purchaseAmount
    else if (purchaseAmount > amountWithoutDiscount && purchaseAmount <= amountStandartDiscount)
        midCost = purchaseAmount - standartDiscount
    else midCost = purchaseAmount - maxDiscount

    val melomanDiscount = midCost * melomanDiscountPercentage / persentage

    if (isMeloman) println("Итоговая стоимость: ${midCost - melomanDiscount} коп.") else
        println("Итоговая стоимость: $midCost коп.")
}