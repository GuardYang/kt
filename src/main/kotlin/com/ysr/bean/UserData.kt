package com.ysr.bean

/**
 * Created by Administrator on 2017/5/26.
 */
class UserData {
    constructor(login: String, id: Int) {
        this.login = login
        this.id = id
    }
    override fun toString(): String {
        return ""+login
    }
    var login: String? = null
    var id: Int = 0
    var avatar_url: String? = null
    var gravatar_id: String? = null
    var url: String? = null
    var html_url: String? = null
    var followers_url: String? = null
    var following_url: String? = null
    var gists_url: String? = null
    var starred_url: String? = null
    var subscriptions_url: String? = null
    var organizations_url: String? = null
    var repos_url: String? = null
    var events_url: String? = null
    var received_events_url: String? = null
    var type: String? = null
    var isSite_admin: Boolean = false
}
