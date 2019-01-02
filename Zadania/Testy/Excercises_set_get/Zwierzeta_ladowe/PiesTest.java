package Excercises_set_get.Zwierzeta_ladowe;

import Excercises_set_get.Zwierzeta_morskie.Rekin;
import Excercises_set_get.Zwierzeta_morskie.Rybki;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class PiesTest {

    private Pies pies;
    private Malpa malpa;
    private Rekin rekin;
    private Rybki rybki;

    @Before
    public void setUp() {
        pies = new Pies();
    }

    @Test
    public void shouldAllowToSetOwlosienie() throws IllegalAccessException, NoSuchFieldException {
        pies.setOwlosienie(true);

        Field field = pies.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);

        assertEquals(field.get(pies), true);
    }

    @Test
    public void shouldAllowToGetOwlosienie() throws IllegalAccessException, NoSuchFieldException {
        Field field = pies.getClass().getDeclaredField("owlosienie");
        field.setAccessible(true);
        field.set(pies, true);

        boolean result = pies.getOwlosienie();

        assertEquals(result, true);
    }

    @Test
    public void shouldAllowToSetLiczbaZebow() throws IllegalAccessException, NoSuchFieldException {
        pies.setLiczbaZebow(50);

        Field field = pies.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);

        assertEquals(field.get(pies), 50);
    }

    @Test
    public void shouldAllowToGetLiczbaZebow() throws IllegalAccessException, NoSuchFieldException {
        Field field = pies.getClass().getDeclaredField("liczbaZebow");
        field.setAccessible(true);
        field.set(pies, 50);

        int result = pies.getLiczbaZebow();

        assertEquals(result, 50);
    }

    @Test
    public void shouldAllowToSetDuzeUszy() throws IllegalAccessException, NoSuchFieldException {
        pies.setDuzeUszy(true);

        Field field = pies.getClass().getDeclaredField("duzeUszy");
        field.setAccessible(true);

        assertEquals(field.get(pies), true);
    }

    @Test
    public void shouldAllowToGetDuzeUszy() throws IllegalAccessException, NoSuchFieldException {

        Field field = pies.getClass().getDeclaredField("duzeUszy");
        field.setAccessible(true);
        field.set(pies, true);

        boolean result = pies.getDuzeUszy();

        assertEquals(result, true);
    }

    @Test
    public void shouldAllowToSetName() throws IllegalAccessException, NoSuchFieldException {
        pies.setName("Beny");

        Field field = pies.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals(field.get(pies), "Beny");
    }

    @Test
    public void shouldAllowToGetName() throws IllegalAccessException, NoSuchFieldException {
        Field field = pies.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(pies, "Beny");

        String result = pies.getName();

        assertEquals(result, "Beny");
    }

    @Test
    public void shouldAllowToCreatePies() throws IllegalAccessException, NoSuchFieldException {

        pies = new Pies(true, rybki, rekin, malpa, malpa, 50, true, "Bureg");

        Field field1 = pies.getClass().getDeclaredField("owlosienie");
        field1.setAccessible(true);

        Field field2 = pies.getClass().getDeclaredField("liczbaZebow");
        field2.setAccessible(true);

        Field field3 = pies.getClass().getDeclaredField("duzeUszy");
        field3.setAccessible(true);

        Field field4 = pies.getClass().getDeclaredField("name");
        field4.setAccessible(true);

        assertEquals(field1.get(pies), true);
        assertEquals(field2.get(pies), 50);
        assertEquals(field3.get(pies), true);
        assertEquals(field4.get(pies), "Bureg");
    }
}