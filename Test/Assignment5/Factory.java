package Assignment5;

/*---------优秀员工--------------*/
class Excellent extends Employer{
    //成员变量------------------------------------------------------
    private double bonus;
    //构造函数----------------------------------------------------------
    public Excellent(){}
    public Excellent(String _name,String _department,double _salary,double _bonus){
        super(_name,_department,_salary);
        this.bonus=_bonus;
    }
    //实现抽象方法---------------------------------------------------
    public void showBonus(){
        System.out.printf("我是优秀员工，我的工资是:%.1f",bonus);
        return;
    }
}
/*----------普通员工--------------*/

class Ordinary extends Employer{
    //构造函数-----------------
    public Ordinary(){}
    public Ordinary(String _name,String _department,double _salary){
        super(_name,_department,_salary);
    }
    //实现抽象方法
    public void showBonus(){
        System.out.println("我是普通员工，没有奖金，加油升级！");
    }
}
public class Factory {
    static Employer getInstance(String type,String _name,String _department,double _salary,double _bonus){
        Employer thisEml=null;
        if(type.equals("Excellent")){
            thisEml=new Excellent(_name,_department,_salary,_bonus);
        }else if(type.equals("Ordinary")){
            thisEml=new Ordinary(_name,_department,_salary);
        }
        return thisEml;
    }
}
