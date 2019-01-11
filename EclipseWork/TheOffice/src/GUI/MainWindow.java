package GUI;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainWindow extends Canvas {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -187387564349014222L;
	
	private static MainWindow mw = null;
	public static MainWindow getInstance() {
		if (mw == null) {
			mw = new MainWindow();
		} // endae IF
		return mw; 
	} // endae getInstance
	
	
	private JFrame frame;
	private JButton jb1, jb2;
	private JLabel jlbl1;
	private JPanel jpnl;
	
	private MainWindow() {
		mainRun();
	}
	private int x = 823, y = 454;
	private void mainRun() {
		frame = new JFrame();
		frame.setTitle("Penis");
		frame.setSize(new Dimension(x, y));
		frame.setPreferredSize(new Dimension(x,y));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);
		frameContents();
		frame.setVisible(true);
	} // endae mainRun
	
	private void frameContents() {
		jb1 = new JButton("SHIT");
		jb1.addActionListener(new AndyReidButtCrackListener());
		jb1.setBackground(Color.RED);
		jb1.setForeground(Color.WHITE);
		jb2 = new JButton("SHIT2.0");
		jb2.addActionListener(new LittleMichaelButtCrackListener());
		jb2.setBackground(Color.GREEN);
		jb2.setForeground(Color.YELLOW);
		jpnl = new JPanel();
		String mj = "/Users/venividivicihofneondeion010101/Desktop/MJDesktop.gif";
		jlbl1 = new JLabel(new ImageIcon(mj, "MJ LOVES TO EAT"));
		Border bord = BorderFactory.createLineBorder(Color.CYAN, 4, true);
		jpnl.setBorder(bord);
		jpnl.add(jlbl1);
		
		
		frame.add(jb1, BorderLayout.NORTH);
		frame.add(jpnl, BorderLayout.CENTER);
		frame.add(jb2, BorderLayout.SOUTH);
		
		
	}

	private class AndyReidButtCrackListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = jb1.getActionCommand();
			if (input.equalsIgnoreCase("SHIT")) {
				JOptionPane.showMessageDialog(frame, "YOU LITTLE SHIT! FUCK YOU!! I'M THE ONLY ANDY REID THAT SHITS!", "Andy Reid's Rant", JOptionPane.ERROR_MESSAGE);
			} // endae IF
			 
			
			
			
		}
		
	}
	
	private class LittleMichaelButtCrackListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = jb2.getActionCommand();
			if (input.equalsIgnoreCase("SHIT2.0")) {
				String mj = "/Users/venividivicihofneondeion010101/Documents/GitHub/JavaScript/JS Crash Course Programs/MJ.gif";
				JOptionPane.showMessageDialog(frame, "LITTLE MICHAEL HERE... HOW'S YOU COCK???", "Michael's Postulation", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(mj));
				
			}
			
		}
		
	}
	

}
