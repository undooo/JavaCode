

//java由于文件保存格式问题，对于中文会乱码报错，解决方法是用以下格式，控制台运行程序
//javac -encoding UTF-8 BasicFrame.java
//java BasicFrame

class People{
    void speak(String s){
        System.out.println(s);
    }
}



//文件名必须与public class 的名字相同
public class BasicFrame {
    //以下是main部分的必要声明   
    public static void main(String args[]) {
        
        //例如可以创建一个people类的对象
        People Liu=new People();
        People2 Li=new People2();
        Li.speak("是的");
        Liu.speak("ok");
    }
}

