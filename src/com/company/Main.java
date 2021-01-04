package com.company;

import dao.FabriquerVehicule;
import entity.Automobile;
import entity.Scooter;
import service.FabriqueVehiculeElectricite;
import service.FabriqueVehiculeEssence;

import java.util.Scanner;

public class Main {

    private static Scanner clavier=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        FabriquerVehicule vehiculeElectrique=new FabriqueVehiculeElectricite();
        FabriquerVehicule vehiculeEssence=new FabriqueVehiculeEssence();
        Automobile auto;
        Scooter moto;
        String choix=null;
        do{
            choix=menu();
            switch(choix){
                case "1":
                    auto=vehiculeElectrique.creeAutomobile("Ford Scapes", 4500,3.5);
                    auto.affichageCaracteristique();
                    break;
                case "2":
                    auto=vehiculeEssence.creeAutomobile("Ford Scapes", 4500,3.5);
                    auto.affichageCaracteristique();
                    break;
                case "3":
                    moto=vehiculeElectrique.creeScooter("T-max","Noir",5400);
                    moto.affichageCaracteristique();
                    break;
                case "4":
                    moto=vehiculeEssence.creeScooter("T-max","Noir",5400);
                    moto.affichageCaracteristique();
                    break;
                default:
                    choix=null;
                    break;
            }
        }while (choix==null);

    }

    private static String menu(){
        System.out.print("|======================|\n" +
                "|---------MENU---------|\n" +
                "|======================|\n" +
                "| 1 Automobile Electrique|\n" +
                "| 2 Automobile Essence   |\n" +
                "| 3 Scooter Electrique|\n" +
                "| 4 Scooter Essence   |\n" +
                "Faites votre choix:");
        return clavier.next();
    }
}
