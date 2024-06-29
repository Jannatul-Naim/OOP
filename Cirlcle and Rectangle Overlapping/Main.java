import java.util.Scanner;
public class Main {
 public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Points[] rectangle = new Points[4];
        Distance[] d = new Distance[4];
        Distance objOfDistance = new Distance();

        for (int t = 0; t < 10; t++) {
            System.out.println("Enter the Circle center x: ");
            float x = sc.nextFloat();
            System.out.println("Enter the Circle center y: ");
            float y = sc.nextFloat();
            System.out.println("Enter the Circle radius: ");
            float r =(float) Math.sqrt(sc.nextDouble());
            Points circle = new Points(x, y, r);


            System.out.println("Enter the coordinates of the rectangle's 4 corners: ");
            for (int i = 0; i < 4; i++) {
                x = sc.nextFloat();
                y = sc.nextFloat();
                rectangle[i] = new Points(x, y);
                d[i] = new Distance(x, y, circle.getX(), circle.getY());
            }

            float minDistance1;
            float minDistance2;
            int index1;
            int index2;


            if (d[1].d > d[0].d) {
                index1 = 0;
                index2 = 1;
                minDistance1 = d[0].d;
                minDistance2 = d[1].d;
            } else {
                index1 = 1;
                index2 = 0;
                minDistance1 = d[1].d;
                minDistance2 = d[0].d;
            }
            for (int i = 2; i < 4; i++) {
                if (d[i].d < minDistance2) {
                    if (d[i].d < minDistance1) {
                        minDistance2 = minDistance1;
                        minDistance1 = d[i].d;

                        index2 = index1;
                        index1 = i;

                    } else {
                        minDistance2 = d[i].d;
                        index2 = i;
                    }
                }
            }

            objOfDistance.overlapCheck(rectangle[index1].getX(), rectangle[index1].getY(), rectangle[index2].getX(), rectangle[index2].getY(), circle.getRadius(), circle.getX(), circle.getY());

        }
    }
}