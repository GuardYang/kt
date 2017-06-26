package com.ysr

/**
 * Created by Administrator on 2017/6/23.
 */
interface OnCompletionListener {
    val time: String
    fun del()
}

interface MyListener {
    //接口中的属性只有类型定义，不可初始化
    val isRefresh: Boolean
    //可以get
    val infp: String
        get() = "信息"
    var id: Int
    fun look() {
        println("查看")
    }
}