package HashCode;

public class Human {

    private String name;
    private String surname;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if (obj instanceof Human) {
            Human otherHuman = (Human) obj;
            return name.equals(otherHuman.name) && surname.equals(otherHuman.surname);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return 3 * name.hashCode() + 5 * surname.hashCode();
    }

}