package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class labelOfTable extends JLabel{
	
	public  labelOfTable(String name) {
		setText(name);
		setBackground(new Color(68,114,196));
		setFont(new Font("微软雅黑",0,18));
		setForeground(Color.white);
		setHorizontalAlignment(CENTER);
		setOpaque(true);
	}
	
//	//创建社团管理中文本
//	public labelOfTable(String name , int a) {
//		setText(name);
//		setBackground(Color.green);
//		setFont(new Font("微软雅黑",0,18));
//		setForeground(new Color(118,113,113));
////		setHorizontalAlignment(CENTER);
//		setOpaque(true);
//	}
}
