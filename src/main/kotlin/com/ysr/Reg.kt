package com.ysr

/**
 * Created by Administrator on 2017/5/23.
 */
object Reg {
    @JvmStatic fun main(args: Array<String>) {
        val s = "a,b,c5,,,"
        val t = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val x = s.split(",")
//        for (tt in t) {
//            println(tt)
//        }
        for (xx in t) {
            println(":"+xx)
        }
       println("t->" + t.size)
        println("x->" + x.size)

    }
}
