package com.SMS.GUI;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel{
    //字体常量
	static Font font = new Font(Frame.type,0,18);
	static Color clolr = new Color(118,113,113);
	
	//Label位置常量
	static int width = 42;
	static int height = 25;
	static int space_y = 67;
	static int space_x = 220;
	static int x= 0;
	
	//TextField常量
	static Color bc = Frame.bc;
	static int fieldWidth = 150;
	
	public DataPanel(boolean a) {
		setLayout(null);
		
		//创建姓名
		JLabel name = new JLabel("姓名:");
		labelFactor(name,this);
		name.setBounds(x, 0, width, height);
		
		JTextField nameField = new JTextField();
		textFieldFactor(nameField,this,a);
		nameField.setBounds(x+width+10, 0, fieldWidth, height);
		
		//创建性别
		JLabel sex = new JLabel("性别:");
		labelFactor(sex,this);
		sex.setBounds(x+space_x, 0, width, height);
		
		JTextField sexField = new JTextField();
		textFieldFactor(sexField,this,a);
		sexField.setBounds(x+space_x+width+10, 0, fieldWidth, height);
		
		//创建学号
		JLabel num = new JLabel("学号:");
		labelFactor(num,this);
		num.setBounds(x, space_y, width, height);
		
		JTextField numField = new JTextField();
		textFieldFactor(numField,this,a);
		numField.setBounds(x+width+10, space_y, fieldWidth, height);
		
		//班级
		JLabel classnum = new JLabel("班级:");
		labelFactor(classnum,this);
		classnum.setBounds(x+space_x, space_y, width, height);
		
		JTextField classnumField = new JTextField();
		textFieldFactor(classnumField,this,a);
		classnumField.setBounds(x+space_x+width+10, space_y, fieldWidth, height);
		
		//学院
		JLabel college = new JLabel("学院:");
		labelFactor(college,this);
		college.setBounds(x, space_y*2, width, height);
		
		JTextField collegeField = new JTextField();
		textFieldFactor(collegeField,this,a);
		collegeField.setBounds(x+width+10, space_y*2, fieldWidth, height);
		
		//电话
		JLabel telnum = new JLabel("电话:");
		labelFactor(telnum,this);
		telnum.setBounds(x+space_x, space_y*2, width, height);
		
		JTextField telnumField = new JTextField();
		textFieldFactor(telnumField,this,a);
		telnumField.setBounds(x+space_x+width+10, space_y*2, fieldWidth, height);
		
		//专业
		JLabel major = new JLabel("专业:");
		labelFactor(major,this);
		major.setBounds(x, space_y*3, width, height);
		
		JTextField majorField = new JTextField();
		textFieldFactor(majorField,this,a);
		majorField.setBounds(x+width+10, space_y*3, fieldWidth, height);
		
		//微信
		JLabel wechat = new JLabel("微信:");
		labelFactor(wechat,this);
		wechat.setBounds(x+space_x, space_y*3, width, height);
		
		JTextField wechatField = new JTextField();
		textFieldFactor(wechatField,this,a);
		wechatField.setBounds(x+space_x+width+10, space_y*3, fieldWidth, height);
		
		//创建入学年份
		JLabel year = new JLabel("入学年份:");
		labelFactor(year,this);
		year.setBounds(x, space_y*4, 78, 25);
		
		JTextField yearField = new JTextField();
		textFieldFactor(yearField,this,a);
		yearField.setBounds(x+78+10, space_y*4, 114, height);
		
		//创建宿舍号
		JLabel dorm = new JLabel("宿舍号:");
		labelFactor(dorm,this);
		dorm.setBounds(x+space_x, space_y*4, 60, 25);
		
		JTextField dormField = new JTextField();
		textFieldFactor(dormField,this,a);
		dormField.setBounds(x+space_x+60+10, space_y*4, 132, height);
	}
	
	//设置文本同一属性
	public static void labelFactor(JLabel name,DataPanel panel) {
		name.setFont(font);
		name.setForeground(clolr);
		panel.add(name);
	}
	
	//设置输入框同一属性
	public static void textFieldFactor(JTextField name,DataPanel panel,boolean a) {
		name.setBackground(bc);
		name.setForeground(clolr);
		name.setFont(font);
		name.setBorder(null);
		name.setEditable(a);
		panel.add(name);
	}
}