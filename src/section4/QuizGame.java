package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog("What year is it?");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("2019")) {
			score += 1;
		}
		// 4. if the user's answer was correct, add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String answer2 = JOptionPane.showInputDialog("Is it going to snow soon in Escondido?");
		// 6. After all the questions have been asked, print the user's score
		if (answer2.equalsIgnoreCase("no")) {
			score += 1;
		}
		String answer3 = JOptionPane.showInputDialog("What is my dog's name?");
		if (answer3.equalsIgnoreCase("ally")) {
			score += 1;
			String answer4 = JOptionPane.showInputDialog("How old am I?");
			if (answer4.equalsIgnoreCase("17")) {
				score += 1;
				JOptionPane.showMessageDialog(null,"You scored"+ score);
			}
		}
	}
}
