//日程：进行学生课表相关的管理
package com.SMS.base;

import com.SMS.lib.algs4.Bag;
import com.SMS.lib.algs4.LinearProbingHashST;
import com.SMS.lib.algs4.SET;

public class Schedule {
    private LinearProbingHashST<Integer, SET<Course>> stu2course;
    private SET<Integer>[][][] course2stu;

    public Schedule() {
        course2stu = (SET<Integer>[][][]) new SET[2][7][6];
        stu2course = new LinearProbingHashST<Integer, SET<Course>>();
    }

    public static void main(String[] args) {
        Schedule test_s = new Schedule();
        test_s.add_cour(new Course(20190105, "电子竞技导论", 'A', 523, 0, 2, 2));
        test_s.add_cour(new Course(20190105, "手机电竞实践", 'C', 553, 1, 1, 4));
        test_s.add_cour(new Course(20190105, "绝地求生与和平精英", 'W', 542, 1, 4, 4));
        test_s.add_cour(new Course(20190101, "手机电竞实践", 'C', 553, 1, 1, 4));
        test_s.add_cour(new Course(20190101, "绝地求生与和平精英", 'W', 542, 1, 4, 4));
    }

    // 获取指定学生的课程
    public Iterable<Course> get_cour(int num) {
        return stu2course.get(num);
    }

    // 添加课程
    public void add_cour(Course cour) {
        SET<Course> tc = stu2course.get(cour.stu_num);
        if (tc == null) {
            tc = new SET<Course>();
            stu2course.put(cour.stu_num, tc);
        }
        tc.add(cour);
        if (course2stu[cour.week][cour.day][cour.time] == null)
            course2stu[cour.week][cour.day][cour.time] = new SET<Integer>();
        course2stu[cour.week][cour.day][cour.time].add(cour.stu_num);
    }

    // 查空（返回有课的人数）
    public int[][][] get_free(Iterable<Integer> stu_num) {
        int[][][] busy = new int[2][7][6];
        // 默认free中全部为0
        for (int w = 0; w < 2; w++)
            for (int d = 0; d < 7; d++)
                for (int t = 0; t < 6; t++) {
                    for (int value : stu_num)
                        if (course2stu[w][d][t].contains(value))
                            busy[w][d][t]++;
                }
        return busy;
    }

    // 删除课程
    // ‼️ 注意：这里传入的是要删除课程的引用，其实我也不知道为什么，new一个出来也可以
    public void del_cour(Course cour) {
        SET<Course> tc = stu2course.get(cour.stu_num);
        if (tc == null)
            throw new IllegalArgumentException("无该课程，无法删除！");
        tc.delete(cour);
        course2stu[cour.week][cour.day][cour.time].delete(cour.stu_num);
    }

    //获取所有课程（导出用）
    public Iterable<Course> get_all_course() {
        Bag<Course> all = new Bag<Course>();
        for (Integer key : stu2course.keys()) {
            for (Course c : stu2course.get(key)) {
                all.add(c);
            }
        }
        return all;
    }
}