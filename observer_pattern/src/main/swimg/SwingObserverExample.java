package main.swimg;



import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
//    JFrame jFrame;
//
//    public static void main(String[] args) {
//        SwingObserverExample swingObserverExample = new SwingObserverExample();
//        swingObserverExample.go();
//    }
//
//    private void go() {
//        jFrame = new JFrame();
//
//        JButton jButton = new JButton("Should I do it?");
//        jButton.addActionListener(new AngelListener());
//        jButton.addActionListener(new DevilListener());
//        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
//    }
//
//    private class AngelListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("Don't do it, you might regret it!");
//        }
//    }
//
//    private class DevilListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("Come on, do it!");
//        }
//    }

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        // Without lambdas
        //button.addActionListener(new AngelListener());
        //button.addActionListener(new DevilListener());

        // With lambdas
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event ->
                System.out.println("Come on, do it!")
        );
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 *
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}
