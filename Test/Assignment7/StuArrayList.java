package Assignment7;

public class StuArrayList {
    protected Student []stuList;
    protected int stuNum;
    protected int hasStu;
    public StuArrayList(){
        stuList=new Student[10];
        stuNum=10;
        hasStu=0;
    }
    public StuArrayList(int _stuNo){
        stuList=new Student[_stuNo];
        this.stuNum=_stuNo;
        this.hasStu=0;
    }
    public void addStu(String _name,String _stuNo,int _score) throws NegScore{
        //判断成绩是否为负数而抛出异常类
        if(_score<0){
            throw new NegScore();
        }
        stuList[hasStu++]=new Student(_name,_stuNo,_score);
    }

    public void printStu(){
        System.out.println("Name\tStuNo\tScore");
        for(int i=0;i<hasStu;i++){
            System.out.println(stuList[i].Stuname+"\t"+stuList[i].Stuno+"\t"+stuList[i].Stuscr);
        }
    }

}
