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

    @Override
    public int compareTo(Course other) {
        int me_val = this.week * 100 + this.day + 10 + this.time;
        int oth_val = other.week * 100 + other.day + 10 + other.time;
        return Integer.compare(me_val, oth_val);
    }
}