import java.lang.*;
import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;

public class DataType {
    public static void main(String args[]) {
        
        //逻辑类型
        boolean DoorOpen=true;
        
        //整型  byte short int long
        //分别占 1     2    4    8  个字节
        //对于int ，正常数字为十进制，0开头的数字为八进制，0x开头代表为十六进制，0b为二进制
        //long在赋值时，末尾要加L，如
        long longNum=12345L;

        //字符类型
        char ch='A',ch2='库';

        //浮点类型
        //float ,加F表示小数表示法， f表示科学计数法   保留8位有效数字   4个字节
        float x=1.3888F;
        //double 加D/d

        //数据类型转换
        char chx=(char)84;



        

        //数组
        //两种写法，第一种
        int a[],b[];
        //第二种，等价于第一种
        int [] a1,b1;
        //注意点，java的数组声明中不可以带有数字，即不可以指定大小，指定大小的步骤在分配地址中完成；

        //Type 1
        int arr[]=new int[4];
        //Type 2
        int arr2[];
        arr2=new int [5];
        //直接给定初始值
        int arr3[]={1,2,3,4,5};
        //直接输出数组的话，会输出地址（char型数组除外，输出char数组会直接将所有元素输出）
        char  char1[]={'西','大'};
        //System.out.println(char1);
        //但是如果在输出char时还添加了其他的内容，则输出的就是char的地址
        String str=new String(char1);
        //System.out.println(str+"to"+arr+"---");

        //输入输出
        //用该类创建一个对象
        Scanner reader=new Scanner(System.in);
        //读取时每一次都会阻塞
        double db1,db2;
        //db1=reader.nextDouble();
        //db2=reader.nextDouble();
        //System.out.println(db1+""+db2);
        
        float xf=1234.56789F;
        System.out.printf("%7.4f\n",xf);
        System.out.println("---程序结束---");

    }
}
