package com.ysr

/**
 * Created by Administrator on 2017/6/21.
 */
fun main(array: Array<String>) {
    //高阶函数常用于函数类型转换
    val a = arrayOf(45, 45, 468, 46, 68)
//    val b=a.map { "第1" }
    //lambda约定参数名称是it,访问自身
    val b = a.map { "第${it}" }
    println(b)

    //filter对集合类型筛选
    var sum = 0
    // 使用% a必须为整型
//    val c = a.filter { it % 2 == 0 }
//    println(c)
//闭包访问sum
    val c = a.filter { it % 2 == 0 }.forEach {
        sum += it
        println(sum)
    }
    println(sum)
    //排序
    println(a.sortByDescending{ it })

}