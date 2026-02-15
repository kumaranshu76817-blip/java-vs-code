interface camera{
    void takesnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("recording in 4k..");
    }

}
interface wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MycellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }

}
class Mysmartphone extends MycellPhone implements camera,wifi{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("taking snap");
    }
    public String[] getNetwork(){
        System.out.println("getting list ofnetworks");
    
        String [] networkList = {
            "anshu", "ayush","prashanth"
        };
        return networkList;
    }
        
    
    public void connectToNetwork(String network){
        System.out.println("connecting to" + network);
    }
}
public class default_method_57 {
    public static void main(String[] args) {
        Mysmartphone ms = new Mysmartphone();
        String[] ar = ms.getNetwork();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
