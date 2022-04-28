package Assignment4.College;

public class Student {
    protected String name;
    protected int StuID;
    void setdata(String name,int StuID){
        this.name=name;
        this.StuID=StuID;
        return;
    }
    public void print(){
        System.out.println(name+","+StuID);
        return;
    }
}
