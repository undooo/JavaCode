package Assignment5;

public abstract class Employer {
    //成员变量
    private String Name;
    private String Department;
    private double Salary;
    //构造函数
    public Employer(){}
    public Employer(String _name,String _department,double _salary){
        this.Name=_name;
        this.Department=_department;
        this.Salary=_salary;
    }
    //成员变量访问方法
    public String getName(){return Name;}
    public String getDepatment(){return Department;}
    public double getSalary(){return Salary;}
    //输出模块
    public void showSalary(){
        System.out.println("我叫"+Name+",在"+Department+"部门"+",我的工资是"+Salary);
    }
    //抽象方法
    public abstract void showBonus();
}
