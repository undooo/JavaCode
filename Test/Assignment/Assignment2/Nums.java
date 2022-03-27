package Assignment.Assignment2;

import java.util.Arrays;

public class Nums {
    static int myMax(int a,int b){
        int max=a>b?a:b;
        System.out.println("两数的最大值为："+max);
        return max;
    }
    static float myMax(float a,float b){
        float max=a>b?a:b;
        System.out.println("两数的最大值为："+max);
        return max;
    }

    static void myMax(float a,float b,int c){
        System.out.println("三个数值从小到大排序为：");
        float array[]={a,b,(float)c};
        Arrays.sort(array);
        for(float num:array){
            // if(num-c==0){
            //     System.out.printf("%d\n",c);
            // }else{
            //     System.out.printf("%.2f\n",num);
            // }
            // System.out.println(num-c==0);
            // System.out.println(num-c==0?(int)c:num);
            if(num-c==0){
                System.out.println((int)c);
            }
            else{
                System.out.println(num);
            }
        }
    }
    public static void main(String args[]) {
        Nums.myMax(1.7F,8.3F,2);
    }
}
