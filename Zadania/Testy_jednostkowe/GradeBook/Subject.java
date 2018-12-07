package Testy_jednostkowe.GradeBook;

public class Subject {

    private String subject;

    public String getSubject(){
        return subject;
    }

    public void addSubject(String subjectName){
        if (subjectName.equals("")){
            throw new IllegalArgumentException("Nazwa przedmiotu musi mieć przynajmniej jeden znak.");
        } else {
            subject = subjectName;
        }
    }

}
