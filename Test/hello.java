import java.util.Scanner;
//Test ubuntu

//Test windows
public class hello{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        
        //读取用户输入的数据数
        System.out.println("请输入待存数据的个数:");
        
        //相关变量初始化
        int size=reader.nextInt();
        int a[]=new int[size];
        
        //读取用户输入的数据
        System.out.println("请输入待存数据:");
        for(int i=0;i<size;i++){
            a[i]=reader.nextInt();
        }

        //获取数字
        System.out.println("请输入要查询的数字:");
        int num=reader.nextInt();
        
        //循环遍历
        int flag=-1;
        for(int j=0;j<size;j++){
            if(a[j]==num){
                flag=j+1;break;
            }
        }
        
        //输出结果
        if(flag==-1){
            System.out.println("未在数组中找到该数字");
        }else{
            System.out.println("已找到该数字，该数据是该数组的第"+flag+"个元素");
        }
        reader.close();
}
}