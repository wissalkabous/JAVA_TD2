public class TestVoiture {
    public static void main(String[] args){
        Voiture car=new Voiture("Sandero","Dacia", 0);

        System.out.println("Les delails de la voiture: ");
        System.out.println("Marque: "+car.getMarque());
        System.out.println("Modele: "+car.getModele());
        System.out.println("Vitesse initiale: "+car.getVitesse());
        System.out.println("Est demarrée: "+car.isEstDemarree());

        car.demarre();
        car.accelerer(45);

        System.out.println("New: ");
        System.out.println("Vitesse: "+car.getVitesse());
        System.out.println("Est demarrée: "+car.isEstDemarree());
    }
}
