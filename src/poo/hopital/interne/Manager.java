package poo.hopital.interne;

import java.util.ArrayList;

public interface Manager {
    ArrayList<Employe> getListeEmployes();
    void addEmploye(Employe employe);
}
