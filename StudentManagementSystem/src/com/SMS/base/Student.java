//学生类：保存单个学生中的信息
package com.SMS.base;
public class Student {
    int num; // 学号
    String name; // 姓名
    Boolean sex; // True男 False女
    int clas; // 班别
    String prof; // 专业
    String colle; // 学院
    long tel; // 电话
    String wechat; // 微信ID
    int year; // 入学年份
    String dorm;// 宿舍号

    public Student() {
    }

    public Student(int num, String name, boolean sex, int clas, String prof, String colle, long tel, String wechat,
                   int year, String dorm) {
        this.num = num;
        this.sex = sex;
        this.clas = clas;
        this.prof = prof;
        this.colle = colle;
        this.tel = tel;
        this.wechat = wechat;
        this.year = year;
        this.dorm = dorm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", clas=" + clas +
                ", prof='" + prof + '\'' +
                ", colle='" + colle + '\'' +
                ", tel=" + tel +
                ", wechat='" + wechat + '\'' +
                ", year=" + year +
                ", dorm='" + dorm + '\'' +
                '}';
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public void setColle(String colle) {
        this.colle = colle;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }
}