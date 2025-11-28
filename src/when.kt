// when 类似于 java 的 switch


fun main() {
    var x = 10
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x is neither 1 nor 2")
    }

    val result = when (x) {
        1 -> 10
        2 -> 20
        else -> 30
    }
    println(result)

    //when 语句不仅可以检查常量，还可以使用范围、集合等复杂条件：
    when (x) {
        in 1..10 -> println("x is in the range")
        !in 1..10 -> println("x is outside the range")
        else -> println("x is neither 1 nor 2")
    }
}

