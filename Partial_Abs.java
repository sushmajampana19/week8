import java.util.Scanner;
abstract class shape{
    abstract void area();
    void display(){}
}     
class circle extends shape{
    float r;
    circle(float n){
        r=n;
    }
    void area(){
        System.out.println(3.14*r*r);
    }
}
class rectangle extends shape{
    float l,b;
    rectangle(float n1,float n2){
        l=n1;
        b=n2;
    }
    void area(){
        System.out.println(l*b);
    }
}class Partial_Abs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length and breadth of a rectangle : ");
        float n,n1,n2;
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        rectangle y = new rectangle(n1,n2);
        System.out.print("area of rectangle : ");
        y.area();

        System.out.print("enter the radius of a circle : ");
        n=sc.nextFloat();
        circle x= new circle(n);
        System.out.print("area of circle : ");
        x.area();
        sc.close();
    }
}
