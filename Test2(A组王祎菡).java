package Test22;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test2 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JButton btn_ok = null;
	private JTextField jf1 = null;
	public Test2() {
		initUI();
	}

	private void initUI(){
		this.setTitle("������С��");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		btn_ok =new JButton("ok");
		btn_ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame t1 =new JFrame("���t�ղ���");
				JTextArea text=new JTextArea("��ش���������⣺����������������˼����ʲô��");
				text.setSize(400, 300);
				text.setLineWrap(true);
				t1.add(text);
				t1.setSize(400, 300);
				t1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				t1.setLayout(null);
				t1.setVisible(true);
				
			}
		});
		jf1 = new JTextField();
		this.getContentPane().add(btn_ok);
		this.getContentPane().add(jf1);
		jf1.setPreferredSize(new Dimension(200,30));
	}

	/**
	 * @param test
	 */
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.setVisible(true);
	}
}
