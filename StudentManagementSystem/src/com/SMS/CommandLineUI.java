package com.SMS;

import com.SMS.lib.algs4.StdIn;
import com.SMS.lib.algs4.StdOut;

public class CommandLineUI {
    public static void main(String[] args) {
        StudentMangement sys = new StudentMangement();
        StdOut.println("欢迎使用学生信息管理系统（命令行版）");
        StdOut.println("请输入数字选择相应功能:");
        int chooseF = StdIn.readInt();
    }
}
