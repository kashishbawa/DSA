public class day2 {
    static class Student{
           String name;
           int marks[]; 
           
           Student(String name, int marks[]){
                    this.name=name;
                    this.marks=marks;
           }

          double avg(){
            int sum=0;
            for(int i = 0 ;  i<marks.length;i++){
            sum = sum +marks[i];
            }
            double average = sum/marks.length;
             return average ;
          } 


        void display(){
            System.out.println("Student : " +name);
            double average = avg();
            if(average > 90){
                System.out.println("You scored Grade A");
            }
            else if (average >80){
                System.out.println("You scored Grade B");
            }
            else if (average >70){
                System.out.println("You scored Grade C");
            }
            else if (average>60){
                System.out.println("You scored Grade d");
            }
            else{
                System.out.println("Try next time ");
            }
        }
           
    }
    public static void main (String args[]){
            int ms1[]={85,69,78,58,89};
             Student s1 = new Student("Kashish",ms1);
             s1.avg();
             s1.display();
    }
}
