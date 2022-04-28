package Assignment5;

import java.util.Scanner;

public class Test {
    //最大员工数
    final static int maxWorkerNum=50;
    static int workerNum;
    public static  void main(String args[]) {
        Employer workerlist[] = new Employer[maxWorkerNum];
        //创建scanner，扫描输入
        Scanner reader = new Scanner(System.in);
        //按行输入
        while (reader.hasNextLine()) {
            String allInfo = reader.nextLine();
            //分割信息
            String infoList[] = allInfo.split(" ");
            //根据数据块的大小不同，分为两种情况
            if (infoList.length == 3) {//普通员工
                Employer worker = Factory.getInstance("Excellent", infoList[0], infoList[1], Double.valueOf(infoList[2].toString()), 0.0);
                workerlist[workerNum++] = worker;
            } else if (infoList.length == 4) {//优秀员工
                Employer worker = Factory.getInstance("Excellent", infoList[0], infoList[1], Double.valueOf(infoList[2].toString()), Double.valueOf(infoList[3].toString()));
                workerlist[workerNum++] = worker;
            }
            //输出结果
        }
    }
}
