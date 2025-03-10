package com.SMS.GUI;

import com.SMS.base.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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

	//输入框
	JTextField nameField = new JTextField();//名字输入框
	JTextField sexField = new JTextField();//性别输入框
	JComboBox<String> sexBox = new JComboBox<>();//性别下拉列表
	JTextField numField = new JTextField();//学号输入框
	JTextField classnumField = new JTextField();//班级输入框
	JTextField collegeField = new JTextField();//学院输入框
	JTextField telnumField = new JTextField();//电话输入框
	JTextField majorField = new JTextField();//专业输入框
	JTextField wechatField = new JTextField();//微信输入框
	JTextField yearField = new JTextField();//入学年份输入框
	JTextField dormField = new JTextField();//宿舍号输入框

	public DataPanel(){
		setLayout(null);

		boolean a = true;

		//创建姓名
		JLabel name = new JLabel("姓名:");
		labelFactor(name, this);
		name.setBounds(x, 0, width, height);

		nameField.setText("请输入姓名");
		textFieldFactor(nameField, this, true);
		nameField.setBounds(x + width + 10, 0, fieldWidth, height);
		nameField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(nameField.getText().equals("请输入姓名"))nameField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(nameField.getText().length() == 0)nameField.setText("请输入姓名");
			}
		});

		//创建性别
		JLabel sex = new JLabel("性别:");
		labelFactor(sex, this);
		sex.setBounds(x + space_x, 0, width, height);

		sexBox.addItem("男");
		sexBox.addItem("女");
		sexBox.setBackground(bc);
		sexBox.setForeground(clolr);
		sexBox.setFont(font);
		sexBox.setBorder(null);
		sexBox.setEditable(true);
		add(sexBox);
		sexBox.setBounds(x + space_x + width + 10, 0, fieldWidth, height);

		//创建学号
		JLabel num = new JLabel("学号:");
		labelFactor(num, this);
		num.setBounds(x, space_y, width, height);

		numField.setText("请输入学号");
		textFieldFactor(numField, this, a);
		numField.setBounds(x + width + 10, space_y, fieldWidth, height);
		numField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(numField.getText().equals("请输入学号"))numField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(numField.getText().length() == 0)numField.setText("请输入学号");
			}
		});

		//班级
		JLabel classnum = new JLabel("班级:");
		labelFactor(classnum, this);
		classnum.setBounds(x + space_x, space_y, width, height);

		classnumField.setText("请输入班级序号,如 1");
		textFieldFactor(classnumField, this, a);
		classnumField.setBounds(x + space_x + width + 10, space_y, fieldWidth, height);
		classnumField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(classnumField.getText().equals("请输入班级序号,如 1"))classnumField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(classnumField.getText().length() == 0)classnumField.setText("请输入班级序号,如 1");
			}
		});

		//学院
		JLabel college = new JLabel("学院:");
		labelFactor(college, this);
		college.setBounds(x, space_y * 2, width, height);

		collegeField.setText("请输入学院名称");
		textFieldFactor(collegeField, this, a);
		collegeField.setBounds(x + width + 10, space_y * 2, fieldWidth, height);
		collegeField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(collegeField.getText().equals("请输入学院名称"))collegeField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(collegeField.getText().length() == 0)collegeField.setText("请输入学院名称");
			}
		});

		//电话
		JLabel telnum = new JLabel("电话:");
		labelFactor(telnum, this);
		telnum.setBounds(x + space_x, space_y * 2, width, height);

		telnumField.setText("请输入号码");
		textFieldFactor(telnumField, this, a);
		telnumField.setBounds(x + space_x + width + 10, space_y * 2, fieldWidth, height);
		telnumField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(telnumField.getText().equals("请输入号码"))telnumField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(telnumField.getText().length() == 0)telnumField.setText("请输入号码");
			}
		});

		//专业
		JLabel major = new JLabel("专业:");
		labelFactor(major, this);
		major.setBounds(x, space_y * 3, width, height);

		majorField.setText("请输入专业名称");
		textFieldFactor(majorField, this, a);
		majorField.setBounds(x + width + 10, space_y * 3, fieldWidth, height);
		majorField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(majorField.getText().equals("请输入专业名称"))majorField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(majorField.getText().length() == 0)majorField.setText("请输入专业名称");
			}
		});

		//微信
		JLabel wechat = new JLabel("微信:");
		labelFactor(wechat, this);
		wechat.setBounds(x + space_x, space_y * 3, width, height);

		wechatField.setText("请输入微信号");
		textFieldFactor(wechatField, this, a);
		wechatField.setBounds(x + space_x + width + 10, space_y * 3, fieldWidth, height);
		wechatField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(wechatField.getText().equals("请输入微信号"))wechatField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(wechatField.getText().length() == 0)wechatField.setText("请输入微信号");
			}
		});

		//创建入学年份
		JLabel year = new JLabel("入学年份:");
		labelFactor(year, this);
		year.setBounds(x, space_y * 4, 78, 25);

		yearField.setText("请输入入学年份");
		textFieldFactor(yearField, this, a);
		yearField.setBounds(x + 78 + 10, space_y * 4, 114, height);
		yearField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(yearField.getText().equals("请输入入学年份"))yearField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(yearField.getText().length() == 0)yearField.setText("请输入入学年份");
			}
		});

		//创建宿舍号
		JLabel dorm = new JLabel("宿舍号:");
		labelFactor(dorm, this);
		dorm.setBounds(x + space_x, space_y * 4, 60, 25);

		dormField.setText("请输入宿舍号");
		textFieldFactor(dormField, this, a);
		dormField.setBounds(x + space_x + 60 + 10, space_y * 4, 132, height);
		dormField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(dormField.getText().equals("请输入宿舍号"))dormField.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(dormField.getText().length() == 0)dormField.setText("请输入宿舍号");
			}
		});
	}

	public DataPanel(boolean a, Student student) {
		setLayout(null);

		if(student != null) {
			//创建姓名
			JLabel name = new JLabel("姓名:");
			labelFactor(name, this);
			name.setBounds(x, 0, width, height);

			nameField.setText(student.getName());
			textFieldFactor(nameField, this, a);
			nameField.setBounds(x + width + 10, 0, fieldWidth, height);

			//创建性别
			JLabel sex = new JLabel("性别:");
			labelFactor(sex, this);
			sex.setBounds(x + space_x, 0, width, height);

			sexBox.addItem("男");
			sexBox.addItem("女");
			sexBox.setBackground(bc);
			sexBox.setForeground(clolr);
			sexBox.setFont(font);
			sexBox.setBorder(null);
			sexBox.setEditable(a);
			add(sexBox);

			sexField.setText(judgeSex(student.getSex()));
			textFieldFactor(sexField,this,false);
			if(a) {
				sexBox.setBounds(x + space_x + width + 10, 0, fieldWidth, height);
			}
			else{
				sexField.setBounds(x + space_x + width + 10, 0, fieldWidth, height);
			}
			//创建学号
			JLabel num = new JLabel("学号:");
			labelFactor(num, this);
			num.setBounds(x, space_y, width, height);

			numField.setText(Integer.toString(student.getNum()));
			textFieldFactor(numField, this, a);
			numField.setBounds(x + width + 10, space_y, fieldWidth, height);

			//班级
			JLabel classnum = new JLabel("班级:");
			labelFactor(classnum, this);
			classnum.setBounds(x + space_x, space_y, width, height);

			classnumField.setText(Integer.toString(student.getClas()));
			textFieldFactor(classnumField, this, a);
			classnumField.setBounds(x + space_x + width + 10, space_y, fieldWidth, height);

			//学院
			JLabel college = new JLabel("学院:");
			labelFactor(college, this);
			college.setBounds(x, space_y * 2, width, height);

			collegeField.setText(student.getColle());
			textFieldFactor(collegeField, this, a);
			collegeField.setBounds(x + width + 10, space_y * 2, fieldWidth, height);

			//电话
			JLabel telnum = new JLabel("电话:");
			labelFactor(telnum, this);
			telnum.setBounds(x + space_x, space_y * 2, width, height);

			telnumField.setText(Long.toString(student.getTel()));
			textFieldFactor(telnumField, this, a);
			telnumField.setBounds(x + space_x + width + 10, space_y * 2, fieldWidth, height);

			//专业
			JLabel major = new JLabel("专业:");
			labelFactor(major, this);
			major.setBounds(x, space_y * 3, width, height);

			majorField.setText(student.getProf());
			textFieldFactor(majorField, this, a);
			majorField.setBounds(x + width + 10, space_y * 3, fieldWidth, height);

			//微信
			JLabel wechat = new JLabel("微信:");
			labelFactor(wechat, this);
			wechat.setBounds(x + space_x, space_y * 3, width, height);

			wechatField.setText(student.getWechat());
			textFieldFactor(wechatField, this, a);
			wechatField.setBounds(x + space_x + width + 10, space_y * 3, fieldWidth, height);

			//创建入学年份
			JLabel year = new JLabel("入学年份:");
			labelFactor(year, this);
			year.setBounds(x, space_y * 4, 78, 25);

			yearField.setText(Integer.toString(student.getYear()));
			textFieldFactor(yearField, this, a);
			yearField.setBounds(x + 78 + 10, space_y * 4, 114, height);

			//创建宿舍号
			JLabel dorm = new JLabel("宿舍号:");
			labelFactor(dorm, this);
			dorm.setBounds(x + space_x, space_y * 4, 60, 25);

			dormField.setText(student.getDorm());
			textFieldFactor(dormField, this, a);
			dormField.setBounds(x + space_x + 60 + 10, space_y * 4, 132, height);
		}
		if(student == null){
			//创建姓名
			JLabel name = new JLabel("姓名:");
			labelFactor(name, this);
			name.setBounds(x, 0, width, height);

			nameField.setText(null);
			textFieldFactor(nameField, this, a);
			nameField.setBounds(x + width + 10, 0, fieldWidth, height);

			//创建性别
			JLabel sex = new JLabel("性别:");
			labelFactor(sex, this);
			sex.setBounds(x + space_x, 0, width, height);

			sexBox.setBackground(bc);
			sexBox.setForeground(clolr);
			sexBox.setFont(font);
			sexBox.setBorder(null);
			sexBox.setEditable(a);
			add(name);
			sexBox.setBounds(x + space_x + width + 10, 0, fieldWidth, height);

			//创建学号
			JLabel num = new JLabel("学号:");
			labelFactor(num, this);
			num.setBounds(x, space_y, width, height);

			numField.setText(null);
			textFieldFactor(numField, this, a);
			numField.setBounds(x + width + 10, space_y, fieldWidth, height);

			//班级
			JLabel classnum = new JLabel("班级:");
			labelFactor(classnum, this);
			classnum.setBounds(x + space_x, space_y, width, height);

			classnumField.setText(null);
			textFieldFactor(classnumField, this, a);
			classnumField.setBounds(x + space_x + width + 10, space_y, fieldWidth, height);

			//学院
			JLabel college = new JLabel("学院:");
			labelFactor(college, this);
			college.setBounds(x, space_y * 2, width, height);

			collegeField.setText(null);
			textFieldFactor(collegeField, this, a);
			collegeField.setBounds(x + width + 10, space_y * 2, fieldWidth, height);

			//电话
			JLabel telnum = new JLabel("电话:");
			labelFactor(telnum, this);
			telnum.setBounds(x + space_x, space_y * 2, width, height);

			telnumField.setText(null);
			textFieldFactor(telnumField, this, a);
			telnumField.setBounds(x + space_x + width + 10, space_y * 2, fieldWidth, height);

			//专业
			JLabel major = new JLabel("专业:");
			labelFactor(major, this);
			major.setBounds(x, space_y * 3, width, height);

			majorField.setText(null);
			textFieldFactor(majorField, this, a);
			majorField.setBounds(x + width + 10, space_y * 3, fieldWidth, height);

			//微信
			JLabel wechat = new JLabel("微信:");
			labelFactor(wechat, this);
			wechat.setBounds(x + space_x, space_y * 3, width, height);

			wechatField.setText(null);
			textFieldFactor(wechatField, this, a);
			wechatField.setBounds(x + space_x + width + 10, space_y * 3, fieldWidth, height);

			//创建入学年份
			JLabel year = new JLabel("入学年份:");
			labelFactor(year, this);
			year.setBounds(x, space_y * 4, 78, 25);

			yearField.setText(null);
			textFieldFactor(yearField, this, a);
			yearField.setBounds(x + 78 + 10, space_y * 4, 114, height);

			//创建宿舍号
			JLabel dorm = new JLabel("宿舍号:");
			labelFactor(dorm, this);
			dorm.setBounds(x + space_x, space_y * 4, 60, 25);

			dormField.setText(null);
			textFieldFactor(dormField, this, a);
			dormField.setBounds(x + space_x + 60 + 10, space_y * 4, 132, height);
		}
	}

	//判断性别
	public static String judgeSex(boolean a){
		if(a){return "男";}
		else{return "女";}
	}
	public static boolean judgeSex(int a){
		if(a == 0){return true;}
		else{return false;}
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