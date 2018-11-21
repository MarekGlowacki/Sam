package Excercises_set_get.Zwierzeta_ladowe.Zwierzeta_morskie;

import Excercises_set_get.Zwierzeta_ladowe.*;

public class Rybki {

    private boolean maLuski;
    private boolean czyDuza;
    private int ileWStadzie;
    private String kolor;
    private Malpa liczbaZebow;
    private Malpa umiejetnosci;
    private Malpa jedzenie;
    private Niedzwiedz name;


    public Rybki(boolean maLuski, Niedzwiedz name, Malpa jedzenie, Malpa umiejetnosci, Malpa liczbaZebow, boolean czyDuza, int ileWStadzie, String kolor) {
        this.maLuski = maLuski;
        this.czyDuza = czyDuza;
        this.ileWStadzie = ileWStadzie;
        this.kolor = kolor;
        this.liczbaZebow = liczbaZebow;
        this.umiejetnosci = umiejetnosci;
        this.jedzenie = jedzenie;
        this.name = name;
    }

    public void setMaLuski(boolean maLuski) {
        this.maLuski = maLuski;
    }

    public boolean getMaLuski() {
        return maLuski;
    }

    public void setCzyDuza(boolean czyDuza) {
        this.czyDuza = czyDuza;
    }

    public boolean isCzyDuza(){
        return czyDuza;
    }

    public void setIleWStadzie(int ileWStadzie) {
        this.ileWStadzie = ileWStadzie;
    }

    public int getIleWStadzie(){
        return ileWStadzie;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setLiczbaZebow(Malpa liczbaZebow) {
        this.liczbaZebow = liczbaZebow;
    }

    public Malpa getLiczbaZebow() {
        return liczbaZebow;
    }

    public void setUmiejetnosci(Malpa umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }

    public Malpa getUmiejetnosci() {
        return umiejetnosci;
    }

    public void setJedzenie (Malpa jedzenie) {
        this.jedzenie = jedzenie;
    }

    public Malpa getJedzenie() {
        return jedzenie;
    }

    public void setName(Niedzwiedz name) {
        this.name = name;
    }

    public Niedzwiedz getName() {
        return name;
    }

}