//Задание 1
//import kotlin.random.Random
//fun main() {
//    var f = 0
//    for(i in 1..10){
//        print(Random.nextInt(1,100))
//        f ++
//        if (f>=10)
//            println()
//        else
//            print(",")
//    }
//}

//Задание 2
//import java.util.*
//fun pf(text: String) {
//    var c = 0
//    var b = 0
//    val v = setOf('а', 'у', 'е', 'ы', 'о', 'э', 'ё', 'я', 'и', 'ю')
//    text.forEach { char ->
//        when {
//            char.isLetter() -> {
//                if (v.contains(char)) {
//                    c++
//                } else {
//                    b++
//                }
//            }
//        }
//    }
//    println("Количество гласных: $c")
//    println("Количество согласных: $b")
//}
//fun main() {
//    println("Введите строку:")
//    val input = readln().lowercase(Locale.getDefault())
//    pf(input)
//}

//Задание 3
//import java.util.*
//fun main() {
//    println("Введите сумму для конвертации")
//    var s = readln().toDouble()
//    var i :Double
//    println("Валюта из которой конвертируем (USD, EUR)")
//    var from = readln().uppercase(Locale.getDefault())
//    while (from != "USD" && from != "EUR") {
//        println("Такая валюта не поддерживается. Попробуйте еще раз:")
//                from = readln().uppercase(Locale.getDefault())
//    }
//    println("В какую валюту (USD, EUR)")
//    var where = readln().uppercase(Locale.getDefault())
//    while (where != "USD" && where != "EUR") {
//        println("Такая валюта не поддерживается. Попробуйте еще раз:")
//        where = readln().uppercase(Locale.getDefault())
//    }
//    if (from == "USD"){
//        i  = s*0.92
//    }
//    else{
//        i =  s*1.08
//    }
//    println("После конвертации получится $i $where")
//}

//Задание 4
//fun main() {
//    println("Введите первую строку:")
//    val s1 = readLine() ?: return
//    println("Введите вторую строку:")
//    val s2 = readLine() ?: return
//    val ana = s1.toCharArray().sorted() == s2.toCharArray().sorted()
//    println(if (ana) "Строки являются анаграммами" else "Строки не являются анаграммами")
//}

//Задание 5
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

//Задание 6
//fun main() {
//    val n = mutableListOf<String>()
//    println("Сколько строк будет в массиве: ")
//    val size = readln().toInt()
//    var stroka = ""
//    for (i in 1..size){
//        println("Введите строку $i")
//        stroka =  readln()
//        n.add(stroka)
//    }
//    n.sort()
//    println("Строки в алфавитном порядке: ")
//    for(i in 1..size){
//        println(n[i-1])
//    }
//}

//Задание 7
//fun main() {
//    println("Введите строку:")
//    val s= readLine() ?: ""
//    val a = s.map {
//        if (it.isUpperCase()) it.lowercaseChar()
//        else it.uppercaseChar()
//    }.joinToString("")
//    println("Результат: $a")
//}

//Задание 8
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

//Задание 9
//fun aye(size:Int): String {
//    val a = ('а'..'я').toList()
//    val b = ('А'..'Я').toList()
//    val c = ('0'..'9').toList()
//    val k = ('a'..'z')
//    val p = ('A'..'Z')
//    val e = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-',
//        '_', '=', '+')
//    val g = a+b+c+k+p+e
//    return (1..size)
//        .map { g.random() }
//        .joinToString("")
//}
//fun main() {
//    println("Какого размера пароль: ")
//    val s = readln().toInt()
//    val p  = aye(s)
//    println(p)
//}

//Задание 10
//fun mmm(stroka: String): String {
//    val words = stroka.split(Regex("\\s+"))
//        .map { it.replace(Regex("[^\\wа-яА-ЯёЁ]"), "") }
//    return words.maxByOrNull { it.length } ?: ""
//}
//
//fun main() {
//    println("Введите строку:")
//    val stroka = readLine() ?: ""
//
//    val word = mmm(stroka)
//    if (word.isNotEmpty()) {
//        println("Самое длинное слово: $word")
//    } else {
//        println("Нет слов в строке.")
//    }
//}