package Assignment1;

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Assignment1 {

    public static void main(String args[]){
       
        test5();
    }

    static void test1(){
        //初始化相关变量
        byte b=0x55;
		short s=0x55ff;
		int i=1000000;
		long l=0xffffL;
		char c='a';
		float f=0.23F;
		double d=0.7E-3;
		boolean B=true;
		String S="这是字符串类对象";

        //输出结果
		System.out.println("字节型变量 b ="+b);
		System.out.println("短整型变量 s = "+s);
		System.out.println(" 整型变量 i = "+i);
		System.out.println("长整型变量 l = "+l);
		System.out.printf("字符型变量 c = %c\n", c);//格式化输出
		System.out.printf("浮点型变量 f = %6.3f\n", f); //格式化输出
		System.out.println("双精度变量 d = "+d);
		System.out.println("布尔型变量 B = "+B);
		System.out.println("字符串类对象 S = "+S);

        //对char的一些尝试
        char a1[]={'西','南','大','学'};
        System.out.println(a1);
        System.out.println(a1+"");
    }
    
    static int i1=1;//类的成员变量
    static void test2(){
        int j=2;//函数内的局部变量
		{//语句块
			int k=3;//语句块内的局部变量
			System.out.println("i1="+i1);
			System.out.println("k="+k);
		}
		System.out.println("j="+j);
		//System.out.println("k="+k);//编译错，已出k的使用范围

    }

    static void test3(){
        int a=1, b=2, c=0;
		if(a<b || (c=a+b)>0) ;//分号是空语句
		if(c==3)
			System.out.println("c=" + c + "  说明c=a+b执行到了");
		else
			System.out.println("c=" + c + "  说明c=a+b没有执行到");

    }
    static void test4(){
        //初始化相关变量
        Scanner reader=new Scanner(System.in);

         //获取学生人数信息
        System.out.println("请输入学生人数：");
        while(!reader.hasNextInt()){
            System.out.println("输入错误！请输入一个整型数字");
            
        }
        int StuNum=reader.nextInt();

        int a[]=new int[StuNum],count=0;
        //读取学生成绩
        System.out.println("请输入学生成绩:");
        for(;count<StuNum;count++){
            if(reader.hasNextInt()){
                a[count]=reader.nextInt();
            }else if(reader.hasNextLine()){
                break;
            }
        }
        //输出学生成绩的相关信息
        for(int i=0;i<count;i++){
            System.out.print("Student "+i+" score is "+a[i]+",grade is");
            //通过与10相除的除数，判断属于哪个等级
            int level=a[i]/10;
            switch(level){
                case 10:
                case 9:
                    System.out.print(" A\n");
                    break;
                case 8:
                    System.out.print(" B\n");
                    break;
                case 7:
                    System.out.print(" C\n");
                    break;
                default:
                    System.out.print(" D\n");
                    break;

            }
        }

    }
    static void test5(){
        //输出相关信息
        System.out.println("****************************");
        System.out.println("请选择购买的商品编号");
        System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
        System.out.println("****************************");

        //初始化相关变量
        Scanner reader=new Scanner(System.in);
        float SumAccount=0;
        char flag='y';
        float price[]=new float[]{245,570,320};
        String product[]=new String[]{"T恤 ￥245.0","网球鞋 ￥570.0","网球拍 ￥320.0"};
        float discount=0.8F;
        //设置一个循环，实现令用户重复输入
        while(flag=='y'){
            //相关信息初始化
            int serialNum=0,amount=0;
            //获取购买物品信息
            System.out.print("\n请输入商品编号:");
            serialNum=reader.nextInt();
            System.out.print("请输入购买数量:");
            amount=reader.nextInt();

            //输出处理后的信息
            System.out.print(product[serialNum-1] +"\t" +"数量 "+amount +"合计 ￥");
            System.out.printf("%5.1f\n",price[serialNum-1]*amount);

            //修改总价
            SumAccount+=price[serialNum-1]*amount;

            //询问是否继续
            System.out.print("是否继续（y/n）:");
            flag=reader.next().charAt(0);
        }
        //输出付款信息
        System.out.printf("\n折扣：%2.1f\n应付金额: %6.1f\n实付金额:",discount,SumAccount*discount);
        float ActualPaid=reader.nextFloat();

        //若付款数小于应付数，则重复提示
        while(ActualPaid<SumAccount*discount){
            System.out.println("您输入的金额小于应付金额，请重新输入：");
            ActualPaid=reader.nextFloat();
        }
        System.out.printf("找钱：%4.1f",ActualPaid-SumAccount*discount);
    }
    
}
