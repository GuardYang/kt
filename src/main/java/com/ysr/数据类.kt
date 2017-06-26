/**
 * Created by Administrator on 2017/6/22.
 */
data class Article(var name: String, var id: Int)

fun main(array: Array<String>) {
    val arc = Article("Kotlin", 9)
    arc.let(::println)
    //复制  生成对象的克隆
    //val newArc=arc.copy("Java")
    val newArc = arc.copy("Java", 8)
    newArc.let(::println)
    //数据类的对象解构
    val (name, id) = newArc
    println("$id,$name")
    println("${newArc.component1()},${newArc.component2()}")
}