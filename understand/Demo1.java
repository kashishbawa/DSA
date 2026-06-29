public class Demo1 {

    static class Done{
        String name ;
          Done(){
            System.out.println("This is Parent ");
          }
          Done(int x){
            this();
            System.out.println("This is another");
          }
    }

    static class Demo extends Done{
    Demo() {
        super(2);
        System.out.println("A");
    }

    Demo(int x) {
        this();
        System.out.println("B");
        
    }

    Demo(String s) {
        this(10);
        System.out.println("C");
    }
}

    public static void main(String[] args) {
        Demo d = new Demo("Java");
    }
}