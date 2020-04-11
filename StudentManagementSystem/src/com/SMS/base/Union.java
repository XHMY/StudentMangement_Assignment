//社团类：保存社团信息，并进行单个社团的管理
package com.SMS.base;

import com.SMS.lib.algs4.Queue;
import com.SMS.lib.algs4.RedBlackBST;

import java.util.Date;

public class Union {

    public String uniName;
    public String from;
    public String type;
    private RedBlackBST<Integer, member> memDatabase;

    public Union() {
        memDatabase = new RedBlackBST<Integer, member>();
    }

    public Union(String uniName, String from, String type) {
        this.uniName = uniName;
        this.from = from;
        this.type = type;
        memDatabase = new RedBlackBST<Integer, member>();
    }

    public void joinMember(int stu_num, Date join_data, String level) {
        memDatabase.put(stu_num, new member(stu_num, join_data, level));
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public static class member {
        int stu_num; // 该成员的学生类属性
        Date join_data; // 加入社团的日期
        String level; // 在社团内的职位

        public member(int stu_num, Date join_data, String level) {
            this.stu_num = stu_num;
            this.join_data = join_data;
            this.level = level;
        }

        public int getStu_num() {
            return stu_num;
        }

        public void setStu_num(int stu_num) {
            this.stu_num = stu_num;
        }

        public Date getJoin_data() {
            return join_data;
        }

        public void setJoin_data(Date join_data) {
            this.join_data = join_data;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }
    }

}