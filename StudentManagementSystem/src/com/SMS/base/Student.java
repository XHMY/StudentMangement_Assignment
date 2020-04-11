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
        this.name = name;
        this.sex = sex;
        this.clas = clas;
        this.prof = prof;
        this.colle = colle;
        this.tel = tel;
        this.wechat = wechat;
        this.year = year;
        this.dorm = dorm;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getColle() {
        return colle;
    }

    public void setColle(String colle) {
        this.colle = colle;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
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
}