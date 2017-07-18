package com.ysr

/**
 * Created by Administrator on 2017/6/13.
 */
fun main(array: Array<String>) {
    var arrays = arrayOf("dsada", "Kotlin", "Java", "dawda", "dawda", "gsegfs")
    var test = Array(22, { "saf" })

    var count = Array(10, { i -> i + 1 })
//    for (t in arrays){
//        println(t)
//    }
//    for (c in count){
//        println(c)
//    }
//    println(count.first())
    var has = hashSetOf("da", "dwadwa", "dwadwa", "dwadwa", "dwadwa", "dwadwa")
    for (h in has) {
        println(h)
    }

//    assert(has.size == 3)

    //数组计数
    count.size
    //数组是否为空
    count.isEmpty()
    //过滤重复数组
    println(arrays.distinct())
    //转换集合
    println(arrays.toSet())
    //切割
    val Intercept = arrays.sliceArray(2..4)



    var mutableListOfs :MutableList<String> =ArrayList()
//           mutableListOf("java","c","C++","java","Visual Basic","	Scala","Kotlin","java","c","Kotlin")
    //数组末尾添加
    mutableListOfs.add("Swift")
    //添加一个数组
//    mutableListOfs.addAll(arrays)
    //选定位置添加

    mutableListOfs.size.toString().let (::println)


}
