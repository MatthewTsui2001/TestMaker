package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumericQuestionTest {

	@Test
	void testGetTolerance() {
		NumericQuestion A = new NumericQuestion("What is Pi",3.14,0.001,Question.Diffenum.Easy);
		assertEquals(0.001,A.getTolerance());
	}
	
	@Test
	void testCheckAnswer() {
		NumericQuestion A = new NumericQuestion("What is Pi",3.14,0.01,Question.Diffenum.Easy);
		assertTrue(A.checkAnswer("3.141"));//Due to floating point inaccuracy it will not be very accurate so border points will not work
		
	}

	@Test
	void testCopy() {
		NumericQuestion A = new NumericQuestion("What is Pi",3.14,0.01,Question.Diffenum.Easy);
		Question B = A.copy();
		assertTrue(B.getQuestion().equals(A.getQuestion()));
		assertTrue(B.getAnswer().equals(A.getAnswer()));
		assertEquals(Question.Diffenum.Easy,B.getLevel());
	}

}
