interface MyCamera {
    void mycamera();
}

interface Myvideo {
    void myvideo();
}

class Mysmartphone implements MyCamera, Myvideo {
    public void mycamera() {
        System.out.println("taking snap");
    }

    public void myvideo() {
        System.out.println("taking video");
    }

    public void callinNumber(String  phoneNumber) {
        System.out.println("calling...." + phoneNumber);
    }

    public void ringing() {
        System.out.println("ringing....");
    }

}

public class ployomorphosim_59 {
    public static void main(String[] args) {
        MyCamera c = new Mysmartphone();
        c.mycamera();
        // c.myvideo(); --> not allowed
        Mysmartphone s = new Mysmartphone();
        s.callinNumber("anshu");
        s.ringing();
    }
}
