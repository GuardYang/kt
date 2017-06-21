package com.ysr

/**
 * Created by Administrator on 2017/6/21.
 */
fun main(array: Array<String>) {
    //调用时可以打参数名
//    val count = sum(2, 6)
    val count = sum(b = 2, a = 6)
    println(count)
    println(add(4, 5, 56, 16))
    val arr = intArrayOf(4, 5, 56, 16)
    println(add(*arr))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

//可变参数
fun add(vararg x: Int): Int {
    var total = 0
    for (i in x) {
        total += i
    }
    return total
}