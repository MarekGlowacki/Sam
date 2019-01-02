package Excercises_set_getTests;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;
import Excercises_set_get.Zwierzeta_ladowe.Niedzwiedz;
import Excercises_set_get.Zwierzeta_morskie.Rekin;
import Excercises_set_get.Zwierzeta_morskie.Rybki;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class MalpaTest {

    private Malpa malpa;
    private Rekin rekin;
    private Rybki rybki;
    private Niedzwiedz niedzwiedz;

    @Before
    public void setUp(){
        malpa = new Malpa();
    }

    @Test
    public void shouldAllowToSetOwlosienie() throws NoSuchFieldException, IllegalAccessException{
        malpa.setOwlosienie(true);

        Field field = malpa.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);

        assertEquals(field.get(malpa), true);
    }

    @Test
    public void shouldAllowToSetLiczbaZebow() throws NoSuchFieldException, IllegalAccessException {
        malpa.setLiczbaZebow(5);

        Field field = malpa.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);
        assertEquals(field.get(malpa), 5);
    }

    @Test
    public void shouldAllowToSetUmiejetnosci() throws NoSuchFieldException, IllegalAccessException {
        malpa.setumiejetnosci("Jedzenie");

        Field field = malpa.getClass().getDeclaredField("umiejetnosci");
        field.setAccessible(true);
        assertEquals(field.get(malpa), "Jedzenie");
    }

    @Test
    public void shouldAllowToSetJedzenie() throws NoSuchFieldException, IllegalAccessException {
        malpa.setJedzenie("Banany");

        Field field = malpa.getClass().getDeclaredField("jedzenie");
        field.setAccessible(true);
        assertEquals(field.get(malpa), "Banany");
    }

    @Test
    public void shouldAllowToGetOwlosienie() throws IllegalAccessException, NoSuchFieldException{
        Field field = malpa.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);
        field.set(malpa, true);

        boolean result = malpa.getOwlosienie();
        assertEquals(result, true);
    }

    @Test
    public void shouldAllowToGetLiczbaZebow() throws IllegalAccessException, NoSuchFieldException{       Malpa malpa = new Malpa();
        Field field = malpa.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);
        field.set(malpa, 5);

        int result = malpa.getLiczbaZebow();
        assertEquals(result, 5);
    }

    @Test
    public void shouldAllowToGetUmiejetnosci() throws IllegalAccessException, NoSuchFieldException{
        Field field = malpa.getClass().getDeclaredField("umiejetnosci");
        field.setAccessible(true);
        field.set(malpa, "jedzenie");

        String result = malpa.getUmiejetnosci();
        assertEquals(result, "jedzenie");
    }

    @Test
    public void shouldAllowToGetJedzenie() throws IllegalAccessException, NoSuchFieldException{
        Field field = malpa.getClass().getDeclaredField("jedzenie");
        field.setAccessible(true);
        field.set(malpa, "banany");

        String result = malpa.getJedzenie();
        assertEquals(result, "banany");
    }

    @Test
    public void shouldAllowToConstructObject() throws IllegalAccessException, NoSuchFieldException{
        rekin = new Rekin();
        rybki = new Rybki();
        niedzwiedz = new Niedzwiedz();

        malpa = new Malpa(true, rybki, rekin, rekin, 5, "jedzenie", "banany", rekin, niedzwiedz);

        Field field1 = malpa.getClass().getDeclaredField("owlosienie");
        field1.setAccessible(true);

        Field field2 = malpa.getClass().getDeclaredField("liczbaZebow");
        field2.setAccessible(true);

        Field field3 = malpa.getClass().getDeclaredField("umiejetnosci");
        field3.setAccessible(true);

        Field field4 = malpa.getClass().getDeclaredField("jedzenie");
        field4.setAccessible(true);

        assertEquals(field1.get(malpa), true);
        assertEquals(field2.get(malpa), 5);
        assertEquals(field3.get(malpa), "jedzenie");
        assertEquals(field4.get(malpa), "banany");

    }
}