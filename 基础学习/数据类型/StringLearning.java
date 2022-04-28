public class StringLearning {
    public static void main(String args[]){
        String s1=new String("java");
        String s2=new String("java");
//        s1.replace('j','a');
//        System.out.println(s1);
        if(s1==s2){
            System.out.println("s1==s2");
        }else{
            System.out.println("s1!=s2");
        }
        if(s1.equals(s2)){
            System.out.println("s1.equals(s2)");
        }else{
            System.out.println("s1 not equals to s2");
        }
        System.out.println("------------------------");


        String s3="java";
        String s4="java";
        if(s3==s4){
            System.out.println("s3==s4");
        }else{
            System.out.println("s3!=s4");
        }
        if(s3.equals(s4)){
            System.out.println("s3.equals(s4)");
        }else{
            System.out.println("s3 not equals to s4");
        }
    }
}
