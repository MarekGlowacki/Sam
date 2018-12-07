package Testy_jednostkowe.GradeBook;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    private Map<String, Subject> gradeBook = new HashMap<>();

    public Map<String, Integer[]> getGradeBook(){
        return gradeBook;
    }

    public void addSubjectToGradeBook(String subjectName){

            Integer[] grades = new Integer[10];
            gradeBook.put(subjectName, grades);
    }

}
