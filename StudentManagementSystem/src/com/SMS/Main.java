package com.SMS;
import com.SMS.base.Student;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.Add_stu(new Student(20190103, "Fuck", true, 2, "数据科学与大数据技术",
                "腾讯云大数据学院", 1330223444, "efefe", 2019, "5567"));
        studentManagement.call_when_exit();
    }
}
