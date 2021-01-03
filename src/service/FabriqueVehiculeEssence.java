package service;

import dao.FabriquerVehicule;
import entity.Automobile;
import entity.AutomobileEssence;
import entity.Scooter;
import entity.ScooterEssence;

public class FabriqueVehiculeEssence implements FabriquerVehicule {
    @Override
    public Automobile creeAutomobile(String modele, int puissance, double espace) {
        Automobile automobileEssence=new AutomobileEssence(modele,puissance,espace);
        return automobileEssence;
    }
    @Override
    public Scooter creeScooter(String modele, String couleur, int puissance) {
        Scooter scooterEssence=new ScooterEssence(modele,couleur,puissance);
        return scooterEssence;
    }
}
