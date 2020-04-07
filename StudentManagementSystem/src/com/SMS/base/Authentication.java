package com.SMS.base;
//鉴权：进行用户管理等

import com.SMS.algs4.LinearProbingHashST;

public class Authentication {

    private LinearProbingHashST<String, String> user_database;

    public Authentication() {
        user_database = new LinearProbingHashST<String, String>();
        add_user("root", "toor"); // 添加默认用户
    }

    // 添加一个用户，分别设置
    public void add_user(String acc, String pas) {
        user_database.put(acc, pas);
    }

    public boolean check_user(String acc, String pas) {
        if (user_database.get(acc) == pas)
            return true;
        return false;
    }
}