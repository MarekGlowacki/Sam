package Testy_jednostkowe.GradeBook;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    public String getName() {
        return name;
    }

    private String name;
    private List<Double> note = new LinkedList<>();

    public List<Double> getNote(){
        return note;
    }

    public Subject(String name){
        this.name = name;
    }

    public void addNote(Double note){
        if (note <= 0){
            throw new IllegalArgumentException("Przedmiot musi mieć dodatnią ocenę.");
        } else {
            this.note.add(note);
        }
    }

    public Double gradesAvarage(){
        Double sum = 0.0;
        for (Double grade : note){
            sum += grade;
        }

        Double avarage = 0.0;
        if (note.size() == 0){
            throw new IllegalArgumentException("No grades added");
        } else {
             return avarage = sum/note.size();
        }
    }
}
