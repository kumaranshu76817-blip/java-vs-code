class MymainEmployee{
    private int id; 
    private String name;
    public MymainEmployee(){
        id = 45;
        name = "anshu";
    }
    public MymainEmployee(String myname, int myid){
        name = myname;
        id = myid;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
}
    public void setId(int i){
        id = i;
    }
}
public class opps3 {
    public static void main(String[] args) {
        MymainEmployee anshu = new MymainEmployee();
        // anshu.setName("codeWithAnshu");
        // anshu.setId(12);
        System.out.println(anshu.getId());
        System.out.println(anshu.getName());
    }
}
