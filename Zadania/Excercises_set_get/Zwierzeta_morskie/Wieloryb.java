package Excercises_set_get.Zwierzeta_morskie;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;


public class Wieloryb {

    private String name;
    private boolean czyDuzy;
    private String kolor;
    private boolean czyLuski;
    private Malpa liczbaZebow;
    private Malpa umiejetnosci;
    private Malpa jedzenie;
    private Rybki ileWStadzie;

    public Wieloryb() {
    }

    public Wieloryb(String name, Rybki ileWStadzie, Malpa jedzenie, Malpa umiejetnosci, Malpa ileZebow, boolean czyDuzy, String kolor, boolean czyLuski) {
        this.name = name;
        this.czyDuzy = czyDuzy;
        this.kolor = kolor;
        this.czyLuski = czyLuski;
        this.liczbaZebow = ileZebow;
        this.umiejetnosci = umiejetnosci;
        this.jedzenie = jedzenie;
        this.ileWStadzie = ileWStadzie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCzyDuzy(boolean czyDuzy) {
        this.czyDuzy = czyDuzy;
    }

    public boolean getCzyDuzy() {
        return czyDuzy;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor(){
        return kolor;
    }

    public void setCzyLuski(boolean czyLuski) {
        this.czyLuski = czyLuski;
    }

    public boolean getCzyLuski(){
        return czyLuski;
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

    public void setJedzenie(Malpa jedzenie) {
        this.jedzenie = jedzenie;
    }

    public Malpa getJedzenie() {
        return jedzenie;
    }

    public void setIleWStadzie(Rybki ileWStadzie) {
        this.ileWStadzie = ileWStadzie;
    }

    public Rybki getIleWStadzie() {
        return ileWStadzie;
    }

}
