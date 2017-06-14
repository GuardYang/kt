package com.ysr.bean

import com.ysr.AppCount
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by Administrator on 2017/5/23.
 */
interface GrtGithubServer {
    @GET("repos/ysrfeng/QrCode/stargazers")
    fun getStartGazers(): Call<List<UserData>>
}

object Server {
    val githubServer: GrtGithubServer by lazy { Retrofit.Builder().baseUrl(AppCount.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(GrtGithubServer::class.java) }
}

fun main(array: Array<String>) {
    Server.githubServer.getStartGazers().execute().body().map (::println)
}