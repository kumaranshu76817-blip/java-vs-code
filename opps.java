class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
}
class Cellphone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");

    }
            public void callFriend(){
            System.out.println("calling rahul");
            
        }
}
class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
    
}
class Rectangle{
    int l;
    int b;
    public int area(){
        return l * b;
    }
    public int perimeter(){
        return  2 * (l+ b);
    }
}

class Tommy{
    public void hit(){
        System.out.println("hitting the enmy");

    }
    public void run(){
        System.out.println("runnin form the enemy");
    }
    public void fire(){
        System.out.println("firing the enemy");
    }
}
class Circle{
    int radius;
    public int area(){
        return radius * radius;
    }
    public int premiter(){
        return radius* 2;
    }
}
public class opps {

    public static void main(String[] args) {
        Employee anshu = new Employee();
        anshu.salary = 34;
        anshu.setName("codeWith anshu");
        System.out.println(anshu.getName());
        System.out.println(anshu.salary);



        Cellphone asus = new Cellphone();
        asus.callFriend();
        asus.ringing();
        asus.vibrating();


        Square  sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        Rectangle rc = new Rectangle();
        rc.l = 5;
        rc.b = 3;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());

        Tommy game = new Tommy();
        game.fire();
        game.hit();
        game.run();


        Circle c = new Circle();
        c.radius = 5;
        System.out.println(c.area());
        System.out.println(c.premiter());

        
     }
}