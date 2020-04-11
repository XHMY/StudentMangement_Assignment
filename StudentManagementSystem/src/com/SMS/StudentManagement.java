//学生管理系统接口：提供给前台程序使用
package com.SMS;

import com.SMS.base.*;
import com.SMS.lib.algs4.StdOut;

import java.io.IOException;
import java.util.Date;

public class StudentManagement {
    private Authentication atc;
    private Stu_Database stuD;
    private Uni_Database uniD;
    private StuSysIO ssIO;
    private Schedule schD;

    public StudentManagement() throws IOException {
        atc = new Authentication();
        stuD = new Stu_Database();
        uniD = new Uni_Database();
        ssIO = new StuSysIO();
        schD = new Schedule();
        if (!StuSysIO.createFile("data/stu.csv")) {
            ssIO.sysImport(stuD, "data/stu.csv");
        }
        if (!StuSysIO.createFile("data/uni.csv")) {
            StuSysIO.createFile("data/unimem.csv");
            ssIO.sysImport(uniD, "data/uni.csv", "data/unimem.csv");
        }
        if (!StuSysIO.createFile("data/cour.csv")) {
            ssIO.sysImport(schD, "data/cour.csv");
        }
    }

    public static void main(String[] args) throws IOException {
        StudentManagement sm = new StudentManagement();
        for (String s : sm.Get_union_name()) {
            StdOut.println(s);
        }
    }

    // 登陆界面
    // 提交登陆请求
    public boolean Login(String acc, String pas) {
        return atc.check_user(acc, pas);
    }

    // 学生资料界面
    // 用学号查询学生
    public Student Get_stu(int num) {
        return stuD.get_stu(num);
    }

    // 添加学生
    public void Add_stu(Student stu) {
        stuD.add_stu(stu.getNum(), stu);
    }

    // 修改学生信息
    public void Modify_stu(Student bef, Student aft) {
        stuD.del_stu(bef.getNum());
        stuD.add_stu(aft.getNum(), aft);
    }

    // 学生日程
    public Iterable<Course> Get_course(int num) {
        return schD.get_cour(num);
    }

    // 添加日程
    public void Add_course(Course cou) {
        schD.add_cour(cou);
    }

    // 修改日程
    public void Modify_course(Course bef, Course aft) {
        schD.del_cour(bef);
        schD.add_cour(aft);
    }

    // 导入
    // 导入学生资料
    public void Import_stu(String file) throws IOException {
        ssIO.sysImport(stuD, file);
    }

    //导入社团信息
    public void Import_uni(String uni_file, String mem_file) throws IOException {
        ssIO.sysImport(uniD, uni_file, mem_file);
    }

    // 导入课程表
    public void Import_course(String file) throws IOException {
        ssIO.sysImport(schD, file);
    }

    // 导出
    // 批量查找指定范围的学生
    public Iterable<Student> Get_Many_stu(int from, int to) {
        return stuD.all_stu(from, to);
    }

    // 导出所有学生
    public void Export_stu(String file) throws IOException {
        ssIO.sysExport(stuD, file);
    }

    // 导出课程表
    public void Export_course(String file) throws IOException {
        ssIO.sysExport(schD, file);
    }

    //导出社团信息
    public void Export_uni(String uni_file, String mem_file) throws IOException {
        ssIO.sysExport(uniD, uni_file, mem_file);
    }

    // 社团管理
    // 查找社团列表
    public Iterable<String> Get_union_name() {
        return uniD.get_uni_name();
    }

    // 批量加入社团
    public void Join_union(String num_all, Union uni, Date dta, String lev) {
        String[] stu = num_all.split(",");
        for (String s : stu) {
            uni.joinMember(Integer.parseInt(s), dta, lev);
        }
    }

    // 从社团移除学生
    public void Remove_from_union(Integer[] stu_num, Union uni) {
        for (Integer stu : stu_num) {
            uni.delMember(stu);
        }
    }

    // 获取社团的学生列表（这个member是Union类里面的属性）
    public Iterable<Union.member> Get_union_stu(String uni_name) {
        return uniD.get_nui(uni_name).getAllMember();
    }

    // 获取社团信息
    public Union Get_Union(String name) {
        return uniD.get_nui(name);
    }

    // 用一组学号列表查空
    public int[][][] Get_free(Iterable<Integer> num_many) {
        return schD.get_free(num_many);
    }

    public int[][][] Get_free(String uni_name) {
        return schD.get_free(uniD.get_nui(uni_name).getAllMemberNum());
    }

    public void call_when_exit() throws IOException {
        ssIO.sysExport(stuD, "data/stu.csv");
        ssIO.sysExport(uniD, "data/uni.csv", "data/unimem.csv");
        ssIO.sysExport(stuD, "data/cour.csv");
    }
}
