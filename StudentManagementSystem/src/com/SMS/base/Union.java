//社团类：保存社团信息，并进行单个社团的管理
package com.SMS.base;
import com.SMS.lib.algs4.Queue;
import com.SMS.lib.algs4.RedBlackBST;

import java.util.Date;

public class Union {

    public void setUni_name(String name) {
        this.name = name;
    }

    public String name;
    public String from;
    public String type;
    private RedBlackBST<Integer, member> memDatabase;

    public Union() {
        memDatabase = new RedBlackBST<Integer, member>();
    }

    public Union(String name, String from, String type) {
        this.name = name;
        this.from = from;
        this.type = type;
        memDatabase = new RedBlackBST<Integer, member>();
    }

    public static class member {
        int stu_num; // 该成员的学生类属性
        Date join_data; // 加入社团的日期
        String level; // 在社团内的职位

        public member(int stu_num, Date join_data, String level) {
            this.stu_num = stu_num;
            this.join_data = join_data;
            this.level = level;
        }
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void joinMember(int stu_num, Date join_data, String level) {
        memDatabase.put(stu_num, new member(stu_num, join_data, level));
    }

    public void delMember(int num) {
        memDatabase.delete(num);
    }

    public Iterable<Integer> getAllMemberNum() {
        return memDatabase.keys();
    }

    public Iterable<member> getAllMember() {
        Queue<member> mem = new Queue<member>();
        for (Integer member : memDatabase.keys()) {
            mem.enqueue(memDatabase.get(member));
        }
        return mem;
    }

}