//№1
//fun main() {
//    println("Введите натуральное число")
//    val n = readLine()?.toIntOrNull() ?: return
//    val a = mutableListOf<String>()
//    if (n==0){
//        a.add("")
//        println(a)
//    }
//    else{
//        for(i in 1..n)
//            a.add((n-i+1).toString())
//        println(a)
//    }
//}

//№2
//fun main(){
//    println("Введите кол-во ступеней в пирамиде:")
//    val n = readLine()?.toIntOrNull() ?: return
//    for(i in 1..n) {
//        repeat(n - i) { print(" ") }
//        repeat(i) { print("# ") }
//        println()
//    }
//}

//№3
//import java.util.*
//fun main() {
//    val a = arrayOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')
//    println("Укажите сдвиг: ")
//    val b = readln().toInt()
//    println("Введите текст: ")
//    val c = readln().lowercase(Locale.getDefault())
//    val d = c.toMutableList()
//    for (i in d.indices) {
//        val h = d[i]
//        val x = a.indexOf(h)
//        if (x != -1) {
//            val n = (x + b) % a.size
//            d[i] = a[n]
//        }
//    }
//    println("Зашифрованное слово: ${d.joinToString("")}")
//}

//№4
//fun main() {
//    println("Введите число: ")
//    val a = readln().toInt()
//    var b = mutableListOf<String>()
//    for (i in 1..a){
//        when {
//            i % 3 == 0 && i % 5 == 0 -> b.add("ВизлллБизллл")
//            i % 3 == 0 -> b.add("Физллл")
//            i % 5 == 0 -> b.add("Бизллл")
//            else -> b.add(i.toString())
//        }
//    }
//    println(b)
//}