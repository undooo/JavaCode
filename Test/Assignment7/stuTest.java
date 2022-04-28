package Assignment7;

import java.util.Scanner;

public class stuTest {
    public static void  main(String args[]){
        StuArrayList stuList=new StuArrayList(20);
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++){
            try{
                System.out.println("请输入学生信息(姓名 学号 成绩):");
                String name,stuNo;
                int score;
                name=scan.next();
                stuNo=scan.next();
                score=scan.nextInt();
                stuList.addStu(name,stuNo,score);
            }
            catch (NegScore e){
                System.out.println("捕获到异常e："+e);
            }

        }
        stuList.printStu();
    }
}
