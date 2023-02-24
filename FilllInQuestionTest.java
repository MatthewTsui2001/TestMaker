package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FillInQuestionTest {

	@Test
	void testParseQ() {
		FillInQuestion A = new FillInQuestion("The Bird is _-Blue-_",Question.Diffenum.Easy);
		assertEquals("The Bird is ___________",A.getQuestion());
		try {
			FillInQuestion B = new FillInQuestion("THE BIRD IS BLUE",Question.Diffenum.Easy);
		}
		catch(IllegalArgumentException e) {}
		try {
			FillInQuestion C = new FillInQuestion("",Question.Diffenum.Easy);
		}
		catch(IllegalArgumentException e) {}
		try {
			FillInQuestion D = new FillInQuestion(null,Question.Diffenum.Easy);
		}
		catch(NullPointerException e) {}
	}
	
	@Test
	void testParseA() {
		Question C = new FillInQuestion("The Dog is _-Red-_.",Question.Diffenum.Easy);
		assertEquals("Red",C.getAnswer());
		try {
			FillInQuestion A = new FillInQuestion("David is _--_ years old",Question.Diffenum.Easy);
		}
		catch(IllegalArgumentException e) {}
		try {
			FillInQuestion D = new FillInQuestion("David is _-   -_",Question.Diffenum.Easy);
			
		}
		catch(IllegalArgumentException e) {}
	}
	
	@Test 
	void testCopy() {
		FillInQuestion A = new FillInQuestion("The Dog is _-Brown-_",Question.Diffenum.Easy);
		Question B = A.copy();
		assertTrue(B.getQuestion().equals(A.getQuestion()));
		assertTrue(B.getAnswer().equals(A.getAnswer()));
		assertEquals(Question.Diffenum.Easy,B.getLevel());
	}

}
