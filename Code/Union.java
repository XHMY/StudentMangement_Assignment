package Code;

import Code.lib.algs4.BST;

public class Union {

    private class member {
        Student stu;
        int join_data;
        String level;

        public member(Student stu, int join_data, String level) {
            this.stu = stu;
            this.join_data = join_data;
            this.level = level;
        }
    }

    public String name;
    public String from;
    public String type;
    public int size = 0;
    private BST<Integer, member> memDatabase;

    public Union(String name, String from, String type) {
        this.name = name;
        this.from = from;
        this.type = type;
    }

    public void joinMember(Student stu, int join_data, String level) {
        memDatabase.put(stu.num, new member(stu, join_data, level));
    }

}