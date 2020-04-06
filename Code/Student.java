//学生类：保存单个学生中的信息

public class Student {
    int num; // 学号
    String name; // 姓名
    boolean sex; // True男 False女
    String clas; // 班别
    String prof; // 专业
    String colle; // 学院
    long tel; // 电话
    String wechat; // 微信ID
    int year; // 入学年份
    String dorm;// 宿舍号

    public Student(int num, String name, boolean sex, String clas, String prof, String colle, long tel, String wechat,
            int year, String dorm) {
        this.num = num;
        this.sex = sex;
        this.clas = clas;
        this.prof = prof;
        this.colle = colle;
        this.tel = tel;
        this.wechat = wechat;
        this.year = year;
        this.dorm = dorm;
    }

}