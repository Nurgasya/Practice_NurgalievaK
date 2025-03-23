//Задание 1
//fun main() {
//    val array = mutableListOf<Int>()
//    while (true) {
//        print("Введите число ")
//        val n = readLine() ?: break
//        if (n.isEmpty()) {
//            break
//        }
//        array.add(n.toInt())
//    }
//    val sum = array.sum()
//    println("Сумма элементов списка: $sum")
//}


//Задание 2
//fun main() {
//    print("Введите числа через запятую: ")
//    val list = readLine()?.split(",")?.map { it.trim().toInt() } ?: emptyList()
//    val max = list.max()
//    val min = list.min()
//    println(max-min)
//}

//Задание 3
//fun main() {
//    print("Введите числа через запятую: ")
//    val list1 = readLine()?.split(",")?.map { it.trim().toInt() } ?: emptyList()
//    print("Введите числа через запятую: ")
//    val list2 = readLine()?.split(",")?.map { it.trim().toInt() } ?: emptyList()
//    val a = list1 +list2
//    println(a)
//}

//Задание 4
//fun lyney(prob: Int, prize: Int, pay: Int): Boolean {
//    return prob * prize > pay
//}
//fun main() {
//    println("Введите prob,prize,pay(Через enter)")
//    val prob = readln().toInt()
//    val prize = readln().toInt()
//    val pay  = readln().toInt()
//    println(lyney(prob, prize, pay))
//}


//Задание 5
//fun lyney(prob: Int, prize: Int, pay: Int): Boolean {
//    return prob * prize > pay
//}
//fun main() {
//    println("Введите prob,prize,pay(Через enter)")
//    val prob = readln().toInt()
//    val prize = readln().toInt()
//    val pay  = readln().toInt()
//    println(lyney(prob, prize, pay))
//}

//Задание 6
//fun aether(a: Int, b: Int):Boolean {
//    return a+b < 100
//}
//fun main() {
//    println("Введите 2 числа через enter ")
//    val a = readln().toInt()
//    val b = readln().toInt()
//    println(aether(a,b))
//}


//Задание 7
//fun pron(a: Int):Boolean {
//    return a  % 100 == 0
//}
//fun main() {
//    println("Введите число ")
//    val a = readln().toInt()
//    println(pron(a))
//}


//Задание 8
//fun are(a: Int): Int {
//    return a * 60
//}
//fun main() {
//    println("Введите fps ")
//    val a = readln().toInt()
//    println(are(a))
//}


//Задание 9
//fun you(n: Int,k:Int): Boolean {
//    return k*k  == n
//}
//fun main() {
//    println("Введите k ")
//    val k = readln().toInt()
//    println("Введите n ")
//    val n = readln().toInt()
//    println(you(n,k))
//}


//Задание 10
//fun reading(n: Int, txt: String): Unit {
//    if (n <= 0) {
//        ""
//    } else {
//        for (i in 1..n) {
//            print(txt)
//        }
//    }
//}
//
//fun main() {
//    println("Введите текст")
//    val txt = readLine() ?: ""
//    println("Введите n")
//    val n = readLine()?.toIntOrNull() ?: 0
//    reading(n, txt)
//}


//Задание 11
//fun equation(equation: String): Int {
//    val parts = equation.replace(" ", "").split("+", "-", "*")
//    val operators = equation.replace(" ", "").filter { it == '+' || it == '-' || it == '*' }
//    var result = parts[0].toIntOrNull() ?: 0
//
//    for (i in 0 until operators.length) {
//        val nextNumber = parts[i + 1].toIntOrNull() ?: 0
//        when (operators[i]) {
//            '+' -> result += nextNumber
//            '-' -> result -= nextNumber
//            '*' -> result *= nextNumber
//        }
//    }
//    return result
//}
//
//fun main() {
//    print("Введите пример: ")
//    val equation = readLine() ?: ""
//    println("Ответ: ${equation(equation)}")
//}


//Задание 12
//fun any(number: Int): String {
//    val oCount = when {
//        number < 0 -> 0
//        else -> number
//    }
//
//    return "L" + "o".repeat(oCount) + "ser"
//}
//
//fun main() {
//    println("Введите количество букв o:")
//    val input = readLine()
//    val number = input?.toIntOrNull() ?: 0
//    val result = any(number)
//    println(result)
//}


//Задание 13
//import javax.swing.JOptionPane
//
//fun main() {
//    JOptionPane.showMessageDialog(null, "привет, мир!", "Я шипперю Рэки и Лангу", JOptionPane.INFORMATION_MESSAGE)
//}


