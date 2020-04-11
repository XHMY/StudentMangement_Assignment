//社团数据库：进行所有社团相关的管理
package com.SMS.base;
import com.SMS.lib.algs4.LinearProbingHashST;
import com.SMS.lib.algs4.Queue;

public class Uni_Database {

    LinearProbingHashST<String, Union> uni_data;

    public Uni_Database() {
        uni_data = new LinearProbingHashST<String, Union>();
    }

    // 返回一个可以遍历的所有社团的名字
    public Iterable<String> get_uni_name() {
        return uni_data.keys();
    }

    // 通过社团名获取指定的一个社团对象
    public Union get_nui(String name) {
        return uni_data.get(name);
    }

    //返回所有社团的
    public Iterable<Union> allUnion(){
        Queue<Union> queue = new Queue<Union>();
        for(String uname: uni_data.keys()){
            queue.enqueue(uni_data.get(uname));
        }
        return  queue;
    }

    // 添加新的社团
    public void add_uni(Union uni) {
        uni_data.put(uni.uniName, uni);
    }

    // 删除社团
    public void del_uni(String name) {
        uni_data.delete(name);
    }
}