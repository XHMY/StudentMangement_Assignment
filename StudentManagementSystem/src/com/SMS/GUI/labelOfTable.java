package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

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
