package Zwierzeta_ladowe;

import Zwierzeta_morskie.*;

public class Pies {

    private boolean owlosienie;
    private int liczbaZebow;
    private boolean duzeUszy;
    private String name;
    private Malpa umiejetnosci;
    private Malpa jedzenie;
    private Rekin czyDuzy;
    private Rybki ileWStadzie;


    public Pies(boolean owlosienie, Rybki ileWStadzie, Rekin czyDuzy, Niedzwiedz liczbazebow, Malpa jedzenie, Malpa umiejetnosci, int liczbaZebow, boolean duzeUczy, String name) {
        this.owlosienie = owlosienie;
        this.liczbaZebow = liczbaZebow;
        this.duzeUszy = duzeUczy;
        this.name = name;
        this.umiejetnosci = umiejetnosci;
        this.jedzenie = jedzenie;
        this.liczbaZebow = liczbaZebow;
        this.czyDuzy = czyDuzy;
        this.ileWStadzie = ileWStadzie;
    }

    public void setOwlosienie(boolean owlosienie) {
        this.owlosienie = owlosienie;
    }

    public boolean getOwlosienie() {
        return owlosienie;
    }

    public void setLiczbaZebow(int liczbaZebow) {
        this.liczbaZebow = liczbaZebow;
    }

    public int getLiczbaZebow() {
        return liczbaZebow;
    }

    public void setDuzeUczy(boolean duzeUczy) {
        this.duzeUszy = duzeUczy;
    }

    public boolean getDuzeUszy() {
        return duzeUszy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
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

    public Malpa getJedzenie(){
        return jedzenie;
    }

    public void setCzyDuzy(Rekin czyDuzy) {
        this.czyDuzy = czyDuzy;
    }

    public Rekin getCzyDuzy() {
        return czyDuzy;
    }

    public void setIleWStadzie(Rybki ileWStadzie) {
        this.ileWStadzie = ileWStadzie;
    }

    public Rybki getIleWStadzie() {
        return ileWStadzie;
    }



}
