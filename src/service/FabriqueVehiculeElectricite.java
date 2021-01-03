package service;

import dao.FabriquerVehicule;
import entity.Automobile;
import entity.AutomobileElectricite;
import entity.Scooter;
import entity.ScooterElectricite;

public class FabriqueVehiculeElectricite implements FabriquerVehicule {
    @Override
    public Automobile creeAutomobile(String modele, int puissance, double espace) {
        Automobile automobileElectricite=new AutomobileElectricite(modele,puissance,espace);
        return automobileElectricite;
    }

    @Override
    public Scooter creeScooter(String modele, String couleur, int puissance) {

        Scooter scooterElectricite=new ScooterElectricite(modele, couleur,puissance);
        return scooterElectricite;
    }
}
