// UNE CLASSE POUR TESTER LA CLASSE RECTANGLE

public class TestRectangle {
    public static void main(String args[]){
    point H=new point(1,3); //creation des points
    point B=new point(2,4);

    Rectangle R=new Rectangle(H,B); // creation du rectangle
    R.setHG(H); // set les point su ractangle 
    R.setBD(B);

    //Affichage du rectangle:
    R.afficher();

    double surf=R.surface(); 
    System.out.println("Surface: "+surf+"\n");

    //Zoom
    R.zoom(2,2);
    System.out.println("After zooming:");
    R.afficher();
}
}
