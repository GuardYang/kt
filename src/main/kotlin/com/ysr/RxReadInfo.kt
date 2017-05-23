package com.ysr

import rx.Observable
import java.io.File

/**
 * Created by yangshirong on 2017/5/21.
 */
fun main(args: Array<String>) {
    val getJson = File(ClassLoader.getSystemResource("json").path).readText()
    Observable.from(getJson.toCharArray().asIterable()).map(::println).subscribe()


}