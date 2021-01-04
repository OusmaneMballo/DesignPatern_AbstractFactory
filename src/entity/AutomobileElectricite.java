package entity;

public class AutomobileElectricite extends Automobile{

    public AutomobileElectricite(String modele, int puissance, double espace) {
        super(modele, puissance, espace);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "AutomobileElectricite{\"+\n" +
                "                \"modele: "+super.modele+"\n" +
                "                \"puissance: "+super.puissance +"\n" +
                "                \"espace: "+super.espace +"\n" +
                "                '}'");
    }
}
