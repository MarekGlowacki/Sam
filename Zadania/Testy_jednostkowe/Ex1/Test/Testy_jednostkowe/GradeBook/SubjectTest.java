package Testy_jednostkowe.GradeBook;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SubjectTest {

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddNoteZero(){
         Subject subject = new Subject("");
         subject.addNote(0d);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddNoteMinusOne(){
        Subject subject = new Subject("");
        subject.addNote(-1d);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToAddNoteMinusMany(){
        Subject subject = new Subject("");
        subject.addNote(-23d);
    }

    @Test
    public void shouldAllowToAddNoteToGradebook(){
        Subject subject = new Subject("");
        subject.addNote(5d);

        List<Double> expected = new LinkedList<>();
        expected.add(5d);

        assertEquals(expected, subject.getNote());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotAllowToComputeAvarageSubjectWhenNoGrades(){
        Subject subject = new Subject("");
        subject.gradesAvarage();
    }

    @Test
    public void shouldComputeAvargeSubjectOneGrade(){
        Subject subject = new Subject("");
        subject.addNote(5d);

        Double expected = 5d;

        assertEquals(expected, subject.gradesAvarage());
    }

    @Test
    public void shouldComputeAvarageSubjectManyGrades(){
        Subject subject = new Subject("");
        subject.addNote(5d);
        subject.addNote(10d);
        subject.addNote(15d);
        subject.addNote(18d);

        Double expected = 12d;

        assertEquals(expected, subject.gradesAvarage());
    }
}