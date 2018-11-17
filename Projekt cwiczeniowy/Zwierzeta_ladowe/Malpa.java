package Zwierzeta_ladowe;

import Zwierzeta_morskie.Rekin;
import Zwierzeta_morskie.Rybki;

public class Malpa {

    private boolean owlosienie;
    private int liczbaZebow;
    private String umiejetnosci;
    private String jedzenie;
    private Rekin name;
    private Niedzwiedz duzeUszy;
    private Rekin czyDuzy;
    public Rekin kolor;
    public Rybki ileWStadzie;

    public Malpa(boolean owlosienie, Rybki ileWStadzie, Rekin kolor, Rekin czyDuzy, int liczbaZebow, String umiejetnosci, String jedzenie, Rekin name, Niedzwiedz duzeUszy)  {
        this.owlosienie = owlosienie;
        this.liczbaZebow = liczbaZebow;
        this.umiejetnosci = umiejetnosci;
        this.jedzenie = jedzenie;
        this.name = name;
        this.duzeUszy = duzeUszy;
        this.czyDuzy = czyDuzy;
        this.kolor = kolor;
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

    public void setumiejetnosci(String umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }

    public  String getUmiejetnosci() {
        return umiejetnosci;
    }

    public void setJedzenie(String jedzenie) {
        this.jedzenie = jedzenie;
    }

    public String getJedzenie() {
        return jedzenie;
    }

    public void setName(Rekin name) {
        this.name = name;
    }

    public Rekin getName() {
        return name;
    }

    public void setDuzeUszy(Niedzwiedz duzeUszy) {
        this.duzeUszy = duzeUszy;
    }

    public Niedzwiedz getDuzeUszy() {
        return duzeUszy;
    }

    public void setCzyDuzy(Rekin czyDuzy) {
        this.czyDuzy = czyDuzy;
    }

    public Rekin getCzyDuzy(){
        return czyDuzy;
    }

    public void setKolor(Rekin kolor) {
        this.kolor = kolor;
    }

    public Rekin getKolor(){
        return kolor;
    }

    public void setIleWStadzie(Rybki ileWStadzie) {
        this.ileWStadzie = ileWStadzie;
    }

    public Rybki getIleWStadzie(){
        return ileWStadzie;
    }



}