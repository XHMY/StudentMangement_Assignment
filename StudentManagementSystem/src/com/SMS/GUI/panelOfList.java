package com.SMS.GUI;

import com.SMS.base.Student;
import com.SMS.base.Union;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.text.SimpleDateFormat;

public class panelOfList extends JPanel {
    static int space_x = 3+83;//x轴间隔
    static int space_y = 31+1;//y轴间隔
    static int width = 83;
    static int height = 31;
    static int a = 0;//用于循环控制布局
    static int b = 0;//用于读取

    //表头
    public panelOfList(){
        this.setLayout(null);
        this.setBackground(Color.white);
        //创建表头
        labelOfTable top1 = new labelOfTable("学号");
        top1.setFont(new Font("Frame.type",0,20));
        this.add(top1);
        top1.setBounds( 0, 0, width,height);

        labelOfTable top2 = new labelOfTable("姓名");
        top2.setFont(new Font("Frame.type",0,20));
        this.add(top2);
        top2.setBounds(space_x,0,width,height);

        labelOfTable top3 = new labelOfTable("学院");
        top3.setFont(new Font("Frame.type",0,20));
        this.add(top3);
        top3.setBounds(space_x*2,0,width,height);

        labelOfTable top4 = new labelOfTable("专业");
        top4.setFont(new Font("Frame.type",0,20));
        this.add(top4);
        top4.setBounds(space_x*3,0,width,height);

        labelOfTable top5 = new labelOfTable("加入时间");
        top5.setFont(new Font("Frame.type",0,20));
        this.add(top5);
        top5.setBounds(space_x*4,0,width,height);

        labelOfTable top6 = new labelOfTable("团内职务");
        top6.setFont(new Font("Frame.type",0,20));
        this.add(top6);
        top6.setBounds(space_x*5,0,width,height);
    }

    //成员列表
    public panelOfList(String unionname){
        this.setLayout(null);
        this.setBackground(Color.white);

        boolean judge = true;//用于选择颜色
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");//data转String格式
        for(Union.member member : Frame.studentManage.Get_union_stu(unionname)){
            if(judge) {
                judge = false;
                Color color = new Color(207,213,234);
                Student stu = Frame.studentManage.Get_stu(member.getStu_num());

                labelOfTable top1 = new labelOfTable(Integer.toString(stu.getNum()),color);//获得学号
                this.add(top1);
                top1.setBounds(0, space_y*a, width, height);

                labelOfTable top2 = new labelOfTable(stu.getName(),color);//获得名字
                this.add(top2);
                top2.setBounds(space_x, space_y*a, width, height);

                labelOfTable top3 = new labelOfTable(stu.getColle(),color);//获得学院
                this.add(top3);
                top3.setBounds(space_x * 2, space_y*a, width, height);
                while (top3.getText().length()*top3.getFont().getSize() > top3.getWidth()) {
                    int size = top3.getFont().getSize();
                    size--;
                    top3.setFont(new Font(Frame.type, 0, size));
                    if(size < 10){top3.setToolTipText(top3.getText());}
                }

                labelOfTable top4 = new labelOfTable(stu.getProf(),color);//获得专业
                this.add(top4);
                top4.setBounds(space_x * 3, space_y*a, width, height);
                while (top4.getText().length()*top4.getFont().getSize() > top4.getWidth()) {
                    int size = top4.getFont().getSize();
                    size--;
                    top4.setFont(new Font(Frame.type, 0, size));
                    if(size < 10){top4.setToolTipText(top4.getText());}
                }

                labelOfTable top5 = new labelOfTable(timeFormat.format(member.getJoin_data()),color);//获得加入年份
                this.add(top5);
                top5.setBounds(space_x * 4, space_y*a, width, height);

                labelOfTable top6 = new labelOfTable(member.getLevel(),color);//获得团内职务
                this.add(top6);
                top6.setBounds(space_x * 5, space_y*a, width, height);

                a++;

            }
            else{
                judge = true;
                Color color = new Color(233,235,245);
                Student stu = Frame.studentManage.Get_stu(member.getStu_num());

                labelOfTable top1 = new labelOfTable(Integer.toString(stu.getNum()),color);//获得学号
                this.add(top1);
                top1.setBounds(0, space_y*a, width, height);

                labelOfTable top2 = new labelOfTable(stu.getName(),color);//获得名字
                this.add(top2);
                top2.setBounds(space_x, space_y*a, width, height);

                labelOfTable top3 = new labelOfTable(stu.getColle(),color);//获得学院
                this.add(top3);
                top3.setBounds(space_x * 2, space_y*a, width, height);
                while (top3.getText().length()*top3.getFont().getSize() > top3.getWidth()) {
                    int size = top3.getFont().getSize();
                    size--;
                    top3.setFont(new Font(Frame.type, 0, size));
                    if(size < 10){top3.setToolTipText(top3.getText());}
                }

                labelOfTable top4 = new labelOfTable(stu.getProf(),color);//获得专业
                this.add(top4);
                top4.setBounds(space_x * 3, space_y*a, width, height);
                while (top4.getText().length()*top4.getFont().getSize() > top4.getWidth()) {
                    int size = top4.getFont().getSize();
                    size--;
                    top4.setFont(new Font(Frame.type, 0, size));
                    if(size < 10){top4.setToolTipText(top4.getText());}
                }

                labelOfTable top5 = new labelOfTable(timeFormat.format(member.getJoin_data()),color);//获得加入年份
                this.add(top5);
                top5.setBounds(space_x * 4, space_y*a, width, height);

                labelOfTable top6 = new labelOfTable(member.getLevel(),color);//获得团内职务
                this.add(top6);
                top6.setBounds(space_x * 5, space_y*a, width, height);

                a++;

            }

        }b = a;a = 0;
    }
}
