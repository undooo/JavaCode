package Assignment6.Computer;

public class Computer {
    int maxUsb;
    USB [] usbSlot;
    //默认构造函数
    public Computer(){
        maxUsb=3;
        usbSlot=new USB[maxUsb];
    }
    //传参构造函数
    public Computer(int _maxUsb){
        this.maxUsb=_maxUsb;
        usbSlot=new USB[maxUsb];
    }
    //插入新的usb设备
    public void add(USB newusb){
        for(int i=0;i<maxUsb;i++){
            if(usbSlot[i]==null){//若有空位置，则插入新设备
                usbSlot[i]=newusb;
                System.out.println("成功插入一个"+newusb.getName());
                return;
            }
        }
        //若此时插槽已满，则输出信息
        System.out.println("插槽已满，无法再插入一个"+newusb.getClass());
        return;
    }
    //启动设备
    public void powerOn(){
        for(USB usb:usbSlot){
            if(usb!=null){//启动存在的设备
                usb.turnOn();
            }
        }
        System.out.println("计算机开机成功");
        return;
    }
    //关闭设备
    public void powerOff(){
        for(USB usb:usbSlot){
            if(usb!=null){
                usb.turnOff();
            }
        }
        System.out.println("计算机关机成功");
        return;
    }
}
