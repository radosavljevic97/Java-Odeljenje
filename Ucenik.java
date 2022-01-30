package Domaci2412;

import Domaci2212.Osoba;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public double prosek(){
        double sum = 0;
        boolean nedovoljan = false;
        for (Integer o : ocene){
            if (o == 1){
                nedovoljan = true;
                break;
            }
            sum += o;
        }
        if (nedovoljan)
            return 1;
        return sum / ocene.size();
    }

    public String ocene(){
        StringBuilder sb = new StringBuilder();
        for(Integer o : ocene){
            sb.append(o).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(prezime);
        sb.append(" ima ocene: ");
        sb.append(ocene);

        return sb.toString();
    }

}
