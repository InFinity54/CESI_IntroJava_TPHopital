package poo.hopital;

import java.util.ArrayList;
import poo.hopital.interne.Directeur;

public class Hopital {
    protected Directeur directeur;

    public Directeur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public int getMasseSalariale() {
        final ArrayList<Integer> allSalaires = new ArrayList<>();
        int totalSalaires = 0;

        allSalaires.add(directeur.getSalaire());

        directeur.getListeEmployes().forEach(employe -> {
            allSalaires.add(employe.getSalaire());
        });

        for (Integer allSalaire : allSalaires) {
            totalSalaires = totalSalaires + allSalaire;
        }

        return totalSalaires;
    }
}
