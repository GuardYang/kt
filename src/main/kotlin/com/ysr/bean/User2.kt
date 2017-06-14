package com.ysr.bean

/**
 * Created by Administrator on 2017/5/23.
 */
data class User2(val login: String, val id: Long, val avatar_url: String) {
    override fun toString(): String {
        return login
    }
}