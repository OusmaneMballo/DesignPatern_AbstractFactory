package dao;

import entity.Automobile;
import entity.Scooter;

public interface FabriquerVehicule {
    public Automobile creeAutomobile();
    public Scooter creeScooter();
}
