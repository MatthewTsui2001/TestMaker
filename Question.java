package lab5;

/**
 * This Class will store objects of question
 * @author Matthew Tsui
 *
 */
public class Question {
	public enum Diffenum{
		Easy,
		Medium,
		Hard
	}
	private Diffenum level;
	private String question,answer;
	
	/**
	 * Construct a Question object
	 */
	public Question(String question,String answer,Diffenum level) {
		//if any of the parameters are null
				if(question==null || answer==null || level == null) {
					throw new NullPointerException("Strings can not be Null");
				}
				//if any of the parameters are empty
				if(question.length()==0 || answer.length()==0) {
					throw new IllegalArgumentException("Strings can not be empty");
				}
				this.question=question;
				this.answer=answer;
				this.level=level;
	}
	/**
	 * Construct a Question object
	 */
	public Question(String question,String answer) {
		//calling first constructor
		this(question,answer,Diffenum.Easy);
	}
	
	//Question Methods
	
	/**
	 * This Method will change/set the question
	 * @param question a String containing the question
	 * @return none
	 */
	public void setQuestion(String question) {
		//if question is null
		if(question==null) {
			throw new NullPointerException("Question can not be null");
		}
		//if question is empty
		if(question.length()==0) {
			throw new IllegalArgumentException("Question can not be empty");
		}
		this.question=question;
	}
	
	/**
	 * This method will return the question
	 * @param none
	 * @return question a String containing the question
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * This method will check if the user answer was correct
	 * @param studentAnswer a String containing the user answer
	 * @return true or false on whether the user answer was correct
	 */
	public boolean checkAnswer(String studentAnswer) {
		if(this.answer.equalsIgnoreCase(studentAnswer))
			return true;
		return false;
	}
	/**
	 * This method will take the question and difficulty and return it to be displayed
	 * @param none
	 * @return question a String containing the question and difficulty
	 */
	public String displayQuestion() {
		String question="Questions: " + this.question;
		question+="\nDifficulty: " + level;
		return question;
	}
	//Answer Methods
	
	/**
	 * This method will change/set the answer 
	 * @param answer a String containing the answer to the question
	 * @return none
	 */
	public void setAnswer(String answer) {
		//if answer is null
		if(answer==null) {
			throw new NullPointerException("Answer can not be Null");
		}
		//if answer is empty
		if(answer.length()==0) {
			throw new IllegalArgumentException("Answer can not be empty");
		}
		this.answer=answer;
	}
	
	/**
	 * This method will return the answer
	 * @param none
	 * @return answer a String containing the answer
	 */
	public String getAnswer() {
		return answer;
	}
	
	//Difficulty Methods
	
	/**
	 * This method changes/sets the difficulty level of the question
	 * @param level a enum for how difficult the question is
	 * @return none
	 */
	public void setLevel(Diffenum level) {
		//if level is null
		if(level==null) {
			throw new NullPointerException("Level can not be null");
		}
		this.level=level;
	}
	
	/**
	 * This method will return the difficulty level of the question
	 * @param none
	 * @return level the difficulty of the question
	 */
	public Diffenum getLevel() {
		return this.level;
	}
	
	/**
	 * This method will return a copy of the question
	 * @param none
	 * @return copy a Question object which is a copy of the Question Q
	 */
	public Question copy() {
		return(new Question(this.getQuestion(),this.getAnswer(),this.getLevel()));
	}
	
	/**
	 * This method will display all of the information of the Question object
	 * @param none
	 * @return none
	 */
	public String toString() {
		String result="Question: \t" + question;
		result+="\nAnswer: \t " + answer;
		result+="\nDifficulty: \t" + level;
		return result + "\n";
	}
	
}
