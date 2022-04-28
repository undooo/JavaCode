package Assignment6.Computer;

public interface USB {
    String getName();
    void turnOn();
    void turnOff();
}


class Mouse implements USB{
    //设备类型
    String name="Mouse";
    //启动
    public void turnOn(){
        System.out.println("鼠标设备启动了");
    }
    //关闭
    public void turnOff(){
        System.out.println("鼠标设备关闭了");
    }
    //获取名字
    public String getName(){
        return this.name;
    }
}

class KeyBoard implements USB{

    final static String name="KeyBoard";

    public void turnOn(){
        System.out.println("键盘设备启动了");
    }
    public void turnOff(){
        System.out.println("键盘设备关闭了");
    }
    public String getName(){
        return this.name;
    }
}

class Mic implements USB{
    final static String name="Mic";

    public void turnOn(){
        System.out.println("麦克风设备启动了");
    }
    public void turnOff(){
        System.out.println("麦克风设备关闭了");
    }
    public String getName(){
        return this.name;
    }
}