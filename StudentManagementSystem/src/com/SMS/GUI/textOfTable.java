package com.SMS.GUI;

import com.SMS.base.Course;
import com.SMS.base.Student;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
用于学生日程表
 */

public class textOfTable extends JTextPane{
	private StyledDocument text ;
	private SimpleAttributeSet font;

	static int stu_num;//接收学生学号
	String courname;//接收课程名
	char rg ;//接收区域
	int classnum ;//接收课室
	static int week;//接收周数
	int day;//接收上课星期
	int time;//接收课程所在时间段
	
	public textOfTable(Color color,int a){
		this.setBackground(color);
		this.setEditable(true);
		
		font = new SimpleAttributeSet();
		StyleConstants.setForeground(font, Frame.fc);
		StyleConstants.setFontSize(font, 12);
		StyleConstants.setAlignment(font, StyleConstants.ALIGN_CENTER);
		
		text = this.getStyledDocument();
		text.setParagraphAttributes(0, text.getLength(), font, false);
	}
	
	public textOfTable(Color color,String pname) {
		this.setName(pname);
		this.setBackground(color);
		this.setEditable(true);
		
		font = new SimpleAttributeSet();
		StyleConstants.setForeground(font, Frame.fc);
		StyleConstants.setFontSize(font, 12);
		StyleConstants.setAlignment(font, StyleConstants.ALIGN_CENTER);
		
		text = this.getStyledDocument();
		text.setParagraphAttributes(0, text.getLength(), font, false);
		
		//添加鼠标监听器
		this.addMouseListener(new MouseListener() {
			
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
				BackgroundFrame add = new BackgroundFrame( 580, 300, 350, 262 );

				boolean judge = false;

				//添加文本项
				JLabel name = new JLabel("课程名:");
				name.setForeground(Frame.fc);
				name.setFont(new Font(Frame.type,0,20));
				add.main.add(name);
				name.setBounds(45, 16, 70, 25);
				
				JLabel region = new JLabel("区域:");
				region.setForeground(Frame.fc);
				region.setFont(new Font(Frame.type,0,20));
				add.main.add(region);
				region.setBounds(55, 16+55, 50, 25);
				
				JLabel classroom = new JLabel("课室:");
				classroom.setForeground(Frame.fc);
				classroom.setFont(new Font(Frame.type,0,20));
				add.main.add(classroom);
				classroom.setBounds(55, 16+55*2, 50, 25);
				
				//添加输入框
				JTextField nameField = new JTextField();
				nameField.setFont(new Font(Frame.type,0,20));
				nameField.setForeground(Frame.fc);
				nameField.setBackground(Color.white);
				add.main.add(nameField);
				nameField.setBounds(120, 12, 180, 35);
				
				JComboBox regionBox = new JComboBox();
				regionBox.setForeground(Frame.fc);
				regionBox.setBackground(Color.white);
				regionBox.setFont(new Font(Frame.type,0,20));
				add.main.add(regionBox);
				regionBox.setBounds(120, 12+55, 100, 35);
				for(int a = 65;a < 91;a++) {regionBox.addItem((char)a);}//添加A~I
				
				
				JTextField classField = new JTextField();
				classField.setFont(new Font(Frame.type,0,20));
				classField.setForeground(Frame.fc);
				classField.setBackground(Color.white);
				add.main.add(classField);
				classField.setBounds(120, 12+55*2, 180, 35);

				//添加确认和取消按钮
				JLabel confirm = new JLabel();
				confirm.setIcon(new ImageIcon("image/confirm.png"));
				add.main.add(confirm);
				confirm.setBounds((350+112)/2-30, 262-27*3, 50, 27);
				confirm.setOpaque(true);

				JLabel cancel = new JLabel();
				cancel.setIcon(new ImageIcon("image/cancel.png"));
				add.main.add(cancel);
				cancel.setBounds((350-112)/2-30, 262-27*3, 50, 27);
				cancel.setOpaque(true);

				//获得内容
				if(getText().length() != 0) {
					nameField.setText(getText());
					regionBox.setSelectedItem((char) (rg - 32));
					classField.setText(Integer.toString(classnum));
					judge = true;

					//获得课程基本数据
					courname = getText();
					if(getName() == "11"){time = 0;day = 0;}
					if(getName() == "12"){time = 0;day = 1;}
					if(getName() == "13"){time = 0;day = 2;}
					if(getName() == "14"){time = 0;day = 3;}
					if(getName() == "15"){time = 0;day = 4;}
					if(getName() == "16"){time = 0;day = 5;}
					if(getName() == "17"){time = 0;day = 6;}

					if(getName() == "21"){time = 1;day = 0;}
					if(getName() == "22"){time = 1;day = 1;}
					if(getName() == "23"){time = 1;day = 2;}
					if(getName() == "24"){time = 1;day = 3;}
					if(getName() == "25"){time = 1;day = 4;}
					if(getName() == "26"){time = 1;day = 5;}
					if(getName() == "27"){time = 1;day = 6;}

					if(getName() == "31"){time = 2;day = 0;}
					if(getName() == "32"){time = 2;day = 1;}
					if(getName() == "33"){time = 2;day = 2;}
					if(getName() == "34"){time = 2;day = 3;}
					if(getName() == "35"){time = 2;day = 4;}
					if(getName() == "36"){time = 2;day = 5;}
					if(getName() == "37"){time = 2;day = 6;}

					if(getName() == "41"){time = 3;day = 0;}
					if(getName() == "42"){time = 3;day = 1;}
					if(getName() == "43"){time = 3;day = 2;}
					if(getName() == "44"){time = 3;day = 3;}
					if(getName() == "45"){time = 3;day = 4;}
					if(getName() == "46"){time = 3;day = 5;}
					if(getName() == "47"){time = 3;day = 6;}

					if(getName() == "51"){time = 4;day = 0;}
					if(getName() == "52"){time = 4;day = 1;}
					if(getName() == "53"){time = 4;day = 2;}
					if(getName() == "54"){time = 4;day = 3;}
					if(getName() == "55"){time = 4;day = 4;}
					if(getName() == "56"){time = 4;day = 5;}
					if(getName() == "57"){time = 4;day = 6;}

					if(getName() == "61"){time = 5;day = 0;}
					if(getName() == "62"){time = 5;day = 1;}
					if(getName() == "63"){time = 5;day = 2;}
					if(getName() == "64"){time = 5;day = 3;}
					if(getName() == "65"){time = 5;day = 4;}
					if(getName() == "66"){time = 5;day = 5;}
					if(getName() == "67"){time = 5;day = 6;}
				}

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
						cancel.setIcon(new ImageIcon("image/cancel.png"));

					}

					@Override
					public void mouseEntered(MouseEvent e) {
						cancel.setIcon(new ImageIcon("image/cancelEntered.png"));

					}

					@Override
					public void mouseClicked(MouseEvent e) {
						add.dispose();

					}
				});

