package Assignment6.Computer;

public class Test {
    public static void main(String s[]){
        //初始化对象
        Computer myComputer=new Computer(3);
        USB myKeyBoard=new KeyBoard();
        USB myMic=new Mic();
        USB myMouse=new Mouse();
        System.out.println("####################################");
        //添加设备
        myComputer.add(myKeyBoard);
        myComputer.add(myMic);
        myComputer.add(myMouse);
        System.out.println("####################################");
        //启动计算机
        myComputer.powerOn();
        System.out.println("####################################");
        //关闭计算机
        myComputer.powerOff();
        System.out.println("####################################");
        return;
    }
}
