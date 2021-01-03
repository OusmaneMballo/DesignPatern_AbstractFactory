package dao;

import entity.Automobile;
import entity.Scooter;

public interface FabriquerVehicule {
    public Automobile creeAutomobile(String modele, int puissance, double espace);
    public Scooter creeScooter(String modele, String couleur, int puissance);
}
