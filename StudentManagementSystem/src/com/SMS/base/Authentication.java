package com.SMS.base;
//鉴权：进行用户管理等

import com.SMS.lib.algs4.LinearProbingHashST;

public class Authentication {

    private final LinearProbingHashST<String, String> user_database;

    public Authentication() {
        user_database = new LinearProbingHashST<String, String>();
        add_user("root", "toor"); // 添加默认用户
    }

    // 添加一个用户，分别设置
    public void add_user(String acc, String pas) {
        user_database.put(acc, pas);
    }

    public boolean check_user(String acc, String pas) {
        String ri_pas = user_database.get(acc);
        if(ri_pas ==null) return false;
        return ri_pas.equals(pas);
    }
}