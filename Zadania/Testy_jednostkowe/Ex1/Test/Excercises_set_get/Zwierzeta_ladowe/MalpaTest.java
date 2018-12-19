package Excercises_set_get.Zwierzeta_ladowe;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class MalpaTest {

    @Test
    public void shouldAllowToSetOwlosienie() throws NoSuchFieldException, IllegalAccessException{
        Malpa malpa = new Malpa();

        malpa.setOwlosienie(true);

        Field field = malpa.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);

        assertEquals(field.get(malpa), true);
    }

    @Test
    public void shouldAllowToSetLiczbaZebow() throws NoSuchFieldException, IllegalAccessException {
        Malpa malpa = new Malpa();

        malpa.setLiczbaZebow(5);

        Field field = malpa.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);
        assertEquals(field.get(malpa), 5);
    }

    @Test
    public void shouldAllowToSetUmiejetnosci() throws NoSuchFieldException, IllegalAccessException {
        Malpa malpa = new Malpa();

        malpa.setumiejetnosci("Jedzenie");

        Field field = malpa.getClass().getDeclaredField("umiejetnosci");
        field.setAccessible(true);
        assertEquals(field.get(malpa), "Jedzenie");
    }

    @Test
    public void shouldAllowToSetJedzenie() throws NoSuchFieldException, IllegalAccessException {
        Malpa malpa = new Malpa();
        malpa.setJedzenie("Banany");

        Field field = malpa.getClass().getDeclaredField("jedzenie");
        field.setAccessible(true);
        assertEquals(field.get(malpa), "Banany");
    }

    @Test
    public void yes(){

    }




}