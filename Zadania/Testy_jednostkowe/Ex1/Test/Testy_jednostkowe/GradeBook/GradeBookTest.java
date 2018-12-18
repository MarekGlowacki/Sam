package Testy_jednostkowe.GradeBook;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GradeBookTest {

    private final String math = "matematyka";
    private final String inf = "informatics";

    private GradeBook gradeBook;

    @Before
    public void setUp(){
        gradeBook = new GradeBook();
        gradeBook.addSubjectToGradeBook(math);
    }

    @Test
    public void shouldAllowToCreateGradeBook(){
        GradeBook gradeBook = new GradeBook();
        assertNotNull(gradeBook);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddSubjectIsAlreadyExist(){
        gradeBook.addSubjectToGradeBook(math);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddSubjectWithZeroLetters(){
        gradeBook.addSubjectToGradeBook("");
    }

    @Test
    public void shouldAllowToGetSubjectFromGradebook(){

        Subject subject = new Subject(inf);

        assertEquals(inf, subject.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowTocomputeWhenNoGrades(){
        gradeBook.subjectsGradesAvarage();
    }

    @Test
    public void shouldAllowToComputeAvaragesWholeGradebook(){
        gradeBook.addSubjectToGradeBook(inf);

        gradeBook.addNote(inf,5d);
        gradeBook.addNote(inf,10d);
        gradeBook.addNote(inf,15d);

        gradeBook.addNote(math,8d);
        gradeBook.addNote(math,80d);
        gradeBook.addNote(math,20d);

        double expected = 23d;

        assertEquals(expected, gradeBook.subjectsGradesAvarage(), 0.001);
    }



}