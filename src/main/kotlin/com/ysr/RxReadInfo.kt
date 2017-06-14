package com.ysr

import rx.Observable
import java.io.File
import java.util.concurrent.Executors

/**
 * Created by yangshirong on 2017/5/21.
 */
fun main(args: Array<String>) {
    val getJson = File(ClassLoader.getSystemResource("json").path).readText()
//    Observable.from(getJson.toCharArray().asIterable()).map(::println).subscribe()
//    Observable.from(getJson.toCharArray().asIterable()).filter{!it.isWhitespace()}.map(::println).subscribe()
//    Observable.from(getJson.toCharArray().asIterable()).filter{!it.isWhitespace()}.groupBy { it }.map(::println).subscribe()
//    Observable.from(getJson.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.map { println(it.key) }.subscribe()
//    Observable.from(getJson.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.map {
//       it.count().subscribe(::println)
//    }.subscribe()
    Observable.from(getJson.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.map {
        o ->
        o.count().subscribe {
            println("${o.key} -> $it")
        }
    }.subscribe()
    val work = Executors.newCachedThreadPool()
    work.execute{
        println("kotlin")
    }

}