package Excercises_set_getTests;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;
import Excercises_set_get.Zwierzeta_ladowe.Niedzwiedz;
import Excercises_set_get.Zwierzeta_morskie.Rekin;
import Excercises_set_get.Zwierzeta_morskie.Rybki;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class NiedzwiedzTest {

    private Niedzwiedz niedzwiedz;
    private Malpa malpa;
    private Rekin rekin;
    private Rybki rybki;

    @Before
    public void setUp() {
        niedzwiedz = new Niedzwiedz();
    }

    @Test
    public void shouldAllowToSetName() throws IllegalAccessException, NoSuchFieldException {
        niedzwiedz.setName("Bureg");

        Field field = niedzwiedz.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals(field.get(niedzwiedz), "Bureg");
    }

    @Test
    public void shouldAllowToSetOwlosienie() throws IllegalAccessException, NoSuchFieldException {
        niedzwiedz.setOwlosienie(true);

        Field field = niedzwiedz.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);

        assertEquals(field.get(niedzwiedz), true);
    }

    @Test
    public void shouldAllowToSetDuzeUszy() throws IllegalAccessException, NoSuchFieldException {
        niedzwiedz.setDuzeUszy(true);

        Field field = niedzwiedz.getClass().getDeclaredField("duzeUszy");
        field.setAccessible(true);

        assertEquals(field.get(niedzwiedz), true);
    }

    @Test
    public void shouldAllowToSetLiczbaZebow() throws IllegalAccessException, NoSuchFieldException {
        niedzwiedz.setLiczbaZebow(500);

        Field field = niedzwiedz.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);

        assertEquals(field.get(niedzwiedz), 500);
    }

    @Test
    public void shouldAllowToGetName() throws IllegalAccessException, NoSuchFieldException {

        Field field = niedzwiedz.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(niedzwiedz, "Bureg");

        String result = niedzwiedz.getName();

        assertEquals(result, "Bureg");

    }

    @Test
    public void shouldAllowToGetOwlosienie() throws IllegalAccessException, NoSuchFieldException {

        Field field = niedzwiedz.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);
        field.set(niedzwiedz, true);

        boolean result = niedzwiedz.getOwlosienie();
        assertEquals(result, true);
    }

    @Test
    public void shouldAllowToGetDuzeUszy() throws IllegalAccessException, NoSuchFieldException{

        Field field = niedzwiedz.getClass().getDeclaredField("duzeUszy");
        field.setAccessible(true);
        field.set(niedzwiedz, true);

        boolean result = niedzwiedz.getDuzeUszy();

        assertEquals(result, true);
    }

    @Test
    public void shouldAllowToGetLiczbaZebow() throws IllegalAccessException, NoSuchFieldException {

        Field field = niedzwiedz.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);
        field.set(niedzwiedz, 500);

        int result = niedzwiedz.getLiczbaZebow();

        assertEquals(result, 500);
    }

    @Test
    public void shouldAllowToConstructNiedzwiedz() throws IllegalAccessException, NoSuchFieldException {
        malpa = new Malpa();
        rekin = new Rekin();
        rybki = new Rybki();

        niedzwiedz = new Niedzwiedz("Bureg", rybki, rekin, rekin, malpa, true, true, 500, malpa);

        Field field1 = niedzwiedz.getClass().getDeclaredField("name");
        field1.setAccessible(true);

        Field field2 = niedzwiedz.getClass().getDeclaredField("owlosienie");
        field2.setAccessible(true);

        Field field3 = niedzwiedz.getClass().getDeclaredField("duzeUszy");
        field3.setAccessible(true);

        Field field4 = niedzwiedz.getClass().getDeclaredField("liczbaZebow");
        field4.setAccessible(true);

        assertEquals(field1.get(niedzwiedz), "Bureg");
        assertEquals(field2.get(niedzwiedz), true);
        assertEquals(field3.get(niedzwiedz), true);
        assertEquals(field4.get(niedzwiedz), 500);

    }
}