package Assignment6.TvPerson;

public interface Age {
    int month=3;
    String ageInformation();
}

class TV implements Age{
    public String ageInformation(){
        return "这台电视机的年龄是5岁"+month+"个月";
    }
}

class Person implements Age{
    public String ageInformation(){
        return "这个人的年龄是20岁"+month+"个月";
    }
}
