//Задание 1
//fun main() {
//    println("Масcив из 5 целых чисел")
//    val array = mutableListOf(13, 24, 898, 20, 88)
//    println(array)
//}

//Задание 2
//fun main() {
//    val array = mutableListOf<Int>()
//    while (true) {
//        print("Введите число(Нажмите enter с пустой строкой чтобы завершить) ")
//        val n = readLine() ?: break
//        if (n.isEmpty()) {
//            break
//        }
//        array.add(n.toInt())
//    }
//    val sum = array.sum()
//    println("Сумма элемента массива: $sum")
//}

////Задание 3
//fun main() {
//    val array = mutableListOf<Int>()
//    println("Введите элементы массива")
//    for (i in 1..10){
//        val n = readLine() ?: return
//        array.add(n.toInt())
//    }
//    println("Максимальное число в массиве ${array.max()}")
//    println("Минимальное число в массиве ${array.min()}")
//}

//Задание 4
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
//    println("Отсортированный список $n")
//}

//Задание 5
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    val uniq = n.toSet()
//    println("Уникальные элементы массива $uniq")
//}

//Задание 6
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    val (chot,nchot) = n.partition { it % 2 == 0 }
//    println("Четные числа: $chot")
//    println("Нечетные числа: $nchot")
//}


//Задание 7
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


//Задание 8
//fun main() {
//    val n = mutableListOf(1,3,5,7,2,100,13,55,78)
//    println("Введите элемент который хотите найти")
//    val seach = readln().toInt()
//    val index = n.indexOf(seach)
//    if (index != -1){
//        println("Элемент найден $index")
//    }
//    else{
//        println("Элемент не найден(")
//    }
//
//}


//Задание 9
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size){
//        val num = readln().toInt()
//        n.add(num)
//    }
//    var a = 0
//
//    val array = mutableListOf<Int>()
//    for (i in 1..size){
//        a =n[i-1]
//        array.add(a)
//    }
//    println(array)
//}


//Задание 10
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size) {
//        val num = readln().toInt()
//        n.add(num)
//    }
//    var a =  0
//    for (i in 1..size){
//        if (n[i-1] % 2 == 0){
//            a += n[i-1]
//        }
//    }
//    println(a)
//}


//Задание 11
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size1 = readln().toInt()
//    for (i in 1..size1) {
//        val num1 = Random.nextInt(1,100)
//        n.add(num1)
//    }
//    println(n)
//    val b = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size2 = readln().toInt()
//    for (i in 1..size2) {
//        val num2 = Random.nextInt(1,100)
//        b.add(num2)
//    }
//    println(b)
//    val c = mutableListOf<Int>()
//    for (i in 1..size1){
//        for (j in 1..size2){
//            if (n[i-1]==b[j-1]){
//                val num3 = b[j-1]
//                c.add(num3)
//            }
//        }
//    }
//    if (c.size == 0)
//        println("Элементы массивов не пересекаются")
//    else {
//        println("Пересекающиеся элементы массивов")
//        println(c)
//    }
//}


//Задание 12
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size1 = readln().toInt()
//    for (i in 1..size1) {
//        val num1 = Random.nextInt(1,100)
//        n.add(num1)
//    }
//    println("Ваш массив")
//    println(n)
//    println("Какой элемент поменять местами")
//    val a = readln().toInt()
//    println("С каким элементом")
//    val b = readln().toInt()
//    n[a-1] = n[b-1]
//    println("Массив с изменением")
//    println(n)
//}


//Задание 13
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    for (i in 1..20) {
//        val num1 = Random.nextInt(1,100)
//        n.add(num1)
//    }
//    println("Ваш массив:")
//    println(n)
//}


//Задание 14
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1,100)
//        n.add(num1)
//    }
//    val del3 = mutableListOf<Int>()
//    for (i in 1..size)
//        if (n[i-1] %  3 == 0)
//            del3.add(n[i-1])
//    println(del3)
//}


//Задание 15
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1,10)
//        n.add(num1)
//    }
//    println(n)
//    val b = mutableListOf<Int>()
//    for (i in 1..size) {
//        val num2 = Random.nextInt(1,10)
//        b.add(num2)
//    }
//    println(b)
//    val c = mutableListOf<Int>()
//    for (i in 1..size){
//        for (j in 1..size){
//            if (n[i-1]==b[j-1]){
//                val num3 = b[j-1]
//                c.add(num3)
//            }
//        }
//    }
//    if (c.size == size)
//        println("Массивы являются палиндромами")
//    else {
//        println("Массивы не являются палиндромами")
//    }
//}


