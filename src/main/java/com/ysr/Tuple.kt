package com.ysr

/**元组
 * Triple 三元
 * Pair 二元
 * Created by Administrator on 2017/6/13.
 */
fun main(array: Array<String>){
    val (day,method,course) = Triple(3,"学会","Kotlin")
    val er = Pair("dqwda",3)
    println("${day}${er.first}")
}