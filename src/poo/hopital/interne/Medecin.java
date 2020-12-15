package poo.hopital.interne;

import java.util.ArrayList;

import poo.exception.MedecinIncompetentException;
import poo.hopital.externe.Patient;
import poo.hopital.general.Maladie;

public class Medecin extends Employe {
    protected Maladie maladie;
    protected ArrayList<Patient> patients;

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }

    public void ajouterPatient(Patient patient) {
        try {
            if (maladie.equals(patient.getMaladie())) {
                patients.add(patient);
            } else {
                throw new MedecinIncompetentException("Médecin incompétent");
            }
        }
        catch (MedecinIncompetentException e) {
            System.out.println("Le patient ne peut pas être soigné par ce médecin : " + e.getMessage());
        }
    }
}