//Задание 16
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1,10)
//        n.add(num1)
//    }
//    println(n)
//    val b = mutableListOf<Int>()
//    for (i in 1..size) {
//        val num2 = Random.nextInt(1,10)
//        b.add(num2)
//    }
//    println(b)
//    println("Конкатенация массивов")
//    val a = n + b
//    println(a)
//}


//Задание 17
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size) {
//        val num = readln().toInt()
//        n.add(num)
//    }
//    var a = 1
//    var b = 0
//    for (i in 1..size) {
//        a  *= n[i-1]
//        b  += n[i-1]
//    }
//    print("Произведение всех элементов массива: ")
//    println(a)
//    print("Сумма всех элементов массива: ")
//    println(b)
//}


//Задание 18
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивa")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 100)
//        n.add(num1)
//    }
//    for(i in 1..size){
//        print(n[i-1])
//        print(" ")
//        if (i % 5 == 0){
//            println("")
//        }
//    }
//}


//Задание 19
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1,100)
//        n.add(num1)
//    }
//    n.sort()
//    println(n)
//    val b = mutableListOf<Int>()
//    for (i in 1..size) {
//        val num2 = Random.nextInt(1,100)
//        b.add(num2)
//    }
//    b.sort()
//    println(b)
//    println("Конкатенация отсортированных массивов")
//    val a = n + b
//    println(a.sorted())
//}


//Задание 20
//fun main() {
//    println("Введите первый член прогрессии")
//    val c = readln().toInt()
//    println("Введите шаг(d)")
//    val d = readln().toInt()
//    val n = mutableListOf(c)
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    var c1 = c
//    for (i in 1..size) {
//        c1 += d
//        n.add(c1)
//    }
//    println(n)
//}


//Задание 21
import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 100)
//        n.add(num1)
//    }
//    println("Ваш массив:")
//    println(n)
//    println("Какой элемент вы хотите удалить? ")
//    val del = readln().toInt()
//    n.removeAt(del-1)
//    println("Массив с удалённым элементом: ")
//    println(n)
//}


//Задание 22
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массивов")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 100)
//        n.add(num1)
//    }
//    println(n)
//    n.sort()
//    val max2 =n[size-2]
//    println("Второй по величине элемент в массиве:")
//    println(max2)
//}


//Задание 23
//fun main() {
//    val n = mutableListOf<List<Int>>()
//    println("Введите количество массивов")
//    val nm  = readln().toInt()
//    val n1 = mutableListOf<Int>()
//    for (i in 1..nm) {
//        println("Введите размер массива ${i}")
//        val size = readln().toInt()
//        for (j in  1..size){
//            println("Введите элемент массива ${i}")
//            val el = readln().toInt()
//            n1.add(el)
//        }
//        n.add(n1)
//    }
//    println("Общий массив : $n1")
//    println("Сумма чисел в общем массиве: ${n1.sum()}  ")
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

//Задание 27
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 10)
//        n.add(num1)
//    }
//    println(n)
//    var count = 0
//    var maxsercount  = 0
//    for (i in 1..size){
//        count=0
//        for (j in i..size){
//            if (n[i-1] == n[j-1]){
//                count ++
//                println(count)
//            }
//            else{
//                break
//            }
//        }
//        if (count > maxsercount){
//            maxsercount = count
//        }
//    }
//    print("Максимальная последовательность одинаковых элементов: $maxsercount")
//
//}
//
////Задание 28
//fun main() {
//    val n = mutableListOf<Int>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size) {
//        val num = readln().toInt()
//        n.add(num)
//    }
//    println("Ваш массив: $n")
//}


//Задание 29
//fun main() {
//    val n = mutableListOf<Double>()
//    println("Введите размер массива")
//    val size = readln().toInt()
//    println("Введите элементы массива")
//    for (i in 1..size) {
//        val num = readln().toDouble()
//        n.add(num)
//    }
//    fun findmediana(n:  MutableList<Double>): Double {
//        n.sort()
//        if (size % 2 ==  0){
//            val num1 = n[(size/2)-1]
//            val num2 = n[(size/2)]
//            return (num1 +num2)/2
//        }
//        else {
//            return n[size/2]
//        }
//
//    }
//    val mediana = findmediana(n)
//    println("Ваш массив: $n")
//    println("Его медана: $mediana")
//}


//Задание 30
//import kotlin.random.Random
//fun main() {
//    val n = mutableListOf<Int>()
//    val size = 100
//    for (i in 1..size) {
//        val num1 = Random.nextInt(1, 100)
//        n.add(num1)
//    }
//    println("Элементы массива по группам из 10")
//    for(i in 1..size){
//        print(n[i-1])
//        print(" ")
//        if (i % 10 == 0){
//            println("")
//        }
//    }
//}
