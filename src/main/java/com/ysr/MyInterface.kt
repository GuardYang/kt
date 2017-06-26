/**
 * Created by yangshirong on 2017/6/25.
 */


interface person {
    val name: String
    fun del()
    var age: Int
}

open class news() {
    var id = "dadaw"
}

class MyFace() : person {
    override fun del() {
        println("del")
    }

    override var name: String = "dwad"
    override var age: Int = 2

}

fun main(array: Array<String>) {
    val t = MyFace()
    t.name="dwd"
    t.age=3
    t.del()

}