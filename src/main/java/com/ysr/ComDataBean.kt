package com.ysr

/**
 * Created by Administrator on 2017/7/14.
 */
class ComDataBean {

    var company_data: List<CompanyDataBean>? = null

    class CompanyDataBean {
        /**
         * company : [{"name":"顺丰","code":"SF","logo":"56/shunfeng.png"},{"name":"百世快递","code":"HTKY","logo":"56/huitongkuaidi.png"},{"name":"中通","code":"ZTO","logo":"56/zhongtong.png"},{"name":"申通","code":"STO","logo":"56/shentong.png"},{"name":"圆通","code":"YTO","logo":"56/yuantong.png"},{"name":"EMS","code":"EMS","logo":"56/ems.png"},{"name":"京东","code":"JD","logo":"56/jd.png"},{"name":"宅急送","code":"ZJS","logo":"56/zhaijisong.png"},{"name":"德邦","code":"DBL","logo":"56/debangwuliu.png"}]
         * title : 常用
         */

        var title: String? = null
        var company: List<CompanyBean>? = null

        class CompanyBean {
            /**
             * name : 顺丰
             * code : SF
             * logo : 56/shunfeng.png
             */

            var name: String? = null
            var code: String? = null
            var logo: String? = null
        }
    }
}
