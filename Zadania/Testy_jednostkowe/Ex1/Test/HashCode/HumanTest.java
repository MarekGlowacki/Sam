package HashCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    private Human human;

    @Before
    public void setUp(){
        human = new Human();
    }

    @Test
    public void shouldAllowToSetName(){
        human.setName("Paweł");

        String expected = "Paweł";
        assertEquals(expected, human.getName());
    }

    @Test
    public void shouldAllowToSetSurname(){
        human.setSurname("Jakocki");

        String expected = "Jakocki";
        assertEquals(expected, human.getSurname());
    }

    @Test
    public void shouldCompareTwoObjectsSameName(){
        Human humana = new Human();
        human.setName("Hah");
        human.setSurname("Heh");

        humana.setName("Hah");
        humana.setSurname("Hah");

        Boolean expected = false;
        assertEquals(expected, human.equals(humana));
    }

    @Test
    public void shouldCompareTwoObjectsSameNameAndSurname(){
        Human humana = new Human();
        human.setName("Hah");
        human.setSurname("Heh");

        humana.setName("Hah");
        humana.setSurname("Heh");

        Boolean expected = true;
        assertEquals(expected, human.equals(humana));
    }

}