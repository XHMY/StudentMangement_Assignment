package com.SMS;

import com.SMS.base.Stu_Database;
import com.SMS.base.Student;
import com.SMS.lib.algs4.Bag;
import com.SMS.lib.algs4.StdOut;
import com.SMS.lib.algs4.StopwatchCPU;

import java.io.IOException;
import java.util.Random;

public class PerformanceTest {



    public PerformanceTest() {
    }

    public static void testStuDat() {
        final Stu_Database std = new Stu_Database();
        Random R = new Random(1234);


    }
    public static void testSchedule() throws IOException {
        final  StudentManagement sm= new StudentManagement();
        Bag<Integer> b = new Bag<Integer>();
        for(Student s: sm.Get_Many_stu(0,100000000)){
            b.add(s.getNum());
        }
        StopwatchCPU stopwatch = new StopwatchCPU();
        sm.Get_free(b);
        double finish_add = stopwatch.elapsedTime();
        StdOut.println(finish_add);
    }

    public static void testStart() throws IOException {
        final  StudentManagement sm;

        StopwatchCPU stopwatch = new StopwatchCPU();
        sm = new StudentManagement();
        double finish_add = stopwatch.elapsedTime();
        StdOut.println(finish_add);
    }

    public static void main(String[] args) throws IOException {
        testSchedule();
    }

}
