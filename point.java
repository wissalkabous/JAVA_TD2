public class point { // creation de la classe point des coordonnées x et y
    private double x;
    private double y;

    public point(){ // constructeur qu'initialise la valeur du point par 0
        this(0,0);
    }
    public point(double a, double b){ 
        this.x=a; this.y=b;
     }

    public point(point p){ // constructeur qui prend un parametre de type point et qui initialise ses coordonnées
        p.x=x;
        p.y=y;
    }

    //EXERCICE
    public point(int a){
        this.x=0;
        this.y=0;
    }

    //constructeur:option1
    /*public point(int a){
        this();
        this.x=a;
    }
    
    option2:
    public point(){
        this(0);
    }
    */

    // Setters de x et y:
    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }
    
    // Getters de x et y 
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    // la methode deplacer() qui prend un parametre de type int et qui renvoie la valeur de x deplacer par une valeur n de type double
    public double deplacerX(int n){
        this.x=x+n;
        return x;
    }

    public double deplacerY(int n){
        this.y=y+n;
        return y;
    }

    // la methode reset() ramenée les coordonnées d'un point à l'origine
    public void reset(){
        this.x=0;
        this.y=0;
    }

    // la methode distance() retourne la distance entre un point déjà crée et le point b qui prendre en paramétre sous forme d'un double
    public double distance (point b){
        double dx= this.x-b.getX(); // on calcule les différences entre les coordonnées x et y des deux points
        double dy=this.y- b.getY();
        return Math.sqrt(dx*dx + dy*dy); // et on calcule la distance euclidienne entre les deux points
    }

    // la 2éme version de la methode distance() calcule la distance entre les points a et b en paramètres
    public static double distance(point a, point b) {
        double dx=a.x- b.x;
        double dy=a.x- b.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public boolean equals(Object obj) {
        // on a utiliser point pour verifier si l'objet en parametre est un point aussi 
       return(this.x == ((point)obj).x && this.y == ((point)obj).y);

        //point otherPoint = (point) obj;

        // Compare x and y values
        //return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    // la methode toString() convertie un objet point vers une chaîne de caractères
    public String toString(){
        return "("+x+","+y+")";

    }
}
