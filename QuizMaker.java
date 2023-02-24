package lab5;
import java.util.*;
/**
 * This class makes a quiz from the question objects
 * @author Matthew Tsui
 *
 */
public class QuizMaker {
	private ArrayList<Question>quizPool;
	private String name;
	
	/**
	 * Construct a QuizMaker object
	 */
	public QuizMaker(String name) {
		if(name==null) {
			throw new NullPointerException("Name can not be null");
		}
		if(name.length()==0) {
			throw new IllegalArgumentException("Name can not be empty");
		}
		this.name=name;
		this.quizPool=new ArrayList<Question>();
	}
	
	/**
	 * This method will add a Question Q to the pool of questions
	 * @param Q a Question object that will be added to the quiz pool
	 * return none
	 */
	public void add(Question Q) {
		if(Q==null) {
			throw new NullPointerException("Question can not be null");
		}
		quizPool.add(Q.copy());
	}
	
	/**
	 * This method will return name
	 * @return name a String containing the name of the quiz
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method will set/change the name of the quiz
	 * @param name a String containing the name of the new quiz
	 * @return none
	 */
	public void setName(String name) {
		if(name==null) {
			throw new NullPointerException("Name can not be null");
		}
		if(name.length()==0) {
			throw new IllegalArgumentException("Name can not be empty");
		}
		this.name=name;
	}
	
	/**
	 * This method will create an arraylist and store all the questions that are in the question pool for a quiz
	 * @param none
	 * @return quiz an arraylist of Question objects
	 */
	public ArrayList<Question> createQuiz(){
		ArrayList<Question>quiz=new ArrayList<>();
		for(int i=0;i<quizPool.size();i++) {
			quiz.add(quizPool.get(i).copy());
		}
		return quiz;
	}
	
	/**
	 * This method will take all the questions of a certain difficulty level and store all the questions for a quiz
	 * @param level a enum for the difficulty of the question
	 * @return quiz an arraylist storing the questions
	 */
	public ArrayList<Question> createQuiz(Question.Diffenum level){
		ArrayList<Question>quiz = new ArrayList<>();
		for(int i=0;i<quizPool.size();i++) {
			if(quizPool.get(i).getLevel()==level) {
				quiz.add(quizPool.get(i).copy());
			}
		}
		return quiz;
	}
}
