package com.SMS.GUI;

import javax.swing.*;
import java.awt.*;

public class labelOfTable extends JLabel{
	
	public  labelOfTable(String name) {
		setText(name);
		setBackground(new Color(68,114,196));
		setFont(new Font("Frame.type",0,18));
		setForeground(Color.white);
		setHorizontalAlignment(CENTER);
		setOpaque(true);
	}

}
