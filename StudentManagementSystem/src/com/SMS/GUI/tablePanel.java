package com.SMS.GUI;

import com.SMS.base.Course;
import com.SMS.base.Union;
import com.SMS.lib.algs4.Bag;

import javax.swing.*;
import java.awt.*;

public class tablePanel extends JPanel{
	static int lwidth = 62;
	static int lheight = 46;
	static int space_x = lwidth+2;
	static int space_y = lheight+2;
	
	static Color color1 = new Color(207,213,234);
	static Color color2 = new Color(233,235,245);

	//table成员变量
	JComboBox<String> week = new JComboBox<>();
	textOfTable s11 = new textOfTable(color1,"11");
	textOfTable s12 = new textOfTable(color1,"12");
	textOfTable s13 = new textOfTable(color1,"13");
	textOfTable s14 = new textOfTable(color1,"14");
	textOfTable s15 = new textOfTable(color1,"15");
	textOfTable s16 = new textOfTable(color1,"16");
	textOfTable s17 = new textOfTable(color1,"17");
	textOfTable s21 = new textOfTable(color2,"21");
	textOfTable s22 = new textOfTable(color2,"22");
	textOfTable s23 = new textOfTable(color2,"23");
	textOfTable s24 = new textOfTable(color2,"24");
	textOfTable s25 = new textOfTable(color2,"25");
	textOfTable s26 = new textOfTable(color2,"26");
	textOfTable s27 = new textOfTable(color2,"27");
	textOfTable s31 = new textOfTable(color1,"31");
	textOfTable s32 = new textOfTable(color1,"32");
	textOfTable s33 = new textOfTable(color1,"33");
	textOfTable s34 = new textOfTable(color1,"34");
	textOfTable s35 = new textOfTable(color1,"35");
	textOfTable s36 = new textOfTable(color1,"36");
	textOfTable s37 = new textOfTable(color1,"37");
	textOfTable s41 = new textOfTable(color2,"41");
	textOfTable s42 = new textOfTable(color2,"42");
	textOfTable s43 = new textOfTable(color2,"43");
	textOfTable s44 = new textOfTable(color2,"44");
	textOfTable s45 = new textOfTable(color2,"45");
	textOfTable s46 = new textOfTable(color2,"46");
	textOfTable s47 = new textOfTable(color2,"47");
	textOfTable s51 = new textOfTable(color1,"51");
	textOfTable s52 = new textOfTable(color1,"52");
	textOfTable s53 = new textOfTable(color1,"53");
	textOfTable s54 = new textOfTable(color1,"54");
	textOfTable s55 = new textOfTable(color1,"55");
	textOfTable s56 = new textOfTable(color1,"56");
	textOfTable s57 = new textOfTable(color1,"57");
	textOfTable s61 = new textOfTable(color2,"61");
	textOfTable s62 = new textOfTable(color2,"62");
	textOfTable s63 = new textOfTable(color2,"63");
	textOfTable s64 = new textOfTable(color2,"64");
	textOfTable s65 = new textOfTable(color2,"65");
	textOfTable s66 = new textOfTable(color2,"66");
	textOfTable s67 = new textOfTable(color2,"67");

	
	public tablePanel() {
		setLayout(null);
		setBackground(Color.white);
		
		//添加周数下拉列表
		for(int a=1;a<=9;a++)week.addItem("第"+a+"周");
		week.setBackground(new Color(68,114,196));
		week.setForeground(Color.white);
		week.setBorder(null);
		this.add(week);
		week.setBounds(0, 0, lwidth, lheight);
		
		//添加表头
		labelOfTable mon = new labelOfTable("MON");
		this.add(mon);
		mon.setBounds(lwidth+2,0,lwidth, lheight);
		
		labelOfTable tue = new labelOfTable("TUE");
		this.add(tue);
		tue.setBounds(space_x*2, 0, lwidth, lheight);
		
		labelOfTable wed = new labelOfTable("WED");
		this.add(wed);
		wed.setBounds(space_x*3, 0, lwidth, lheight);
		
		labelOfTable thu = new labelOfTable("THU");
		this.add(thu);
		thu.setBounds(space_x*4, 0, lwidth, lheight);
		
		labelOfTable fri = new labelOfTable("FRI");
		this.add(fri);
		fri.setBounds(space_x*5, 0, lwidth, lheight);
		
		labelOfTable sat = new labelOfTable("SAT");
		this.add(sat);
		sat.setBounds(space_x*6, 0, lwidth, lheight);
		
		labelOfTable sun = new labelOfTable("SUN");
		this.add(sun);
		sun.setBounds(space_x*7, 0, lwidth, lheight);
		
		//添加时间段
		textOfTable t1 = new textOfTable(color1,"8:20","1~2");
		this.add(t1);
		t1.setBounds(0, lheight+4, lwidth, lheight);
		
		textOfTable t2 = new textOfTable(color2,"10:20","3~4");
		this.add(t2);
		t2.setBounds(0, lheight+4+space_y, lwidth, lheight);
		
		textOfTable t3 = new textOfTable(color1,"14:00","5~6");
		this.add(t3);
		t3.setBounds(0, lheight+4+space_y*2, lwidth, lheight);
		
		textOfTable t4 = new textOfTable(color2,"16:00","7~8");
		this.add(t4);
		t4.setBounds(0, lheight+4+space_y*3, lwidth, lheight);
		
		textOfTable t5 = new textOfTable(color1,"18:40","9~10");
		this.add(t5);
		t5.setBounds(0, lheight+4+space_y*4, lwidth, lheight);
		
		textOfTable t6 = new textOfTable(color2,"20:30","11~12");
		this.add(t6);
		t6.setBounds(0, lheight+4+space_y*5, lwidth, lheight);
		
		//行数位置常量
		int b = 0;//y轴位置
		
			//列数位置常量
		int a = 1;//x轴位置

		s11.setText(null);
		this.add(s11);
		s11.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s12.setText(null);
		this.add(s12);
		s12.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s13.setText(null);
		this.add(s13);
		s13.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s14.setText(null);
		this.add(s14);
		s14.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s15.setText(null);
		this.add(s15);
		s15.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s16.setText(null);
		this.add(s16);
		s16.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s17.setText(null);
		this.add(s17);
		s17.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;

			//第二行
		a = 1;

		s21.setText(null);
		this.add(s21);
		s21.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s22.setText(null);
		this.add(s22);
		s22.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s23.setText(null);
		this.add(s23);
		s23.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s24.setText(null);
		this.add(s24);
		s24.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s25.setText(null);
		this.add(s25);
		s25.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s26.setText(null);
		this.add(s26);
		s26.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s27.setText(null);
		this.add(s27);
		s27.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第三行
		a = 1;

		s31.setText(null);
		this.add(s31);
		s31.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s32.setText(null);
		this.add(s32);
		s32.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s33.setText(null);
		this.add(s33);
		s33.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s34.setText(null);
		this.add(s34);
		s34.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s35.setText(null);
		this.add(s35);
		s35.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s36.setText(null);
		this.add(s36);
		s36.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s37.setText(null);
		this.add(s37);
		s37.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第四行
		a = 1;

		s41.setText(null);
		this.add(s41);
		s41.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s42.setText(null);
		this.add(s42);
		s42.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s43.setText(null);
		this.add(s43);
		s43.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s44.setText(null);
		this.add(s44);
		s44.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s45.setText(null);
		this.add(s45);
		s45.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s46.setText(null);
		this.add(s46);
		s46.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s47.setText(null);
		this.add(s47);
		s47.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第五行
		a = 1;

		s51.setText(null);
		this.add(s51);
		s51.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s52.setText(null);
		this.add(s52);
		s52.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s53.setText(null);
		this.add(s53);
		s53.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s54.setText(null);
		this.add(s54);
		s54.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s55.setText(null);
		this.add(s55);
		s55.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s56.setText(null);
		this.add(s56);
		s56.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s57.setText(null);
		this.add(s57);
		s57.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第六行
		a = 1;

		s61.setText(null);
		this.add(s61);
		s61.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s62.setText(null);
		this.add(s62);
		s62.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s63.setText(null);
		this.add(s63);
		s63.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s64.setText(null);
		this.add(s64);
		s64.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s65.setText(null);
		this.add(s65);
		s65.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s66.setText(null);
		this.add(s66);
		s66.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;

		s67.setText(null);
		this.add(s67);
		s67.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
	}

