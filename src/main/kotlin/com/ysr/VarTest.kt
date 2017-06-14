package com.ysr

/**
 * Created by Administrator on 2017/6/13.
 */
fun main(array: Array<String>) {
    var id: Int
    var name: String? = null
    val age: Int
    var isCheck: Boolean? = null
    var isFirst: Boolean = false
    var addr: String = "地址"
    addr = "2心智"
    age = 2

    var aCha = 's'
    val cccc = addr + aCha + 0

    if (null != addr) {
        println(addr)
    }
    if (!isFirst) {
        System.out.println(isCheck)
    }
    if (!addr.isEmpty()) {
        println(addr.count())
    } else
        println("wu")
//    println(addr.toCharArray())
    for (array in addr.toCharArray()) {
        println(array)
    }
    println(cccc)
    val Time = Triple(6, 1, 3)
    val complay = "茶大赛"
    val complay2 = "安抚"
    val complay3 = "vss氛围十分"
    val admin = "admin"
    val news = "${Time.first}发，各${complay2}色粉色，大武${complay3}当哇，发${admin}我发发，${complay}"


    println(news)


}