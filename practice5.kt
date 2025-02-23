
//Задание 1
//fun main() {
//    for (i in 1..10) {
//        print(i)
//        println()
//    }
//}

//Задание 2
//fun main() {
//    for (i in 1..20) {
//        if (i % 2 == 0) {
//            println(i)
//        }
//    }
//}

//Задание 3
//fun main() {
//    println("Введите число N:")
//    val n = readLine()?.toIntOrNull() ?: return
//    val sum = (1..n).sum()
//    println("Сумма чисел от 1 до $n: $sum")
//}

//Задание 4
//fun main() {
//    println("Введите число для вычисления факториала:")
//    val number = readLine()?.toIntOrNull() ?: return
//    var f = 1
//    for (i in 1..number) {
//        f *= i
//    }
//    println("Факториал = $f")
//}

//Задание 5
//fun main() {
//    println("Введите число для проверки на простоту:")
//    val nu = readLine()?.toIntOrNull() ?: return
//    val isPrime = (2 until nu).none { nu % it == 0 }
//    println(if (isPrime) "$nu - простое число"
//    else "$nu - не простое число")
//}

//Задание 6
//fun main() {
//    for (i in 1..10) {
//        for (j in 1..10) {
//            print("${i * j}\t")
//        }
//        println()
//    }
//}

//Задание 7
//fun main() {
//    println("Введите количество чисел Фибоначчи для генерации:")
//    val fibCount = readLine()?.toIntOrNull() ?: return
//    var a = 0
//    var b = 1
//    for (i in 1..fibCount) {
//        println(a)
//        val next = a + b
//        a = b
//        b = next
//    }
//}

//Задание 8
//fun main(){
//    println("Введите два числа:")
//    var a = readln().toInt()
//    var b = readln().toInt()
//    while ((a != 0) and  (b != 0)) {
//        if (a > b) {
//            a = a % b
//        } else {
//            b = b % a
//        }
//    }
//    println("Наибольший общий делитель: ${a+b}")
//}

//Задание 9
//fun main() {
//    println("Введите строку для вывода в обратном порядке:")
//    val a = readLine() ?: return
//    println(a.reversed())
//}

//Задание 10
//fun main() {
//    println("Введите число")
//    println("Сумма его цифр ${readLine()!!.map { it.toString().toInt() }.sum()}")
//}

//Задание 11
//fun main() {
//    println("Введите первую строку:")
//    val s1 = readLine() ?: return
//    println("Введите вторую строку:")
//    val s2 = readLine() ?: return
//    val ana = s1.toCharArray().sorted() == s2.toCharArray().sorted()
//    println(if (ana) "Строки являются анаграммами" else "Строки не являются анаграммами")
//}

//Задание 12
//fun main() {
//    println("Введите начальное число:")
//    val startNum = readLine()?.toIntOrNull() ?: return
//    println("Введите шаг:")
//    val step = readLine()?.toIntOrNull() ?: return
//    for (i in startNum..startNum + step * step step step) {
//        print("$i ")
//    }
//    println()
//}

//Задание 13
//fun main(){
//    for (i in 1..20){
//        if (i>=10){
//            println("-------------")
//        }
//        else {
//            println("----------")
//        }
//        println("|$i^$i = ${i * i}|")
//        if (i>=10) {
//            println("-------------")
//        }
//        else {
//            println("----------")
//        }
//    }
//}

//Задание 14
//import kotlin.random.Random
//fun main () {
//        for (i in 1..10){
//            val a = Random.nextInt(0,100)
//            println(a)
//    }
//}

//Задание 15
//fun main (){
//    println("Введите строку для проверки на палиндром:")
//    val s = readln().lowercase()
//    if (s== s.reversed()){
//        println("Слово является палиндромом")
//    }
//    else {
//        println("Слово не является палиндромом")
//    }
//}

//Задание 16
//fun main (){
//    println("Введите число: ")
//    var abc = readln().toInt()
//    var sum = 0
//    for (i in 1..abc){
//        sum +=i*i
//    }
//    println(sum)
//}

//Задание 17
//fun main(){
//    println("Введите строку: ")
//    val v = readLine() ?: return
//    for (char in v)
//        print("$char,")
//}

//Задание 18
//fun main() {
//    println("Введите кол-во ступеней: ")
//    val height = readLine()?.toInt() ?: return
//    for (i in 1..height) {
//        println("#".repeat(i))
//    }
//}

