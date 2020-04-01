import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Frame {
	public static void Login() {
		BackgroundFrame login = new BackgroundFrame(530,250,500,320,new Color(45,85,151));
		
		//添加文本
		JLabel label1 = new JLabel("账号");//label1.setOpaque(true);
		JLabel label2 = new JLabel("密码");//label2.setOpaque(true);
		
		login.main.add(label1);
		login.main.add(label2);
		
		label1.setBounds(160, 70,50,30);
		label2.setBounds(160, 140, 50, 30);
		
			//设置字体
		label1.setFont(new Font("微软雅黑",0,24));
		label1.setForeground(new Color(193,207,225));
		label2.setFont(new Font("微软雅黑",0,24));
		label2.setForeground(new Color(193,207,225));
		
		//添加账号框和密码框
		JTextField account = new JTextField();
		JPasswordField password = new JPasswordField();
		
		login.main.add(account);
		login.main.add(password);
		
		account.setBounds(215, 70, 150, 30);
		password.setBounds(215,140,150,30);
		
			//取消边框
		account.setBorder(null);
		password.setBorder(null);
		
			//设置背景颜色
		account.setBackground(new Color(133,152,185));
		password.setBackground(new Color(133,152,185));
		
			//设置输入框样式
		account.setForeground(Color.white);
		account.setFont(new Font("微软雅黑",0,14));
		password.setForeground(Color.white);
		password.setFont(new Font("微软雅黑",0,14));
		
		//添加登录按钮
		ImageIcon icon1 = new ImageIcon("lgButton3.png");
		JLabel button = new JLabel();
		button.setIcon(icon1);
		login.main.add(button);
		button.setBounds(220, 210, 100, 41);
		
			//输入错误提示
		JLabel tips = new JLabel("账号和密码不可为空");
		login.main.add(tips);
		tips.setForeground(Color.red);
		tips.setFont(new Font("微软雅黑",0,14));
		
			//给登录按钮添加鼠标监听器
		button.addMouseListener(new MouseListener() {

			
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
				// TODO Auto-generated method stub			
				if(account.getText().length() == 0 || password.getPassword().length == 0) {	
					tips.setBounds(215,40,150,30);
				}
				else {
					boolean a = Login(account,password.toString());
						if(a) Home();
				}
			}
		});
	
			//给账号框和密码框添加键盘监听器
		account.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(account.getText().length() == 0 || password.getPassword().length == 0) {
						tips.setBounds(215,40,150,30);
					}
					else{
						boolean a = Login(account,password.toString());
						if(a) Home();
					}					
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		password.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(account.getText().length() == 0 || password.getPassword().length == 0) {
						tips.setBounds(215,40,150,30);
					}
					else{
						boolean a = Login(account,password.toString());
						if(a) Home();
					}					
				}				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
	}

	public void static Home() {} 
	
	public static void main(String[] args) {
		
		Login();
		
	}

}
