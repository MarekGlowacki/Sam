package Excercises_set_get.Zwierzeta_ladowe;

import Excercises_set_get.Zwierzeta_morskie.*;

public class Niedzwiedz {

    private String name;
    private boolean owlosienie;
    private boolean duzeUszy;
    private int liczbaZebow;
    private Malpa jedzenie;
    private Malpa umiejetnosci;
    private Rekin czyDuzy;
    private Rekin kolor;
    private Rybki ileWStadzie;

    public Niedzwiedz() {
    }

    public Niedzwiedz(String name, Rybki ileWStadzie, Rekin kolor, Rekin czyDuzy, Malpa umiejetnosci, boolean owlosienie, boolean duzeUszy, int liczbaZebow, Malpa jedzenie) {
        this.name = name;
        this.owlosienie = owlosienie;
        this.duzeUszy = duzeUszy;
        this.liczbaZebow = liczbaZebow;
        this.jedzenie = jedzenie;
        this.umiejetnosci = umiejetnosci;
        this.czyDuzy = czyDuzy;
        this.kolor = kolor;
        this.ileWStadzie = ileWStadzie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setOwlosienie(boolean owlosienie) {
        this.owlosienie = owlosienie;
    }

    public boolean getOwlosienie() {
        return owlosienie;
    }

    public void setDuzeUszy(boolean duzeUszy) {
        this.duzeUszy = duzeUszy;
    }

    public boolean getDuzeUszy() {
        return duzeUszy;
    }

    public void setLiczbaZebow(int liczbaZebow) {
        this.liczbaZebow = liczbaZebow;
    }

    public int getLiczbaZebow() {
        return liczbaZebow;
    }

    public void setJedzenie(Malpa jedzenie) {
        this.jedzenie = jedzenie;
    }

    public Malpa getJedzenie(){
        return jedzenie;
    }

    public void setUmiejetnosci(Malpa umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }

    public Malpa getUmiejetnosci(){
        return umiejetnosci;
    }

    public void setCzyDuzy(Rekin czyDuzy) {
        this.czyDuzy = czyDuzy;
    }

    public Rekin getCzyDuzy() {
        return czyDuzy;
    }

    public void setKolor(Rekin kolor) {
        this.kolor = kolor;
    }

    public Rekin getKolor() {
        return kolor;
    }

    public void setIleWStadzie(Rybki ileWStadzie) {
        this.ileWStadzie = ileWStadzie;
    }

    public Rybki getIleWStadzie() {
        return ileWStadzie;
    }

}