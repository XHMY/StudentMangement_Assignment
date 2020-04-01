import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.*;

public class BackgroundFrame extends JFrame {
	JPanel main = new JPanel();
	
	public BackgroundFrame(int x,int y,int width,int height,Color color) {
		//创建窗口
		setUndecorated(true);
		setBounds(530,250,width,height);		
		setLayout(null);
		setBackground(new Color(242,242,242));
		
		//添加鼠标操作使窗口可拖动
		FrameListener moveListener = new FrameListener(this);		
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);
		
		//创建标题框top
		JPanel top = new JPanel();
		top.setBackground(new Color(47,85,151));
		top.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("close.jpg");
		ImageIcon icon2 = new ImageIcon("minimum.jpg");
		
		JButton close = new JButton();
		JButton minimum = new JButton();
		close.setIcon(icon1);
		minimum.setIcon(icon2);
		
		top.add(close);
		top.add(minimum);
		close.setBounds(x-60, 0, 30, 30);
		minimum.setBounds(x-90, 0, 30, 30);
		
		//给按钮添加最小化和关闭功能
		close.addActionListener((e)->{System.exit(0);});
		minimum.addActionListener((e)->{setExtendedState(ICONIFIED);});
		
		//放置标题栏top
		add(top);
		top.setBounds(0,0,width,30);
		
		//放置主面板main
		add(main);
		main.setLayout(null);
		main.setBounds(0, 30, width, height-30);
		main.setBackground(color);
		
		//窗口可视化
		setVisible(true);
	}
	
	public BackgroundFrame(int x,int y,int width,int height) {
		//创建窗口
		setUndecorated(true);
		setBounds(530,250,width,height);		
		setLayout(null);
		setBackground(new Color(242,242,242));
		
		//使窗口可拖动
		FrameListener moveListener = new FrameListener(this);		
		addMouseListener(moveListener);
		addMouseMotionListener(moveListener);
		
		//创建标题框top
		JPanel top = new JPanel();
		top.setBackground(new Color(47,85,151));
		top.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("close.jpg");
		ImageIcon icon2 = new ImageIcon("minimum.jpg");
		
		JButton close = new JButton();
		JButton minimum = new JButton();
		close.setIcon(icon1);
		minimum.setIcon(icon2);
		
		top.add(close);
		top.add(minimum);
		close.setBounds(x-60, 0, 30, 30);
		minimum.setBounds(x-90, 0, 30, 30);
		
		//给按钮添加最小化和关闭功能
		close.addActionListener((e)->{System.exit(0);});
		minimum.addActionListener((e)->{setExtendedState(ICONIFIED);});
		
		//放置标题框top
		add(top);
		top.setBounds(0,0,width,30);
		
		//放置主面板main
		add(main);
		main.setLayout(null);
		main.setBounds(0, 30, width, height-30);
		main.setBackground(new Color(242,242,242));
		
		//窗口可视化
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	}
}


	 