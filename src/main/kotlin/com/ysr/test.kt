package com.ysr

/** Kotlin 关键字冲突的处理
Java 有 static 关键字，在 Kotlin 中没有这个关键字，如果在 Java 代码中想要通过类名调用一个 Kotlin 类的方法，你需要使用 @JvmStatic 替代这个关键字。
在 Kotlin 中也有很多的关键字是 Java 中是没有的。例如 in , is , data 等。如果 Java 中使用了这些关键字，需要加上反引号(`)转义来避免冲突。例如
// 转换为 Kotlin 代码需要加反引号转义
fun `is`() {
}
 * Created by Administrator on 2017/6/13.
 */
object test {
    internal var isfirst: Boolean = false
    @JvmStatic fun main(args: Array<String>) {

        if (isfirst) {

        }
        print("" + isfirst)
    }
}
