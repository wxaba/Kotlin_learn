// 流程控制
// 条件 if else when
// if 是最常用的条件判断语句

var x = 10

fun main() {

    if (x < 5) {
        println("x is smaller than 5")
    } else if (x < 10) {
        println("x is larger than 10")
    } else {
        println("x is larger than 5")
    }

    // if 作为表达式
    val y = if (x > 5) 5 else 10
    println(y)
}