package com.SMS.base;
//作为单个课程的结构

public class Course implements Comparable<Course> {
    public int stu_num;
    public String name;
    public char pos;
    public int clasroom;
    public int week;
    public int day;
    public int time;

    public Course(int stu_num, String name, char pos, int clasroom, int week, int day, int time) {
        this.stu_num = stu_num;
        this.name = name;
        this.pos = pos;
        this.clasroom = clasroom;
        this.week = week;
        this.day = day;
        this.time = time;
    }

    public Course() {
    }

    public int getStu_num() {
        return stu_num;
    }

    public void setStu_num(int stu_num) {
        this.stu_num = stu_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPos() {
        return pos;
    }

    public void setPos(char pos) {
        this.pos = pos;
    }

    public int getClasroom() {
        return clasroom;
    }

    public void setClasroom(int clasroom) {
        this.clasroom = clasroom;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Course other) {
        int me_val = this.week * 100 + this.day + 10 + this.time;
        int oth_val = other.week * 100 + other.day + 10 + other.time;
        return Integer.compare(me_val, oth_val);
    }

    @Override
    public String toString() {
        return "Course{" +
                "stu_num=" + stu_num +
                ", name='" + name + '\'' +
                ", pos=" + pos +
                ", clasroom=" + clasroom +
                ", week=" + week +
                ", day=" + day +
                ", time=" + time +
                '}';
    }
}