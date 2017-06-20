package com.ysr

/**
 * Created by Administrator on 2017/6/20.
 */
fun main(array: Array<String>) {
    val list = arrayListOf("C++")
    list.add("C++")
    list.add("Swift")
    list.add("Kotlin")
    list.add("Java")
//    for (l in list) {
//        println(l)
//    }

//    for (l in list) {
//        if ("Kotlin".contains(l))
//            println(l)
//        else
//            println("00")
//    }

//    val i: Int
//    val j: Int
    /**
     * 九九乘法表
     */
    for (i in 1..10) {
        for (j in 1..i) {
            print("$j*$i=${j * i}\t")
        }
        println()
    }

}