//Задание 1.
/*fun main() {
    println("Введите три числа:")
    val nu1 = readln().toInt()
    val nu2 = readln().toInt()
    val nu3 = readln().toInt()
    val a = arrayOf(nu1,nu2,nu3)
    println("Максимальное число: ${a.max()}")
}*/

//Задание 2.
/*fun main() {
    println("Введите три числа:")
    val nu1 = readln().toInt()
    val nu2 = readln().toInt()
    val nu3 = readln().toInt()
    val a = arrayOf(nu1, nu2, nu3)
    if (a.distinct().size == 3)
        println("Среднее число: ${a.average()}")
    else println("Ошибка")
}*/

//Задание 3.
/*fun main() {
    println("Введите числа разной четности:")
    val nu1 = readln().toInt()
    val nu2 = readln().toInt()
    if (nu1 % 2 != 0)
        println("$nu1 нечетное число")
    if (nu2 % 2 != 0)
        println("$nu2 нечетное число")
}*/

//Задание 4.
/*fun main() {
    println("Введите два числа большее и меньшее:")
    val nu1 = readln().toInt()
    val nu2 = readln().toInt()
    if (nu1 % nu2 != 0){
        println("Первое число не кратно второму" )
        println("Остаток ${nu1 % nu2}")}
    else
        println("Первое число кратно второму")
}*/

//Задание 5.
/*fun main() {
    println("Введите три стороны треугольника:")
    val nu1 = readln().toInt()
    val nu2 = readln().toInt()
    val nu3 = readln().toInt()
    if ((nu1 <= nu2 + nu3) and (nu2 <= nu1 + nu3) and (nu3 <= nu1 + nu2)){
        println("Такой треугольник может существовать")
    }
    else
        println("Такой треугольник не может существовать")
}*/

//Задание 6.
/*fun main() {
    println("Введите год:")
    val nu1 = readln().toInt()
    if (nu1 % 4 != 0){
        println("Это не високосный год")
        println("365 дней") }
    else {
        println("Это високосный год")
        println("366 дней")
    }
}*/

//Задание 7.
//а)
/*fun main() {
    println("Введите два вещественных числа:")
    val nu1 = readln().toFloat()
    val nu2 = readln().toFloat()
    val a = nu1 - nu2
    val b = nu2 - nu1
    if (a>b) {
        println("$nu1 больше $nu2")
    }
    else
        println("$nu2 больше $nu1")
}*/
//б)
/*fun main() {
    println("Введите два вещественных числа:")
    val nu1 = readln().toFloat()
    val nu2 = readln().toFloat()
    val a = nu1 - nu2
    val b = nu2 - nu1
    if (a<b) {
        println("$nu1 меньше $nu2")
    }
    else
        println("$nu2 меньше $nu1")
}*/

//Задание 8.
/*fun main() {
    println("Введите километры:")
    var nu1 = readln().toInt()
    println("Введите футы:")
    var nu2 = readln().toFloat()
    val nu2p = 0.305f
    nu1 = nu1*1000
    nu2 = nu2 * nu2p
    if (nu1 > nu2)
        println("Расстояние в футах меньше")
    else
        println("Расстояние в километрах меньше")
}*/

//Задание 9.
/*fun main() {
    println("Введите m: ")
    val m = readln().toInt()
    println("Введите n: ")
    val n = readln().toInt()
    if (m % n !=0)
        println("$m на $n нацело не делится")
    else
        println("Частное: ${m / n}")
}*/

//Задание 10.
/*fun main() {
    println("Введите b:")
    val b = readln().toInt()
    println("Введите число:")
    val nu1 = readln().toInt()
    if (b % nu1 != 0)
        println("$nu1 не является делителем $b")
    else
        println("$nu1 является делителем $b")
}*/

//Задание 11.
//а)
/*fun main() {
    println("Введите число")
    val nu1 = readln().toInt()
    if (nu1 % 2 ==0)
        println("Число является чётным")
    else
        println("Число не является чётным")

}*/
//б)
/*fun main() {
    println("Введите число")
    val nu1 = readln().toInt()
    if (nu1 % 10 ==7)
        println("Число оканчивается на 7")
    else
        println("Число не оканчивается на 7")
}
*/

//Задание 12.
//а)
/*fun main() {
    println("Введите двузначное число")
    val nu1 = readln().toInt()
    if ((nu1 % 10)>(nu1/10) )
        println("Вторая цифра больше первой")
    else
        println("Первая цифра больше второй")
}*/
//б)
/*fun main() {
    println("Введите двузначное число")
    val nu1 = readln().toInt()
    if ((nu1 % 10)==(nu1/10))
        println("Цифры одинаковы")
    else
        println("Цифры разные")
}*/

//Задание 13.
/*fun main() {
    println("Введите четырёхзначное число:")
    val q =readln().toInt()
    println("Введите число а:")
    val a1 = readln().toInt()
    val a = q / 1000
    val b = q % 1000 / 100
    val c = q % 1000 % 100 / 10
    val d = q % 1000 % 100 % 10
    if(a+b == c+d)
        println("Сумма первых двух и последних двух чисел равны")
    else
        println("Сумма первых двух и последних двух чисел не равны")
    if ((a+b+c+d) % 3 ==0 )
        println("Сумма его цифр кратна 3")
    else
        println("Сумма его цифр не кратна 3")
    if (a*b*c*d % 4 ==0 )
        println("Произведение его цифр кратно 4")
    else
        println("Произведение его цифр не кратно 4")
    if (a*b*c*d % a1 == 0)
        println("Произведение его цифр кратно $a1")
    else
        println("Произведение его цифр не кратно $a1")
}*/
