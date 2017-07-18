package com.ysr

import com.ysr.express.bean.RequestShipperName
import java.util.*

/**
 * Created by Administrator on 2017/7/13.
 */
class MyList {

    internal var list3: List<RequestShipperName.ShippersBean> = ArrayList()
    fun main(vararg args: String) {
        val list: List<RequestShipperName.ShippersBean>
        list = ArrayList<RequestShipperName.ShippersBean>()
        init(list)

    }

    private fun init(list2: List<RequestShipperName.ShippersBean>) {
        list3 = list2
    }
}
