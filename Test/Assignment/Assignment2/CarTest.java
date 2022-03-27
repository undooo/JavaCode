package Assignment.Assignment2;

public class CarTest {
    public static void main(String args[]){
        Car Car1=new Car("甲",40,10);
        System.out.println("这辆车的车主名为："+Car1.GetUserName());
        System.out.println("当前车速为："+Car1.GetSpeed());
        System.out.println("当前转向角度为："+Car1.GetDegree());
        Car1.changeDegree(20);
        System.out.println("转向之后的角度为："+Car1.GetDegree());
        Car1.StopTheCar();
        System.out.println("停车成功！当前速度为"+Car1.GetSpeed()+",当前转向角度为："+Car1.GetDegree());

    }
}
