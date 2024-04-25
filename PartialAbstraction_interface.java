import java.util.Scanner;
interface Area{
    void display_area();
}
class circle implements Area{
    float l;
    circle(float n){
        l=n;
    }
    public void display_area(){
        System.out.println(3.14*l*l);
    }
}
public class PartialAbstraction_interface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n;
        System.out.print("enter the radius of a circle : ");
        n=sc.nextFloat();
        circle x= new circle(n);
        System.out.print("area of circle : ");
        x.display_area();
        sc.close();
    }
}

