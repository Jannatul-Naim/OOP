import java.awt.*;
import java.util.Scanner;
public class Create_shapes {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Circlecernter x : ");
        int x = sc.nextInt();
        System.out.print("Enter first Circlecernter y : ");
        int y = sc.nextInt();
        System.out.print("Enter first Circle Radius : ");
        int radius = sc.nextInt();
        point Circle1 = new point(x,y,radius);

        System.out.print("Enter second Circlecernter x : ");
        x = sc.nextInt();
        System.out.print("Enter second Circlecernter y : ");
        y = sc.nextInt();
        System.out.print("Enter second Circle Radius : ");
        radius = sc.nextInt();
        point Circle2 = new point(x,y,radius);

        Overlap overlap = new Overlap();
        if(overlap.FindOverlap(Circle1,Circle2))
            System.out.println("Overlap Ase Bro");
        else
            System.out.println("Nai ");








    }
}
