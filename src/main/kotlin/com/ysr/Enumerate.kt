package com.ysr

/**枚举
 *
 * Created by yangshirong on 2017/5/20.
 */
enum class Lang(val type: String) {
    ONE("1"),
    TWO("2"),
    Three("3"),
    Four("4");


    fun getMenu(): Unit {
        println(type)
    }

    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())

        }
    }

}

fun main(args: Array<String>) {
    if (args.size == 0) return
    val lang = Lang.parse(args[0])
    print(lang)
//    lang.getMenu()

//    lang.myMethod()

}
//重写
fun Lang.myMethod() {
    val id = when (this) {
        Lang.ONE -> "5"
        Lang.TWO -> "6"
        Lang.Three -> "7"
        Lang.Four -> "8"
    }
    print(id)
}