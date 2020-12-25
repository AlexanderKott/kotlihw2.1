import java.math.BigDecimal

//Задача №1 - Денежные переводы

val amount = BigDecimal(100.00)  //Сумма для перевода
val percent = BigDecimal(0.75)    //Процент за перевод
val minPercent = BigDecimal(35.00)  //Минимальная сумма

var resultSum: BigDecimal = BigDecimal.ZERO  //Вывод суммы

fun main() {

    val res: BigDecimal = amount.multiply(percent).divide(BigDecimal(100))
    resultSum = if (amount.toInt() > minPercent.toInt()) res + amount else minPercent

    println("Перевод составит $resultSum рублей")

}