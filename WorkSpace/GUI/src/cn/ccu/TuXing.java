package cn.ccu;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
/**
 * 
 * @author dell
 *
 */
public class TuXing  extends JFrame implements ItemListener {
	static Label la = new Label("用户名");
	static TextField fi = new TextField(50);
	public TuXing() {
	setVisible(true);
	setBounds(0,0,500,500);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		TuXing tx = new TuXing();
		tx.add(fi);
		tx.add(la);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	}

