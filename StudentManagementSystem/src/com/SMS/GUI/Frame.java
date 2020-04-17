package com.SMS.GUI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.SMS.StudentManagement;
import com.SMS.base.Course;
import com.SMS.base.Schedule;
import com.SMS.base.Student;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Frame {
	
	
	//一般窗口常量
	static int cfx = 510;
	static int cfy = 122;
	static int cfwidth = 528;
	static int cfheight = 600;
	static int cpheight = cfheight-BackgroundFrame.d;
	
	static Color bc = new Color(242,242,242);
	static Color fc = new Color(47,85,151);
	
	static String type = "微软雅黑";
		
	static BackgroundFrame homeFrame = new BackgroundFrame(cfx, cfy, cfwidth, cfheight,true);
	static JPanel secmain = new JPanel();
	static CardLayout cl = new CardLayout();
	static JPanel cardpanel = new JPanel(cl);

	//学生对象
	static Student student = new Student();
	static StudentManagement studentManage;
	static {
		try {
			studentManage = new StudentManagement();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static Schedule schedule = new Schedule();
	static int w = 1;//计算周数

	static int test = 0;
	static boolean judge1 = true;
	static boolean judge2 = false;

	//登录界面
	public static void LoginFrame() throws IOException {
		BackgroundFrame login = new BackgroundFrame(530,250,500,320,new Color(45,85,151));
		StudentManagement studentManage = new StudentManagement();
		
		//添加标签
		JLabel label1 = new JLabel("账号");
		JLabel label2 = new JLabel("密码");
		
		login.main.add(label1);
		login.main.add(label2);
		
		label1.setBounds(160, 70,50,30);
		label2.setBounds(160, 140, 50, 30);
		
			//设置标签字体
		label1.setFont(new Font(type,0,24));
		label1.setForeground(new Color(193,207,225));
		label2.setFont(new Font(type,0,24));
		label2.setForeground(new Color(193,207,225));
		
		//添加账号框和密码框
		JTextField account = new JTextField();
		JPasswordField password = new JPasswordField();
		
		login.main.add(account);
		login.main.add(password);
		
		account.setBounds(215, 70, 150, 30);
		password.setBounds(215,140,150,30);
		
			//取消边框
		account.setBorder(null);
		password.setBorder(null);
		
			//设置背景颜色
		account.setBackground(new Color(133, 152, 185));
		password.setBackground(new Color(133, 152, 185));

		//设置输入字体
		account.setForeground(Color.white);
		account.setFont(new Font(type, 0, 14));
		password.setForeground(Color.white);
		password.setFont(new Font(type, 0, 14));

		//添加登录按钮
		ImageIcon icon1 = new ImageIcon("src/com/SMS/GUI/image/lgButton3.png");
		JLabel button = new JLabel();
		button.setIcon(icon1);
		login.main.add(button);
		button.setBounds(220, 210, 100, 41);

		//创建错误提示
		JLabel tips = new JLabel("账号或密码不能为空");
		JLabel tips2 = new JLabel("账号或密码错误");

		login.main.add(tips);
		login.main.add(tips2);
		
		tips.setForeground(Color.red);
		tips.setFont(new Font(type,0,14));
		tips2.setForeground(Color.red);
		tips2.setFont(new Font(type,0,14));
		
			//添加鼠标监听器
		button.addMouseListener(new MouseListener() {

			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub			
				if(account.getText().length() == 0 || password.getPassword().length == 0) {	
					tips.setBounds(215,40,150,30);
					tips2.setBounds(225, 40, 0, 0);
				}
				else {
					if(studentManage.Login(account.getText(),String.valueOf(password.getPassword()))) {
						login.dispose();
						
						Home();
					}
					else {
						tips2.setBounds(225, 40, 150, 30);
						tips.setBounds(215,40,0,0);
					}
				}
			}
		});
	
			//添加键盘监听器
		account.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(account.getText().length() == 0 || password.getPassword().length == 0) {
						tips.setBounds(215,40,150,30);
					}
					else{
						if(studentManage.Login(account.getText(),String.valueOf(password.getPassword()))) {
							login.dispose();
							Home();
						}
						else	tips2.setBounds(225, 40, 150, 30);
					}					
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		password.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(account.getText().length() == 0 || password.getPassword().length == 0) {
						tips.setBounds(215,40,150,30);
						tips2.setBounds(225, 40, 0, 0);
					}
					else{
						if(studentManage.Login(account.getText(),String.valueOf(password.getPassword()))) {
							login.dispose();
							Home();
						}
						else {
							tips2.setBounds(225, 40, 150, 30);
							tips.setBounds(215,40,0,0);
						}
					}					
				}				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
	}

	//主界面
	public static void  Home() {
		//窗口显示
		homeFrame.setVisible(true);
		
		//按钮位置常量
		int d = 183;//正方形按钮边长和小矩形长边
		int x1= 53;//第一纵列x坐标
		int x2 = 262;//第二纵列x坐标
		int y1 = 67;//第一行y坐标
		int y2 = 262;//第二行y坐标
		
		//按钮文本常量
		Color foreground = Color.white;
		Font font = new Font(type,0,18);
		
		//添加关闭按钮提示
//		homeFrame.

		//创建主面板
		JPanel home = new JPanel();
		home.setLayout(null);
		home.setBackground(bc);
		homeFrame.main.add(home);
		home.setBounds(0, 0, cfwidth, cpheight);

		//创建学生资料按钮
		HomeButton stuData = new HomeButton("学生资料", new Color(91, 155, 213), new ImageIcon("src/com/SMS/GUI/image/学生资料.png"), new ImageIcon("src/com/SMS/GUI/image/学生资料2.png"));
		home.add(stuData);
		stuData.setBounds(x1, y1, d, d);

		//创建学生日程按钮
		HomeButton stuSchedule = new HomeButton("学生日程", new Color(0, 176, 80), new ImageIcon("src/com/SMS/GUI/image/学生日程.png"), new ImageIcon("src/com/SMS/GUI/image/学生日程2.png"));
		home.add(stuSchedule);
		stuSchedule.setBounds(x2, y1, d * 5 / 12, d);

		//创建其他按钮
		HomeButton other = new HomeButton("其他", new Color(237, 125, 49), new ImageIcon("src/com/SMS/GUI/image/其他.png"), new ImageIcon("src/com/SMS/GUI/image/其他2.png"));
		home.add(other);
		other.setBounds(x2 + d * 7 / 12 - 2, y1, d * 5 / 12, d);

		//创建导入按钮
		HomeButton input = new HomeButton("导入", new Color(255, 192, 0), new ImageIcon("src/com/SMS/GUI/image/导入.png"), new ImageIcon("src/com/SMS/GUI/image/导入2.png"));
		home.add(input);
		input.setBounds(x1, y2 + 2, d, d * 5 / 12);

		//创建导出按钮
		HomeButton output = new HomeButton("导出", new Color(68, 114, 196), new ImageIcon("src/com/SMS/GUI/image/导出.png"), new ImageIcon("src/com/SMS/GUI/image/导出2.png"));
		home.add(output);
		output.setBounds(x1, y2 + d * 7 / 12 - 2, d, d * 5 / 12);

		//创建社团管理按钮
		HomeButton unionManage = new HomeButton("社团管理", new Color(112, 48, 160), new ImageIcon("src/com/SMS/GUI/image/社团管理.png"), new ImageIcon("src/com/SMS/GUI/image/社团管理2.png"));
		home.add(unionManage);
		unionManage.setBounds(x2, y2, d, d);

	} 
	
	//学生资料界面
	public static void StuDataPanel() throws IOException {
//		StudentManagement studentManage = new StudentManagement();

		if(test == 0) {
			student = null;//学生对象初始化
		}
		test++;

		//创建主面板
		JPanel stuDataPanel = new JPanel();
		stuDataPanel.setLayout(null);
		stuDataPanel.setBackground(bc);
		homeFrame.main.add(stuDataPanel);
		stuDataPanel.setBounds(0, 0, cfwidth, 177);

		//创建返回按钮
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68, 114, 196));
		backButton.setFont(new Font(type, 0, 18));
		stuDataPanel.add(backButton);
		backButton.setBounds(13, 15, 73, 30);

		//创建添加按钮
		JLabel add = new JLabel("添加");
		add.setFont(new Font(type,0,18));
		add.setForeground(fc);
		stuDataPanel.add(add);
		add.setBounds(458, 15, 40, 30);

		//创建查找栏
		JLabel searchFrame = new JLabel();
		searchFrame.setLayout(null);
		searchFrame.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchFrame.png"));
		stuDataPanel.add(searchFrame);
		searchFrame.setBounds(20, 57, 488, 120);
			//在查找栏上创建面板
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setOpaque(false);
		searchFrame.add(search);
		search.setBounds(0, 0, 488, 120);

		//创建复选框
		JCheckBox box1 = new JCheckBox("按学号");
		box1.setFont(new Font(type,0,18));
		box1.setBackground(Color.white);
		box1.setForeground(fc);
		box1.setSelected(judge1);
		box1.setEnabled(judge2);
		search.add(box1);
		box1.setBounds(73, 71, 83, 26);

		JCheckBox box2 = new JCheckBox("按姓名");
		box2.setFont(new Font(type,0,18));
		box2.setBackground(Color.white);
		box2.setForeground(fc);
		box2.setSelected(judge2);
		box2.setEnabled(judge1);
		search.add(box2);
		box2.setBounds(180, 71, 83, 26);

		//创建输入框
		JTextField input = new JTextField();
		if(judge1 == true)input.setText("请输入学号");
		if(judge2 == true)input.setText("请输入姓名");
		search.add(input);
		input.setFont(new Font(type,0,16));
		input.setForeground(fc);
		input.setBounds(73, 30, 190, 36);

		//创建查找按钮
		JLabel searchButton = new JLabel();
		searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchButton.png"));
		search.add(searchButton);
		searchButton.setBounds(280, 30, 82, 60);
		searchButton.setOpaque(true);

		//创建修改按钮
		JLabel fixButton = new JLabel();
		fixButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/fixButton.png"));
		search.add(fixButton);
		fixButton.setBounds(380, 30, 82, 60);
		fixButton.setOpaque(true);

		//创建信息表
		secmain.setLayout(null);
		homeFrame.main.add(secmain);
		secmain.setBounds(DataPanel.width+10, 210, DataPanel.space_x+DataPanel.width+10+DataPanel.fieldWidth, DataPanel.space_y*4+DataPanel.height);

		DataPanel panel = new DataPanel(false,student);
		createDataPanel(panel);

		//创建查无此人提示
		JLabel warn = new JLabel("查无此人");
		warn.setForeground(Color.red);
		warn.setFont(new Font(type,0,16));
		search.add(warn);

		//返回按钮添加鼠标监听器
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				//退出学生资料界面恢复成员变量原有值
				judge1 = true;
				judge2 = false;
				test = 0;


				homeFrame.main.removeAll();
				secmain.removeAll();
				Home();
			}
		});

		//添加按钮添加鼠标监视器
		add.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				BackgroundFrame addFrame = new BackgroundFrame(cfx+50,cfy+100,cfwidth,cfheight-158);
				addFrame.setTitle("stu");//命名为stu
				DataPanel panelOfAdd = new DataPanel();
				panelOfAdd.setBackground(bc);
				addFrame.main.add(panelOfAdd);
				panelOfAdd.setBounds(DataPanel.width + 10, 30, DataPanel.space_x + DataPanel.width + 10 + DataPanel.fieldWidth, DataPanel.space_y * 4 + DataPanel.height);

				//添加确认和取消按钮
				JLabel confirm = new JLabel();
				confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirm.png"));
				addFrame.main.add(confirm);
				confirm.setBounds(cfwidth / 2 + 28, cfheight-158 - 100, 50, 27);
				confirm.setOpaque(true);

				JLabel cancel = new JLabel();
				cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancel.png"));
				addFrame.main.add(cancel);
				cancel.setBounds(cfwidth / 2 - 84, cfheight-158 - 100, 50, 27);
				cancel.setOpaque(true);

				//添加鼠标监听器
				cancel.addMouseListener(new MouseListener() {

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseExited(MouseEvent e) {
						cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancel.png"));

					}

					@Override
					public void mouseEntered(MouseEvent e) {
						cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancelEntered.png"));

					}

					@Override
					public void mouseClicked(MouseEvent e) {
						addFrame.dispose();

					}
				});

				confirm.addMouseListener(new MouseListener() {

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseExited(MouseEvent e) {
						confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirm.png"));

					}

					@Override
					public void mouseEntered(MouseEvent e) {
						confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirmEntered.png"));

					}

					@Override
					public void mouseClicked(MouseEvent e) {
						if(panelOfAdd.nameField.getText().equals("请输入姓名") || panelOfAdd.numField.getText().equals("请输入学号")
								|| panelOfAdd.classnumField.getText().equals("请输入班级序号,如 1") || panelOfAdd.collegeField.getText().equals("请输入学院名称")
								|| panelOfAdd.telnumField.getText().equals("请输入号码") || panelOfAdd.majorField.getText().equals("请输入专业名称")
								|| panelOfAdd.wechatField.getText().equals("请输入微信号") || panelOfAdd.yearField.getText().equals("请输入入学年份")
								|| panelOfAdd.dormField.getText().equals("请输入宿舍号")) {

							JLabel confirmWithNull = new JLabel("请完善信息");
							confirmWithNull.setForeground(Color.red);
							confirmWithNull.setFont(new Font(type, 0, 14));
							addFrame.main.add(confirmWithNull);
							confirmWithNull.setBounds((cfwidth - 90) / 2, 0, 90, 30);
						}
						else{
							if (panelOfAdd.nameField.getText().length() != 0 && panelOfAdd.numField.getText().length() != 0 && panelOfAdd.classnumField.getText().length() != 0 && panelOfAdd.collegeField.getText().length() != 0 && panelOfAdd.telnumField.getText().length() != 0 && panelOfAdd.majorField.getText().length() != 0 && panelOfAdd.wechatField.getText().length() != 0 && panelOfAdd.yearField.getText().length() != 0 && panelOfAdd.dormField.getText().length() != 0) {
								Student student2 = new Student();//创建学生对象
								student2.setName(panelOfAdd.nameField.getText());//获得名字
								student2.setSex(DataPanel.judgeSex(panelOfAdd.sexBox.getSelectedIndex()));//获得性别
								student2.setNum(Integer.parseInt(panelOfAdd.numField.getText()));//获得学号
								student2.setClas(Integer.parseInt(panelOfAdd.classnumField.getText()));//获得班别
								student2.setColle(panelOfAdd.collegeField.getText());//获得学院
								student2.setTel(Long.parseLong(panelOfAdd.telnumField.getText()));//获得电话
								student2.setProf(panelOfAdd.majorField.getText());//获得专业
								student2.setWechat(panelOfAdd.wechatField.getText());//获得微信
								student2.setYear(Integer.parseInt(panelOfAdd.yearField.getText()));//获得入学年份
								student2.setDorm(panelOfAdd.dormField.getText());//获得宿舍
								studentManage.Add_stu(student2);//添加学生对象到数据库
								addFrame.dispose();
							} else {
								JLabel confirmWithNull = new JLabel("请完善信息");
								confirmWithNull.setForeground(Color.red);
								confirmWithNull.setFont(new Font(type, 0, 14));
								addFrame.main.add(confirmWithNull);
								confirmWithNull.setBounds((cfwidth - 90) / 2, 0, 90, 30);
							}
						}


					}
				});
			}
		});

		//输入框添加焦点监听器
		input.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if(input.getText().equals("请输入学号") ||input.getText().equals("请输入姓名"))
					input.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(input.getText().length() == 0) {
					if (judge1 == true) input.setText("请输入学号");
					if (judge2 == true) input.setText("请输入姓名");
				}
			}
		});

		//输入框添加键盘监听器
		input.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					if(input.getText() != null) {
						if (box1.isSelected() == true) {
							student = studentManage.Get_stu(Integer.parseInt(input.getText()));
							judge1 = true;
							judge2 = false;
						}
						if (box2.isSelected() == true) {
							student = studentManage.Get_stu(input.getText());
							judge1 = false;
							judge2 = true;
						}

						if (student != null) {
							homeFrame.main.removeAll();
							homeFrame.main.updateUI();
							try {
								StuDataPanel();
							} catch (IOException ioException) {
								ioException.printStackTrace();
							}
						}else{warn.setBounds(83,0,90,30);}

					}
				}
			}
		});

		//复选框添加事件监听器
		box1.addActionListener((e) -> {
			if (box1.isSelected() == true) {box1.setEnabled(false);box2.setEnabled(true);box2.setSelected(false);input.setText("请输入学号");}
		});
		box2.addActionListener((e) -> {
			if (box2.isSelected() == true) {box2.setEnabled(false);box1.setEnabled(true);box1.setSelected(false);input.setText("请输入姓名");}
		});

		//修改按钮添加鼠标监听器
		fixButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				fixButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/fixButton.png"));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				fixButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/fixButtonEntered.png"));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if(student != null) {
					//清除面板重新加载
					secmain.removeAll();

					//创建个人信息表并显示学生对象信息
					DataPanel panel1 = new DataPanel(true, student);
					createDataPanel(panel1);

					//添加确认和取消按钮
					JLabel confirm = new JLabel();
					confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirm.png"));
					homeFrame.main.add(confirm);
					confirm.setBounds(cfwidth / 2 + 28, cfheight - 90, 50, 27);
					confirm.setOpaque(true);

					JLabel cancel = new JLabel();
					cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancel.png"));
					homeFrame.main.add(cancel);
					cancel.setBounds(cfwidth / 2 - 84, cfheight - 90, 50, 27);
					cancel.setOpaque(true);

					secmain.updateUI();

					//添加鼠标监听器
					cancel.addMouseListener(new MouseListener() {

						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseExited(MouseEvent e) {
							cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancel.png"));

						}

						@Override
						public void mouseEntered(MouseEvent e) {
							cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancelEntered.png"));

						}

						@Override
						public void mouseClicked(MouseEvent e) {
							//删除确定取消键
							homeFrame.main.remove(cancel);
							homeFrame.main.remove(confirm);
							homeFrame.main.updateUI();

							//去掉原有可编辑表格
							secmain.removeAll();
							secmain.updateUI();

							//创建不可编辑表格并显示未改变的学生对象信息
							DataPanel panel2 = new DataPanel(false, student);
							createDataPanel(panel2);

						}
					});

					confirm.addMouseListener(new MouseListener() {

						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseExited(MouseEvent e) {
							confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirm.png"));

						}

						@Override
						public void mouseEntered(MouseEvent e) {
							confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirmEntered.png"));

						}

						@Override
						public void mouseClicked(MouseEvent e) {
							//更新个人信息
							Student student1 = new Student();
							student1.setName(panel1.nameField.getText());//更新名字
							student1.setSex(DataPanel.judgeSex(panel1.sexBox.getSelectedIndex()));//更新性别
							student1.setNum(Integer.parseInt(panel1.numField.getText()));//更新学号
							student1.setClas(Integer.parseInt(panel1.classnumField.getText()));//更新班别
							student1.setColle(panel1.collegeField.getText());//更新学院
							student1.setTel(Long.parseLong(panel1.telnumField.getText()));//更新电话
							student1.setProf(panel1.majorField.getText());//更新专业
							student1.setWechat(panel1.wechatField.getText());//更新微信
							student1.setYear(Integer.parseInt(panel1.yearField.getText()));//更新入学年份
							student1.setDorm(panel1.dormField.getText());//更新宿舍
							studentManage.Modify_stu(studentManage.Get_stu(student.getNum()),new Student(student1.getNum(),student1.getName(),student1.getSex(),student1.getClas(),student1.getProf(),student1.getColle(),student1.getTel(),student1.getWechat(),student1.getYear(),student1.getDorm()));

							//删除确认取消按钮
							homeFrame.main.remove(cancel);
							homeFrame.main.remove(confirm);
							homeFrame.main.updateUI();

							//清空信息面板
							secmain.removeAll();

							//添加更新后的个人信息
							DataPanel panel3 = new DataPanel(false, student1);
							createDataPanel(panel3);
						}
					});

				}
			}
		});

		//查找按钮添加鼠标监听器
		searchButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchButton.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchButtonEntered.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if(input.getText() != null) {
					if (box1.isSelected() == true) {
						student = studentManage.Get_stu(Integer.parseInt(input.getText()));
						judge1 = true;
						judge2 = false;
					}
					if (box2.isSelected() == true) {
						student = studentManage.Get_stu(input.getText());
						judge1 = false;
						judge2 = true;
					}

					if (student != null) {
						homeFrame.main.removeAll();
						homeFrame.main.updateUI();
						try {
							StuDataPanel();
						} catch (IOException ioException) {
							ioException.printStackTrace();
						}
					}else{warn.setBounds(83,0,90,30);}
				}
			}
		});


	}
	
	//创建学生信息表
	public static  void createDataPanel(DataPanel panel) {
//		DataPanel panel = new DataPanel(a,student);
		panel.setBackground(bc);
		secmain.add(panel);
		panel.setBounds(0, 0, DataPanel.space_x+DataPanel.width+10+DataPanel.fieldWidth, DataPanel.space_y*4+DataPanel.height);
	}
	
	//学生日程界面
	public static void StuSchedule() {
		homeFrame.setVisible(true);

		//创建主面板		
		JPanel stuSchedule = new JPanel();
		stuSchedule.setLayout(null);
		stuSchedule.setBackground(bc);
		homeFrame.main.add(stuSchedule);
		stuSchedule.setBounds(0, 0, cfwidth, 177);

		//创建返回按钮
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68, 114, 196));
		backButton.setFont(new Font(type, 0, 18));
		stuSchedule.add(backButton);
		backButton.setBounds(13, 15, 73, 30);

		//创建查找栏
		JLabel searchFrame = new JLabel();
		searchFrame.setLayout(null);
		searchFrame.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchFrame2.png"));
		stuSchedule.add(searchFrame);
		searchFrame.setBounds(20, 57, 488, 120);
		//在查找栏上创建面板
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setOpaque(false);
		searchFrame.add(search);
		search.setBounds(0, 0, 488, 120);

		//创建复选框
		JCheckBox box1 = new JCheckBox("按专业");
		box1.setFont(new Font(type,0,18));
		box1.setForeground(fc);
		box1.setBackground(Color.white);
		box1.setSelected(false);
		box1.setEnabled(true);
		search.add(box1);
		box1.setBounds(30, 31, 83, 26);
		
		JCheckBox box2 = new JCheckBox("按学号");
		box2.setFont(new Font(type,0,18));
		box2.setForeground(fc);
		box2.setBackground(Color.white);
		box2.setSelected(true);
		box2.setEnabled(false);
		search.add(box2);
		box2.setBounds(30, 68, 83, 26);
		
		//创建下拉列表
		JComboBox<String> major = new JComboBox<>();
		major.setFont(new Font(type,0,14));
		major.setBackground(Color.white);
		major.setForeground(fc);
		major.addItem("数据科学与大数据技术");
		search.add(major);
		major.setBounds(160, 21, 180, 36);

		//创建输入框
		JTextField numInput = new JTextField();
		numInput.setBorder(BorderFactory.createLineBorder(fc, 1, false));
		numInput.setForeground(fc);
		numInput.setFont(new Font(type, 0, 18));
		search.add(numInput);
		numInput.setBounds(160, 68, 180, 36);

		//创建查找按钮
		JLabel searchButton = new JLabel();
		searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/search.png"));
		search.add(searchButton);
		searchButton.setBounds(377, 43, 80, 37);
		searchButton.setOpaque(true);

		//创建表格
		secmain.setLayout(null);
		secmain.setBackground(Color.black);
		homeFrame.main.add(secmain);
		secmain.setBounds(9, 195, cfwidth-18, 336);
		tablePanel table = new tablePanel();//日程表底部面版
		secmain.add(table);
		table.setBounds(0, 0, cfwidth-18, 336);
		
		homeFrame.main.updateUI();

		//添加输入提醒
		JLabel warn = new JLabel();
		warn.setBackground(bc);
		warn.setFont(new Font(type,0,16));
		warn.setForeground(Color.red);
		homeFrame.main.add(warn);
		warn.setBounds((cfwidth-100)/2,0,100,30);
		warn.setOpaque(true);

		//返回按钮添加鼠标监听器
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.main.removeAll();
				secmain.removeAll();
				Home();
			}
		});

		//复选框添加事件监视器
		box1.addActionListener((e)->{if(box1.isSelected() == true)box1.setEnabled(false);box2.setEnabled(true);box2.setSelected(false);});
		box2.addActionListener((e)->{if(box2.isSelected() == true)box1.setEnabled(true);box2.setEnabled(false);box1.setSelected(false);});

		//查找按钮添加鼠标监听器
		searchButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/search.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchEntered.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				if(box2.isSelected()){
					if(numInput.getText().length() != 0 && studentManage.Get_course(Integer.parseInt(numInput.getText())) != null) {
						warn.setText(null);//查找成功去掉提醒
						textOfTable.stu_num = Integer.parseInt(numInput.getText());

						//清空所有面板
						secmain.removeAll();
						secmain.updateUI();
						cardpanel.removeAll();
						cardpanel.updateUI();

						w = 1;//计算周数
						int a = 0;
						int b = 0;//判断周数是否改变

						//计算周数
						for (Course c : studentManage.Get_course(Integer.parseInt(numInput.getText()))) {
							a = c.week;
							if (a != b) w++;
							b = a;
						}

						//添加表头到secmain
						tablePanel tableTop = new tablePanel(w);
						secmain.add(tableTop);
						tableTop.setBounds(0, 0, cfwidth - 18, 336);

						//创建卡片面板到表头
						tableTop.add(cardpanel);
						cardpanel.setBounds(tablePanel.space_x, tablePanel.lheight+4, tablePanel.space_x*7,
								tablePanel.space_x*5);

						//创建面板
						for (int t = 0; t < w; t++) {
							//创建周数相等的面板添加到卡片面板
							tablePanel panel = new tablePanel("第"+(t+1)+"周");
							cardpanel.add(panel,"第"+(t+1)+"周");
							panel.setSize(tablePanel.space_x*7, tablePanel.space_x*5);//System.out.println(panel.getName());

							//获得布局好一周课程的面板
							for(Course s:studentManage.Get_course(Integer.parseInt(numInput.getText()))){
								if(s.week == t){
									if(s.day == 0){
										if(s.time == 0){panel.s11.setText(s.name);panel.s11.setToolTipText("课室"+s.pos+s.clasroom);panel.s11.rg = s.pos;panel.s11.classnum = s.clasroom;}
										if(s.time == 1){panel.s21.setText(s.name);panel.s21.setToolTipText("课室"+s.pos+s.clasroom);panel.s21.rg = s.pos;panel.s21.classnum = s.clasroom;}
										if(s.time == 2){panel.s31.setText(s.name);panel.s31.setToolTipText("课室"+s.pos+s.clasroom);panel.s31.rg = s.pos;panel.s31.classnum = s.clasroom;}
										if(s.time == 3){panel.s41.setText(s.name);panel.s41.setToolTipText("课室"+s.pos+s.clasroom);panel.s41.rg = s.pos;panel.s41.classnum = s.clasroom;}
										if(s.time == 4){panel.s51.setText(s.name);panel.s51.setToolTipText("课室"+s.pos+s.clasroom);panel.s51.rg = s.pos;panel.s51.classnum = s.clasroom;}
										if(s.time == 5){panel.s61.setText(s.name);panel.s61.setToolTipText("课室"+s.pos+s.clasroom);panel.s61.rg = s.pos;panel.s61.classnum = s.clasroom;}
									}
									if(s.day == 1){
										if(s.time == 0){panel.s12.setText(s.name);panel.s12.setToolTipText("课室"+s.pos+s.clasroom);panel.s12.rg = s.pos;panel.s12.classnum = s.clasroom;}
										if(s.time == 1){panel.s22.setText(s.name);panel.s22.setToolTipText("课室"+s.pos+s.clasroom);panel.s22.rg = s.pos;panel.s22.classnum = s.clasroom;}
										if(s.time == 2){panel.s32.setText(s.name);panel.s32.setToolTipText("课室"+s.pos+s.clasroom);panel.s32.rg = s.pos;panel.s32.classnum = s.clasroom;}
										if(s.time == 3){panel.s42.setText(s.name);panel.s42.setToolTipText("课室"+s.pos+s.clasroom);panel.s42.rg = s.pos;panel.s42.classnum = s.clasroom;}
										if(s.time == 4){panel.s52.setText(s.name);panel.s52.setToolTipText("课室"+s.pos+s.clasroom);panel.s52.rg = s.pos;panel.s52.classnum = s.clasroom;}
										if(s.time == 5){panel.s62.setText(s.name);panel.s62.setToolTipText("课室"+s.pos+s.clasroom);panel.s62.rg = s.pos;panel.s62.classnum = s.clasroom;}
									}
									if(s.day == 2){
										if(s.time == 0){panel.s13.setText(s.name);panel.s13.setToolTipText("课室"+s.pos+s.clasroom);panel.s13.rg = s.pos;panel.s13.classnum = s.clasroom;}
										if(s.time == 1){panel.s23.setText(s.name);panel.s23.setToolTipText("课室"+s.pos+s.clasroom);panel.s23.rg = s.pos;panel.s23.classnum = s.clasroom;}
										if(s.time == 2){panel.s33.setText(s.name);panel.s33.setToolTipText("课室"+s.pos+s.clasroom);panel.s33.rg = s.pos;panel.s33.classnum = s.clasroom;}
										if(s.time == 3){panel.s43.setText(s.name);panel.s43.setToolTipText("课室"+s.pos+s.clasroom);panel.s43.rg = s.pos;panel.s43.classnum = s.clasroom;}
										if(s.time == 4){panel.s53.setText(s.name);panel.s53.setToolTipText("课室"+s.pos+s.clasroom);panel.s53.rg = s.pos;panel.s53.classnum = s.clasroom;}
										if(s.time == 5){panel.s63.setText(s.name);panel.s63.setToolTipText("课室"+s.pos+s.clasroom);panel.s63.rg = s.pos;panel.s63.classnum = s.clasroom;}
									}
									if(s.day == 3){
										if(s.time == 0){panel.s14.setText(s.name);panel.s14.setToolTipText("课室"+s.pos+s.clasroom);panel.s14.rg = s.pos;panel.s14.classnum = s.clasroom;}
										if(s.time == 1){panel.s24.setText(s.name);panel.s24.setToolTipText("课室"+s.pos+s.clasroom);panel.s24.rg = s.pos;panel.s24.classnum = s.clasroom;}
										if(s.time == 2){panel.s34.setText(s.name);panel.s34.setToolTipText("课室"+s.pos+s.clasroom);panel.s34.rg = s.pos;panel.s34.classnum = s.clasroom;}
										if(s.time == 3){panel.s44.setText(s.name);panel.s44.setToolTipText("课室"+s.pos+s.clasroom);panel.s44.rg = s.pos;panel.s44.classnum = s.clasroom;}
										if(s.time == 4){panel.s54.setText(s.name);panel.s54.setToolTipText("课室"+s.pos+s.clasroom);panel.s54.rg = s.pos;panel.s54.classnum = s.clasroom;}
										if(s.time == 5){panel.s64.setText(s.name);panel.s64.setToolTipText("课室"+s.pos+s.clasroom);panel.s64.rg = s.pos;panel.s64.classnum = s.clasroom;}
									}
									if(s.day == 4){
										if(s.time == 0){panel.s15.setText(s.name);panel.s15.setToolTipText("课室"+s.pos+s.clasroom);panel.s15.rg = s.pos;panel.s15.classnum = s.clasroom;}
										if(s.time == 1){panel.s25.setText(s.name);panel.s25.setToolTipText("课室"+s.pos+s.clasroom);panel.s25.rg = s.pos;panel.s25.classnum = s.clasroom;}
										if(s.time == 2){panel.s35.setText(s.name);panel.s35.setToolTipText("课室"+s.pos+s.clasroom);panel.s35.rg = s.pos;panel.s35.classnum = s.clasroom;}
										if(s.time == 3){panel.s45.setText(s.name);panel.s45.setToolTipText("课室"+s.pos+s.clasroom);panel.s45.rg = s.pos;panel.s45.classnum = s.clasroom;}
										if(s.time == 4){panel.s55.setText(s.name);panel.s55.setToolTipText("课室"+s.pos+s.clasroom);panel.s55.rg = s.pos;panel.s55.classnum = s.clasroom;}
										if(s.time == 5){panel.s65.setText(s.name);panel.s65.setToolTipText("课室"+s.pos+s.clasroom);panel.s65.rg = s.pos;panel.s65.classnum = s.clasroom;}
									}
									if(s.day == 5){
										if(s.time == 0){panel.s16.setText(s.name);panel.s16.setToolTipText("课室"+s.pos+s.clasroom);panel.s16.rg = s.pos;panel.s16.classnum = s.clasroom;}
										if(s.time == 1){panel.s26.setText(s.name);panel.s26.setToolTipText("课室"+s.pos+s.clasroom);panel.s26.rg = s.pos;panel.s26.classnum = s.clasroom;}
										if(s.time == 2){panel.s36.setText(s.name);panel.s36.setToolTipText("课室"+s.pos+s.clasroom);panel.s36.rg = s.pos;panel.s36.classnum = s.clasroom;}
										if(s.time == 3){panel.s46.setText(s.name);panel.s46.setToolTipText("课室"+s.pos+s.clasroom);panel.s46.rg = s.pos;panel.s46.classnum = s.clasroom;}
										if(s.time == 4){panel.s56.setText(s.name);panel.s56.setToolTipText("课室"+s.pos+s.clasroom);panel.s56.rg = s.pos;panel.s56.classnum = s.clasroom;}
										if(s.time == 5){panel.s66.setText(s.name);panel.s66.setToolTipText("课室"+s.pos+s.clasroom);panel.s66.rg = s.pos;panel.s66.classnum = s.clasroom;}
									}
									if(s.day == 6){
										if(s.time == 0){panel.s17.setText(s.name);panel.s17.setToolTipText("课室"+s.pos+s.clasroom);panel.s17.rg = s.pos;panel.s17.classnum = s.clasroom;}
										if(s.time == 1){panel.s27.setText(s.name);panel.s27.setToolTipText("课室"+s.pos+s.clasroom);panel.s27.rg = s.pos;panel.s27.classnum = s.clasroom;}
										if(s.time == 2){panel.s37.setText(s.name);panel.s37.setToolTipText("课室"+s.pos+s.clasroom);panel.s37.rg = s.pos;panel.s37.classnum = s.clasroom;}
										if(s.time == 3){panel.s47.setText(s.name);panel.s47.setToolTipText("课室"+s.pos+s.clasroom);panel.s47.rg = s.pos;panel.s47.classnum = s.clasroom;}
										if(s.time == 4){panel.s57.setText(s.name);panel.s57.setToolTipText("课室"+s.pos+s.clasroom);panel.s57.rg = s.pos;panel.s57.classnum = s.clasroom;}
										if(s.time == 5){panel.s67.setText(s.name);panel.s67.setToolTipText("课室"+s.pos+s.clasroom);panel.s67.rg = s.pos;panel.s67.classnum = s.clasroom;}
									}
								}
							}
						}

						textOfTable.week = 0;//第一周

						tableTop.week.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								int select = tableTop.week.getSelectedIndex()+1;//获得所选周
								cl.show(cardpanel,"第"+select+"周");//切换到所选周

								textOfTable.week = tableTop.week.getSelectedIndex();//切换周数时传递切换后的周数
							}
						});
					}
					else{
						if(numInput.getText().length() == 0){warn.setText("请输入学号");}
						else{warn.setText("对象不存在");}
					}
				}

			}
		});



	}

	//更新课程面板
	public static void StuSchedule(String text,int week) {
		//创建主面板
		JPanel stuSchedule = new JPanel();
		stuSchedule.setLayout(null);
		stuSchedule.setBackground(bc);
		homeFrame.main.add(stuSchedule);
		stuSchedule.setBounds(0, 0, cfwidth, 177);

		//创建返回按钮
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68, 114, 196));
		backButton.setFont(new Font(type, 0, 18));
		stuSchedule.add(backButton);
		backButton.setBounds(13, 15, 73, 30);

		//创建查找栏
		JLabel searchFrame = new JLabel();
		searchFrame.setLayout(null);
		searchFrame.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchFrame2.png"));
		stuSchedule.add(searchFrame);
		searchFrame.setBounds(20, 57, 488, 120);
		//在查找栏上创建面板
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setOpaque(false);
		searchFrame.add(search);
		search.setBounds(0, 0, 488, 120);

		//创建复选框
		JCheckBox box1 = new JCheckBox("按专业");
		box1.setFont(new Font(type,0,18));
		box1.setForeground(fc);
		box1.setBackground(Color.white);
		box1.setSelected(false);
		box1.setEnabled(true);
		search.add(box1);
		box1.setBounds(30, 31, 83, 26);

		JCheckBox box2 = new JCheckBox("按学号");
		box2.setFont(new Font(type,0,18));
		box2.setForeground(fc);
		box2.setBackground(Color.white);
		box2.setSelected(true);
		box2.setEnabled(false);
		search.add(box2);
		box2.setBounds(30, 68, 83, 26);

		//创建下拉列表
		JComboBox<String> major = new JComboBox<>();
		major.setFont(new Font(type,0,14));
		major.setBackground(Color.white);
		major.setForeground(fc);
		major.addItem("数据科学与大数据技术");
		search.add(major);
		major.setBounds(160, 21, 180, 36);

		//创建输入框
		JTextField numInput = new JTextField();
		numInput.setText(text);
		numInput.setBorder(BorderFactory.createLineBorder(fc, 1, false));
		numInput.setForeground(fc);
		numInput.setFont(new Font(type, 0, 18));
		search.add(numInput);
		numInput.setBounds(160, 68, 180, 36);

		//创建查找按钮
		JLabel searchButton = new JLabel();
		searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/search.png"));
		search.add(searchButton);
		searchButton.setBounds(377, 43, 80, 37);
		searchButton.setOpaque(true);

		//清除面板
		secmain.removeAll();
		secmain.updateUI();
		homeFrame.main.add(secmain);
		secmain.setBounds(9, 195, cfwidth-18, 336);
		cardpanel.removeAll();
		cardpanel.updateUI();

		//添加表头
		tablePanel tableTop2 = new tablePanel(w);
		secmain.add(tableTop2);
		tableTop2.setBounds(0, 0, cfwidth - 18, 336);

		tableTop2.add(cardpanel);
		cardpanel.setBounds(tablePanel.space_x, tablePanel.lheight+4, tablePanel.space_x*7,
				tablePanel.space_x*5);

		for (int t = 0; t < w; t++) {
			//创建周数相等的面板添加到卡片面板
			tablePanel panel = new tablePanel("第"+(t+1)+"周");
			cardpanel.add(panel,"第"+(t+1)+"周");
			panel.setSize(tablePanel.space_x*7, tablePanel.space_x*5);

			//获得布局好一周课程的面板
			for(Course s:studentManage.Get_course(Integer.parseInt(numInput.getText()))){
				if(s.week == t){
					if(s.day == 0){
						if(s.time == 0){panel.s11.setText(s.name);panel.s11.setToolTipText("课室"+s.pos+s.clasroom);panel.s11.rg = s.pos;panel.s11.classnum = s.clasroom;}
						if(s.time == 1){panel.s21.setText(s.name);panel.s21.setToolTipText("课室"+s.pos+s.clasroom);panel.s21.rg = s.pos;panel.s21.classnum = s.clasroom;}
						if(s.time == 2){panel.s31.setText(s.name);panel.s31.setToolTipText("课室"+s.pos+s.clasroom);panel.s31.rg = s.pos;panel.s31.classnum = s.clasroom;}
						if(s.time == 3){panel.s41.setText(s.name);panel.s41.setToolTipText("课室"+s.pos+s.clasroom);panel.s41.rg = s.pos;panel.s41.classnum = s.clasroom;}
						if(s.time == 4){panel.s51.setText(s.name);panel.s51.setToolTipText("课室"+s.pos+s.clasroom);panel.s51.rg = s.pos;panel.s51.classnum = s.clasroom;}
						if(s.time == 5){panel.s61.setText(s.name);panel.s61.setToolTipText("课室"+s.pos+s.clasroom);panel.s61.rg = s.pos;panel.s61.classnum = s.clasroom;}
					}
					if(s.day == 1){
						if(s.time == 0){panel.s12.setText(s.name);panel.s12.setToolTipText("课室"+s.pos+s.clasroom);panel.s12.rg = s.pos;panel.s12.classnum = s.clasroom;}
						if(s.time == 1){panel.s22.setText(s.name);panel.s22.setToolTipText("课室"+s.pos+s.clasroom);panel.s22.rg = s.pos;panel.s22.classnum = s.clasroom;}
						if(s.time == 2){panel.s32.setText(s.name);panel.s32.setToolTipText("课室"+s.pos+s.clasroom);panel.s32.rg = s.pos;panel.s32.classnum = s.clasroom;}
						if(s.time == 3){panel.s42.setText(s.name);panel.s42.setToolTipText("课室"+s.pos+s.clasroom);panel.s42.rg = s.pos;panel.s42.classnum = s.clasroom;}
						if(s.time == 4){panel.s52.setText(s.name);panel.s52.setToolTipText("课室"+s.pos+s.clasroom);panel.s52.rg = s.pos;panel.s52.classnum = s.clasroom;}
						if(s.time == 5){panel.s62.setText(s.name);panel.s62.setToolTipText("课室"+s.pos+s.clasroom);panel.s62.rg = s.pos;panel.s62.classnum = s.clasroom;}
					}
					if(s.day == 2){
						if(s.time == 0){panel.s13.setText(s.name);panel.s13.setToolTipText("课室"+s.pos+s.clasroom);panel.s13.rg = s.pos;panel.s13.classnum = s.clasroom;}
						if(s.time == 1){panel.s23.setText(s.name);panel.s23.setToolTipText("课室"+s.pos+s.clasroom);panel.s23.rg = s.pos;panel.s23.classnum = s.clasroom;}
						if(s.time == 2){panel.s33.setText(s.name);panel.s33.setToolTipText("课室"+s.pos+s.clasroom);panel.s33.rg = s.pos;panel.s33.classnum = s.clasroom;}
						if(s.time == 3){panel.s43.setText(s.name);panel.s43.setToolTipText("课室"+s.pos+s.clasroom);panel.s43.rg = s.pos;panel.s43.classnum = s.clasroom;}
						if(s.time == 4){panel.s53.setText(s.name);panel.s53.setToolTipText("课室"+s.pos+s.clasroom);panel.s53.rg = s.pos;panel.s53.classnum = s.clasroom;}
						if(s.time == 5){panel.s63.setText(s.name);panel.s63.setToolTipText("课室"+s.pos+s.clasroom);panel.s63.rg = s.pos;panel.s63.classnum = s.clasroom;}
					}
					if(s.day == 3){
						if(s.time == 0){panel.s14.setText(s.name);panel.s14.setToolTipText("课室"+s.pos+s.clasroom);panel.s14.rg = s.pos;panel.s14.classnum = s.clasroom;}
						if(s.time == 1){panel.s24.setText(s.name);panel.s24.setToolTipText("课室"+s.pos+s.clasroom);panel.s24.rg = s.pos;panel.s24.classnum = s.clasroom;}
						if(s.time == 2){panel.s34.setText(s.name);panel.s34.setToolTipText("课室"+s.pos+s.clasroom);panel.s34.rg = s.pos;panel.s34.classnum = s.clasroom;}
						if(s.time == 3){panel.s44.setText(s.name);panel.s44.setToolTipText("课室"+s.pos+s.clasroom);panel.s44.rg = s.pos;panel.s44.classnum = s.clasroom;}
						if(s.time == 4){panel.s54.setText(s.name);panel.s54.setToolTipText("课室"+s.pos+s.clasroom);panel.s54.rg = s.pos;panel.s54.classnum = s.clasroom;}
						if(s.time == 5){panel.s64.setText(s.name);panel.s64.setToolTipText("课室"+s.pos+s.clasroom);panel.s64.rg = s.pos;panel.s64.classnum = s.clasroom;}
					}
					if(s.day == 4){
						if(s.time == 0){panel.s15.setText(s.name);panel.s15.setToolTipText("课室"+s.pos+s.clasroom);panel.s15.rg = s.pos;panel.s15.classnum = s.clasroom;}
						if(s.time == 1){panel.s25.setText(s.name);panel.s25.setToolTipText("课室"+s.pos+s.clasroom);panel.s25.rg = s.pos;panel.s25.classnum = s.clasroom;}
						if(s.time == 2){panel.s35.setText(s.name);panel.s35.setToolTipText("课室"+s.pos+s.clasroom);panel.s35.rg = s.pos;panel.s35.classnum = s.clasroom;}
						if(s.time == 3){panel.s45.setText(s.name);panel.s45.setToolTipText("课室"+s.pos+s.clasroom);panel.s45.rg = s.pos;panel.s45.classnum = s.clasroom;}
						if(s.time == 4){panel.s55.setText(s.name);panel.s55.setToolTipText("课室"+s.pos+s.clasroom);panel.s55.rg = s.pos;panel.s55.classnum = s.clasroom;}
						if(s.time == 5){panel.s65.setText(s.name);panel.s65.setToolTipText("课室"+s.pos+s.clasroom);panel.s65.rg = s.pos;panel.s65.classnum = s.clasroom;}
					}
					if(s.day == 5){
						if(s.time == 0){panel.s16.setText(s.name);panel.s16.setToolTipText("课室"+s.pos+s.clasroom);panel.s16.rg = s.pos;panel.s16.classnum = s.clasroom;}
						if(s.time == 1){panel.s26.setText(s.name);panel.s26.setToolTipText("课室"+s.pos+s.clasroom);panel.s26.rg = s.pos;panel.s26.classnum = s.clasroom;}
						if(s.time == 2){panel.s36.setText(s.name);panel.s36.setToolTipText("课室"+s.pos+s.clasroom);panel.s36.rg = s.pos;panel.s36.classnum = s.clasroom;}
						if(s.time == 3){panel.s46.setText(s.name);panel.s46.setToolTipText("课室"+s.pos+s.clasroom);panel.s46.rg = s.pos;panel.s46.classnum = s.clasroom;}
						if(s.time == 4){panel.s56.setText(s.name);panel.s56.setToolTipText("课室"+s.pos+s.clasroom);panel.s56.rg = s.pos;panel.s56.classnum = s.clasroom;}
						if(s.time == 5){panel.s66.setText(s.name);panel.s66.setToolTipText("课室"+s.pos+s.clasroom);panel.s66.rg = s.pos;panel.s66.classnum = s.clasroom;}
					}
					if(s.day == 6){
						if(s.time == 0){panel.s17.setText(s.name);panel.s17.setToolTipText("课室"+s.pos+s.clasroom);panel.s17.rg = s.pos;panel.s17.classnum = s.clasroom;}
						if(s.time == 1){panel.s27.setText(s.name);panel.s27.setToolTipText("课室"+s.pos+s.clasroom);panel.s27.rg = s.pos;panel.s27.classnum = s.clasroom;}
						if(s.time == 2){panel.s37.setText(s.name);panel.s37.setToolTipText("课室"+s.pos+s.clasroom);panel.s37.rg = s.pos;panel.s37.classnum = s.clasroom;}
						if(s.time == 3){panel.s47.setText(s.name);panel.s47.setToolTipText("课室"+s.pos+s.clasroom);panel.s47.rg = s.pos;panel.s47.classnum = s.clasroom;}
						if(s.time == 4){panel.s57.setText(s.name);panel.s57.setToolTipText("课室"+s.pos+s.clasroom);panel.s57.rg = s.pos;panel.s57.classnum = s.clasroom;}
						if(s.time == 5){panel.s67.setText(s.name);panel.s67.setToolTipText("课室"+s.pos+s.clasroom);panel.s67.rg = s.pos;panel.s67.classnum = s.clasroom;}
					}
				}
			}
		}

		tableTop2.week.setSelectedIndex(week);
		cl.show(cardpanel,"第2周");

		tableTop2.week.addActionListener((e) -> {
			int select = tableTop2.week.getSelectedIndex()+1;//获得所选周
			cl.show(cardpanel,"第"+select+"周");//切换到所选周
		});

		homeFrame.main.updateUI();

		//添加输入提醒
		JLabel warn = new JLabel();
		warn.setBackground(bc);
		warn.setFont(new Font(type,0,16));
		warn.setForeground(Color.red);
		homeFrame.main.add(warn);
		warn.setBounds((cfwidth-100)/2,0,100,30);
		warn.setOpaque(true);



		//返回按钮添加鼠标监听器
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.main.removeAll();
				secmain.removeAll();
				Home();
			}
		});

		//复选框添加事件监视器
		box1.addActionListener((e)->{if(box1.isSelected() == true)box1.setEnabled(false);box2.setEnabled(true);box2.setSelected(false);});
		box2.addActionListener((e)->{if(box2.isSelected() == true)box1.setEnabled(true);box2.setEnabled(false);box1.setSelected(false);});

		//查找按钮添加鼠标监听器
		searchButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/search.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/searchEntered.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				if(box2.isSelected()){
					if(numInput.getText().length() != 0 && studentManage.Get_course(Integer.parseInt(numInput.getText())) != null) {
						warn.setText(null);//查找成功去掉提醒
						textOfTable.stu_num = Integer.parseInt(numInput.getText());

						//清空所有面板
						secmain.removeAll();
						secmain.updateUI();
						cardpanel.removeAll();
						cardpanel.updateUI();

						w = 1;//计算周数
						int a = 0;
						int b = 0;//判断周数是否改变

						//计算周数
						for (Course c : studentManage.Get_course(Integer.parseInt(numInput.getText()))) {
							a = c.week;
							if (a != b) w++;
							b = a;
						}

						//添加表头到secmain
						tablePanel tableTop = new tablePanel(w);
						secmain.add(tableTop);
						tableTop.setBounds(0, 0, cfwidth - 18, 336);

						//创建卡片面板到表头
						tableTop.add(cardpanel);
						cardpanel.setBounds(tablePanel.space_x, tablePanel.lheight+4, tablePanel.space_x*7,
								tablePanel.space_x*5);

						//创建面板
						for (int t = 0; t < w; t++) {
							//创建周数相等的面板添加到卡片面板
							tablePanel panel = new tablePanel("第"+(t+1)+"周");
							cardpanel.add(panel,"第"+(t+1)+"周");
							panel.setSize(tablePanel.space_x*7, tablePanel.space_x*5);//System.out.println(panel.getName());

							//获得布局好一周课程的面板
							for(Course s:studentManage.Get_course(Integer.parseInt(numInput.getText()))){
								if(s.week == t){
									if(s.day == 0){
										if(s.time == 0){panel.s11.setText(s.name);panel.s11.setToolTipText("课室"+s.pos+s.clasroom);panel.s11.rg = s.pos;panel.s11.classnum = s.clasroom;}
										if(s.time == 1){panel.s21.setText(s.name);panel.s21.setToolTipText("课室"+s.pos+s.clasroom);panel.s21.rg = s.pos;panel.s21.classnum = s.clasroom;}
										if(s.time == 2){panel.s31.setText(s.name);panel.s31.setToolTipText("课室"+s.pos+s.clasroom);panel.s31.rg = s.pos;panel.s31.classnum = s.clasroom;}
										if(s.time == 3){panel.s41.setText(s.name);panel.s41.setToolTipText("课室"+s.pos+s.clasroom);panel.s41.rg = s.pos;panel.s41.classnum = s.clasroom;}
										if(s.time == 4){panel.s51.setText(s.name);panel.s51.setToolTipText("课室"+s.pos+s.clasroom);panel.s51.rg = s.pos;panel.s51.classnum = s.clasroom;}
										if(s.time == 5){panel.s61.setText(s.name);panel.s61.setToolTipText("课室"+s.pos+s.clasroom);panel.s61.rg = s.pos;panel.s61.classnum = s.clasroom;}
									}
									if(s.day == 1){
										if(s.time == 0){panel.s12.setText(s.name);panel.s12.setToolTipText("课室"+s.pos+s.clasroom);panel.s12.rg = s.pos;panel.s12.classnum = s.clasroom;}
										if(s.time == 1){panel.s22.setText(s.name);panel.s22.setToolTipText("课室"+s.pos+s.clasroom);panel.s22.rg = s.pos;panel.s22.classnum = s.clasroom;}
										if(s.time == 2){panel.s32.setText(s.name);panel.s32.setToolTipText("课室"+s.pos+s.clasroom);panel.s32.rg = s.pos;panel.s32.classnum = s.clasroom;}
										if(s.time == 3){panel.s42.setText(s.name);panel.s42.setToolTipText("课室"+s.pos+s.clasroom);panel.s42.rg = s.pos;panel.s42.classnum = s.clasroom;}
										if(s.time == 4){panel.s52.setText(s.name);panel.s52.setToolTipText("课室"+s.pos+s.clasroom);panel.s52.rg = s.pos;panel.s52.classnum = s.clasroom;}
										if(s.time == 5){panel.s62.setText(s.name);panel.s62.setToolTipText("课室"+s.pos+s.clasroom);panel.s62.rg = s.pos;panel.s62.classnum = s.clasroom;}
									}
									if(s.day == 2){
										if(s.time == 0){panel.s13.setText(s.name);panel.s13.setToolTipText("课室"+s.pos+s.clasroom);panel.s13.rg = s.pos;panel.s13.classnum = s.clasroom;}
										if(s.time == 1){panel.s23.setText(s.name);panel.s23.setToolTipText("课室"+s.pos+s.clasroom);panel.s23.rg = s.pos;panel.s23.classnum = s.clasroom;}
										if(s.time == 2){panel.s33.setText(s.name);panel.s33.setToolTipText("课室"+s.pos+s.clasroom);panel.s33.rg = s.pos;panel.s33.classnum = s.clasroom;}
										if(s.time == 3){panel.s43.setText(s.name);panel.s43.setToolTipText("课室"+s.pos+s.clasroom);panel.s43.rg = s.pos;panel.s43.classnum = s.clasroom;}
										if(s.time == 4){panel.s53.setText(s.name);panel.s53.setToolTipText("课室"+s.pos+s.clasroom);panel.s53.rg = s.pos;panel.s53.classnum = s.clasroom;}
										if(s.time == 5){panel.s63.setText(s.name);panel.s63.setToolTipText("课室"+s.pos+s.clasroom);panel.s63.rg = s.pos;panel.s63.classnum = s.clasroom;}
									}
									if(s.day == 3){
										if(s.time == 0){panel.s14.setText(s.name);panel.s14.setToolTipText("课室"+s.pos+s.clasroom);panel.s14.rg = s.pos;panel.s14.classnum = s.clasroom;}
										if(s.time == 1){panel.s24.setText(s.name);panel.s24.setToolTipText("课室"+s.pos+s.clasroom);panel.s24.rg = s.pos;panel.s24.classnum = s.clasroom;}
										if(s.time == 2){panel.s34.setText(s.name);panel.s34.setToolTipText("课室"+s.pos+s.clasroom);panel.s34.rg = s.pos;panel.s34.classnum = s.clasroom;}
										if(s.time == 3){panel.s44.setText(s.name);panel.s44.setToolTipText("课室"+s.pos+s.clasroom);panel.s44.rg = s.pos;panel.s44.classnum = s.clasroom;}
										if(s.time == 4){panel.s54.setText(s.name);panel.s54.setToolTipText("课室"+s.pos+s.clasroom);panel.s54.rg = s.pos;panel.s54.classnum = s.clasroom;}
										if(s.time == 5){panel.s64.setText(s.name);panel.s64.setToolTipText("课室"+s.pos+s.clasroom);panel.s64.rg = s.pos;panel.s64.classnum = s.clasroom;}
									}
									if(s.day == 4){
										if(s.time == 0){panel.s15.setText(s.name);panel.s15.setToolTipText("课室"+s.pos+s.clasroom);panel.s15.rg = s.pos;panel.s15.classnum = s.clasroom;}
										if(s.time == 1){panel.s25.setText(s.name);panel.s25.setToolTipText("课室"+s.pos+s.clasroom);panel.s25.rg = s.pos;panel.s25.classnum = s.clasroom;}
										if(s.time == 2){panel.s35.setText(s.name);panel.s35.setToolTipText("课室"+s.pos+s.clasroom);panel.s35.rg = s.pos;panel.s35.classnum = s.clasroom;}
										if(s.time == 3){panel.s45.setText(s.name);panel.s45.setToolTipText("课室"+s.pos+s.clasroom);panel.s45.rg = s.pos;panel.s45.classnum = s.clasroom;}
										if(s.time == 4){panel.s55.setText(s.name);panel.s55.setToolTipText("课室"+s.pos+s.clasroom);panel.s55.rg = s.pos;panel.s55.classnum = s.clasroom;}
										if(s.time == 5){panel.s65.setText(s.name);panel.s65.setToolTipText("课室"+s.pos+s.clasroom);panel.s65.rg = s.pos;panel.s65.classnum = s.clasroom;}
									}
									if(s.day == 5){
										if(s.time == 0){panel.s16.setText(s.name);panel.s16.setToolTipText("课室"+s.pos+s.clasroom);panel.s16.rg = s.pos;panel.s16.classnum = s.clasroom;}
										if(s.time == 1){panel.s26.setText(s.name);panel.s26.setToolTipText("课室"+s.pos+s.clasroom);panel.s26.rg = s.pos;panel.s26.classnum = s.clasroom;}
										if(s.time == 2){panel.s36.setText(s.name);panel.s36.setToolTipText("课室"+s.pos+s.clasroom);panel.s36.rg = s.pos;panel.s36.classnum = s.clasroom;}
										if(s.time == 3){panel.s46.setText(s.name);panel.s46.setToolTipText("课室"+s.pos+s.clasroom);panel.s46.rg = s.pos;panel.s46.classnum = s.clasroom;}
										if(s.time == 4){panel.s56.setText(s.name);panel.s56.setToolTipText("课室"+s.pos+s.clasroom);panel.s56.rg = s.pos;panel.s56.classnum = s.clasroom;}
										if(s.time == 5){panel.s66.setText(s.name);panel.s66.setToolTipText("课室"+s.pos+s.clasroom);panel.s66.rg = s.pos;panel.s66.classnum = s.clasroom;}
									}
									if(s.day == 6){
										if(s.time == 0){panel.s17.setText(s.name);panel.s17.setToolTipText("课室"+s.pos+s.clasroom);panel.s17.rg = s.pos;panel.s17.classnum = s.clasroom;}
										if(s.time == 1){panel.s27.setText(s.name);panel.s27.setToolTipText("课室"+s.pos+s.clasroom);panel.s27.rg = s.pos;panel.s27.classnum = s.clasroom;}
										if(s.time == 2){panel.s37.setText(s.name);panel.s37.setToolTipText("课室"+s.pos+s.clasroom);panel.s37.rg = s.pos;panel.s37.classnum = s.clasroom;}
										if(s.time == 3){panel.s47.setText(s.name);panel.s47.setToolTipText("课室"+s.pos+s.clasroom);panel.s47.rg = s.pos;panel.s47.classnum = s.clasroom;}
										if(s.time == 4){panel.s57.setText(s.name);panel.s57.setToolTipText("课室"+s.pos+s.clasroom);panel.s57.rg = s.pos;panel.s57.classnum = s.clasroom;}
										if(s.time == 5){panel.s67.setText(s.name);panel.s67.setToolTipText("课室"+s.pos+s.clasroom);panel.s67.rg = s.pos;panel.s67.classnum = s.clasroom;}
									}
								}
							}
						}

						textOfTable.week = 0;//第一周

						tableTop.week.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								int select = tableTop.week.getSelectedIndex()+1;//获得所选周
								cl.show(cardpanel,"第"+select+"周");//切换到所选周

								textOfTable.week = tableTop.week.getSelectedIndex();//切换周数时传递切换后的周数
							}
						});
					}
					else{
						if(numInput.getText().length() == 0){warn.setText("请输入学号");}
						else{warn.setText("对象不存在");}
					}
				}

			}
		});
	}
	
	//导入界面
	public static void Input() {
//		homeFrame.setVisible(true);

		//创建返回按键
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68, 114, 196));
		backButton.setFont(new Font(type, 0, 18));
		homeFrame.main.add(backButton);
		backButton.setBounds(13, 15, 73, 30);
		//添加鼠标监听器
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						homeFrame.main.removeAll();
						secmain.removeAll();
						Home();
					}
				});
	
		//创建复选框
		JCheckBox box1 = new JCheckBox("导入个人信息");
		box1.setSelected(true);
		box1.setForeground(fc);
		box1.setFont(new Font(type,0,18));
		box1.setBackground(bc);
		homeFrame.main.add(box1);
		box1.setBounds(100, 130, 150, 30);
		
		JCheckBox box2 = new JCheckBox("导入日程");
		box2.setForeground(fc);
		box2.setFont(new Font(type,0,18));
		box2.setBackground(bc);
		homeFrame.main.add(box2);
		box2.setBounds(300, 130, 100, 30);
		
		JCheckBox box3 = new JCheckBox("导入社团");
		box3.setForeground(fc);
		box3.setFont(new Font(type,0,18));
		box3.setBackground(bc);
		homeFrame.main.add(box3);
		box3.setBounds(100, 130+30+10, 100, 30);
		
		//添加文本框
		JLabel text = new JLabel("文件位置");
		text.setForeground(fc);
		text.setFont(new Font(type,0,20));
		homeFrame.main.add(text);
		text.setBounds(30, 130+30*2+10*2+10, 90, 30);
		
		//添加文件栏
		//文件地址输入框
		JTextField addressField = new JTextField();
		addressField.setEditable(true);
		addressField.setForeground(fc);
		addressField.setBackground(Color.white);
		addressField.setFont(new Font(type, 0, 14));
		homeFrame.main.add(addressField);
		addressField.setBounds(30 + 90, 130 + 30 * 2 + 10 * 2 + 8, 300, 35);
		//添加文件选择对话框按钮
		JLabel fileButton = new JLabel();
		fileButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/fileSelect.png"));
		homeFrame.main.add(fileButton);
		fileButton.setBounds(120 + 300, 218, 35, 35);
		//添加鼠标监听器
		fileButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fileButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				addressField.setText(fileSelectedFrame());
				
			}
		});

		//社团专属额外文件栏
		//文件地址输入框
		JTextField addressField2 = new JTextField();
		addressField2.setEditable(true);
		addressField2.setForeground(fc);
		addressField2.setBackground(Color.white);
		addressField2.setFont(new Font(type, 0, 14));
		homeFrame.main.add(addressField2);
		//添加文件选择按钮
		JLabel fileButton2 = new JLabel();
		fileButton2.setIcon(new ImageIcon("src/com/SMS/GUI/image/fileSelect.png"));
		fileButton2.setToolTipText("选择社团成员列表文件");
		fileButton2.setOpaque(true);
		homeFrame.main.add(fileButton2);
		//添加鼠标监听器
		fileButton2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fileButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				addressField2.setText(fileSelectedFrame());
				
			}
		});
		
		//设置单选和复选框状态事件
		box1.addActionListener((e)->{
			if(box1.isSelected() == true) {
				box2.setSelected(false);
				box3.setSelected(false);
				addressField2.setBounds(120, 218+35+10, 0, 0);
				fileButton2.setBounds(420, 218+35+10, 0, 0);
				fileButton.setToolTipText(null);
			}
		});
		box2.addActionListener((e)->{
			if(box2.isSelected() == true) {
				box1.setSelected(false);
				box3.setSelected(false);
				addressField2.setBounds(120, 218+35+10, 0, 0);
				fileButton2.setBounds(420, 218+35+10, 0, 0);
				fileButton.setToolTipText(null);
			}
		});
		box3.addActionListener((e)->{
			if(box3.isSelected() == true) {
				box1.setSelected(false);
				box2.setSelected(false);
				addressField2.setBounds(120, 218+35+10, 300, 35);
				fileButton2.setBounds(420, 218+35+10, 35, 35);
				fileButton.setToolTipText("选择社团列表文件");
			} else {
				addressField2.setBounds(120, 218 + 35 + 10, 0, 0);//设置大小为0以隐藏组件
				fileButton2.setBounds(420, 218 + 35 + 10, 0, 0);
			}
		});

		//添加导入按钮
		JLabel inputButton = new JLabel();
		inputButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/input.png"));
		inputButton.setOpaque(true);
		homeFrame.main.add(inputButton);
		inputButton.setBounds((cfwidth - 48 * 3 / 2) / 2, cfheight - 200, 48 * 3 / 2, 22 * 3 / 2);
		//添加鼠标监听器
		inputButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				inputButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/input.png"));

			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				inputButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/inputEntered.png"));

			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	//导出界面
	public static void Output() {
//		homeFrame.setVisible(true);

		//创建返回按键
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68, 114, 196));
		backButton.setFont(new Font(type, 0, 18));
		homeFrame.main.add(backButton);
		backButton.setBounds(13, 15, 73, 30);
		//添加鼠标监听器
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						homeFrame.main.removeAll();
						secmain.removeAll();
						Home();
					}
				});
	
		//创建复选框
		JCheckBox box1 = new JCheckBox("导出个人信息");
		box1.setSelected(true);
		box1.setForeground(fc);
		box1.setFont(new Font(type,0,18));
		box1.setBackground(bc);
		homeFrame.main.add(box1);
		box1.setBounds(100, 130, 150, 30);
		
		JCheckBox box2 = new JCheckBox("导出日程");
		box2.setForeground(fc);
		box2.setFont(new Font(type,0,18));
		box2.setBackground(bc);
		homeFrame.main.add(box2);
		box2.setBounds(300, 130, 100, 30);
		
		JCheckBox box3 = new JCheckBox("导出社团");
		box3.setForeground(fc);
		box3.setFont(new Font(type,0,18));
		box3.setBackground(bc);
		homeFrame.main.add(box3);
		box3.setBounds(100, 130+30+10, 100, 30);
		
		//添加文本框
		JLabel text = new JLabel("导出位置");
		text.setForeground(fc);
		text.setFont(new Font(type,0,20));
		homeFrame.main.add(text);
		text.setBounds(30, 130+30*2+10*2+10, 90, 30);
		
		//添加文件栏
		//文件地址输入框
		JTextField addressField = new JTextField();
		addressField.setEditable(true);
		addressField.setForeground(fc);
		addressField.setBackground(Color.white);
		addressField.setFont(new Font(type, 0, 14));
		homeFrame.main.add(addressField);
		addressField.setBounds(30 + 90, 130 + 30 * 2 + 10 * 2 + 8, 300, 35);
		//添加文件选择对话框按钮
		JLabel fileButton = new JLabel();
		fileButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/fileSelect.png"));
		homeFrame.main.add(fileButton);
		fileButton.setBounds(120 + 300, 218, 35, 35);
		//添加鼠标监听器
		fileButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fileButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				addressField.setText(fileSelectedFrame());
				
			}
		});

		//社团专属额外文件栏
		//文件地址输入框
		JTextField addressField2 = new JTextField();
		addressField2.setEditable(true);
		addressField2.setForeground(fc);
		addressField2.setBackground(Color.white);
		addressField2.setFont(new Font(type, 0, 14));
		homeFrame.main.add(addressField2);
		//添加文件选择按钮
		JLabel fileButton2 = new JLabel();
		fileButton2.setIcon(new ImageIcon("src/com/SMS/GUI/image/fileSelect.png"));
		fileButton2.setToolTipText("保存社团成员列表文件");
		fileButton2.setOpaque(true);
		homeFrame.main.add(fileButton2);
		//添加鼠标监听器
		fileButton2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fileButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				addressField2.setText(fileSelectedFrame());
				
			}
		});
		
		//设置单选和复选框状态事件
		box1.addActionListener((e)->{
			if(box1.isSelected() == true) {
				box2.setSelected(false);
				box3.setSelected(false);
				addressField2.setBounds(120, 218+35+10, 0, 0);
				fileButton2.setBounds(420, 218+35+10, 0, 0);
				fileButton.setToolTipText(null);
			}
		});
		box2.addActionListener((e)->{
			if(box2.isSelected() == true) {
				box1.setSelected(false);
				box3.setSelected(false);
				addressField2.setBounds(120, 218+35+10, 0, 0);
				fileButton2.setBounds(420, 218+35+10, 0, 0);
				fileButton.setToolTipText(null);
			}
		});
		box3.addActionListener((e)->{
			if(box3.isSelected() == true) {
				box1.setSelected(false);
				box2.setSelected(false);
				addressField2.setBounds(120, 218+35+10, 300, 35);
				fileButton2.setBounds(420, 218+35+10, 35, 35);
				fileButton.setToolTipText("保存社团列表文件");
			} else {
				addressField2.setBounds(120, 218 + 35 + 10, 0, 0);//设置大小为0以隐藏组件
				fileButton2.setBounds(420, 218 + 35 + 10, 0, 0);
			}
		});

		//添加导入按钮
		JLabel outputButton = new JLabel();
		outputButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/output.png"));
		outputButton.setOpaque(true);
		homeFrame.main.add(outputButton);
		outputButton.setBounds((cfwidth - 48 * 3 / 2) / 2, cfheight - 200, 48 * 3 / 2, 22 * 3 / 2);
		//添加鼠标监听器
		outputButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				outputButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/output.png"));

			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				outputButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/outputEntered.png"));

			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	//社团管理界面
	public static void UnionManage() {
		homeFrame.setVisible(true);

		//创建返回按钮
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("src/com/SMS/GUI/image/back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68, 114, 196));
		backButton.setFont(new Font(type, 0, 18));
		homeFrame.main.add(backButton);
		backButton.setBounds(13, 15, 73, 30);
		//添加鼠标监听器
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						
					}

			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.main.removeAll();
				secmain.removeAll();
				Home();
			}
		});

		//添加查找栏
		JLabel search = new JLabel();
		search.setIcon(new ImageIcon("src/com/SMS/GUI/image/unionSearch.png"));
		homeFrame.main.add(search);
		search.setBounds((cfwidth - 486) / 2, 60, 450 + 36, 75 + 36 / 6 + 1);
		search.setBackground(Color.green);
		search.setOpaque(true);

		//添加下拉列表
		JComboBox<String> box = new JComboBox<>();
		box.setForeground(bc);
		box.setFont(new Font(type, 0, 20));
		search.add(box);
		box.setBounds(175, 25, 235, 35);
		
		//添加社团基本信息
		int x = 55;
		int space_y = 42;
		
		JLabel name = new JLabel("社团名称:");
		JTextField nameField = new JTextField();
		createDataPerformed(name, nameField);
		homeFrame.main.add(name);
		homeFrame.main.add(nameField);
		name.setBounds(x, 167, 90, 30);
		nameField.setBounds(x+90, 167, 200, 30);
		
		JLabel belong = new JLabel("所属:");
		JTextField belongField = new JTextField();
		createDataPerformed(belong, belongField);
		homeFrame.main.add(belong);
		homeFrame.main.add(belongField);
		belong.setBounds(x, 167+space_y, 50, 30);
		belongField.setBounds(x+50, 167+space_y, 200, 30);
		
		JLabel unionType = new JLabel("类型:");
		JTextField unionTypeField = new JTextField();
		createDataPerformed(unionType, unionTypeField);
		homeFrame.main.add(unionType);
		homeFrame.main.add(unionTypeField);
		unionType.setBounds(x, 167+space_y*2, 50, 30);
		unionTypeField.setBounds(x+50, 167+space_y*2, 200, 30);
		
		JLabel amount = new JLabel("人数:");
		JTextField amountField = new JTextField();
		createDataPerformed(amount, amountField);
		homeFrame.main.add(amount);
		homeFrame.main.add(amountField);
		amount.setBounds(x + 270, 167 + space_y * 2, 50, 30);
		amountField.setBounds(x + 270 + 50, 167 + space_y * 2, 100, 30);

		JLabel memberData = new JLabel("成员信息:");
		createDataPerformed(memberData, null);
		homeFrame.main.add(memberData);
		memberData.setBounds(x, 167 + space_y * 3, 90, 30);

		//添加查找团空按钮
		JLabel checkFree = new JLabel();
		checkFree.setIcon(new ImageIcon("src/com/SMS/GUI/image/checkFree.png"));
		checkFree.setOpaque(true);
		homeFrame.main.add(checkFree);
		checkFree.setBounds(55 + 270 + 50, 167 + 10, 102, 42);
		//添加鼠标监听器
		checkFree.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				checkFree.setIcon(new ImageIcon("src/com/SMS/GUI/image/checkFree.png"));

			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				checkFree.setIcon(new ImageIcon("src/com/SMS/GUI/image/checkFreeEntered.png"));

			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				CheckFreeFrame();
				
			}
		});
		
		//添加社团成员列表
			//创建成员列表
		
			//创建滚动面板并添加组件
		JScrollPane listPanel = new JScrollPane();
		homeFrame.main.add(listPanel);
		listPanel.setBounds((cfwidth-513)/2, 331, 513, 200);
		
		
		
		homeFrame.main.updateUI();
	}
	
	//社团查空界面
	public static void CheckFreeFrame(){
		BackgroundFrame checkFrame = new BackgroundFrame(600,200,cfwidth,457,false);
		checkFrame.setVisible(true);
		
		//添加输入框
		JTextField text = new JTextField();
		text.setForeground(fc);
		text.setFont(new Font(type,0,18));
		text.setEditable(false);
		checkFrame.main.add(text);
		text.setBounds(35+105*2+15*2, 16, 200, 30);
		
		//添加复选框
		JCheckBox box1 = new JCheckBox("全体成员");
		box1.setForeground(fc);
		box1.setBackground(bc);
		box1.setFont(new Font(type,0,18));
		checkFrame.main.add(box1);
		box1.setBounds(35, 18, 105, 25);
		
		JCheckBox box2 = new JCheckBox("个别成员");
		box2.setForeground(fc);
		box2.setBackground(bc);
		box2.setFont(new Font(type,0,18));
		checkFrame.main.add(box2);
		box2.setBounds(35+105+15, 18, 105, 25);
			//设置单选及对应事件
		box1.setSelected(true);
		box1.addActionListener((e)->{
			if(box1.isSelected() == true) {	
				box1.setEnabled(false);
				box2.setEnabled(true);
				box2.setSelected(false);	
				text.setEditable(false);
			}
		});
		box2.addActionListener((e)->{
			if(box2.isSelected() == true) {	
				box2.setEnabled(false);
				box1.setEnabled(true);
				box1.setSelected(false);	
				text.setEditable(true);
			}
		});
		
		//添加课程表查空情况
		tablePanel panel = new tablePanel(0);
		checkFrame.main.add(panel);
		panel.setBounds(9, 63, cfwidth-18, 336);
	}
	
	//信息显示格式
	public static void createDataPerformed(JLabel label,JTextField text){
		label.setBackground(bc);
		label.setFont(new Font("微软雅黑",0,18));
		label.setForeground(new Color(118,113,113));
		label.setOpaque(true);
		
		if(text != null) {
			text.setBorder(null);
			text.setForeground(new Color(118,113,113));
			text.setFont(new Font(type,0,20));
			text.setBackground(bc);
		}
	}
	
	//添加修改框保存事件
	public static void confirmClickedEvent(BackgroundFrame frame) {
		if(frame.getTitle() == "stu") {


			frame.dispose();
		}
		if(frame.getTitle() == "lesson") {
			
		}
	}
		
	//文件选择框
	public static String fileSelectedFrame() {
		JFileChooser chooser = new JFileChooser();
		File file = null;
		
		//筛选出目标文件类型
		FileNameExtensionFilter filter = new FileNameExtensionFilter("数据文件","png");//"png"为例子
		chooser.setFileFilter(filter);
		
		//显示对话框
		int ret = chooser.showOpenDialog(chooser);
			//获取选择结果
		if(ret == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		
		return file.getAbsolutePath();
	}

	//程序结束调用
	public static void exitSystem(){
		try {
			studentManage.call_when_exit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

	//test
	public static void test(){
		Course receive = new Course();
		for(Course c:studentManage.Get_course(83994618)){
			receive = c;
			System.out.println();

		}
	}

	//主函数
	public static void main(String[] args) throws IOException {

//		LoginFrame();
//		Home();
//		StuDataPanel();
		StuSchedule();
//		Input();
//		Output();
//		UnionManage();
//		CheckFreeFrame();
//		test();
	}
}