	//只创建表头
	public tablePanel(int w){
		setLayout(null);
		setBackground(Color.white);

		//添加周数下拉列表
		for(int a=1;a<=w;a++)week.addItem("第"+a+"周");
		week.setBackground(new Color(68,114,196));
		week.setForeground(Color.white);
		week.setBorder(null);
		this.add(week);
		week.setBounds(0, 0, lwidth, lheight);

		//添加表头
		labelOfTable mon = new labelOfTable("MON");
		this.add(mon);
		mon.setBounds(lwidth+2,0,lwidth, lheight);

		labelOfTable tue = new labelOfTable("TUE");
		this.add(tue);
		tue.setBounds(space_x*2, 0, lwidth, lheight);

		labelOfTable wed = new labelOfTable("WED");
		this.add(wed);
		wed.setBounds(space_x*3, 0, lwidth, lheight);

		labelOfTable thu = new labelOfTable("THU");
		this.add(thu);
		thu.setBounds(space_x*4, 0, lwidth, lheight);

		labelOfTable fri = new labelOfTable("FRI");
		this.add(fri);
		fri.setBounds(space_x*5, 0, lwidth, lheight);

		labelOfTable sat = new labelOfTable("SAT");
		this.add(sat);
		sat.setBounds(space_x*6, 0, lwidth, lheight);

		labelOfTable sun = new labelOfTable("SUN");
		this.add(sun);
		sun.setBounds(space_x*7, 0, lwidth, lheight);

		//添加时间段
		textOfTable t1 = new textOfTable(color1,"8:20","1~2");
		this.add(t1);
		t1.setBounds(0, lheight+4, lwidth, lheight);

		textOfTable t2 = new textOfTable(color2,"10:20","3~4");
		this.add(t2);
		t2.setBounds(0, lheight+4+space_y, lwidth, lheight);

		textOfTable t3 = new textOfTable(color1,"14:00","5~6");
		this.add(t3);
		t3.setBounds(0, lheight+4+space_y*2, lwidth, lheight);

		textOfTable t4 = new textOfTable(color2,"16:00","7~8");
		this.add(t4);
		t4.setBounds(0, lheight+4+space_y*3, lwidth, lheight);

		textOfTable t5 = new textOfTable(color1,"18:40","9~10");
		this.add(t5);
		t5.setBounds(0, lheight+4+space_y*4, lwidth, lheight);

		textOfTable t6 = new textOfTable(color2,"20:30","11~12");
		this.add(t6);
		t6.setBounds(0, lheight+4+space_y*5, lwidth, lheight);
	}

