/**增加新方法
 * Created by Administrator on 2017/6/26.
 *
 */
fun Int.sqare(): Int {
    //平方
    return this * this
}

fun <U> Array<U>.bigCount(): U
        where U : Number, U : Comparable<U> {
    var max = this[0]
    for (i in 1..lastIndex) {
        val first = this[i]
        if (first > max) {
            max = first
        }

    }
    return max
}

fun main(array: Array<String>) {
    val list = arrayOf(15, 51, 85, 6, 44, 48)
    println(list.bigCount())

}