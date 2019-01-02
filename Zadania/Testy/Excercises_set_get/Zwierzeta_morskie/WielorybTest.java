package Excercises_set_get.Zwierzeta_morskie;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;
import Excercises_set_get.Zwierzeta_ladowe.Niedzwiedz;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class WielorybTest {

    private Wieloryb wieloryb;
    private Malpa malpa;
    private Rybki rybki;

    @Before
    public void setUp() {
        wieloryb = new Wieloryb();
    }

    @Test
    public void shouldAllowToSetName() throws IllegalAccessException, NoSuchFieldException {
        wieloryb.setName("Wal");

        Field field = wieloryb.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals(field.get(wieloryb), "Wal");

    }

    @Test
    public void shouldAllowToGetMaLuski() throws IllegalAccessException, NoSuchFieldException {

        Field field = wieloryb.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(wieloryb, "Wal");

        String result = wieloryb.getName();

        assertEquals(result, "Wal");

    }

    @Test
    public void shouldAllowToSetCzyDuzy() throws IllegalAccessException, NoSuchFieldException {
        wieloryb.setCzyDuzy(true);

        Field field = wieloryb.getClass().getDeclaredField("czyDuzy");
        field.setAccessible(true);

        assertEquals(field.get(wieloryb), true);

    }

    @Test
    public void shouldAllowToGetCzyDuzy() throws IllegalAccessException, NoSuchFieldException {

        Field field = wieloryb.getClass().getDeclaredField("czyDuzy");
        field.setAccessible(true);
        field.set(wieloryb, true);

        boolean result = wieloryb.getCzyDuzy();

        assertEquals(result, true);

    }

    @Test
    public void shouldAllowToSetKolor() throws IllegalAccessException, NoSuchFieldException {
        wieloryb.setKolor("wielorybi");

        Field field = wieloryb.getClass().getDeclaredField("kolor");
        field.setAccessible(true);

        assertEquals(field.get(wieloryb), "wielorybi");

    }

    @Test
    public void shouldAllowToGetKolor() throws IllegalAccessException, NoSuchFieldException {

        Field field = wieloryb.getClass().getDeclaredField("kolor");
        field.setAccessible(true);
        field.set(wieloryb, "wielorybi");

        String result = wieloryb.getKolor();

        assertEquals(result, "wielorybi");

    }

    @Test
    public void shouldAllowToSetCzyLuski() throws IllegalAccessException, NoSuchFieldException {
        wieloryb.setCzyLuski(true);

        Field field = wieloryb.getClass().getDeclaredField("czyLuski");
        field.setAccessible(true);

        assertEquals(field.get(wieloryb), true);

    }

    @Test
    public void shouldAllowToGetCzyLuski() throws IllegalAccessException, NoSuchFieldException {

        Field field = wieloryb.getClass().getDeclaredField("czyLuski");
        field.setAccessible(true);
        field.set(wieloryb, true);

        boolean result = wieloryb.getCzyLuski();

        assertEquals(result, true);

    }

    @Test
    public void shouldAllowToConstructRybki() throws IllegalAccessException, NoSuchFieldException{

        wieloryb = new Wieloryb("Wal", rybki, malpa, malpa, malpa, true, "wielorybi", true);

        Field field1 = wieloryb.getClass().getDeclaredField("name");
        field1.setAccessible(true);

        Field field2 = wieloryb.getClass().getDeclaredField("czyDuzy");
        field2.setAccessible(true);

        Field field3 = wieloryb.getClass().getDeclaredField("kolor");
        field3.setAccessible(true);

        Field field4 = wieloryb.getClass().getDeclaredField("czyLuski");
        field4.setAccessible(true);

        assertEquals(field1.get(wieloryb), "Wal");
        assertEquals(field2.get(wieloryb), true);
        assertEquals(field3.get(wieloryb), "wielorybi");
        assertEquals(field4.get(wieloryb), true);

    }
}