	//只有表体
	public tablePanel(String name){
		setLayout(null);
		setBackground(Color.white);
		setName(name);

		//行数位置常量
		int b = 0;//y轴位置

		//列数位置常量
		int a = 0;//x轴位置

		s11.setText(null);
		s11.setEditable(false);
		this.add(s11);
		s11.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s12.setText(null);
		s12.setEditable(false);
		this.add(s12);
		s12.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s13.setText(null);
		s13.setEditable(false);
		this.add(s13);
		s13.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s14.setText(null);
		s14.setEditable(false);
		this.add(s14);
		s14.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s15.setText(null);
		s15.setEditable(false);
		this.add(s15);
		s15.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s16.setText(null);
		s16.setEditable(false);
		this.add(s16);
		s16.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s17.setText(null);
		s17.setEditable(false);
		this.add(s17);
		s17.setBounds(space_x*a, space_y*b, lwidth, lheight);
		b++;

		//第二行
		a = 0;

		s21.setText(null);
		s21.setEditable(false);
		this.add(s21);
		s21.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s22.setText(null);
		s22.setEditable(false);
		this.add(s22);
		s22.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s23.setText(null);
		s23.setEditable(false);
		this.add(s23);
		s23.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s24.setText(null);
		s24.setEditable(false);
		this.add(s24);
		s24.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s25.setText(null);
		s25.setEditable(false);
		this.add(s25);
		s25.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s26.setText(null);
		s26.setEditable(false);
		this.add(s26);
		s26.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s27.setText(null);
		s27.setEditable(false);
		this.add(s27);
		s27.setBounds(space_x*a, space_y*b, lwidth, lheight);
		b++;

		//第三行
		a = 0;

		s31.setText(null);
		s31.setEditable(false);
		this.add(s31);
		s31.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s32.setText(null);
		s32.setEditable(false);
		this.add(s32);
		s32.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s33.setText(null);
		s33.setEditable(false);
		this.add(s33);
		s33.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s34.setText(null);
		s34.setEditable(false);
		this.add(s34);
		s34.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s35.setText(null);
		s35.setEditable(false);
		this.add(s35);
		s35.setBounds(space_x*a,space_y*b, lwidth, lheight);
		a++;

		s36.setText(null);
		s36.setEditable(false);
		this.add(s36);
		s36.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s37.setText(null);
		s37.setEditable(false);
		this.add(s37);
		s37.setBounds(space_x*a, space_y*b, lwidth, lheight);
		b++;

		//第四行
		a = 0;

		s41.setText(null);
		s41.setEditable(false);
		this.add(s41);
		s41.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s42.setText(null);
		s42.setEditable(false);
		this.add(s42);
		s42.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s43.setText(null);
		s43.setEditable(false);
		this.add(s43);
		s43.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s44.setText(null);
		s44.setEditable(false);
		this.add(s44);
		s44.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s45.setText(null);
		s45.setEditable(false);
		this.add(s45);
		s45.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s46.setText(null);
		s46.setEditable(false);
		this.add(s46);
		s46.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s47.setText(null);
		s47.setEditable(false);
		this.add(s47);
		s47.setBounds(space_x*a, space_y*b, lwidth, lheight);
		b++;

		//第五行
		a = 0;

		s51.setText(null);
		s51.setEditable(false);
		this.add(s51);
		s51.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s52.setText(null);
		s52.setEditable(false);
		this.add(s52);
		s52.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s53.setText(null);
		s53.setEditable(false);
		this.add(s53);
		s53.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s54.setText(null);
		s54.setEditable(false);
		this.add(s54);
		s54.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s55.setText(null);
		s55.setEditable(false);
		this.add(s55);
		s55.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s56.setText(null);
		s56.setEditable(false);
		this.add(s56);
		s56.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s57.setText(null);
		s57.setEditable(false);
		this.add(s57);
		s57.setBounds(space_x*a, space_y*b, lwidth, lheight);
		b++;

		//第六行
		a = 0;

		s61.setText(null);
		s61.setEditable(false);
		this.add(s61);
		s61.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s62.setText(null);
		s62.setEditable(false);
		this.add(s62);
		s62.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s63.setText(null);
		s63.setEditable(false);
		this.add(s63);
		s63.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s64.setText(null);
		s64.setEditable(false);
		this.add(s64);
		s64.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s65.setText(null);
		s65.setEditable(false);
		this.add(s65);
		s65.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s66.setText(null);
		s66.setEditable(false);
		this.add(s66);
		s66.setBounds(space_x*a, space_y*b, lwidth, lheight);
		a++;

		s67.setText(null);
		s67.setEditable(false);
		this.add(s67);
		s67.setBounds(space_x*a, space_y*b, lwidth, lheight);
	}

