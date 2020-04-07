//社团类：保存社团信息，并进行单个社团的管理
package com.SMS.base;
import com.SMS.algs4.Queue;
import com.SMS.algs4.RedBlackBST;

public class Union {

    private class member {
        Student stu; // 该成员的学生类属性
        int join_data; // 加入社团的日期
        String level; // 在社团内的职位

        public member(Student stu, int join_data, String level) {
            this.stu = stu;
            this.join_data = join_data;
            this.level = level;
        }
    }

    public String name;
    public String from;
    public String type;
    public int size = 0;
    private RedBlackBST<Integer, member> memDatabase;

    public Union(String name, String from, String type) {
        this.name = name;
        this.from = from;
        this.type = type;
    }

    public void joinMember(Student stu, int join_data, String level) {
        memDatabase.put(stu.num, new member(stu, join_data, level));
    }

    public void delMember(int num) {
        memDatabase.delete(num);
    }

    public Iterable<member> getAllMember() {
        Queue<member> mem = new Queue<member>();
        for (Integer member : memDatabase.keys()) {
            mem.enqueue(memDatabase.get(member));
        }
        return mem;
    }

}