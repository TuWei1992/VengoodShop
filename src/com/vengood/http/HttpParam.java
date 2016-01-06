package com.vengood.http;

import com.loopj.android.http.RequestParams;

/**
 *类名：HttpParams.java
 *注释：网络请求参数工具类
 *日期：2016年1月2日
 *作者：王超
 */
public class HttpParam {
    public static RequestParams getLoginParam(String account, String pwd) {
        RequestParams params = new RequestParams();
        params.put("act", "module");
        params.put("name", "bj_qmxk");
        params.put("do", "login");
        params.put("weid", "3");
        params.put("app_login", "yes");
        params.put("account", account);
        params.put("pwd", pwd);
        return params;
    }
}
