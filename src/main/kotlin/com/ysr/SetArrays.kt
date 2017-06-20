package com.ysr

/**
 * Created by Administrator on 2017/6/15.
 */
fun main(array: Array<String>) {
    //无序不重复
    val mainLine = setOf("Java", "Swift", "C++", "PHP", "Go", "Python")
    val twoLine = setOf("C++", "C", "Ruby", "Objective-C")
    val threeLine = setOf("C++", "Scala", "Dart")
    //元素计数
    println(mainLine.count())
    //是否为空
    println(mainLine.isEmpty())
    //是否包含
    println(mainLine.contains("Swift"))
    println(mainLine.containsAll(twoLine))
    //转换数组
    val array = mainLine.toTypedArray()
    for (a in array) {
        println(a)
    }
    //集合运算
    val meetLines = mainLine.intersect(twoLine)//交集
    println(meetLines)
    val diffLine = mainLine.subtract(twoLine)//差集
    println(diffLine)
    println(mainLine.union(twoLine))//并集
    println(mainLine.minus(twoLine))//补集

    //Map使用，没有顺序位置会改变
    val mapList = mapOf<String, String>(Pair("a", "1"), Pair("b", "1"), Pair("c", "1"), Pair("d", "1"))
    //获取key值
    println("a".toLowerCase())
    println("a".toUpperCase())
    println(mapList.getOrDefault("A".toLowerCase(), "不存在"))
    //返回所有key/value
    mapList.keys
    mapList.values
    //转换为可变
    val tmapList = mapList.toMutableMap()
    //修改
    tmapList["a"] = "8648"
    //添加
    tmapList.put("e", "156156")
    //移除
    tmapList.remove("a")

    for (t in tmapList) {
        println(t)
    }
}