	//社团查空课程表体
	public tablePanel(String unionname,int w ){
		setLayout(null);
		setBackground(Color.white);

		//第一行
		int l11 = 0;int l12 = 0;int l13 = 0;int l14 = 0;int l15 = 0;int l16 = 0;int l17 = 0;
		//第二行
		int l21 = 0;int l22 = 0;int l23 = 0;int l24 = 0;int l25 = 0;int l26 = 0;int l27 = 0;
		//第三行
		int l31 = 0;int l32 = 0;int l33 = 0;int l34 = 0;int l35 = 0;int l36 = 0;int l37 = 0;
		//第四行
		int l41 = 0;int l42 = 0;int l43 = 0;int l44 = 0;int l45 = 0;int l46 = 0;int l47 = 0;
		//第五行
		int l51 = 0;int l52 = 0;int l53 = 0;int l54 = 0;int l55 = 0;int l56 = 0;int l57 = 0;
		//第六行
		int l61 = 0;int l62 = 0;int l63 = 0;int l64 = 0;int l65 = 0;int l66 = 0;int l67 = 0;

		int num = 0;//计算社团人数
		for(Union.member m : Frame.studentManage.Get_union_stu(unionname)) {
			for(Course c : Frame.studentManage.Get_course(m.getStu_num())) {
				if(c.week == w){
					if(c.day == 0){
						if(c.time == 0){l11++;}
						if(c.time == 1){l21++;}
						if(c.time == 2){l31++;}
						if(c.time == 3){l41++;}
						if(c.time == 4){l51++;}
						if(c.time == 5){l61++;}
					}
					if(c.day == 1){
						if(c.time == 0){l12++;}
						if(c.time == 1){l22++;}
						if(c.time == 2){l32++;}
						if(c.time == 3){l42++;}
						if(c.time == 4){l52++;}
						if(c.time == 5){l62++;}}
					if(c.day == 2){
						if(c.time == 0){l13++;}
						if(c.time == 1){l23++;}
						if(c.time == 2){l33++;}
						if(c.time == 3){l43++;}
						if(c.time == 4){l53++;}
						if(c.time == 5){l63++;}
					}
					if(c.day == 3){
						if(c.time == 0){l14++;}
						if(c.time == 1){l24++;}
						if(c.time == 2){l34++;}
						if(c.time == 3){l44++;}
						if(c.time == 4){l54++;}
						if(c.time == 5){l64++;}
					}
					if(c.day == 4){
						if(c.time == 0){l15++;}
						if(c.time == 1){l25++;}
						if(c.time == 2){l35++;}
						if(c.time == 3){l45++;}
						if(c.time == 4){l55++;}
						if(c.time == 5){l65++;}
					}
					if(c.day == 5){
						if(c.time == 0){l16++;}
						if(c.time == 1){l26++;}
						if(c.time == 2){l36++;}
						if(c.time == 3){l46++;}
						if(c.time == 4){l56++;}
						if(c.time == 5){l66++;}}
					if(c.day == 6){
						if(c.time == 0){l17++;}
						if(c.time == 1){l27++;}
						if(c.time == 2){l37++;}
						if(c.time == 3){l47++;}
						if(c.time == 4){l57++;}
						if(c.time == 5){l67++;}
					}
				}
			}num++;
		}

		//行数位置常量
		int b = 0;//y轴位置

		//列数位置常量
		int a = 0;//x轴位置

		s11.setText(null);
		s11.setEditable(false);
		checkCrowded(s11,l11,num);
		this.add(s11);
		s11.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s12.setText(null);
		s12.setEditable(false);
		checkCrowded(s12,l12,num);
		this.add(s12);
		s12.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s13.setText(null);
		s13.setEditable(false);
		checkCrowded(s13,l13,num);
		this.add(s13);
		s13.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s14.setText(null);
		s14.setEditable(false);
		checkCrowded(s14,l14,num);
		this.add(s14);
		s14.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s15.setText(null);
		s15.setEditable(false);
		checkCrowded(s15,l15,num);
		this.add(s15);
		s15.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s16.setText(null);
		s16.setEditable(false);
		checkCrowded(s16,l16,num);
		this.add(s16);
		s16.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s17.setText(null);
		s17.setEditable(false);
		checkCrowded(s17,l17,num);
		this.add(s17);
		s17.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第二行
		a = 0;

		s21.setText(null);
		s21.setEditable(false);
		checkCrowded(s21,l21,num);
		this.add(s21);
		s21.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s22.setText(null);
		s22.setEditable(false);
		checkCrowded(s22,l22,num);
		this.add(s22);
		s22.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s23.setText(null);
		s23.setEditable(false);
		checkCrowded(s23,l23,num);
		this.add(s23);
		s23.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s24.setText(null);
		s24.setEditable(false);
		checkCrowded(s24,l24,num);
		this.add(s24);
		s24.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s25.setText(null);
		s25.setEditable(false);
		checkCrowded(s25,l25,num);
		this.add(s25);
		s25.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s26.setText(null);
		s26.setEditable(false);
		checkCrowded(s26,l26,num);
		this.add(s26);
		s26.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s27.setText(null);
		s27.setEditable(false);
		checkCrowded(s27,l27,num);
		this.add(s27);
		s27.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第三行
		a = 0;

		s31.setText(null);
		s31.setEditable(false);
		checkCrowded(s31,l31,num);
		this.add(s31);
		s31.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s32.setText(null);
		s32.setEditable(false);
		checkCrowded(s32,l32,num);
		this.add(s32);
		s32.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s33.setText(null);
		s33.setEditable(false);
		checkCrowded(s33,l33,num);
		this.add(s33);
		s33.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s34.setText(null);
		s34.setEditable(false);
		checkCrowded(s34,l34,num);
		this.add(s34);
		s34.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s35.setText(null);
		s35.setEditable(false);
		checkCrowded(s35,l35,num);
		this.add(s35);
		s35.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s36.setText(null);
		s36.setEditable(false);
		checkCrowded(s36,l36,num);
		this.add(s36);
		s36.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s37.setText(null);
		s37.setEditable(false);
		checkCrowded(s37,l37,num);
		this.add(s37);
		s37.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第四行
		a = 0;

		s41.setText(null);
		s41.setEditable(false);
		checkCrowded(s41,l41,num);
		this.add(s41);
		s41.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s42.setText(null);
		s42.setEditable(false);
		checkCrowded(s42,l42,num);
		this.add(s42);
		s42.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s43.setText(null);
		s43.setEditable(false);
		checkCrowded(s43,l43,num);
		this.add(s43);
		s43.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s44.setText(null);
		s44.setEditable(false);
		checkCrowded(s44,l44,num);
		this.add(s44);
		s44.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s45.setText(null);
		s45.setEditable(false);
		checkCrowded(s45,l45,num);
		this.add(s45);
		s45.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s46.setText(null);
		s46.setEditable(false);
		checkCrowded(s46,l46,num);
		this.add(s46);
		s46.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s47.setText(null);
		s47.setEditable(false);
		checkCrowded(s47,l47,num);
		this.add(s47);
		s47.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第五行
		a = 0;

		s51.setText(null);
		s51.setEditable(false);
		checkCrowded(s51,l51,num);
		this.add(s51);
		s51.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s52.setText(null);
		s52.setEditable(false);
		checkCrowded(s52,l52,num);
		this.add(s52);
		s52.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s53.setText(null);
		s53.setEditable(false);
		checkCrowded(s53,l53,num);
		this.add(s53);
		s53.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s54.setText(null);
		s54.setEditable(false);
		checkCrowded(s54,l54,num);
		this.add(s54);
		s54.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s55.setText(null);
		s55.setEditable(false);
		checkCrowded(s55,l55,num);
		this.add(s55);
		s55.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s56.setText(null);
		s56.setEditable(false);
		checkCrowded(s56,l56,num);
		this.add(s56);
		s56.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s57.setText(null);
		s57.setEditable(false);
		checkCrowded(s57,l57,num);
		this.add(s57);
		s57.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第六行
		a = 0;

		s61.setText(null);
		s61.setEditable(false);
		checkCrowded(s61,l61,num);
		this.add(s61);
		s61.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s62.setText(null);
		s62.setEditable(false);
		checkCrowded(s62,l62,num);
		this.add(s62);
		s62.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s63.setText(null);
		s63.setEditable(false);
		checkCrowded(s63,l63,num);
		this.add(s63);
		s63.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s64.setText(null);
		s64.setEditable(false);
		checkCrowded(s64,l64,num);
		this.add(s64);
		s64.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s65.setText(null);
		s65.setEditable(false);
		checkCrowded(s65,l65,num);
		this.add(s65);
		s65.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s66.setText(null);
		s66.setEditable(false);
		checkCrowded(s66,l66,num);
		this.add(s66);
		s66.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s67.setText(null);
		s67.setEditable(false);
		checkCrowded(s67,l67,num);
		this.add(s67);
		s67.setBounds(space_x * a, space_y * b, lwidth, lheight);
	}

