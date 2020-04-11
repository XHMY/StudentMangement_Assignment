package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

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
	
	//登录界面
	public static void Login() {
		BackgroundFrame login = new BackgroundFrame(530,250,500,320,new Color(45,85,151));
		
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
		account.setBackground(new Color(133,152,185));
		password.setBackground(new Color(133,152,185));
		
			//设置输入字体
		account.setForeground(Color.white);
		account.setFont(new Font(type,0,14));
		password.setForeground(Color.white);
		password.setFont(new Font(type,0,14));
		
		//添加登录按钮
		ImageIcon icon1 = new ImageIcon("image\\lgButton3.png");
		JLabel button = new JLabel();
		button.setIcon(icon1);
		login.main.add(button);
		button.setBounds(220, 210, 100, 41);
		
			//创建错误提示
		JLabel tips = new JLabel("账号或密码不能为空");
		JLabel tips2 = new JLabel("账号或密码错误" );
		
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
				}
				else {
					if(true) {							
						login.dispose();
						
						Home();
					}
					else	tips2.setBounds(225, 40, 150, 30);
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
						if(true) {
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
					}
					else{
						if(true) {	
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
		HomeButton stuData = new HomeButton("学生资料",new Color(91,155,213),new ImageIcon("image\\学生资料.png"),new ImageIcon("image\\学生资料2.png"));
		home.add(stuData);
		stuData.setBounds(x1, y1, d, d);
		
		//创建学生日程按钮
		HomeButton stuSchedule = new HomeButton("学生日程",new Color(0,176,80),new ImageIcon("image\\学生日程.png"),new ImageIcon("image\\学生日程2.png"));
		home.add(stuSchedule);
		stuSchedule.setBounds(x2, y1, d*5/12, d);
		
		//创建其他按钮
		HomeButton other = new HomeButton("其他",new Color(237,125,49),new ImageIcon("image\\其他.png"),new ImageIcon("image\\其他2.png"));
		home.add(other);
		other.setBounds(x2+d*7/12-2, y1, d*5/12, d);
		
		//创建导入按钮
		HomeButton input = new HomeButton("导入",new Color(255,192,0),new ImageIcon("image\\导入.png"),new ImageIcon("image\\导入2.png"));
		home.add(input);
		input.setBounds(x1,y2+2,d,d*5/12);
		
		//创建导出按钮
		HomeButton output = new HomeButton("导出",new Color(68,114,196),new ImageIcon("image\\导出.png"),new ImageIcon("image\\导出2.png"));
		home.add(output);
		output.setBounds(x1, y2+d*7/12-2, d, d*5/12);
		
		//创建社团管理按钮
		HomeButton unionManage = new HomeButton("社团管理",new Color(112,48,160),new ImageIcon("image\\社团管理.png"),new ImageIcon("image\\社团管理2.png"));
		home.add(unionManage);
		unionManage.setBounds(x2, y2, d, d);
		
	} 
	
	//学生资料界面
	public static void StuDataPanel() {
		//创建主面板		
		JPanel stuDataPanel = new JPanel();
		stuDataPanel.setLayout(null);
		stuDataPanel.setBackground(bc);
		homeFrame.main.add(stuDataPanel);
		stuDataPanel.setBounds(0, 0, cfwidth, 177);
		
		//创建返回按钮
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("image\\back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68,114,196));
		backButton.setFont(new Font(type,0,18));
		stuDataPanel.add(backButton);
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
		
		//创建添加按钮
		JLabel add = new JLabel("添加");
		add.setFont(new Font(type,0,18));
		add.setForeground(fc);
		stuDataPanel.add(add);
		add.setBounds(458, 15, 40, 30);		
			//添加鼠标监视器
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
				BackgroundFrame addFrame = new BackgroundFrame(cfx+50,cfy+100,cfwidth,cfheight-158,0);
				addFrame.setTitle("stu");
				DataPanel panel = new DataPanel(true);
				panel.setBackground(bc);
				addFrame.main.add(panel);
				panel.setBounds(DataPanel.width+10, 30, DataPanel.space_x+DataPanel.width+10+DataPanel.fieldWidth, DataPanel.space_y*4+DataPanel.height);
			}
		});

		
		//创建查找栏
		JLabel searchFrame = new JLabel();
		searchFrame.setLayout(null);
		searchFrame.setIcon(new ImageIcon("image\\searchFrame.png"));
		stuDataPanel.add(searchFrame);
		searchFrame.setBounds(20, 57, 488, 120);
			//在查找栏上创建面板
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setOpaque(false);
		searchFrame.add(search);
		search.setBounds(0, 0, 488, 120);
		
		//创建输入框
		JTextField input = new JTextField();
		search.add(input);
		input.setFont(new Font(type,0,16));
		input.setForeground(fc);
		input.setBounds(73, 30, 190, 36);
		
		//创建复选框
		JCheckBox box1 = new JCheckBox("按学号");
		box1.setFont(new Font(type,0,18));
		box1.setBackground(Color.white);
		box1.setForeground(fc);
		box1.setSelected(true);
		search.add(box1);
		box1.setBounds(73, 71, 83, 26);
		
		JCheckBox box2 = new JCheckBox("按姓名");
		box2.setFont(new Font(type,0,18));
		box2.setBackground(Color.white);
		box2.setForeground(fc);
		box2.setSelected(false);
		search.add(box2);
		box2.setBounds(180, 71, 83, 26);
			//设置复选框单选
		box1.addActionListener((e)->{if(box1.isSelected() == true) box2.setSelected(false);});
		box2.addActionListener((e)->{if(box2.isSelected() == true) box1.setSelected(false);});
		
		//创建查找按钮
		JLabel searchButton = new JLabel();
		searchButton.setIcon(new ImageIcon("image\\searchButton.png"));
		search.add(searchButton);
		searchButton.setBounds(280, 30, 82, 60);
		searchButton.setOpaque(true);		
			//添加鼠标监听器
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
				searchButton.setIcon(new ImageIcon("image\\searchButton.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("image\\searchButtonEntered.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		//创建修改按钮
		JLabel fixButton = new JLabel();
		fixButton.setIcon(new ImageIcon("image\\fixButton.png"));
		search.add(fixButton);
		fixButton.setBounds(380, 30, 82, 60);
		fixButton.setOpaque(true);		
			//添加鼠标监听器
		fixButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				fixButton.setIcon(new ImageIcon("image\\fixButton.png"));			
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fixButton.setIcon(new ImageIcon("image\\fixButtonEntered.png"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				//清除面板重新加载
				secmain.removeAll();
				createDataPanel(true);
				
				//添加确认和取消按钮
				JLabel confirm = new JLabel();
				confirm.setIcon(new ImageIcon("image\\confirm.png"));
				homeFrame.main.add(confirm);
				confirm.setBounds(cfwidth/2+28,cfheight-90,50,27);
				confirm.setOpaque(true);
				
				JLabel cancel = new JLabel();
				cancel.setIcon(new ImageIcon("image\\cancel.png"));
				homeFrame.main.add(cancel);
				cancel.setBounds(cfwidth/2-84, cfheight-90, 50, 27);
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
						cancel.setIcon(new ImageIcon("image\\cancel.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						cancel.setIcon(new ImageIcon("image\\cancelEntered.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						homeFrame.main.remove(cancel);
						homeFrame.main.remove(confirm);
						homeFrame.main.updateUI();
						secmain.removeAll();
						createDataPanel(false);
						
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
						confirm.setIcon(new ImageIcon("image\\confirm.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						confirm.setIcon(new ImageIcon("image\\confirmEntered.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						homeFrame.main.remove(cancel);
						homeFrame.main.remove(confirm);
						homeFrame.main.updateUI();
						secmain.removeAll();
						createDataPanel(false);
					}
				});
				
				
			}
		});
	
		//创建信息表
		secmain.setLayout(null);
		homeFrame.main.add(secmain);
		secmain.setBounds(DataPanel.width+10, 210, DataPanel.space_x+DataPanel.width+10+DataPanel.fieldWidth, DataPanel.space_y*4+DataPanel.height);

		createDataPanel(false);		
	}
	
	//创建学生信息表
	public static  void createDataPanel(boolean a) {
		DataPanel panel = new DataPanel(a);
		panel.setBackground(bc);
		secmain.add(panel);
		panel.setBounds(0, 0, DataPanel.space_x+DataPanel.width+10+DataPanel.fieldWidth, DataPanel.space_y*4+DataPanel.height);
	}
	
	//学生日程界面
	public static void StuSchedule() {
//		homeFrame.setVisible(true);
		
		//创建主面板		
		JPanel stuSchedule = new JPanel();
		stuSchedule.setLayout(null);
		stuSchedule.setBackground(bc);
		homeFrame.main.add(stuSchedule);
		stuSchedule.setBounds(0, 0, cfwidth, 177);
				
		//创建返回按钮
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("image\\back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68,114,196));
		backButton.setFont(new Font(type,0,18));
		stuSchedule.add(backButton);
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
				
		//创建查找栏
		JLabel searchFrame = new JLabel();
		searchFrame.setLayout(null);
		searchFrame.setIcon(new ImageIcon("image\\searchFrame2.png"));
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
		box1.setSelected(true);
		search.add(box1);
		box1.setBounds(30, 31, 83, 26);
		
		JCheckBox box2 = new JCheckBox("按学号");
		box2.setFont(new Font(type,0,18));
		box2.setForeground(fc);
		box2.setBackground(Color.white);
		box2.setSelected(false);
		search.add(box2);
		box2.setBounds(30, 68, 83, 26);
		
		box1.addActionListener((e)->{if(box1.isSelected() == true)box2.setSelected(false);});
		box2.addActionListener((e)->{if(box2.isSelected() == true)box1.setSelected(false);});
		
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
		numInput.setFont(new Font(type,0,18));
		search.add(numInput);
		numInput.setBounds(160, 68, 180, 36);
		
		//创建查找按钮
		JLabel searchButton = new JLabel();
		searchButton.setIcon(new ImageIcon("image\\search.png"));
//		searchButton.setBackground(Color.black);
		search.add(searchButton);
		searchButton.setBounds(377, 43, 80, 37);
		searchButton.setOpaque(true);
			//添加鼠标监听器
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
				searchButton.setIcon(new ImageIcon("image\\search.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				searchButton.setIcon(new ImageIcon("image\\searchEntered.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		//创建表格
		secmain.setLayout(null);
		secmain.setBackground(Color.black);
		homeFrame.main.add(secmain);
		secmain.setBounds(9, 195, cfwidth-18, 336);
		tablePanel table = new tablePanel();
		secmain.add(table);
		table.setBounds(0, 0, cfwidth-18, 336);
		
		homeFrame.main.updateUI();
	}
	
	//导入界面
	public static void Input() {
//		homeFrame.setVisible(true);
		
		//创建返回按键
		JLabel backButton = new JLabel();
		backButton.setIcon(new ImageIcon("image\\back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68,114,196));
		backButton.setFont(new Font(type,0,18));
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
		addressField.setFont(new Font(type,0,14));
		homeFrame.main.add(addressField);
		addressField.setBounds(30+90, 130+30*2+10*2+8, 300, 35);		
			//添加文件选择对话框按钮
		JLabel fileButton = new JLabel();
		fileButton.setIcon(new ImageIcon("image\\fileSelect.png"));
		homeFrame.main.add(fileButton);
		fileButton.setBounds(120+300, 218, 35, 35);
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
		addressField2.setFont(new Font(type,0,14));
		homeFrame.main.add(addressField2);
			//添加文件选择按钮
		JLabel fileButton2 = new JLabel();
		fileButton2.setIcon(new ImageIcon("image\\fileSelect.png"));
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
			}
			else {
				addressField2.setBounds(120, 218+35+10, 0, 0);//设置大小为0以隐藏组件
				fileButton2.setBounds(420, 218+35+10, 0, 0);
			}
		});
	
		//添加导入按钮
		JLabel inputButton = new JLabel();
		inputButton.setIcon(new ImageIcon("image\\input.png"));
		inputButton.setOpaque(true);
		homeFrame.main.add(inputButton);
		inputButton.setBounds((cfwidth-48*3/2)/2, cfheight-200, 48*3/2, 22*3/2);
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
				inputButton.setIcon(new ImageIcon("image\\input.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				inputButton.setIcon(new ImageIcon("image\\inputEntered.png"));
				
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
		backButton.setIcon(new ImageIcon("image\\back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68,114,196));
		backButton.setFont(new Font(type,0,18));
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
		addressField.setFont(new Font(type,0,14));
		homeFrame.main.add(addressField);
		addressField.setBounds(30+90, 130+30*2+10*2+8, 300, 35);		
			//添加文件选择对话框按钮
		JLabel fileButton = new JLabel();
		fileButton.setIcon(new ImageIcon("image\\fileSelect.png"));
		homeFrame.main.add(fileButton);
		fileButton.setBounds(120+300, 218, 35, 35);
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
		addressField2.setFont(new Font(type,0,14));
		homeFrame.main.add(addressField2);
			//添加文件选择按钮
		JLabel fileButton2 = new JLabel();
		fileButton2.setIcon(new ImageIcon("image\\fileSelect.png"));
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
			}
			else {
				addressField2.setBounds(120, 218+35+10, 0, 0);//设置大小为0以隐藏组件
				fileButton2.setBounds(420, 218+35+10, 0, 0);
			}
		});
	
		//添加导入按钮
		JLabel outputButton = new JLabel();
		outputButton.setIcon(new ImageIcon("image\\output.png"));
		outputButton.setOpaque(true);
		homeFrame.main.add(outputButton);
		outputButton.setBounds((cfwidth-48*3/2)/2, cfheight-200, 48*3/2, 22*3/2);
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
				outputButton.setIcon(new ImageIcon("image\\output.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				outputButton.setIcon(new ImageIcon("image\\outputEntered.png"));
				
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
		backButton.setIcon(new ImageIcon("image\\back.png"));
		backButton.setText(" 返回");
		backButton.setForeground(new Color(68,114,196));
		backButton.setFont(new Font(type,0,18));
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
		search.setIcon(new ImageIcon("image\\unionSearch.png"));
		homeFrame.main.add(search);
		search.setBounds((cfwidth-486)/2, 60, 450+36, 75+36/6+1);
		search.setBackground(Color.green);
		search.setOpaque(true);
		
		//添加下拉列表
		JComboBox<String> box = new JComboBox<>();
		box.setForeground(bc);
		box.setFont(new Font(type,0,20));
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
		amount.setBounds(x+270, 167+space_y*2, 50, 30);
		amountField.setBounds(x+270+50, 167+space_y*2, 100, 30);
		
		JLabel memberData = new JLabel("成员信息:");
		createDataPerformed(memberData,null);
		homeFrame.main.add(memberData);
		memberData.setBounds(x, 167+space_y*3, 90, 30);
		
		//添加查找团空按钮
		JLabel checkFree = new JLabel();
		checkFree.setIcon(new ImageIcon("image\\checkFree.png"));
		checkFree.setOpaque(true);
		homeFrame.main.add(checkFree);
		checkFree.setBounds(55+270+50, 167+10, 102, 42);
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
				checkFree.setIcon(new ImageIcon("image\\checkFree.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				checkFree.setIcon(new ImageIcon("image\\checkFreeEntered.png"));
				
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
//			Student a = new Student(frame.panel.nameField.getText());
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
	
	public static void main(String[] args) {
		
		Login();
//		Home();
//		StuDataPanel();
//		StuSchedule();
//		Input();
//		Output();
//		UnionManage();
//		CheckFreeFrame();
	}
}