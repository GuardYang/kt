package com.ysr

/**
 * Created by Administrator on 2017/6/21.
 */
class News {
    private var address = "dawdaf"

    class Cate {
        var list = arrayOf("Java", "Swift", "C++", "Kotlin")
        //joinToString输出文本
        val listDesc = list.joinToString()

    }

    //内部类
    inner class Langgue {
        fun getDate(name: String) {
            //内部类可以访问主类属性
            address = name
            address.let(::println)
        }
    }
}

fun main(array: Array<String>) {
//    println(News.Cate().listDesc)
    News.Cate().listDesc.let(::println)
    //更改地区
    News().Langgue().getDate("dada")
//    News().address.let(::println)
}