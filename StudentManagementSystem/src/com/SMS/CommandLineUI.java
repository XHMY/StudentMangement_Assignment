package com.SMS;

import com.SMS.lib.algs4.StdIn;
import com.SMS.lib.algs4.StdOut;

import java.io.IOException;

public class CommandLineUI {
    public static void main(String[] args) throws IOException {
        StudentManagement sys = new StudentManagement();
        StdOut.println("欢迎使用学生信息管理系统（命令行版）");
        StdOut.println("请输入数字选择相应功能:");
        if (args.length == 0) {
            StdOut.println("1、添加指定学生在指定时间一次缺课记录\n2、录入指定学生在指定时间的缺课记录\n3、修改指定学生在指定时间的缺课记录\n4、查询并打印指定学生全部的缺课记录\n5、查询指定时间段内的全部缺课学生并按缺课次数顺序打印\n输入-1结束程序\n");
        }
        int chooseF = StdIn.readInt();
    }
}
