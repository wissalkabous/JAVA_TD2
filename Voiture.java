import Voiture.Moteur;

//  CREATION DE LA CLASSE VOITURE:
public class Voiture {
    private String modele; // initialisation des attributs de la classe
    private String marque;
    private double vitesse;
    private boolean estDemarree = false;
    private Moteur Moteur = new Moteur("Dacia", 5); // creation du moteur

    public Voiture(String modele, String marque, double vitesse){ 
        this.marque=marque;
        this.modele=modele;
        this.vitesse=vitesse;
    }

    // setters:

    public void setModele(String MO){
        this.modele=MO;
    }
    public void setMarque(String MA){
        this.marque=MA;
    }
    public void setModel(double VI){
        this.vitesse=VI;
    }
    public void setestDemarree(boolean DE){
        this.estDemarree=DE;
    }
    public void setvitesse(double v){
        this.vitesse=v;
    }

    // getters:
    public String getModele(){
        return modele;
    }
    public String getMarque(){
        return marque;
    }
    public double getVitesse(){
        return vitesse;
    }
    public boolean isEstDemarree(){
        return estDemarree;
    }
    public double getvitesse(){
        return this.vitesse;
    }

    //  Les Methodes:
    public double deQuellePuissance(){ // cette methode renvoie la puissance du moteur
        return this.Moteur.getPuissance();
    }

    public void demarre(){ // cette methode renvoie TRUE si la voiture est demaree sinon, elle renvoie FALSE
        this.setestDemarree(true);
    }
    
    
    public void accelerer(double v ){ // cette methode ajoute une vitesse à la vitesse initiale
        this.setvitesse(this.vitesse+v);
    }


}


