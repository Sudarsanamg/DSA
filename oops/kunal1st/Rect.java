package oops.kunal1st;

public class Rect {
    double length;
    double width;

    Rect() {
        length = 1.0;
        width = 1.0;
    }

    Rect(double len, double wid) {
        this.length = len;
        this.width = wid;
    }

    Rect(double side) {
        this.length = side;
        this.width = side;
    }

    public void calculate() {
        System.out.println(length*width);
    }

}
