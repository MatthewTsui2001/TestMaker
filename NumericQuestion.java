/**
 * 
 */
package lab5;

/**
 * This Class will store the objects for Numeric Questions 
 * @author Matthew Tsui
 *
 */
public class NumericQuestion extends Question{
	private double tolerance;
	
	/**
	 * NumericQuestion Constructor
	 */
	public NumericQuestion(String Question,double answer,double tolerance,Diffenum level) {
		super(Question,String.valueOf(answer),level);
		this.tolerance=tolerance;
	}
	
	/**
	 * This method returns the tolerance of the question
	 * @param none
	 * @return tolerance a double holding the tolerance for the answer
	 */
	public double getTolerance() {
		return tolerance;
	}
	
	/**
	 * This Method overrides the checkAnswer from Question and checks if the answer is within the tolerance
	 * @param Answer a String holding the answer from the user
	 * @return True of false whether the answer was within the tolerance
	 */
	@Override
	public boolean checkAnswer(String Answer) {
		if(Math.abs(Double.valueOf(this.getAnswer())-Double.valueOf(Answer))<tolerance){
			return true;
		}
		return false;
	}
	
	/**
	 * This method Overrides the copy method from the Question class and creates a copy of the NumericQuestion returning a question
	 * @param none
	 * @return a copy of the NumericQuestion
	 */
	@Override
	public Question copy() {
		return (new NumericQuestion(this.getQuestion(),Double.valueOf(this.getAnswer()),this.tolerance,this.getLevel()));
	}

}