	//社团学号查空表体
	public tablePanel(Bag bag,int a1,int stu){
		setLayout(null);
		setBackground(Color.white);

		int free[][][] = Frame.studentManage.Get_free(bag);

		//第一行
		int l11 = free[a1][0][0];int l12 = free[a1][1][0];int l13 = free[a1][2][0];int l14 = free[a1][3][0];int l15 = free[a1][4][0];int l16 = free[a1][5][0];int l17 = free[a1][6][0];
		//第二行
		int l21 = free[a1][0][1];int l22 = free[a1][1][1];int l23 = free[a1][2][1];int l24 = free[a1][3][1];int l25 = free[a1][4][1];int l26 = free[a1][5][1];int l27 = free[a1][6][1];
		//第三行
		int l31 = free[a1][0][2];int l32 = free[a1][1][2];int l33 = free[a1][2][2];int l34 = free[a1][3][2];int l35 = free[a1][4][2];int l36 = free[a1][5][2];int l37 = free[a1][6][2];
		//第四行
		int l41 = free[a1][0][3];int l42 = free[a1][1][3];int l43 = free[a1][2][3];int l44 = free[a1][3][3];int l45 = free[a1][4][3];int l46 = free[a1][5][3];int l47 = free[a1][6][3];
		//第五行
		int l51 = free[a1][0][4];int l52 = free[a1][1][4];int l53 = free[a1][2][4];int l54 = free[a1][3][4];int l55 = free[a1][4][4];int l56 = free[a1][5][4];int l57 = free[a1][6][4];
		//第六行
		int l61 = free[a1][0][5];int l62 = free[a1][1][5];int l63 = free[a1][2][5];int l64 = free[a1][3][5];int l65 = free[a1][4][5];int l66 = free[a1][5][5];int l67 = free[a1][6][5];

		//行数位置常量
		int b = 0;//y轴位置

		//列数位置常量
		int a = 0;//x轴位置

		s11.setText(null);
		s11.setEditable(false);
		checkCrowded(s11,l11,stu);
		this.add(s11);
		s11.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s12.setText(null);
		s12.setEditable(false);
		checkCrowded(s12,l12,stu);
		this.add(s12);
		s12.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s13.setText(null);
		s13.setEditable(false);
		checkCrowded(s13,l13,stu);
		this.add(s13);
		s13.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s14.setText(null);
		s14.setEditable(false);
		checkCrowded(s14,l14,stu);
		this.add(s14);
		s14.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s15.setText(null);
		s15.setEditable(false);
		checkCrowded(s15,l15,stu);
		this.add(s15);
		s15.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s16.setText(null);
		s16.setEditable(false);
		checkCrowded(s16,l16,stu);
		this.add(s16);
		s16.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s17.setText(null);
		s17.setEditable(false);
		checkCrowded(s17,l17,stu);
		this.add(s17);
		s17.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第二行
		a = 0;

		s21.setText(null);
		s21.setEditable(false);
		checkCrowded(s21,l21,stu);
		this.add(s21);
		s21.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s22.setText(null);
		s22.setEditable(false);
		checkCrowded(s22,l22,stu);
		this.add(s22);
		s22.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s23.setText(null);
		s23.setEditable(false);
		checkCrowded(s23,l23,stu);
		this.add(s23);
		s23.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s24.setText(null);
		s24.setEditable(false);
		checkCrowded(s24,l24,stu);
		this.add(s24);
		s24.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s25.setText(null);
		s25.setEditable(false);
		checkCrowded(s25,l25,stu);
		this.add(s25);
		s25.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s26.setText(null);
		s26.setEditable(false);
		checkCrowded(s26,l26,stu);
		this.add(s26);
		s26.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s27.setText(null);
		s27.setEditable(false);
		checkCrowded(s27,l27,stu);
		this.add(s27);
		s27.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第三行
		a = 0;

		s31.setText(null);
		s31.setEditable(false);
		checkCrowded(s31,l31,stu);
		this.add(s31);
		s31.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s32.setText(null);
		s32.setEditable(false);
		checkCrowded(s32,l32,stu);
		this.add(s32);
		s32.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s33.setText(null);
		s33.setEditable(false);
		checkCrowded(s33,l33,stu);
		this.add(s33);
		s33.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s34.setText(null);
		s34.setEditable(false);
		checkCrowded(s34,l34,stu);
		this.add(s34);
		s34.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s35.setText(null);
		s35.setEditable(false);
		checkCrowded(s35,l35,stu);
		this.add(s35);
		s35.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s36.setText(null);
		s36.setEditable(false);
		checkCrowded(s36,l36,stu);
		this.add(s36);
		s36.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s37.setText(null);
		s37.setEditable(false);
		checkCrowded(s37,l37,stu);
		this.add(s37);
		s37.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第四行
		a = 0;

		s41.setText(null);
		s41.setEditable(false);
		checkCrowded(s41,l41,stu);
		this.add(s41);
		s41.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s42.setText(null);
		s42.setEditable(false);
		checkCrowded(s42,l42,stu);
		this.add(s42);
		s42.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s43.setText(null);
		s43.setEditable(false);
		checkCrowded(s43,l43,stu);
		this.add(s43);
		s43.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s44.setText(null);
		s44.setEditable(false);
		checkCrowded(s44,l44,stu);
		this.add(s44);
		s44.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s45.setText(null);
		s45.setEditable(false);
		checkCrowded(s45,l45,stu);
		this.add(s45);
		s45.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s46.setText(null);
		s46.setEditable(false);
		checkCrowded(s46,l46,stu);
		this.add(s46);
		s46.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s47.setText(null);
		s47.setEditable(false);
		checkCrowded(s47,l47,stu);
		this.add(s47);
		s47.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第五行
		a = 0;

		s51.setText(null);
		s51.setEditable(false);
		checkCrowded(s51,l51,stu);
		this.add(s51);
		s51.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s52.setText(null);
		s52.setEditable(false);
		checkCrowded(s52,l52,stu);
		this.add(s52);
		s52.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s53.setText(null);
		s53.setEditable(false);
		checkCrowded(s53,l53,stu);
		this.add(s53);
		s53.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s54.setText(null);
		s54.setEditable(false);
		checkCrowded(s54,l54,stu);
		this.add(s54);
		s54.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s55.setText(null);
		s55.setEditable(false);
		checkCrowded(s55,l55,stu);
		this.add(s55);
		s55.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s56.setText(null);
		s56.setEditable(false);
		checkCrowded(s56,l56,stu);
		this.add(s56);
		s56.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s57.setText(null);
		s57.setEditable(false);
		checkCrowded(s57,l57,stu);
		this.add(s57);
		s57.setBounds(space_x * a, space_y * b, lwidth, lheight);
		b++;

		//第六行
		a = 0;

		s61.setText(null);
		s61.setEditable(false);
		checkCrowded(s61,l61,stu);
		this.add(s61);
		s61.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s62.setText(null);
		s62.setEditable(false);
		checkCrowded(s62,l62,stu);
		this.add(s62);
		s62.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s63.setText(null);
		s63.setEditable(false);
		checkCrowded(s63,l63,stu);
		this.add(s63);
		s63.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s64.setText(null);
		s64.setEditable(false);
		checkCrowded(s64,l64,stu);
		this.add(s64);
		s64.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s65.setText(null);
		s65.setEditable(false);
		checkCrowded(s65,l65,stu);
		this.add(s65);
		s65.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s66.setText(null);
		s66.setEditable(false);
		checkCrowded(s66,l66,stu);
		this.add(s66);
		s66.setBounds(space_x * a, space_y * b, lwidth, lheight);
		a++;

		s67.setText(null);
		s67.setEditable(false);
		checkCrowded(s67,l67,stu);
		this.add(s67);
		s67.setBounds(space_x * a, space_y * b, lwidth, lheight);
	}

