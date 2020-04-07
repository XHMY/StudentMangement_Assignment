//日程：进行学生课表相关的管理
package com.SMS.base;
import com.SMS.algs4.LinearProbingHashST;
import com.SMS.algs4.SET;
import com.SMS.algs4.StdOut;

public class Schedule {

    private LinearProbingHashST<Integer, Course[][][]> stu2course;
    private SET<Integer>[][][] course2stu;

    public Schedule() {
        course2stu = (SET<Integer>[][][]) new SET[2][7][6];
        stu2course = new LinearProbingHashST<Integer, Course[][][]>();
    }

    // 获取指定学生的课程
    public Course[][][] get_cour(int num) {
        return stu2course.get(num);
    }

    // 添加课程
    public void add_cour(Course cour, int num, int week, int day, int time) {
        Course[][][] tc = stu2course.get(num);
        if (tc == null) {
            tc = new Course[2][7][6];
            stu2course.put(num, tc);
        }
        tc[week][day][time] = cour;
        if (course2stu[week][day][time] == null)
            course2stu[week][day][time] = new SET<Integer>();
        course2stu[week][day][time].add(num);
    }

    // 删除课程
    public void del_cour(Course cour, int num, int week, int day, int time) {
        Course[][][] tc = stu2course.get(num);
        if (tc == null)
            throw new IllegalArgumentException("无该课程，无法删除！");
        tc[week][day][time] = null;
        course2stu[week][day][time].delete(num);
    }

    // 查空
    public int[][][] get_free(int[] stu_num) {
        int[][][] free = new int[2][7][6];
        // 默认free中全部为0
        for (int w = 0; w < 2; w++)
            for (int d = 0; d < 7; d++)
                for (int t = 0; t < 6; t++) {
                    for (int i = 0; i < stu_num.length; i++)
                        if (course2stu[w][d][t].contains(stu_num[i]))
                            free[w][d][t]++;
                }
        return free;
    }

    public static void main(String[] args) {
        Schedule test_s = new Schedule();
        test_s.add_cour(new Course("电子竞技导论", 'A', 543), 20200101, 1, 2, 3);
        test_s.add_cour(new Course("社交学", 'B', 542), 20200101, 0, 2, 4);
        test_s.add_cour(new Course("电子竞技导论", 'A', 543), 20200101, 0, 2, 3);
        Course[][][] c = test_s.get_cour(20200101);
        StdOut.println();
    }
}