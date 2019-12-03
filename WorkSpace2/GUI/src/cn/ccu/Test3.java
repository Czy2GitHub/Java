package cn.ccu;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Test3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("�û���¼");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ�������
        JPanel panel01 = new JPanel();
        panel01.add(new JLabel("�û���"));
        panel01.add(new JTextField(10));

        // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ�������
        JPanel panel02 = new JPanel();
        panel02.add(new JLabel("��   ��"));
        panel02.add(new JPasswordField(10));

        // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ
        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel03.add(new JButton("��¼"));
        panel03.add(new JButton("ע��"));

        // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ�����
        Box vBox = Box.createVerticalBox();
        vBox.add(panel01);
        vBox.add(panel02);
        vBox.add(panel03);

        jf.setContentPane(vBox);

        jf.pack();										//ʹ���ڴ�С��Ӧ�齨
        jf.setLocationRelativeTo(null);	     			 //ʹ������ϵͳĬ��λ�ó���
        jf.setVisible(true);
	}
}