	//判断颜色
	private void checkCrowded(textOfTable s,int l,int total){
		if(total != 1) {
			//数据预处理
//			if((total)

			//判断
			if (l >= total / 2.0) {
				s.setBackground(Color.red);
				s.setToolTipText(l + "人有课"+"\n"+"总人数为:"+total);
			}
			if (l >= total / 3.0 && l < total / 2.0) {
				s.setBackground(Color.orange);
				s.setToolTipText(l + "人有课"+"\n"+"总人数为:"+total);
			}
			if (l >= total / 6.0 && l < total / 3.0) {
				s.setBackground(Color.yellow);
				s.setToolTipText(l + "人有课"+"\n"+"总人数为:"+total);
			}
			if (l < total / 6.0 && l != 0) {
				s.setBackground(Color.green);
				s.setToolTipText(l + "人有课"+"\n"+"总人数为:"+total);
			}
			if (l == 0) {
				s.setToolTipText("无缺席"+"\n"+"总人数为:"+total);
			}
		}else{
			if(l ==total){
				s.setBackground(Color.red);s.setToolTipText(l+"人有课"+"\n"+"总人数为:"+total);
			}else s.setToolTipText("无缺席"+"\n"+"总人数为:"+total);
		}
	}
//	public static void main(String[] args){
//		Bag<Integer> bag1 = new Bag<Integer>();
//		bag1.add(12491747);
//		tablePanel panel = new tablePanel(bag1,1,100);
//		int a[][][] = Frame.studentManage.Get_free(bag1);
//		System.out.println(a[1][1][1]);
//	}
}
