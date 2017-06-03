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
				JOptionPane.showMessageDialog(null,"<가슴운동>\n"
						+ "벤치프레스 40키로 10회 5셋\n"
						+ "덤벨 벤치프레스 양쪽 각 10키로 10회 5셋\n"
						+ "덤벨플라이 5키로 20회 3셋\n"
						+ "케이블크로스 오버 5키로 25회 2셋\n"
						+ "케이블 트라이셉스 익스텐션 15키로 10회 5셋");
			}
		});
		btnNewButton.setBounds(174, 121, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC624\uB298\uC758 \uC2DD\uB2E8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"<다이어트 식단>\n"
						+ "아침:바나나 한개,아몬드 우유 200ml\n"
						+ "점심:자유식\n"
						+ "저녁:닭가슴살 2쪽(저염식),고구마 찐것1개,각종 채소반찬");
			}
		});
		btnNewButton_1.setBounds(174, 165, 103, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB3D9\uAE30\uBD80\uC5EC ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					img=ImageIO.read(new File("C:\\Users\\JUNG\\Desktop\\자바 프로젝트\\동기부여1.jpg"));
				} catch(IOException ex) {
					JOptionPane.showMessageDialog(null,"이미지가 없습니다.");
				}
			}	
		});
		btnNewButton_2.setBounds(174, 209, 103, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
