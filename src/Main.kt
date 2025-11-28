// 变量
// var 可变
// val 不可变
var name = "Tom"
const val age = 18

// 类型
// 可使用: 指变量类型
// 内置基本类型有 Int Double Float String Boolean
// 不显式指明类型时 Kotlin 会根据字面量进行类型推断
var month: Int = 12
var π: Double = 3.14159265358979
var pi: Float = 3.14f
var isLoading: Boolean = false
var welcomeMessage: String = "Hello World"

//


// fun 声明函数
// main() 函数是特殊函数 是 Kotlin 程序的入口
fun main() {
    // ${} 是模板字符串
    println("My name is $name and I am $age years old")
    println("My age plus 5 is ${age+5}")
    println(month)
    println(π)
    println(pi)
    println(isLoading)
    println(welcomeMessage)
}