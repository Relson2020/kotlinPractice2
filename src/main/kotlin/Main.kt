import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

  //  runBlocking {
     //       display()
   /*     var result= measureTimeMillis {
            number1()
            number2()
            println(number1()+number2())
        }
        println("result time $result")*/
    //    delay(4000)
  //  }
    println("done")

}
suspend fun display() = coroutineScope{

   launch {//delay(6000)
    println("world !!")
   }
    val result: Deferred<Int> = async {
        return@async 3+4
    }
    println(result.await())

    launch {
      //  delay(3000)
        println("hey")
    }
    println("hello")
}
suspend fun number1():Int{
    delay(1000)
  return 12
}
suspend fun number2():Int{
    return 43
}