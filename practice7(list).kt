//Задание 1
//fun main() {
//    val n = mutableListOf<String>()
//    for (i in 1..5){
//        println("Введите элемент $i")
//        val num = readln()
//        n.add(num)
//    }
//    println("Ваш массив: $n")
//}

//Задание 2
//fun main() {
//    val n = mutableListOf("a","б","в","г","д")
//    println("Что вы ищите?")
//    val seach = readln()
//    val index = n.indexOf(seach)
//    if (index != -1){
//        println("Элемент найден он под номером ${index+1}")
//    }
//    else{
//        println("Элемент не найден(")
//    }
//}


//Задание 3
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 10)
//        n.add(num1)
//    }
//    println("Элементы массива")
//    for (i in 1..size){
//        print(n[i-1])
//        if (i<size)
//            print(",")
//        else
//            println()
//    }
//}

//Задание 4
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 10)
//        n.add(num1)
//    }
//    n.sort()
//    println("Отсортированный список")
//    println(n)
//}

//Задание 5
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    val chet= mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 10)
//        n.add(num1)
//    }
//    println("Ваш массив $n")
//    for (i in 1..size ){
//        val num2 = n[i-1]
//        if (num2 % 2 == 0){
//            chet.add(num2)
//        }
//    }
//    println("Массив четных чисел: $chet")
//}

//Задание 6
//fun main() {
//    val n = mutableListOf("август", "аврогим", "видлер", "ги..ер", "диллер")
//    println("Введите первую букву разыскиваемого элемента")
//    val pb = readLine()?.lowercase()?.first() ?: throw
//    IllegalArgumentException("Недопустимый ввод")
//    println("Количество слов на эту букву в массиве ${n.filter {
//        it.startsWith(pb) }.count()}")
//}

//Задание 7
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(-10, 10)
//        n.add(num1)
//    }
//    println("Ваш массив")
//    println(n)
//    for (i in 1..size){
//        if (n[i-1]>0){
//            n[i-1] = -n[i-1]
//        }
//    }
//    println("Ваш масив только с отрицательными числами")
//    println(n)
//}

//Задание 8
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 10)
//        n.add(num1)
//    }
//    println("Ваш массив")
//    println(n)
//    for (i in 1..size){
//        n[i-1] = n[i-1]*n[i-1]
//    }
//    println("Массив квадратов")
//    println(n)
//}