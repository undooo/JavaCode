package Assignment7;

public class NegScore extends Exception{
    public NegScore(){
        super("学生成绩不能为负数，请重新输入！");
    }
    public NegScore(String s){
        super(s);
    }

}
