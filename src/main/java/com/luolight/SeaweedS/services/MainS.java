package com.luolight.SeaweedS.services;

import com.luolight.SeaweedS.models.SsUser;

import java.io.IOException;
import java.util.HashMap;

public interface MainS {

    /**
     * 检测url
     * @param url
     * @return
     */
    HashMap<String, Object> getCheckUrl(String url);

    /**
     * 通过url生成html
     * @param url
     * @return
     */
    HashMap<String, Object> productHtml(String url) throws IOException;

    /**
     * 用户注册
     * @param ssUser
     * @return
     */
    HashMap<String, Object> register(SsUser ssUser);

    /**
     * 用户登录
     * @param ssUser
     * @return
     */
    HashMap<String, Object> login(SsUser ssUser);

    /**
     * 完善资料
     * @param ssUser
     * @return
     */
    HashMap<String, Object> perfectInfo(SsUser ssUser);

}
