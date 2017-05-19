package com.ysr;

import com.ysr.kotlinfirst.LoginInfo;

/**
 * Created by Administrator on 2017/5/19.
 */
public class BaseModel {
    public static void main(String[] s) {
        User user = new User("ysr", 20, "123456");
        LoginInfo info = new LoginInfo();
        info.setUsername("ysr");
        //  System.out.print( user.getName());
        System.out.print(info.getDistrictcode());
    }
}
