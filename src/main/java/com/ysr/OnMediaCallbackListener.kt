package com.ysr

/**
 * Created by yangshirong on 2017/5/22.
 */

class OnMediaCallbackListener {
    private var listener: CallbackListener? = null

     interface CallbackListener {
        fun onLook()

        fun onDel(id: String)
    }

    fun setListener(listener: CallbackListener) {
        this.listener = listener
        listener.onDel("dddd")
    }
}

//internal
