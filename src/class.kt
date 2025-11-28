// class 声明类
class Dog {
    var name: String = "" // 声明属性
    var age: Int = 0
}

// 主构造器
class Person(val name: String, val age: Int){
    var job: String = ""
}

// 次构造器
class Cat(val name: String){

    var age: Int = 0

    constructor(name: String, age: Int) : this(name){
        this.age = age
    }
}

// init 块
class Car(var name: String){
    init {
        println("Car init")
    }
}

// 方法
fun Person.greeting(person: Person){
    println("Hello ${person.name}")
}

// 继承
open class Animal(val name: String){
    open fun sound(){
        println("Animal Sound")
    }
}

class Monkey(name: String, age: Int)  : Animal(name){
    // 重写方法
    override fun sound(){
        println("Monkey Sound")
    }
}

// 接口
interface Flyable {
    fun fly() {
        println("fly")
    }
}

class Bird(name: String, age: Int)  : Flyable{
    override fun fly() {
        println("Bird fly")
    }
}

// 数据类
data class User(val name: String, val age: Int)

// 伴生对象 类的静态成员
class MyClass {
    companion object Factory {
        fun create(): MyClass {
            return MyClass()
        }
    }
}

// 密封类
// 密封类是一种特殊的类，它限制了子类的创建
// 只能定义有限数量的子类
// 常用于表示具有固定子类的层次结构
sealed class Result
data class Success(val message: String) : Result()
data class Failure(val exception: Exception) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println(result.message)
        is Failure -> println("error: ${result.exception.message}")
    }
}

