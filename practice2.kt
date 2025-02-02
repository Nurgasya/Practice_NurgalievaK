import kotlin.math.pow
import kotlin.math.sqrt

//Операция с числами
/*
//1.а)
fun main(){
    val a=47
    val b=10
    val c=a/b
    println("Дано двузначное число:"); println(a)
    println("Число десятков в нём:"); println(c)
}*/
//б)
/*
fun main(){
    val a=73
    val b=10
    val c=a%b
    println("Дано двузначное число:"); println(a)
    println("Число единиц в нём:"); println(c)
}*/
//в)
/*
fun main(){
    val a=79
    val b=10
    val c=a/b
    val f=a%b
    val e=c+f
    println("Дано двузначное число:"); println(a)
    println("Сумма его цифр:"); println(e)
}
*/
//г)
/*
fun main(){
    val a=66
    val b=10
    val c=a/b
    val f=a%b
    val e=c*f
    println("Дано двузначное число:"); println(a)
    println("Произведение его цифр:"); println(e)
}*/

//2.а)
/*
fun main(){
    val a=937
    val b=10
    val c=a%b
    println("Дано трехзначное число:"); println(a)
    println("Число единиц в нём:"); println(c)
}*/
//б)
/*
fun main() {
    val a=854
    val b=10
    val c=a/b
    val d=100
    val e=(a%d)/b
    val f=a/d
    println("Дано трехзначное число:"); println(a)
    println("Число десятков в нём:"); println(c)
    println("Или же число сотен в нём:"); println(f)
    println("а десятков:"); println(e)
}*/
//в)
/*
fun main(){
    val a=396
    val b=100
    val d=10
    val c=a/b
    val f=(a%b)/d
    val g=a%d
    val e=c+f+g
    println("Дано трехзначное число:"); println(a)
    println("Сумма его цифр:"); println(e)
}*/
//г)
/*fun main(){
    val a=999
    val b=100
    val d=10
    val c=a/b
    val f=(a%b)/d
    val g=a%d
    val e=c*f*g
    println("Дано трехзначное число:"); println(a)
    println("Произведение его цифр:"); println(e)
}*/

/*//3.
fun main(){
    println()
    var a= readln().toInt()
    println()
    var b= readln().toInt()
    println("${a / b}")
}*/
/*
//4.
fun main() {
    val a: Double =2.0
    val b:Double =5.0
    val c=a.pow(b)
    println(c)
}*/
/*
//5.
fun main() {
    val a:Double =144.0
    var c=sqrt(a)
    println(c)
}*/

//Вычисление логических выражений
//1.
/*
fun main(){
    val a=true
    val b=false
    val c=false
    val e=a or b
    val f=a and b
    val s=b or c
    println(e)
    println(f)
    println(s)
}*/

//2.
/*
fun main(){
    val x=false
    val y=true
    val z=false
    val a=x or y
    val b=x and y
    val c=x and z
    println(a)
    println(b)
    println(c)
}*/

//3.
/*
fun main(){
    val a=true
    val b=false
    val c=false
    val e=!a and b
    val f=a or !b
    val s=a and b or c
    println(e)
    println(f)
    println(s)
}*/

//4.
/*fun main(){
    val x=true
    val y=true
    val z=false
    val a=!x and y
    val b=x or !y
    val c=x or y and z
    println(a)
    println(b)
    println(c)
}*/

//5.
/*fun main(){
    val x=true
    val y=true
    val z=false
    val a=!x and y
    val b=x or !y
    val c=x or y and z
    println(a)
    println(b)
    println(c)
}*/

//6.
/*fun main(){
    val x=false
    val y=false
    val z=true
    val a=x or y and !z
    val b=x and !y or z
    val c=!x and !y
    val m=x and (!y or z)
    val r=!(x and z) or y
    val t=x or (!(y or z))
    println(a)
    println(b)
    println(c)
    println(m)
    println(r)
    println(t)
}*/
//7.
/*fun main(){
    val a=true
    val b=false
    val c=false
    val x=a or !(a and b) or c
    val y=!a or a and (b or c)
    val z=(a or b and !c) and c
    println(x)
    println(y)
    println(z)
}*/