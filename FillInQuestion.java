package lab5;
/**
 * This Class stores the information on the objects of Fill In Questions
 * @author Matthew Tsui
 *
 */
public class FillInQuestion extends Question{
	
	/**
	 * FillInQuestion Constructor
	 */
	public FillInQuestion(String sentence,Diffenum diff) {
		super(parseQ(sentence),parseA(sentence),diff);
	}
	
	/**
	 * This Method will retrieve the correct question by removing the answer
	 * @param sentence the full sentence with the answer word
	 * @return the question without the answer
	 */
	private static String parseQ(String sentence) {
		if(sentence == null) {
			throw new NullPointerException("Sentence can not be null");
		}
		if(sentence.indexOf('_')<0 ||(sentence.charAt(sentence.indexOf('_')+1)!='-' && sentence.charAt(sentence.lastIndexOf('_')-1)!='-')) {
			throw new IllegalArgumentException("Question must contain ____");
		}
		
		return(sentence.substring(0,sentence.indexOf('_'))+"___________" +sentence.substring(sentence.lastIndexOf('_')+1));
	}
	
	/**
	 * This method will retrieve the answer from the sentence
	 * @param sentence the full sentence with the question and answer
	 * @return the answer to the fill in question
	 */
	private static String parseA(String sentence) {
		String answer=sentence.substring(sentence.indexOf('-')+1,sentence.lastIndexOf('-'));
		answer.trim();
		if(answer.length()<0) {
			throw new IllegalArgumentException("Answer can not be empty");
		}
		return answer;
		
	}
	
	/**
	 * This method will copy the FillInQuestion
	 * @param none
	 * @return a copy of the FillInQuestion
	 */
	@Override
	public Question copy() {
		String Question =this.getQuestion().substring(0,this.getQuestion().indexOf('_')+1) + "-" + this.getAnswer() + "-" +this.getQuestion().substring(this.getQuestion().lastIndexOf('_'));
		return new FillInQuestion(Question,this.getLevel());
	}
	

}