//Задание 14
//fun of(a:Int,b:Int):Int{
//    return a+b
//}
//fun main() {
//    println("Введите 2 числа через enter")
//    val a =  readln().toInt()
//    val b = readln().toInt()
//    println(of(a,b))
//}


//Задание 15
//fun assignments(a:Int,b:Int): Int {
//    if (a<b)
//        return b
//    else
//        return a
//}
//fun main() {
//    println("Введите 2 числа через enter")
//    val a =  readln().toInt()
//    val b = readln().toInt()
//    println(assignments(a,b))
//}


//Задание 16
//fun paygorno(a:Int): Boolean {
//    return a%2==0
//}
//fun main() {
//    println("Введите  число")
//    val a = readln().toInt()
//    println(paygorno(a))
//}

//Задание 17
//fun imstupid(a:Int): Int {
//    var fuckyou  = 1
//    for(i in 2..a) {
//        fuckyou *= i
//    }
//    return fuckyou
//}
//fun main() {
//    println("Введите  число")
//    val a = readln().toInt()
//    println(imstupid(a))
//}


//Задание 18
//fun LyneyAndAetherCanon(n: Int): Boolean {
//    if (n <= 1) return false
//    if (n <= 3) return true
//    if (n % 2 == 0 || n % 3 == 0) return false
//    for (i in 5..Math.sqrt(n.toDouble()).toInt() step 6) {
//        if (n % i == 0 || n % (i + 2) == 0) return false
//    }
//
//    return true
//}
//
//fun main() {
//    println("Введите число для проверки: ")
//    val input = readLine()
//    val number = input?.toIntOrNull()
//
//    if (number != null) {
//        if (LyneyAndAetherCanon(number)) {
//            println("$number является простым числом.")
//        } else {
//            println("$number не является простым числом.")
//        }
//    } else {
//        println("Ошибка: введите корректное целое число.")
//    }
//}


//Задание 19
//fun calculateSum(numbers: IntArray): Int {
//    var sum = 0
//    for (number in numbers) {
//        sum += number
//    }
//    return sum
//}
//fun main() {
//    print("Введите количество чисел в массиве: ")
//    val count = readLine()?.toIntOrNull() ?: 0
//    if (count <= 0) {
//        println("Некорректное количество чисел")
//        return
//    }
//    val numbers = IntArray(count)
//    for (i in 0 until count) {
//        print("Введите число ${i + 1}: ")
//        val input = readLine()?.toIntOrNull()
//        numbers[i] = input ?: 0
//    }
//    val totalSum = calculateSum(numbers)
//    println("Сумма чисел в массиве: $totalSum")
//}

//Задание 20
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    println("Максимальное число в массиве ${n.max()}")
//}

//Задание 21
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num.toInt())
//    }
//    for (i in n.indices) {
//        for (j in i + 1 until n.size) {
//            if (n[i] > n[j]) {
//                val temp = n[i]
//                n[i] = n[j]
//                n[j] = temp
//            }
//        }
//    }
//    println("$n")
//}

//Задание 22
//fun main (){
//    println("Введите строку для проверки на палиндром:")
//    val s = readln().lowercase()
//    if (s== s.reversed()){
//        println("Строка является палиндромом")
//    }
//    else {
//        println("Строка не является палиндромом")
//    }
//}

//Задание 23
//fun axxx(input: String): Int {
//    return input.length
//}
//fun main() {
//    println("Введите строку:")
//    val input = readLine() ?: ""
//    val a = axxx(input)
//    println("Количество символов в строке: $a")
//}


//Задание 24
//import java.util.*
//
//fun aye(a: String): String {
//    return a.uppercase(Locale.getDefault())
//}
//fun main() {
//    println("Введите строку:")
//    val a = readLine() ?: ""
//    println(aye(a))
//}


//Задание 25
//fun aaa(a: String,b:String): String {
//    return a + b
//}
//fun main() {
//    println("Введите строку:")
//    val a = readLine() ?: ""
//    println("Введите строку")
//    val b = readLine() ?: ""
//    println(aaa(a,b))
//}


//Задание 26
//import kotlin.random.Random
//
//fun ababa(a:Array<Int>): Int {
//    val size = a.size
//    return a[size-1]
//}
//fun main() {
//    val a = Array(10){
//        Random.nextInt(1,101)
//    }
//    println("Последний элемент массива: ${a.joinToString(", ")}")
//    print("= ")
//    println(ababa(a))
//}


