package ex_10_OOPs;

public class OOPsPractices2 {
    public static void main(String[] args) {

        Code c1 = new Code();
        System.out.println(c1.name);

        Code t1 = new Code("OOPs");
        System.out.println(t1.topic);

        Learning p1 = new Learning();

        Cartoon cr = new Cartoon();
    }
}

class Code{
    String name;
    String topic;

    Code() {
        name = "Java";
    }
       Code(String topic) {
            this.topic = topic;
        }
    }

class Learning{
  Learning(){
      System.out.println("Java");
  }

}
class Cartoon{
    Cartoon() {}

    Cartoon(String name){

    }

}