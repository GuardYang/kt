/**函数参数类型定义，函数通用
 * Created by yangshirong on 2017/6/25.
 */
fun main(array: Array<String>) {
    fun <U> showInfo(pare: U) {
        println(pare)
    }
    showInfo(3)
    showInfo("fafafa")
    val sum = arrayOf(312, 3123, 411).sum()
    fun <U : Number> getSum(vararg numbers: U): Double {
        return numbers.sumByDouble { it.toDouble() }
    }

    //多重约束
    fun <T> bigPart(list: Array<T>, two: T): List<T>
            where T : Number, T : Comparable<T> {
        return list.filter { it >= two }.sorted()
    }
//    println(getSum(312, 3123.6, 411))
    println(bigPart(arrayOf(312, 3123, 411), 3))
    class Mys : source<String>() {
        override fun del(): String = "qwewqe"
    }

}

abstract class source<out T> {
    abstract fun del(): T
}

