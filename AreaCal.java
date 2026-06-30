// Build the Shape Area Calculator project (priority #1)

// Shape base class with area() returning 0
// Circle, Rectangle, Triangle extend it, override area()
// Array of Shape objects, sort by area using bubble sort
// Print results
public class AreaCal {
    
    
    
    
    
    public static class Shape{
        double area(){
            return 0 ; 
        }
    }
    public static class Circle extends Shape{
             double radius;
          Circle(double radius){
             this.radius=radius;    
        } 
        
        @Override
        double area(){
              return  3.14 * radius * radius;
              
        }
         
           
        }
    
     public static class  Rectangle extends Shape{
         
        double len;
    double bdh;

         Rectangle(double len, double bdh){
             this.len=len;    
             this.bdh=bdh;    
        } 
        
        @Override
        double area(){
             return len * bdh;
               
        }
    }

     public static class  Triangle extends Shape{

          double base;
    double height;

        Triangle(double base, double height){
             this.base=base;    
             this.height=height;    
        } 
        
        @Override
        double area(){
             return  0.5 * base * height;
              
        }
    }
    public static void main(String[] args) {
        Shape s1 = new Circle(21);
        
        Shape s2 = new Rectangle(5,25);
    
        Shape s3 = new Triangle(20,30);


         Shape arr[] ={s1,s2,s3};

         for(int i =0 ; i <arr.length ;i++){
            for(int j = 0; j< arr.length-1-i ;j++){
                if(arr[j].area() > arr[j+1].area()){
                    
                    Shape temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                    
                    
                }

            }
            
         }
       for(int i = 0; i<arr.length;i++){
        System.out.println(arr[i].area());
       }
    }
    
}
