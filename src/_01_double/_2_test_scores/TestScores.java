package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	double point = 0;
	String question1 = JOptionPane.showInputDialog("What is the name of the protagonist in Hollow Knight?");
	if(question1.equals("Ghost")) {
		point = point + 12.50;
	}
	String question2 = JOptionPane.showInputDialog("What is the name of the former king of Hollownest?");
	if(question2.equals("The Pale King")) {
		point = point + 12.50;
	}
	String question3 = JOptionPane.showInputDialog("What is the name of the final boss Hollow Knight?");
	if(question3.equals("Absolute Radiance")) {
		point = point + 12.50;
	}
	String question4 = JOptionPane.showInputDialog("What is the name of the creature inside the mask of the protagonist?");
	if(question4.equals("A Shade")) {
		point = point + 12.50;
	}
	String question5 = JOptionPane.showInputDialog("What is the name of the charm needed to get the true ending?");
	if(question5.equals("Void Heart")) {
		point = point + 12.50;
	}
	String question6 = JOptionPane.showInputDialog("What is the name of the Dreamer in Fog Canyon?");
	if(question6.equals("Monomon")) {
		point = point + 12.50;
	}
	String question7 = JOptionPane.showInputDialog("What is the name of the Dreamer in the City of Tears?");
	if(question7.equals("Lurien")) {
		point = point + 12.50;
	}
	String question8 = JOptionPane.showInputDialog("What is the name of the Dreamer in Deepnest?");
	if(question8.equals("Herrah")) {
		point = point + 12.50;
	}
	
	if (point >= 100) {
		JOptionPane.showMessageDialog(null, point + "% WOW! You realy know your stuff!");
	} else if (point >= 90) {
		JOptionPane.showMessageDialog(null, point + "% You did very well!");
	} else if (point >= 80) {
		JOptionPane.showMessageDialog(null, point + "% Good job!");
	} else if (point >= 70) {
		JOptionPane.showMessageDialog(null, point + "% Oh, so close to a B!");
	} else if (point >= 60) {
		JOptionPane.showMessageDialog(null, point + "% I know you can do it next time.");
	} else if (point >= 50) {
		JOptionPane.showMessageDialog(null, point + "% That's ok I guess.");
	} else if (point >= 40) {
		JOptionPane.showMessageDialog(null, point + "% Not good.");
	} else if (point >= 30) {
		JOptionPane.showMessageDialog(null, point + "% Study more next time.");
	} else if (point >= 20) {
		JOptionPane.showMessageDialog(null, point + "% That's not great.");
	} else if (point >= 10) {
		JOptionPane.showMessageDialog(null, point +  "% You didn't do well.");
	} else {
		JOptionPane.showMessageDialog(null, point + "% No. Just no.");
	}
		
	
}
}

