package com.ysr

import com.ysr.kotlinfirst.LoginInfo

/**
 * Created by Administrator on 2017/5/19.
 */

fun main(args: Array<out String>) {
    val user = User("ysr", 20, "123456")
    val info = LoginInfo()
    info.username = "ysr"
    //print(user.name)
    info.let(::println)
    //反射
    RegisterInfo::class.constructors.map(::println)
}


class RegisterInfo {
    fun test() {

    }
}
var count=0
set(value) {
    if (value>=0)
        field=value
}