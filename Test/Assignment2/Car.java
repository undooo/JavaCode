package Assignment2;

public class Car {
    //声明变量
    private String UserName;
    private float CarSpeed;
    private float CarDirInDegree;
    //构造函数
    public Car(String username){
        this.UserName=username;
    }
    public Car(String username,float speed,float Degree){
        this(username);
        this.CarSpeed=speed;
        this.CarDirInDegree=Degree;
    }
    //成员函数
    public String GetUserName(){return this.UserName;}
    public float GetSpeed(){return this.CarSpeed;}
    public float GetDegree(){return this.CarDirInDegree;}
    public void changeSpeed(float speed){this.CarSpeed=speed;}
    public void changeDegree(float Degree){this.CarDirInDegree=Degree;}
    public void StopTheCar(){this.CarSpeed=0;this.CarDirInDegree=0;}
}
