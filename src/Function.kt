fun main() {

    // 使用 fun 声明函数

    fun greet(name: String = "Jery"): String {
        return "Hello $name"
    }

    println(greet())
    println(greet("Tom"))

    // 使用 varargs 声明可变参数
    fun sum(vararg numbers: Int): Int {
        println(numbers)
        return numbers.sum()
    }

    println(sum(1, 2))

    // Kotlin 支持单表达式函数，即函数体只有一行代码的函数，
// 可以省略 return 和大括号。
// 单表达式函数会隐式地返回表达式的结果。
    fun add(a: Int, b: Int) = a + b
    println(add(1, 2))
}