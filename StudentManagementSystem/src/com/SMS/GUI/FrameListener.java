package com.SMS.GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameListener extends MouseAdapter{
    private Point lastPoint = null;
	private BackgroundFrame window = null;
	
	public FrameListener(BackgroundFrame window) {
		this.window = window;
	}
	
	public void mousePressed(MouseEvent e) {
		lastPoint = e.getLocationOnScreen();
		System.out.println(lastPoint);
	}
	
	public void mouseDragged(MouseEvent e) {
		System.out.println(e);
		Point point = e.getLocationOnScreen();
		int offsetX = point.x - lastPoint.x;
		int offsetY = point.y - lastPoint.y;

		Rectangle bounds = window.getBounds();
		bounds.x += offsetX;
		bounds.y += offsetY;
		window.setBounds(bounds);
		lastPoint = point;
	}
}