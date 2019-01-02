package Excercises_set_get.Zwierzeta_morskie;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;
import Excercises_set_get.Zwierzeta_ladowe.Niedzwiedz;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class RybkiTest {

    private Rybki rybki;
    private Malpa malpa;
    private Niedzwiedz niedzwiedz;

    @Before
    public void setUp() {
        rybki = new Rybki();
    }

    @Test
    public void shouldAllowToSetMaLuski() throws IllegalAccessException, NoSuchFieldException {
        rybki.setMaLuski(true);

        Field field = rybki.getClass().getDeclaredField("maLuski");
        field.setAccessible(true);

        assertEquals(field.get(rybki), true);

    }

    @Test
    public void shouldAllowToGetMaLuski() throws IllegalAccessException, NoSuchFieldException {

        Field field = rybki.getClass().getDeclaredField("maLuski");
        field.setAccessible(true);
        field.set(rybki, true);

        boolean result = rybki.getMaLuski();

        assertEquals(result, true);

    }

    @Test
    public void shouldAllowToSetCzyDuza() throws IllegalAccessException, NoSuchFieldException {
        rybki.setCzyDuza(true);

        Field field = rybki.getClass().getDeclaredField("czyDuza");
        field.setAccessible(true);

        assertEquals(field.get(rybki), true);

    }

    @Test
    public void shouldAllowToGetCzyDuza() throws IllegalAccessException, NoSuchFieldException {

        Field field = rybki.getClass().getDeclaredField("czyDuza");
        field.setAccessible(true);
        field.set(rybki, true);

        boolean result = rybki.isCzyDuza();

        assertEquals(result, true);

    }

    @Test
    public void shouldAllowToSetIleWStadzie() throws IllegalAccessException, NoSuchFieldException {
        rybki.setIleWStadzie(5000);

        Field field = rybki.getClass().getDeclaredField("ileWStadzie");
        field.setAccessible(true);

        assertEquals(field.get(rybki), 5000);

    }

    @Test
    public void shouldAllowToGetIleWStadzie() throws IllegalAccessException, NoSuchFieldException {

        Field field = rybki.getClass().getDeclaredField("ileWStadzie");
        field.setAccessible(true);
        field.set(rybki, 5000);

        int result = rybki.getIleWStadzie();

        assertEquals(result, 5000);

    }

    @Test
    public void shouldAllowToSetKolor() throws IllegalAccessException, NoSuchFieldException {
        rybki.setKolor("rybkowy");

        Field field = rybki.getClass().getDeclaredField("kolor");
        field.setAccessible(true);

        assertEquals(field.get(rybki), "rybkowy");

    }

    @Test
    public void shouldAllowToGetkolor() throws IllegalAccessException, NoSuchFieldException {

        Field field = rybki.getClass().getDeclaredField("kolor");
        field.setAccessible(true);
        field.set(rybki, "rybkowy");

        String result = rybki.getKolor();

        assertEquals(result, "rybkowy");

    }

    @Test
    public void shouldAllowToConstructRybki() throws IllegalAccessException, NoSuchFieldException{

        rybki = new Rybki(true, niedzwiedz, malpa, malpa, malpa, true, 5000, "rybkowy");

        Field field1 = rybki.getClass().getDeclaredField("maLuski");
        field1.setAccessible(true);

        Field field2 = rybki.getClass().getDeclaredField("czyDuza");
        field2.setAccessible(true);

        Field field3 = rybki.getClass().getDeclaredField("ileWStadzie");
        field3.setAccessible(true);

        Field field4 = rybki.getClass().getDeclaredField("kolor");
        field4.setAccessible(true);

        assertEquals(field1.get(rybki), true);
        assertEquals(field2.get(rybki), true);
        assertEquals(field3.get(rybki), 5000);
        assertEquals(field4.get(rybki), "rybkowy");

    }
}