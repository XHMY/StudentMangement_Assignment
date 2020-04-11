package com.SMS.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BackgroundFrame extends JFrame{
    JPanel main = new JPanel();
	
	//窗口标题宽度常量
	static int d = 43;
	
	//登录框
	public BackgroundFrame(int x,int y,int width,int height,Color color) {
		//窗口创建
		setUndecorated(true);
		setBounds(530,250,width,height);		
		setLayout(null);
		setBackground(new Color(242,242,242));

		//实现窗体拖动
		FrameListener moveListener = new FrameListener(this);
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);

		//创建标题top
		JPanel top = new JPanel();
		top.setBackground(new Color(47, 85, 151));
		top.setLayout(null);

		ImageIcon icon1 = new ImageIcon("src/com/SMS/GUI/image/close.png");
		ImageIcon icon2 = new ImageIcon("src/com/SMS/GUI/image/minimum.png");

		JButton close = new JButton();
		JButton minimum = new JButton();
		close.setIcon(icon1);
		minimum.setIcon(icon2);

		top.add(close);
		top.add(minimum);
		close.setBounds(x - 60, 0, 30, 30);
		minimum.setBounds(x - 90, 0, 30, 30);
		
		//添加最小化和关闭功能
		close.addActionListener((e)->{dispose();});
		minimum.addActionListener((e)->{setExtendedState(ICONIFIED);});
		
		//添加top到窗口
		add(top);
		top.setBounds(0,0,width,30);
		
		//添加主面板main
		add(main);
		main.setLayout(null);
		main.setBounds(0, 30, width, height-30);
		main.setBackground(color);
		
		//作为代码最后一行
		setVisible(true);
	}
	
	//home框
	public BackgroundFrame(int x,int y,int width,int height,boolean a) {
		
		
		//窗口创建
		setUndecorated(true);
		setBounds(x,y,width,height);
		setLayout(null);
		setBackground(new Color(242,242,242));

		//实现窗体拖动
		FrameListener moveListener = new FrameListener(this);
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);

		//创建标题top
		JPanel top = new JPanel();
		top.setBackground(new Color(47, 85, 151));
		top.setLayout(null);

		ImageIcon icon1 = new ImageIcon("src/com/SMS/GUI/image/close.png");
		ImageIcon icon2 = new ImageIcon("src/com/SMS/GUI/image/minimum.png");

		JButton close = new JButton();
		JButton minimum = new JButton();
		close.setIcon(icon1);
		minimum.setIcon(icon2);

		top.add(close);
		top.add(minimum);
		close.setBounds(width - d, 0, d, d);
		minimum.setBounds(width - 2 * d, 0, d, d);
		
		//添加最小化和关闭功能
		close.addActionListener((e)->{
			if(a) {
				BackgroundFrame warn = new BackgroundFrame(x+(width-200)/2,y+(height-100)/2,300,200,"是否退出系统？");
				warn.setVisible(true);
			}else dispose();
		});
		minimum.addActionListener((e)->{setExtendedState(ICONIFIED);});
		
		//添加top到窗口
		add(top);
		top.setBounds(0,0,width,d);
		
		//添加主面板main
		add(main);
		main.setLayout(null);
		main.setBounds(0, d, width, height-d);
		main.setBackground(new Color(242,242,242));

	}
	
	//添加修改框
	public BackgroundFrame(int x,int y,int width,int height,int a) {
		
		
		//窗口创建
		setUndecorated(true);
		setBounds(x,y,width,height);		
		setLayout(null);
		setBackground(new Color(242,242,242));
		
		//实现窗体拖动
		FrameListener moveListener = new FrameListener(this);		
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);
		
		//创建标题top
		JPanel top = new JPanel();
		top.setBackground(new Color(47,85,151));
		top.setLayout(null);
		
		//添加top到窗口
		add(top);
		top.setBounds(0, 0, width, d);

		//添加主面板main
		add(main);
		main.setLayout(null);
		main.setBounds(0, d, width, height - d);
		main.setBackground(new Color(242, 242, 242));

		//添加确认和取消按钮
		JLabel confirm = new JLabel();
		confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirm.png"));
		main.add(confirm);
		confirm.setBounds(width / 2 + 28, height - 100, 50, 27);
		confirm.setOpaque(true);

		JLabel cancel = new JLabel();
		cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancel.png"));
		main.add(cancel);
		cancel.setBounds(width / 2 - 84, height - 100, 50, 27);
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
				dispose();
				
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
				Frame.confirmClickedEvent(BackgroundFrame.this);
				
			}
		});
		
		//作为代码最后一行
		setVisible(true);
	}

	//提示框
	public BackgroundFrame(int x,int y,int width,int height,String text) {
		//窗口创建
		setUndecorated(true);
		setBounds(x,y,width,height);		
		setLayout(null);
		setBackground(new Color(242,242,242));
		
		//实现窗体拖动
		FrameListener moveListener = new FrameListener(this);		
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);
		
		//创建标题top
		JPanel top = new JPanel();
		top.setBackground(new Color(47,85,151));
		top.setLayout(null);
		
		//添加top到窗口
		add(top);
		top.setBounds(0,0,width,30);
		
		//添加主面板main
		add(main);
		main.setLayout(null);
		main.setBounds(0, d, width, height-d);
		main.setBackground(new Color(242,242,242));

		//添加提示文本
		JLabel warn = new JLabel(text);
		warn.setForeground(Frame.fc);
		warn.setFont(new Font(Frame.type, 0, 20));
		this.main.add(warn);
		warn.setBounds((width - text.length() * 10) / 3, (height - 30) / 4, text.length() * 100, 30);

		//添加确认和取消按钮
		JLabel confirm = new JLabel();
		confirm.setIcon(new ImageIcon("src/com/SMS/GUI/image/confirm.png"));
		main.add(confirm);
		confirm.setBounds(width / 2 + 28, height - 100, 50, 27);
		confirm.setOpaque(true);

		JLabel cancel = new JLabel();
		cancel.setIcon(new ImageIcon("src/com/SMS/GUI/image/cancel.png"));
		main.add(cancel);
		cancel.setBounds(width / 2 - 84, height - 100, 50, 27);
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
				dispose();
				
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
				System.exit(0);
				
			}
		});
		
		//作为代码最后一行
		setVisible(true);
	}
}