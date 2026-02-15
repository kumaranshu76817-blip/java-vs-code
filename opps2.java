class MyEmployee{
     private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;

    }
    public void setId(int i){
        this.id = i;
    }


}
class Cicle{
    private int radius;
    public void setRadius(int i){
        this.radius = i;
    }
    public int getRadius(){
        return radius* radius;
    }

}
public class opps2 {
    public static void main(String[] args) {
        MyEmployee anshu = new MyEmployee();
        anshu.setName("anshu");
        anshu.setId(45);
        System.out.println(anshu.getId());
        System.out.println(anshu.getName());


        Circle c = new Circle();
        c.setRadius()
    }
}
