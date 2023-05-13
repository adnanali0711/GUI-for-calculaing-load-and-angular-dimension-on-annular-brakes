import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class brakes1 {

	private JFrame frame;
	private JTextField Mt;
	private JTextField Ri;
	private JTextField n;
	private JTextField Pavg;
	private JTextField Ro;
	private JTextField u;
	private JTextField P;
	private JTextField tht;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					brakes1 window = new brakes1();
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
	public brakes1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculate Load and Angular Dimension of Annular Brakes ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(59, 10, 578, 41);
		frame.getContentPane().add(lblNewLabel);
		
		Mt = new JTextField();
		Mt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Mt.setBounds(186, 61, 96, 19);
		frame.getContentPane().add(Mt);
		Mt.setColumns(10);
		
		Ri = new JTextField();
		Ri.setBounds(186, 101, 96, 19);
		frame.getContentPane().add(Ri);
		Ri.setColumns(10);
		
		n = new JTextField();
		n.setBounds(514, 101, 96, 19);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		Pavg = new JTextField();
		Pavg.setBounds(514, 61, 96, 19);
		frame.getContentPane().add(Pavg);
		Pavg.setColumns(10);
		
		Ro = new JTextField();
		Ro.setBounds(186, 139, 96, 19);
		frame.getContentPane().add(Ro);
		Ro.setColumns(10);
		
		u = new JTextField();
		u.setBounds(514, 139, 96, 19);
		frame.getContentPane().add(u);
		u.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Torque Capacity(MPa)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(24, 64, 152, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inner Radius(mm)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(24, 104, 152, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Outer Radius(mm)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(24, 141, 145, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Average Pressure On Pad(MPa)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(304, 63, 224, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Number Of Pads");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(304, 103, 145, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Coefficient Of Friction");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(304, 141, 157, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton cal = new JButton("Calculate Load");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,d,f,g,h,i;
				h=Double.parseDouble(n.getText());
				a=Double.parseDouble(Mt.getText());
				b=Double.parseDouble(Ri.getText());
				c=Double.parseDouble(Ro.getText());
				d=Double.parseDouble(u.getText());
				f=(2*(c*c*c-b*b*b))/(3*(c*c-b*b));
				a=(a*1000)/h;
				g=a/(d*f);
				i=Math.round(g*100)/100.0;
				P.setText(Double.toString(i));
				
			}
		});
		cal.setBounds(94, 208, 157, 31);
		frame.getContentPane().add(cal);
		
		P = new JTextField();
		P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		P.setBounds(176, 279, 96, 19);
		frame.getContentPane().add(P);
		P.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Load");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(113, 280, 63, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Angular Dimension");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(372, 281, 132, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		tht = new JTextField();
		tht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tht.setBounds(514, 279, 96, 19);
		frame.getContentPane().add(tht);
		tht.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate Angle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,d,f,g,h,i,j,k,l,m;
				h=Double.parseDouble(n.getText());
				a=Double.parseDouble(Mt.getText());
				b=Double.parseDouble(Ri.getText());
				c=Double.parseDouble(Ro.getText());
				d=Double.parseDouble(u.getText());
				k=Double.parseDouble(Pavg.getText());
				f=(2*(c*c*c-b*b*b))/(3*(c*c-b*b));
				a=(a*1000)/h;
				g=a/(d*f);
				j=g/h;
				l=(2*j)/(c*c-b*b);
				l=(l*180)/3.14;
				
				m=Math.round(l*100)/100.0;
				tht.setText(Double.toString(m));
			}
		});
		btnNewButton.setBounds(403, 205, 157, 37);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("N");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(282, 281, 45, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("°");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(620, 281, 45, 13);
		frame.getContentPane().add(lblNewLabel_10);
	}
}