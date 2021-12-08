import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    GlobalScope.launch {
      // delay(1000L)
       display2()
    }
    println("main")
}
suspend fun display2 (){
    println("suspend")
}