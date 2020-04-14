package com.SMS.GUI;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class textOfTable extends JTextPane{
	private StyledDocument text ;
	private SimpleAttributeSet font;
	
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
	
	public textOfTable(Color color) {
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
				for(int a = 65;a < 74;a++) {regionBox.addItem((char)a);}//添加A~I
				
				
				JTextField classField = new JTextField();
				classField.setFont(new Font(Frame.type,0,20));
				classField.setForeground(Frame.fc);
				classField.setBackground(Color.white);
				add.main.add(classField);
				classField.setBounds(120, 12+55*2, 180, 35);
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
