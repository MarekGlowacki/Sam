package Excercises_set_get.Zwierzeta_morskie;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class RekinTest {

    private Rekin rekin;
    private Malpa malpa;
    private Rybki rybki;

    @Before
    public void setUp() {
        rekin = new Rekin();
    }

    @Test
    public void shouldAllowToSetCzyDuzy() throws IllegalAccessException, NoSuchFieldException {
        rekin.setCzyDuzy(true);

        Field field = rekin.getClass().getDeclaredField("czyDuzy");
        field.setAccessible(true);

        assertEquals(field.get(rekin), true);

    }

    @Test
    public void shouldAllowToGetCzyDuzy() throws IllegalAccessException, NoSuchFieldException {

        Field field = rekin.getClass().getDeclaredField("czyDuzy");
        field.setAccessible(true);
        field.set(rekin, true);

        boolean result = rekin.getCzyDuzy();

        assertEquals(result, true);

    }

    @Test
    public void shouldAllowToSetCzyLuski() throws IllegalAccessException, NoSuchFieldException {
        rekin.setCzyLuski(true);

        Field field = rekin.getClass().getDeclaredField("czyLuski");
        field.setAccessible(true);

        assertEquals(field.get(rekin), true);

    }

    @Test
    public void shouldAllowToGetCzyLuski() throws IllegalAccessException, NoSuchFieldException {

        Field field = rekin.getClass().getDeclaredField("czyLuski");
        field.setAccessible(true);
        field.set(rekin, true);

        boolean result = rekin.isCzyLuski();

        assertEquals(result, true);

    }

    @Test
    public void shouldAllowToSetName() throws IllegalAccessException, NoSuchFieldException {
        rekin.setName("Szark");

        Field field = rekin.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals(field.get(rekin), "Szark");

    }

    @Test
    public void shouldAllowToGetName() throws IllegalAccessException, NoSuchFieldException {

        Field field = rekin.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(rekin, "Szark");

        String result = rekin.getName();

        assertEquals(result, "Szark");

    }

    @Test
    public void shouldAllowToSetKolor() throws IllegalAccessException, NoSuchFieldException {
        rekin.setKolor("rekinowy");

        Field field = rekin.getClass().getDeclaredField("kolor");
        field.setAccessible(true);

        assertEquals(field.get(rekin), "rekinowy");

    }

    @Test
    public void shouldAllowToGetkolor() throws IllegalAccessException, NoSuchFieldException {

        Field field = rekin.getClass().getDeclaredField("kolor");
        field.setAccessible(true);
        field.set(rekin, "rekinowy");

        String result = rekin.getKolor();

        assertEquals(result, "rekinowy");

    }

    @Test
    public void shouldAllowToConstructRekin() throws IllegalAccessException, NoSuchFieldException{

        rekin = new Rekin(true, rybki, malpa, malpa, true, "Szark", "rekinowy", malpa);

        Field field1 = rekin.getClass().getDeclaredField("czyDuzy");
        field1.setAccessible(true);

        Field field2 = rekin.getClass().getDeclaredField("czyLuski");
        field2.setAccessible(true);

        Field field3 = rekin.getClass().getDeclaredField("name");
        field3.setAccessible(true);

        Field field4 = rekin.getClass().getDeclaredField("kolor");
        field4.setAccessible(true);

        assertEquals(field1.get(rekin), true);
        assertEquals(field2.get(rekin), true);
        assertEquals(field3.get(rekin), "Szark");
        assertEquals(field4.get(rekin), "rekinowy");

    }
}