// Mike Vealey
// CSIT211
// Spring 2017

import java.util.Scanner;

public class Quiz {
	private String[][] question = new String[25][2];
	private int questionCount = 0;
		
	public void add(String newQuestion) {
		question[questionCount][0] = newQuestion;
		questionCount++;
		if (questionCount > 25) {
			System.out.print("Question Array full.");
		}
	}
		
	public void giveQuiz() {
		Scanner answer = new Scanner(System.in);
		
		for(int row = 0; row < questionCount; row++) {
			System.out.println(question[row][0]);

			question[row][1] = answer.nextLine();
		}
		answer.close();
	}
	
	public void printResults() {
		for(int row = 0;row < questionCount; row++ ) {
			System.out.println("Q: " + question[row][0]);
			System.out.println("A: " + question[row][1] + "\n");
		}
	}
			
}

