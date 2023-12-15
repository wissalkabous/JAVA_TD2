// CODAGE DES ASSOCIASIONS
import java.lang.Math;

public class Rectangle { // creation de la classe rectangle 
    private point HG; // initialisation des parametres 
    private point BD;

    public Rectangle(){ // constructeur par defaut
    }

    // setters & getters
    public void setHG(point HG){
        this.HG=HG;
    }
    public void setBD(point BD){
        this.BD=BD;
    }
    public point getHG(){
        return HG;
    }
    public point getBD(){
        return BD;
    }

    public Rectangle(point H, point B){  //initialisation des points
        //HG=new point();
        //BD=new point();
        this.HG=H;
        this.BD=B;
    }

    public void afficher(){ // methode qui affiche le point haut gauche HG et le point bas droite BD
        System.out.println("Rectangle:");
        System.out.println("Point Haut Gauche: "+HG);
        System.out.println("Point Bas Droite: "+BD+"\n");
    }
 
    public double surface(){ // methode qui calcule la surface du rectangle
        double width = Math.abs(HG.getX()-HG.getY());// on prend la hauteur et la langeur et on les multiple
        double height = Math.abs(BD.getX()-BD.getY());
        return width*height;
    }

    public void zoom(int deltax, int deltay){
        // Déplacer le coin haut gauche vers le haut et vers la gauche
        HG.setX(HG.getX() - deltax);
        HG.setY(HG.getY() - deltay);
        //Déplacer le coin bas droit vers le bas et vers la droite
        BD.setX(BD.getX() + deltax);
        BD.setY(BD.getY() + deltay);
    }
}
