package w3d3.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class QuizTest {
   private Quiz quizUnderTest = new Quiz();

    @org.junit.Test
    public void getNumCorrect() {

        assertEquals(0, quizUnderTest.getNumCorrect());
    }

    @org.junit.Test
    public void increaseScore() {
    }

    @org.junit.Test
    public void getQuizIndex() {
        assertEquals(0, quizUnderTest.getQuizIndex());
    }

    @org.junit.Test
    public void increaseQuizIndex() {
        quizUnderTest.increaseQuizIndex();
        assertEquals(1, quizUnderTest.getQuizIndex());
    }

    @org.junit.Test
    public void getCurrentQuestion() {

        assertEquals("[2, 3, 5, 7, 11, ? ]", quizUnderTest.getCurrentQuestion());
    }

    @org.junit.Test
    public void getCurrentAnswr() {
        assertEquals(13, quizUnderTest.getCurrentAnswr());
    }
}
