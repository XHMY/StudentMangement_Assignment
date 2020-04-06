//学生数据库：在数据库中管理学生

import lib.algs4.LinearProbingHashST;
import lib.algs4.Queue;
import lib.algs4.RedBlackBST;

public class Stu_Database {

    private RedBlackBST<Integer, Student> stu_num_data;
    private LinearProbingHashST<String, Student> stu_name_data;

    public Stu_Database() {
        stu_num_data = new RedBlackBST<Integer, Student>();
        stu_name_data = new LinearProbingHashST<String, Student>();
    }

    // 按学号顺序返回所有学生对象
    public Iterable<Student> all_stu() {
        Queue<Student> all = new Queue<Student>();
        for (int num : stu_num_data.keys()) {
            all.enqueue(stu_num_data.get(num));
        }
        return all;
    }

    // 按学号顺序返回[s,e]区间内的所有学生
    public Iterable<Student> all_stu(int s, int e) {
        Queue<Student> all = new Queue<Student>();
        for (int num : stu_num_data.keys(s, e)) {
            all.enqueue(stu_num_data.get(num));
        }
        return all;
    }

    // 通过学号获取一个学生对象
    public Student get_stu(int num) {
        return stu_num_data.get(num);
    }

    // 通过姓名获取一个学生对象
    public Student get_stu(String name) {
        return stu_name_data.get(name);
    }

    // 删除一个给定学号的学生
    public void del_stu(int num) {
        stu_name_data.delete(stu_num_data.get(num).name);
        stu_num_data.delete(num);

    }

    // 添加一个学生给定学号的学生
    public void add_stu(int num, Student stu) {
        stu_num_data.put(num, stu);
        stu_name_data.put(stu.name, stu);
    }

}