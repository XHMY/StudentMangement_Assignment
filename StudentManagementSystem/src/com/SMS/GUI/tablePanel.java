package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class tablePanel extends JPanel{
	static int lwidth = 62;
	static int lheight = 46;
	static int space_x = lwidth+2;
	static int space_y = lheight+2;
	
	static Color color1 = new Color(207,213,234);
	static Color color2 = new Color(233,235,245);
	
	public tablePanel() {
		setLayout(null);
		setBackground(Color.white);
		
		//添加周数下拉列表
		JComboBox<String> week = new JComboBox<>();
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
		
		textOfTable s11 = new textOfTable(color1);
		s11.setText(null);
		this.add(s11);
		s11.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s12 = new textOfTable(color1);
		s12.setText(null);
		this.add(s12);
		s12.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s13 = new textOfTable(color1);
		s13.setText(null);
		this.add(s13);
		s13.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s14 = new textOfTable(color1);
		s14.setText(null);
		this.add(s14);
		s14.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s15 = new textOfTable(color1);
		s15.setText(null);
		this.add(s15);
		s15.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s16 = new textOfTable(color1);
		s16.setText(null);
		this.add(s16);
		s16.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s17 = new textOfTable(color1);
		s17.setText(null);
		this.add(s17);
		s17.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;

			//第二行
		a = 1;
		
		textOfTable s21 = new textOfTable(color2);
		s21.setText(null);
		this.add(s21);
		s21.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s22 = new textOfTable(color2);
		s22.setText(null);
		this.add(s22);
		s22.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s23 = new textOfTable(color2);
		s23.setText(null);
		this.add(s23);
		s23.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s24 = new textOfTable(color2);
		s24.setText(null);
		this.add(s24);
		s24.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s25 = new textOfTable(color2);
		s25.setText(null);
		this.add(s25);
		s25.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s26 = new textOfTable(color2);
		s26.setText(null);
		this.add(s26);
		s26.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s27 = new textOfTable(color2);
		s27.setText(null);
		this.add(s27);
		s27.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第三行
		a = 1;
		
		textOfTable s31 = new textOfTable(color1);
		s31.setText(null);
		this.add(s31);
		s31.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s32 = new textOfTable(color1);
		s32.setText(null);
		this.add(s32);
		s32.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s33 = new textOfTable(color1);
		s33.setText(null);
		this.add(s33);
		s33.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s34 = new textOfTable(color1);
		s34.setText(null);
		this.add(s34);
		s34.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s35 = new textOfTable(color1);
		s35.setText(null);
		this.add(s35);
		s35.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s36 = new textOfTable(color1);
		s36.setText(null);
		this.add(s36);
		s36.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s37 = new textOfTable(color1);
		s37.setText(null);
		this.add(s37);
		s37.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第四行
		a = 1;
		
		textOfTable s41 = new textOfTable(color2);
		s41.setText(null);
		this.add(s41);
		s41.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s42 = new textOfTable(color2);
		s42.setText(null);
		this.add(s42);
		s42.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s43 = new textOfTable(color2);
		s43.setText(null);
		this.add(s43);
		s43.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s44 = new textOfTable(color2);
		s44.setText(null);
		this.add(s44);
		s44.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s45 = new textOfTable(color2);
		s45.setText(null);
		this.add(s45);
		s45.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s46 = new textOfTable(color2);
		s46.setText(null);
		this.add(s46);
		s46.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s47 = new textOfTable(color2);
		s47.setText(null);
		this.add(s47);
		s47.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第五行
		a = 1;
		
		textOfTable s51 = new textOfTable(color1);
		s51.setText(null);
		this.add(s51);
		s51.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s52 = new textOfTable(color1);
		s52.setText(null);
		this.add(s52);
		s52.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s53 = new textOfTable(color1);
		s53.setText(null);
		this.add(s53);
		s53.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s54 = new textOfTable(color1);
		s54.setText(null);
		this.add(s54);
		s54.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s55 = new textOfTable(color1);
		s55.setText(null);
		this.add(s55);
		s55.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s56 = new textOfTable(color1);
		s56.setText(null);
		this.add(s56);
		s56.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s57 = new textOfTable(color1);
		s57.setText(null);
		this.add(s57);
		s57.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第六行
		a = 1;
		
		textOfTable s61 = new textOfTable(color2);
		s61.setText(null);
		this.add(s61);
		s61.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s62 = new textOfTable(color2);
		s62.setText(null);
		this.add(s62);
		s62.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s63 = new textOfTable(color2);
		s63.setText(null);
		this.add(s63);
		s63.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s64 = new textOfTable(color2);
		s64.setText(null);
		this.add(s64);
		s64.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s65 = new textOfTable(color2);
		s65.setText(null);
		this.add(s65);
		s65.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s66 = new textOfTable(color2);
		s66.setText(null);
		this.add(s66);
		s66.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s67 = new textOfTable(color2);
		s67.setText(null);
		this.add(s67);
		s67.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
	}
	
	public tablePanel(int n){
		setLayout(null);
		setBackground(Color.white);
		
		//添加周数下拉列表
		JComboBox<String> week = new JComboBox<>();
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
		
		//添加事件段
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
		
		//行数位置变量
		int b = 0;//y位置
		
			//列数位置变量
		int a = 1;//x位置
		
		textOfTable s11 = new textOfTable(color1,0);
		s11.setText(null);
		this.add(s11);
		s11.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s12 = new textOfTable(color1,0);
		s12.setText(null);
		this.add(s12);
		s12.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s13 = new textOfTable(color1,0);
		s13.setText(null);
		this.add(s13);
		s13.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s14 = new textOfTable(color1,0);
		s14.setText(null);
		this.add(s14);
		s14.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s15 = new textOfTable(color1,0);
		s15.setText(null);
		this.add(s15);
		s15.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s16 = new textOfTable(color1,0);
		s16.setText(null);
		this.add(s16);
		s16.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s17 = new textOfTable(color1,0);
		s17.setText(null);
		this.add(s17);
		s17.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;

			//第二行
		a = 1;
		
		textOfTable s21 = new textOfTable(color2,0);
		s21.setText(null);
		this.add(s21);
		s21.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s22 = new textOfTable(color2,0);
		s22.setText(null);
		this.add(s22);
		s22.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s23 = new textOfTable(color2,0);
		s23.setText(null);
		this.add(s23);
		s23.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s24 = new textOfTable(color2,0);
		s24.setText(null);
		this.add(s24);
		s24.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s25 = new textOfTable(color2,0);
		s25.setText(null);
		this.add(s25);
		s25.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s26 = new textOfTable(color2,0);
		s26.setText(null);
		this.add(s26);
		s26.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s27 = new textOfTable(color2,0);
		s27.setText(null);
		this.add(s27);
		s27.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第三行
		a = 1;
		
		textOfTable s31 = new textOfTable(color1,0);
		s31.setText(null);
		this.add(s31);
		s31.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s32 = new textOfTable(color1,0);
		s32.setText(null);
		this.add(s32);
		s32.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s33 = new textOfTable(color1,0);
		s33.setText(null);
		this.add(s33);
		s33.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s34 = new textOfTable(color1,0);
		s34.setText(null);
		this.add(s34);
		s34.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s35 = new textOfTable(color1,0);
		s35.setText(null);
		this.add(s35);
		s35.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s36 = new textOfTable(color1,0);
		s36.setText(null);
		this.add(s36);
		s36.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s37 = new textOfTable(color1,0);
		s37.setText(null);
		this.add(s37);
		s37.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第四行
		a = 1;
		
		textOfTable s41 = new textOfTable(color2,0);
		s41.setText(null);
		this.add(s41);
		s41.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s42 = new textOfTable(color2,0);
		s42.setText(null);
		this.add(s42);
		s42.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s43 = new textOfTable(color2,0);
		s43.setText(null);
		this.add(s43);
		s43.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s44 = new textOfTable(color2,0);
		s44.setText(null);
		this.add(s44);
		s44.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s45 = new textOfTable(color2,0);
		s45.setText(null);
		this.add(s45);
		s45.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s46 = new textOfTable(color2,0);
		s46.setText(null);
		this.add(s46);
		s46.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s47 = new textOfTable(color2,0);
		s47.setText(null);
		this.add(s47);
		s47.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第五行
		a = 1;
		
		textOfTable s51 = new textOfTable(color1,0);
		s51.setText(null);
		this.add(s51);
		s51.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s52 = new textOfTable(color1,0);
		s52.setText(null);
		this.add(s52);
		s52.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s53 = new textOfTable(color1,0);
		s53.setText(null);
		this.add(s53);
		s53.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s54 = new textOfTable(color1,0);
		s54.setText(null);
		this.add(s54);
		s54.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s55 = new textOfTable(color1,0);
		s55.setText(null);
		this.add(s55);
		s55.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s56 = new textOfTable(color1,0);
		s56.setText(null);
		this.add(s56);
		s56.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s57 = new textOfTable(color1,0);
		s57.setText(null);
		this.add(s57);
		s57.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		b++;
		
			//第六行
		a = 1;
		
		textOfTable s61 = new textOfTable(color2,0);
		s61.setText(null);
		this.add(s61);
		s61.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s62 = new textOfTable(color2,0);
		s62.setText(null);
		this.add(s62);
		s62.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s63 = new textOfTable(color2,0);
		s63.setText(null);
		this.add(s63);
		s63.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s64 = new textOfTable(color2,0);
		s64.setText(null);
		this.add(s64);
		s64.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s65 = new textOfTable(color2,0);
		s65.setText(null);
		this.add(s65);
		s65.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s66 = new textOfTable(color2,0);
		s66.setText(null);
		this.add(s66);
		s66.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
		a++;
		
		textOfTable s67 = new textOfTable(color2,0);
		s67.setText(null);
		this.add(s67);
		s67.setBounds(space_x*a, lheight+4+space_y*b, lwidth, lheight);
	}
}
