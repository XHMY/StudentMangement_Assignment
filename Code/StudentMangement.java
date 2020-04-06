//学生管理系统接口：提供给前台程序使用

public class StudentMangement {
    // 登陆界面
    // 提交登陆请求
    public static boolean Login(String acc, String pas) {
        Authentication atc = new Authentication();
        return atc.check_user(acc, pas);
    }

    // 学生资料界面
    // 用学号查询学生
    public Student Get_stu(int num) {

    }

    // 添加学生
    public void Add_stu(Student stu) {

    }

    // 修改学生信息
    public void Modify_stu(Student bef, Student aft) {

    }

    // 学生日程
    public Course[][][] Get_course(int num) {

    }

    // 添加日程
    public void Add_course(Course cou, int num, int week, int day, int time) {

    }

    // 修改日程
    public void Modify_course(Course aft, int num, int week, int day, int time) {

    }

    // 导入
    // 导入学生资料
    public void Import_stu(String file) {

    }

    // 导入课程表
    public void Import_course(String file) {

    }

    // 导出
    // 批量查找
    public Student[] Get_Many_stu(String num) {

    }

    // 批量导出学生
    public void Export_stu(int[] num) {

    }

    // 社团管理
    // 查找社团列表
    public String[] Get_union_name() {

    }

    // 批量加入社团
    public boolean Join_union(String num) {

    }

    // 从社团移除学生
    public void Remove_from_union(Student[] stu) {

    }

    // 获取社团的学生列表
    public Student[] Get_union_stu(String name) {

    }

    // 获取社团信息
    public Union Get_Union(String name) {

    }

    // 用一组学号列表查空
    public int[][][] Get_free(int[] num) {

    }

    public int[][][] Get_free(Union uin) {

    }
}
