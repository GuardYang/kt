/**
 * Created by Administrator on 2017/6/23.
 */
val a = 5
val b = 6

//Kotlin智能转换
fun main(array: Array<String>) {
    if (a is Int) {
        //inc()加1
        println(a.inc())
        //减一
        println(a.dec())
    }
//强制转换as   安全转换as？
    try {
//        val c=a as String
        val c = a as? String
        //转换失败返回null
        println(c)
    } catch(e: Exception) {
        println(e)
    }

}