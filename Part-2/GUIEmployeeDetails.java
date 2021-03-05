import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.Dimension;
class guinew{
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		GridLayout g=new GridLayout(5,2);
		f.setLayout(g);
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		JPanel p8=new JPanel();
		JPanel p9=new JPanel();
		JPanel p10=new JPanel();
		
		JLabel l1=new JLabel("NAME");
		JLabel l2=new JLabel("ID");
		JLabel l3=new JLabel("DOB");
		JLabel l4=new JLabel("DOJ");
		
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		
		t1.setPreferredSize(new Dimension(200,30));
		t2.setPreferredSize(new Dimension(200,30));
		t3.setPreferredSize(new Dimension(200,30));
		t4.setPreferredSize(new Dimension(200,30));
		
		JButton b1=new JButton("submit");
		JButton b2=new JButton("reset");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File fileobj=new File("E:\\5th sem\\ppts\\java\\file.txt");
				try {
					FileWriter fw=new FileWriter(fileobj.getAbsoluteFile(),true);
					System.out.println("name :" +t1.getText());
					fw.write("name :" +t1.getText());
					System.out.println("id:" +t2.getText());
					fw.write("id :" +t2.getText());
					System.out.println("dob :" +t3.getText());
					fw.write("dob :" +t3.getText());
					System.out.println("doj :" +t4.getText());
					fw.write("doj :" +t4.getText());
					
				}
				catch(IOException io) {
			}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					t1.setText(" ");
					t2.setText(null);
					t3.setText(null);
					t4.setText(null);
					
		}
			
		});
		p1.add(l1); 
		p3.add(l2);
		p5.add(l3);
		p7.add(l4);
		p2.add(t1); 
		p4.add(t2);
		p6.add(t3);
		p8.add(t4);
		p9.add(b1); 
		p10.add(b2);
	
		f.add(p1); 
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		f.add(p6);
		f.add(p7);
		f.add(p8);
		f.add(p9);
		f.add(p10);
		f.setVisible(true);
		
		
		
		
		
	}
}