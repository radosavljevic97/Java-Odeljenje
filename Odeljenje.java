package Domaci2412;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }


    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }


    public void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

        public void upisiUcenika(Ucenik u, int redniBroj){
            dnevnik.add(redniBroj, u);
        }

        public void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
            }

        public void ispisiUcenika(int i){
            dnevnik.remove(i);
        }

    public void pogledajOcene(Ucenik u){
        System.out.println(u.ocene());
    }

    public void pogledajOcene(int i){
        System.out.println(dnevnik.get(i).ocene());
    }

    public void prosecnaOcena(Ucenik u){
        System.out.println(u.prosek());
    }

    public void prosecnaOcena(int i){
        System.out.println(dnevnik.get(i).prosek());
    }

    public double prosecnaOcenaOdeljenja(){
        double prosek = 0;
        for(Ucenik u : dnevnik){
            prosek += u.prosek();
        }
        return prosek / dnevnik.size();
    }

    public void opisnaOcena(Ucenik u){
        double prosek = u.prosek();
        if (prosek == 1)
            System.out.println("Nedovoljan");
        else if (prosek >= 4.5)
            System.out.println("Odlican");
        else if (prosek >= 3.5)
            System.out.println("Vrlo dobar");
        else if (prosek >= 2.5)
            System.out.println("Dobar");
        else
            System.out.println("Dovoljan");
    }


    public void izlistajDnevnik(){
        for(Ucenik u : dnevnik){
            System.out.println(u.getIme() + " " + u.getPrezime() + " ima ocene: ");
            if(u.getOcene().isEmpty()){
                System.out.println("Ucenik nema zapisane ocene.");
            }
            else{
                System.out.println(u.getOcene());
            }
            System.out.println();
        }
    }

    public void velicinaOdeljenja(){
        if(dnevnik.size() > 25){
            System.out.println("Veliko odeljenje.");
        }
        else if(dnevnik.size() > 15){
            System.out.println("Srednje odeljenje.");
        }
        else{
            System.out.println("Malo odeljenje.");
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ima djake: ");
        sb.append("\n");

        for(Ucenik u : dnevnik){
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");
        }

        return sb.toString();
    }









    }

