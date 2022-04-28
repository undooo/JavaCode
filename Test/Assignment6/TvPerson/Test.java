package Assignment6.TvPerson;

public class Test {
    static void print(Age x){
        System.out.println(x.ageInformation());
    }
    public static void main(String s[]){
        Age thisTv=Factory.getInstance("TV");
        Age thisPerson=Factory.getInstance("Person");
        print(thisTv);
        print(thisPerson);
        return;
    }
}
