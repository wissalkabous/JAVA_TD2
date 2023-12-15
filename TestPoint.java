
public class TestPoint{
    static public void main(String args[]){
        point p1=new point(0,0); //initialisation d'un point de type point
        p1.setX(1); // initialisation des coordonnées x et y par des entiers
        p1.setY(2);
        System.out.println("la position du p1 est: ("+p1.getX()+","+p1.getY()+")");// tester les getters
        
        //System.out.println(p1.x);
        //System.out.println(p1.y);

        //on a deplacer x par une valeur de 2 et y par 4 avec la methode deplacer()
        System.out.println("la nouvelle position de p1: ("+p1.deplacerX(2)+","+p1.deplacerY(4)+")"); 
     
        point p2=new point(2, 5); // creation d'un nouveau point 
        // tester les deux versions de la methode distance
        System.out.println("la position du p2 est: ("+p2.getX()+","+p2.getY()+")");
        System.out.println("la distance entre p1 et p2: "+p1.distance(p2));
        System.out.println("la distance entre p1 et p2: "+point.distance(p1,p2)+"\n");
   

        point p3=new point(2,3);
        point p4=p3;
        System.out.println("la position du p3 est: ("+p3.getX()+","+p3.getY()+")");
        System.out.println("la position du p4 est: ("+p4.getX()+","+p4.getY()+")");
        System.out.println("Est-ce-que p2 et p3 sont egaux? " + p3.equals(p2));
        System.out.println("Est-ce-que p3 et p4 sont egaux? " + p3.equals(p4)+"\n");

        p1.reset();
        System.out.println("la position du p1 apres rest() est: ("+p1.getX()+","+p1.getY()+")\n");

        // NOTION DE CONSTRUCTEUR
        point p=new point();
        point q=new point(5,2);
        System.out.println("le point p: "+p);
        System.out.println("le point q: "+q+"\n");

        // CONVERTION VERS TEXTE toString()
        point pt=new point(2,5);
        System.out.println(pt.toString());


        

        
    }

    

     
}

