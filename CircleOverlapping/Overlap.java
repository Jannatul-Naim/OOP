public class Overlap {
    public boolean FindOverlap(point p1, point p2) {

    float sumOfRadius= p2.getR()+p1.getR();
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        Overlap overlap = new Overlap();

        float distanceOfCircles= overlap.GetDistance(x1,y1,x2,y2);

        if(distanceOfCircles<sumOfRadius)
            return true;
        else
            return false;
    }

    public static float GetDistance(int x1, int y1, int x2, int y2) {
        return (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}

