package Assignment7;

public class Student {
    //定义变量
    protected String Stuname;
    protected String Stuno;
    protected int Stuscr;
    //构造函数
    public Student(){
        Stuname="unKnown";
        Stuno="unKnown";
        Stuscr=0;
    }
    public  Student(String _name,String _no,int _score){
        this.Stuname=_name;
        this.Stuno=_no;
        this.Stuscr=_score;
    }
}
