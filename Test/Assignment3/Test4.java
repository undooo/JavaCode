package Assignment3;

class Power{
    //set the variable
    int x=10,y=10;
    void ff2(int passX,int passY){
        System.out.println("Before the process,x="+x+",y="+y);
        x=passX*passX;
        y=passY*passY;
        System.out.println("In the process,x is:"+x+",y="+y);

    }
}
class Power2{
    void ff2(data data1){
        System.out.println("Before the process,data's x is:"+data1.x);
        data1.x=100;
        System.out.println("In the process,data's x is:"+data1.x);
    }
}

class data{
    int x=10;
    data(int num){x=num;}
}
public class Test4 {
    public static void main(String[] args) {
        Power p=new Power();
        p.ff2(100,100);
        System.out.println("After the process x="+p.x+", y="+p.y);
        System.out.println("===================================");
        data data1=new data(10);
        Power2 p2=new Power2();
        p2.ff2(data1);
        System.out.println("After the process,data's x is "+data1.x);

    }

}
