public class Distance {
    float d;
    public Distance(float d) {
        this.d = d;
    }
    public Distance(){
    }

    public Distance(float x1, float y1, float x2, float y2){
        this.d = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public float getDistance(float x1, float y1, float x2, float y2) {
      return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public void overlappingCheck(float RectValue,  float CenterX,float r) {
        float dis = Math.abs(RectValue-CenterX);
        if(dis<r){
            System.out.println("Overlapping");

        } else if (dis== r) {
            System.out.println("Overlapped With Single Point");
        } else{
            System.out.println("Not Overlapping");
        }
    }
    public void overlappingCheck(float RectX, float RectY,float CenterX,float CenterY,float Radious) {
        float dis = getDistance(RectX,RectY,CenterX,CenterY);
        if(dis<Radious){
            System.out.println("Overlapping");
        }
        else if (dis== Radious) {
            System.out.println("Overlapped With Single Point");}
        else {
            System.out.println("Not Overlapping");
        }
    }
    private void formularCheck(float x1, float y1, float x2, float y2, float Radious,float circleX,float circleY) {
        if (x1 == x2) {
            if ((y1 >= y2) && (y1 >= circleY) && (y2 < circleY)) {
                overlappingCheck(x1, circleX, Radious);
            } else if ((y1 <= y2) && (y1 <= circleY) && (y2 > circleY)) {
                overlappingCheck(x1, circleX, Radious);
            } else {
                overlappingCheck(x1, y1, circleX, circleY, Radious);
            }
        } else {
            if((x1>x2)&&(x1>circleX)&&(x2<circleX)){
                overlappingCheck(y2,circleY, Radious);

            }
            else if ((x1<x2)&&(x1<circleX)&&(x2>circleX)) {
                overlappingCheck(y1,circleY, Radious);
            }
            else {
                overlappingCheck(x1,y1,circleX, circleY, Radious);
            }
        }

    }

    public void overlapCheck(float x1, float y1, float x2, float y2, float Radious,float circleX,float circleY){
        formularCheck(x1, y1, x2,y2,Radious,circleX,circleY);
    }

}
