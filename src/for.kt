// for 循环通常用于遍历范围或集合。它在 Kotlin 中非常简洁。

fun main(){
  for (i in 1..5) {
    println(i)
  }
  println("----------")

  for (i in 1..10 step 2){
    println(i)
  }
  println("----------")

  for (i in 10 downTo 1 step 2){
    println(i)
  }
  println("----------")

  for (i in listOf(1,2,3,4,5)) {
    println(i)
  }
  println("----------")
}