				boolean finalJudge = judge;
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
						confirm.setIcon(new ImageIcon("image/confirm.png"));

					}

					@Override
					public void mouseEntered(MouseEvent e) {
						confirm.setIcon(new ImageIcon("image/confirmEntered.png"));

					}

					@Override
					public void mouseClicked(MouseEvent e) {
						if(nameField.getText().length() != 0 || classField.getText().length() != 0) {
							if (finalJudge) {
								char pos = (char) ((char) regionBox.getSelectedItem() + 32);
								Frame.studentManage.Modify_course(new Course(stu_num, courname, rg, classnum, week, day, time),
										new Course(stu_num, nameField.getText(), pos, Integer.parseInt(classField.getText()), week, day, time));

								add.dispose();

								Frame.homeFrame.main.removeAll();
								Frame.StuSchedule(Integer.toString(stu_num), week);
								Frame.homeFrame.main.updateUI();
							} else {
								char pos = (char) ((char) regionBox.getSelectedItem() + 32);
								Frame.studentManage.Add_course(new Course(stu_num, nameField.getText(), pos, Integer.parseInt(classField.getText()), week, day, time));
								add.dispose();

								Frame.homeFrame.main.removeAll();
								Frame.StuSchedule(Integer.toString(stu_num), week);
								Frame.homeFrame.main.updateUI();
							}
						}
					}
				});
			}
		});
	}
	
	public textOfTable(Color backcolor,String startTime,String times) {
		this.setBackground(backcolor);//设置背景颜色
		this.setEditable(false);//设置是否可编辑
		
		//设置第一行文本格式
		SimpleAttributeSet font1 = new SimpleAttributeSet();//创建格式变量
		StyleConstants.setForeground(font1, Color.black);//设置文本颜色
		StyleConstants.setFontSize(font1, 12);//设置字体大小
		StyleConstants.setAlignment(font1, StyleConstants.ALIGN_CENTER);//设置文本居中
		
		//设置第二行文本格式
		SimpleAttributeSet font2 = new SimpleAttributeSet();
		StyleConstants.setForeground(font2, Color.black);
		StyleConstants.setFontSize(font2, 14);
		StyleConstants.setBold(font2, true);//设置文本加粗
		StyleConstants.setAlignment(font2, StyleConstants.ALIGN_CENTER);
		
		//添加第一行文字
		StyledDocument text1 = this.getStyledDocument();
		text1.setParagraphAttributes(0, text1.getLength(), font1, false);		
		try {
			text1.insertString(text1.getLength(), startTime, font1);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//添加第二行文字
		StyledDocument text2 = this.getStyledDocument();
		text2.setParagraphAttributes(text1.getLength(), text2.getLength(), font2, true);
		try {
			text2.insertString(text1.getLength(), "\n"+times, font2);
		}catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
