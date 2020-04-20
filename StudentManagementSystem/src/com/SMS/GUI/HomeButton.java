package com.SMS.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class HomeButton extends JLabel{
    public HomeButton(String name,Color color,ImageIcon icon1,ImageIcon icon2) {
		super(name);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				setIcon(icon1);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				setIcon(icon2);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBorder(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Border b1 = BorderFactory.createLineBorder(color, 2, false);
				Border b2 = BorderFactory.createLineBorder(Color.white, 1, false);
				setBorder(BorderFactory.createCompoundBorder(b1, b2));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(getText() == "学生资料")	{
					Frame.homeFrame.main.removeAll();
					Frame.homeFrame.main.updateUI();
					try {
						Frame.StuDataPanel();
					} catch (IOException ioException) {
						ioException.printStackTrace();
					}
				}
				if(getText() == "学生日程")	{
					Frame.homeFrame.main.removeAll();
					Frame.homeFrame.main.updateUI();
					Frame.StuSchedule();
				}
				if(getText() == "导入") {
					Frame.homeFrame.main.removeAll();
					Frame.homeFrame.main.updateUI();
					Frame.Input();
				}
				if(getText() == "导出") {
					Frame.homeFrame.main.removeAll();
					Frame.homeFrame.main.updateUI();
					Frame.Output();
				}
				if(getText() == "社团管理") {
					Frame.homeFrame.main.removeAll();
					Frame.homeFrame.main.updateUI();
					Frame.start.UnionManage();
				}
			}
		});
		
		
		setIcon(icon1);
		

	}
}