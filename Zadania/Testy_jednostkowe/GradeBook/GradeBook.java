package Testy_jednostkowe.GradeBook;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    private Map<String, Subject> gradeBook = new HashMap<>();

    public Map<String, Subject> getGradeBook(){
        return gradeBook;
    }

    public void addSubjectToGradeBook(String subjectName){
        if (gradeBook.containsKey(subjectName)){
            throw new IllegalArgumentException("Taki przedmiot już istnieje");
        } else if (subjectName.equals("")){
            throw new IllegalArgumentException("Nazwa przedmiotu musi mieć przyjnajmniej jeden znak");
        } else {
            gradeBook.put(subjectName, new Subject(subjectName));
        }
    }

    public void addNote(String subjectName, Double note){
        Subject subject = getSubjectFromGradebook(subjectName);
        subject.addNote(note);
    }

    public Subject getSubjectFromGradebook(String subjectName){
        if (gradeBook.containsKey(subjectName)){
            return gradeBook.get(subjectName);
        } else {
            throw new IllegalArgumentException("Gradebook has no subject " + subjectName);
        }
    }

    public double subjectsGradesAvarage(){
        Double avarages = 0.0;

        for (String subjectName : gradeBook.keySet()){
            Subject subject = gradeBook.get(subjectName);
            avarages += subject.gradesAvarage();
        }

        if (avarages == 0.0) {
            throw new IllegalArgumentException("There is no grades in whole Gradebook");
        } else {
            return avarages/gradeBook.size();
        }

    }
}