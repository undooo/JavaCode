package Assignment7;

public class testError {
    /*---定义两个方法，method1会调用method2，并捕获其中的异常*/
    public void method1(){
        try{
            System.out.println("Method1开始调用");
            method2();

        }
        catch(Exception e){
            System.out.println("捕获到了异常："+e);
        }
        finally {
            System.out.println("method1异常捕获结束");
        }
    }
    public void method2() throws Exception{
        int age=-1;
        System.out.println("method2开始调用");
        if(age<0){
            throw new Exception("年龄必须输入正数");
        }else{
            System.out.println("年龄为"+age);
        }
        System.out.println("method2正常结束");
    }
    public static void main(String args[]){
        //调用method1
        testError myTest =new testError();
        myTest.method1();
    }
}
