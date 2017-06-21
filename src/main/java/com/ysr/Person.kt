//去掉包名
//package com.ysr

/**类要被继承，要用open修饰
 * Created by Administrator on 2017/6/21.
 */

open class Modle constructor(var a: Int, var b: String, var c: String, var d: Boolean) {
    var id: String? = null
    open var name = "fdawdawfawf"
    //组合属性
    val avg: Double
        get() {
            when (this.b) {
                "feng" -> {
                    return 561.156
                }
                else -> {
                    return 25.1
                }
            }
        }

    var x: Int
        get() {
            when (this.b) {
                "daw" -> {
                    return 5
                }
                else -> {
                    return 8
                }
            }
        }
        set(value) {
            when (value) {
                in 5000..Int.MAX_VALUE -> {
                    this.b = "aaaa"
                }
                else -> {
                    this.b = "qqqq"
                }
            }
        }

    fun getDta() {
        val menue = arrayOf("ddwad", "fdwafwa", "fagesag")
        val desc = menue.reduce { s1, s2 -> s1 + "," + s2 }
        println("${desc}")
    }

}

class Unit(d: Boolean, a: Int = 1, b: String = "b", c: String = "c") : Modle(a, b, c, d) {
    override var name = "fsafesf"

}

fun main(array: Array<String>) {
    //变量要放在前面，否则要写完整
    val a = Unit(false)
    a.let(::println)
    //组合属性使用
    a.x = 4515
    println(a.avg)
    println(a.b)
    a.getDta()
}