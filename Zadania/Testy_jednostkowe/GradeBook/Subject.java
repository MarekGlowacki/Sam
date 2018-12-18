package Testy_jednostkowe.GradeBook;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    private List<Double> note = new LinkedList<>();

    public List<Double> getNote(){
        return note;
    }

    public void addNote(Double note){
        if (note <= 0){
            throw new IllegalArgumentException("Przedmiot musi mieć dodatnią ocenę.");
        } else {
            this.note.add(note);
        }
    }

}
