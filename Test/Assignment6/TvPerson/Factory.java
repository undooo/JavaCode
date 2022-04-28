package Assignment6.TvPerson;
//工厂模式
public class Factory {
    public static Age getInstance(String type){
        //根据类型的不同，创建不同的对象
        Age temp=null;
        if(type.equals("TV")){
            temp=new TV();
            return temp;
        }else if (type.equals("Person")){
            temp=new Person();
            return temp;
        }
        return temp;
    }
}
