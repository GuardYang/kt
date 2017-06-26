/**避免继承
 * Created by Administrator on 2017/6/22.
 */
open class Person(var name: String) {
    open val id = "dwada"
}

fun main(array: Array<String>) {

    val one = object : Person("fawfaw") {
        override val id = "fsaae"

    }
    one.id.let(::println)
    //纯对象表达式
    val login = object {
        var sise = 200
    }
    login.sise.let(::println)
    NetWorkManager.login()

    //与类关联性强
    MyCard.test()
}

//对象申明，不能再函数中
//包装类
object NetWorkManager {
    fun login() {
        "fessf".let(::println)
    }
}

//半生对象,创建一个实例工厂
class MyCard {
    companion object {
        fun test() = MyCard
    }
}
