import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ProjectDemo {
	
	Image img = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectDemo window = new ProjectDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProjectDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uB098\uB9CC\uC758 \uD5EC\uC2A4 \uD2B8\uB808\uC774\uB108");
		label.setBounds(163, 54, 126, 15);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("\uC624\uB298\uC758 \uB8E8\uD2F4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"<�����>\n"
						+ "��ġ������ 40Ű�� 10ȸ 5��\n"
						+ "���� ��ġ������ ���� �� 10Ű�� 10ȸ 5��\n"
						+ "�����ö��� 5Ű�� 20ȸ 3��\n"
						+ "���̺�ũ�ν� ���� 5Ű�� 25ȸ 2��\n"
						+ "���̺� Ʈ���̼��� �ͽ��ټ� 15Ű�� 10ȸ 5��");
			}
		});
		btnNewButton.setBounds(174, 121, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC624\uB298\uC758 \uC2DD\uB2E8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"<���̾�Ʈ �Ĵ�>\n"
						+ "��ħ:�ٳ��� �Ѱ�,�Ƹ�� ���� 200ml\n"
						+ "����:������\n"
						+ "����:�߰����� 2��(������),���� ���1��,���� ä�ҹ���");
			}
		});
		btnNewButton_1.setBounds(174, 165, 103, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB3D9\uAE30\uBD80\uC5EC ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					img=ImageIO.read(new File("C:\\Users\\JUNG\\Desktop\\�ڹ� ������Ʈ\\����ο�1.jpg"));
				} catch(IOException ex) {
					JOptionPane.showMessageDialog(null,"�̹����� �����ϴ�.");
				}
			}	
		});
		btnNewButton_2.setBounds(174, 209, 103, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