//Задание 27
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 10)
//        n.add(num1)
//    }
//    println("Какой элемент вы хотите найти?")
//    val seach  = readln().toInt()
//    fun seaching(n: MutableList<Int> ,seach: Int):Boolean{
//        for (i in n.indices){
//            if (n[i]==seach) {
//                return true
//            }
//        }
//        return false
//    }
//    val found =  seaching(n,seach)
//    if (found){
//        println("Элемент найден")
//    }
//    else{
//        println("Элемент не найден")
//    }
//}

//Задание 28
//fun zaeblo(size:Int): MutableList<Int> {
//    val n = mutableListOf<Int>()
//    for (i in 1..size) {
//        val num1 = i
//        n.add(num1)
//    }
//    return n
//}
//fun main() {
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println(zaeblo(size))
//
//}


//Задание 29
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    println("Максимальное число в массиве ${n.max()}")
//    println("Минимальное число в массиве ${n.min()}")
//}


//Задание 30
//fun yxtu(n:Int ): Int {
//    var a  = 0
//    for (i in 1..n){
//        a  +=  i
//    }
//    return a
//}
//fun main() {
//    println("Введите число ")
//    val n =readln().toInt()
//    println(yxtu(n))
//}


//Задание 31
//fun mda(n:Double ): Double {
//    return (n*9/5)+32
//}
//fun main() {
//    println("Введите градус цельсия ")
//    val n =readln().toDouble()
//    println(mda(n))
//}


//Задание 32
//fun main() {
//    println("Введите строку для вывода в обратном порядке:")
//    val a = readLine() ?: return
//    println(a.reversed())
//}

//Задание 33
//fun main() {
//    val n = mutableListOf(1,3,5,7,2,100,13,55,78)
//    println("Введите элемент который хотите найти")
//    val seach = readln().toInt()
//    val index = n.indexOf(seach)
//    if (index != -1){
//        println("Элемент найден: $index")
//    }
//    else{
//        println("Элемент не найден...")
//    }
//
//}

//Задание 34
//fun oxxx(n:String ): String {
//    return n.replace(" ","")
//}
//fun main() {
//    println("Введите строку ")
//    val n =readln()
//    println(oxxx(n))
//}


//Задание 35
//fun mmm(n:Int ): Int {
//    return (n*(n +1))/2
//}
//fun main() {
//    println("Введите n ")
//    val n =readln().toInt()
//    println ("Сумма первых $n натуральных чисел:" )
//    println(mmm(n))
//}


//Задание 36
//fun main() {
//    print("Введите строку: ")
//    val text = readLine() ?: ""
//    print("Введите подстроку: ")
//    val substring = readLine() ?: ""
//    if (text.contains(substring)) {
//        println("Текст содержит подстроку")
//    } else {
//        println("Текст не содержит подстроку")
//    }
//}

//Задание 37
//fun blya(n:Int ) {
//    for (i in 1..10){
//        println("__________")
//        println("$n^$i = ${n*i}")
//        println("----------")
//    }
//}
//fun main() {
//    println("Введите число")
//    val n =readln().toInt()
//    println(blya(n))
//}


//Задание 38
//fun axxx(input: String): Int {
//    return input.length
//}
//fun main() {
//    println("Введите строку:")
//    val input = readLine() ?: ""
//    val a = axxx(input)
//    println("Количество символов в строке: $a")
//}

//Задание 39
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    val nrev = n
//    println(nrev.reversed())
//}

//Задание 40
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    println ("Массив n:")
//    println (n)
//
//    var a = 0
//    val array = mutableListOf<Int>()
//    for (i in 1..size){
//        a =n[i-1]
//        array.add(a)
//    }
//    println("Копия этого массива: ")
//    println(array)
//}

//Задание 41
//fun abcd(input: String): Int {
//    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"
//    var count = 0
//    for (char in input) {
//        if (char in vowels) {
//            count++
//        }
//    }
//    return count
//}
//fun main() {
//    println("Введите строку:")
//    val input = readLine() ?: ""
//
//    println(abcd(input))
//}


//Задание 42
//import kotlin.random.Random
//import kotlin.random.nextInt
//
//fun babushka(array: Array<Int>, input: Int): Int {
//    for (i in array.indices) {
//        if (array[i] == input) {
//            return i
//        }
//    }
//    return -1
//}
//
//fun main() {
//    val array = Array(10) {
//        Random.nextInt(1..10)
//    }
//    println("Сгенерированный массив: ${array.joinToString(", ")}")
//    println("Введите элемент для поиска:")
//    val input = readLine()?.toIntOrNull()
//
//    val index = input?.let { babushka(array, it) }
//    println()
//    println("Индекс первого вхождения элемента $input: $index")
//}