//Задание 19
//fun main (){
//    val a = mutableListOf(45, 67, 89, 12, 46, 78, 11, 99)
//    for (i in a.indices) {
//        for (j in i + 1 until a.size) {
//            if (a[i] > a[j]) {
//                val temp = a[i]
//                a[i] = a[j]
//                a[j] = temp
//            }
//        }
//    }
//    println("$a")
//}

//Задание 20
//fun main(){
//    println("Введите диапазон для поиска простых чисел:")
//    val startRange = readLine()?.toInt() ?: return
//    val endRange = readLine()?.toInt() ?: return
//    for (num in startRange..endRange) {
//        if (num > 1 && (2 until num).none { num % it == 0 }) {
//            print("$num ")
//        }
//    }
//}

//Задание 21
//fun main(){
//    println("Введите год и месяц для вывода всех дат в этом месяце:")
//    val year = readLine()?.toInt() ?: return
//    val month = readLine()?.toInt() ?: return
//    val days = when(month) {
//        1,3,5,7,8,10,12 -> 31
//        4,6,9,11 -> 30
//        2 -> if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 29
//        else 28
//        else -> throw IllegalArgumentException("Некорректный месяц")
//    }
//    for(day in 1..days) {
//        println("$day/$month/$year")
//    }
//}

//Задание 22
//import kotlin.random.Random
//fun main(){
//    println("Угадай число~")
//    val a = Random.nextInt(101)
//    var e = readln().toInt()
//    while (e != a){
//        when{
//            e < a -> println("Не, больше")
//            e > a -> println("Ну не, меньше")
//        }
//        e = readln().toInt()
//    }
//    println("omg yeah")
//}

//Задание 23
//fun main (){
//    var operation: String?
//    do {
//        println("Введите две цифры через пробел или 'стоп' для выхода:")
//        operation = readLine()
//        if(operation != "стоп") {
//            val parts = operation?.split(" ")?.map { it.toDouble() }
//            if(parts?.size == 2) {
//                val sum = parts[0] + parts[1]
//                val mul = parts[0] * parts[1]
//                println("Сложение: $sum, Умножение: $mul")
//            } else {
//                println("Некорректный ввод!")
//            }
//        }
//    } while (operation != "стоп")
//}

//Задание 24
//fun main(){
//    val m = arrayOf(
//        arrayOf(1,2,3),
//        arrayOf(4,5,6),
//        arrayOf(7,8,9)
//    )
//    val transposedMatrix = Array(m[0].size) { IntArray(m.size) }
//    for(i in m.indices) {
//        for(j in m[i].indices) {
//            transposedMatrix[j][i] = m[i][j]
//        }
//    }
//    println("Транспонированная матрица:")
//    for(row in transposedMatrix) {
//        println(row.joinToString(", "))
//    }
//}

//Задание 25
//fun main (){
//    for(i in 1..10) {
//        println("$i^3 = ${i * i * i}")
//    }
//}

//Задание 26
//fun main (){
//    println("Введите число, до которого будет подсчет четных и нечетных чисел:")
//    val n = readLine()?.toInt() ?: return
//    var e = 0
//    var o = 0
//    for(i in 1..n) {
//        if(i % 2 == 0) e += i
//        else o += i
//    }
//    println("Сумма четных: $e Сумма нечетных: $o")
//}

//Задание 27
//fun main(){
//    println("Введите кол-во ступеней в пирамиде:")
//    val n = readLine()?.toIntOrNull() ?: return
//    for(i in 1..n) {
//        repeat(n - i) { print(" ") }
//        repeat(i) { print("$i ") }
//        println()
//    }
//}

//Задание 28
//fun main(){
//    println("Введите количество чисел:")
//    val count = readLine()?.toIntOrNull() ?: return
//    val n = mutableListOf<Int>()
//    repeat(count) {
//        println("Введите число ${it + 1}:")
//        n.add(readLine()?.toIntOrNull() ?: return)
//    }
//    n.sort()
//    println("Отсортированные числа: $n")
//}

//Задание 29
//fun main (){
//    println("Введите число для нахождения суммы ряда:")
//    val n = readLine()?.toIntOrNull() ?: return
//    var s = (1..n).sumOf { 1.0 / it }
//    println("Сумма ряда от 1 до $n: $s")
//}

//Задание 30
//fun main (){
//    println("Введите целое число для конвертации в двоичную систему:")
//    val n = readLine()?.toIntOrNull() ?: return
//    val b = n.toString(2)
//    println("Число в двоичной системе: $n: $b")
//}