interface Bicycle{
    void applyBrake(int derement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3gs();
    void blowHornhn();
}
class AvonCycle implements Bicycle{
     void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBrake(int derement){
        System.out.println("applying breake");
    }
    public void speedUp(int increment){
        System.out.println("applyin acceraltor");
    }
}
public class interface_54 {
    public static void main(String[] args) {
        AvonCycle cy = new AvonCycle();
        cy.applyBrake(1);
       
    }
}
