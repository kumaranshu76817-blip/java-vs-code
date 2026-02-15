class Cylinder{
    private int radius;
    private int height;

    public  void cylinder( int radius, int height){
        this.radius = radius ;
        this.height = height;
    }

    public void setRadius(int i){
        radius = i;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
     public double surfaceArea(){
        return 2 * 3.14* radius + 2 * 3.143 * radius * height;
     }
    
}
class Rectangle{
    private int radius;
    private int height;

    public Rectangle(){
        this.radius = 7;
        this.height = 2;
    }

    public Rectangle(int height, int radius){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 4 * radius +height;
    }
}

public class practiceSet {
    public static void main(String[] args) {
        // Cylinder cy = new Cylinder();
        // cy.setRadius(23);
        // int r = cy.getRadius();
        // cy.setHeight(34);
        // int h = cy.getHeight();
        // System.out.println(r);
        // System.out.println(h);
        // System.out.println(cy.surfaceArea());


        // problme 2

        Rectangle r = new Rectangle(2,3);
        r.setHeight(4);
        r.setRadius(6);
        System.out.println(r.getHeight());
        System.out.println(r.getRadius());
        System.out.println(r.surfaceArea());

    }
}
