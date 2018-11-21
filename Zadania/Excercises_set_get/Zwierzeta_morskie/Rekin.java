package Excercises_set_get.Zwierzeta_ladowe.Zwierzeta_morskie;

import Excercises_set_get.Zwierzeta_ladowe.Malpa;


public class Rekin {

    private boolean czyDuzy;
    private boolean czyLuski;
    private String name;
    private String kolor;
    private Malpa liczbaZebow;
    private Malpa umiejetnosci;
    private Malpa jedzenie;
    private Rybki ileWStadzie;

    public Rekin(boolean czyLuski, Rybki ileWStadzie, Malpa jedzenie, Malpa umiejetnosci, boolean czyDuzy, String name, String kolor, Malpa liczbaZebow) {
        this.czyLuski = czyLuski;
        this.czyDuzy = czyDuzy;
        this.name = name;
        this.kolor = kolor;
        this.liczbaZebow = liczbaZebow;
        this.umiejetnosci = umiejetnosci;
        this.jedzenie = jedzenie;
        this.ileWStadzie = ileWStadzie;

    }

    public void setCzyDuzy(boolean czyDuzy) {
        this.czyDuzy = czyDuzy;
    }

    public boolean getCzyDuzy(){
        return czyDuzy;
    }

    public void setCzyLuski(boolean czyLuski){
        this.czyLuski = czyLuski;
    }

    public boolean isCzyLuski(){
        return czyLuski;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor(){
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