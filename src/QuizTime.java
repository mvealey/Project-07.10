// Mike Vealey
// CSIT211
// Spring 2017

public class QuizTime {

	public static void main(String[] args) {
		Quiz quiz = new Quiz();
		
		// create the quiz
		quiz.add("What is the capital of Maryland?");
		quiz.add("What is the state bird of Maryland?");
		quiz.add("What is the size of Maryland?");
		quiz.add("What is the tallest point in Maryland?");
		quiz.add("What is the biggest city in Maryland?");
		
		// give the quiz
		quiz.giveQuiz();
		
		//display the results
		quiz.printResults();
	}
	
}
