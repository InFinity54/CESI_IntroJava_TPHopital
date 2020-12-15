package poo.hopital.interne;

import java.util.ArrayList;

public class Directeur extends Employe implements Manager {
    protected ArrayList<Employe> listeEmployes;

    @Override
    public ArrayList<Employe> getListeEmployes() {
        return listeEmployes;
    }

    @Override
    public void addEmploye(Employe employe) {
        listeEmployes.add(employe);
    }
}
