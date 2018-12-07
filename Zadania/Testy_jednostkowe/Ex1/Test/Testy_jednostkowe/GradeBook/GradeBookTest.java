package Testy_jednostkowe.GradeBook;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GradeBookTest {

    private GradeBook gradeBook;
    private Subject subject;

    @Before
    public void setUp(){
        gradeBook = new GradeBook();
        subject = new Subject();
    }

    @Test
    public void shouldAllowToCreateNewGradebook(){
        gradeBook.newGradeBook();

        Map<String, Integer[]> expected = new HashMap<>();
        assertEquals(expected, gradeBook.getGradeBook());
    }

    @Test
    public void shouldAllowToCreateNewSubject(){
        subject.addSubject("Matma");

        String expected = "Matma";
        assertEquals(expected, subject.getSubject());
    }

    @Test
    public void shouldAllowToAddSubjectToGradeBook(){
        subject.addSubject("Matma");
        gradeBook.addSubjectToGradeBook(subject.getSubject());

        Map<String, Integer[]> expected = new HashMap<>();
        Integer[] grades = new Integer[10];
        expected.put("Matma", grades);

        assertEquals(expected, gradeBook.getGradeBook());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddSubjectWithZeroLetters(){
        subject.addSubject("");
    }

}