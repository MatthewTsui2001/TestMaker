package lab5;
import java.util.*;
/**
 * This program is used to test the QuizMaker and Question classes
 * @author Matthew Tsui
 *
 */
public class QuizManager {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuizMaker Test = new QuizMaker("Quiz1");
		
		//Creating the Questions that will be in the question pool for the quiz maker
		Test.add(new Question("What does CPU stand for?","Central Processing Unit",Question.Diffenum.Medium));
		Test.add(new Question("What does RAM stand for?","Random Access Memory",Question.Diffenum.Medium));
		Test.add(new Question("What is the capital of Canada?","Ottawa",Question.Diffenum.Medium));
		Test.add(new Question("At what temperature does water freeze in celcius?","0",Question.Diffenum.Easy));
		Test.add(new Question("What is 2 to the power of 5?","32",Question.Diffenum.Easy));
		Test.add(new Question("If you were born six years ago how old would you be?","6",Question.Diffenum.Easy));
		Test.add(new Question("What is the power house of the cell?","Mitochondria",Question.Diffenum.Easy));
		Test.add(new Question("What is the biggest oragn in the human body?","Skin",Question.Diffenum.Hard));
		Test.add(new Question("What is the scienctific name of the biggest muscle in the human body?","Gluteus Maximus",Question.Diffenum.Hard));
		Test.add(new Question("What is the term for a group of crows?","Murder",Question.Diffenum.Hard));
		//fill in questions
		Test.add(new FillInQuestion("If Jake's mom had four kids North, East, South. The last kids name is_-Jake-_.",Question.Diffenum.Easy));
		Test.add(new FillInQuestion("The dog is _-brown-_",Question.Diffenum.Easy));
		//numeric questions
		Test.add(new NumericQuestion("What is 1/3",0.3333333333,0.01,Question.Diffenum.Easy));
		Test.add(new NumericQuestion("What is PI",3.14,0.01,Question.Diffenum.Easy));
		
		//creating the test with all questions
		ArrayList<Question>Quiz = Test.createQuiz();
		//giveQuiz(Quiz,input);
		ArrayList<Question>Quiz2 = Test.createQuiz(Question.Diffenum.Easy);
		giveQuiz(Quiz2,input);
	}
	
	/**
	 * This method takes the quiz ArrayList of question and asks the user for the answer and gives them a score based on their correct answers
	 * @param quiz an ArrayList of questions, answers, and difficulty level
	 * @param input a Scanner to accept the user inputs
	 * @return none
	 */
	public static void giveQuiz(ArrayList<Question>quiz,Scanner input) {
		int score=0;
		for(int i=0;i<quiz.size();i++) {
			//asks the user a question
			System.out.println(quiz.get(i).displayQuestion());
			String answer = input.nextLine();
			if(quiz.get(i).checkAnswer(answer)) {
				score++;
			}
		}
		System.out.println("Score: " + score + "/" + quiz.size());
	}

}
