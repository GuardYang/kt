package com.ysr

/**
 * Created by yangshirong on 2017/5/22.
 */
class Test : OnMediaCallbackListener.CallbackListener {

    fun getData() {

        val media: OnMediaCallbackListener
        media = OnMediaCallbackListener()

        media.setListener(this)
    }


    override fun onLook() {

    }

    override fun onDel(id: String) {
        print(id)
    }



}
