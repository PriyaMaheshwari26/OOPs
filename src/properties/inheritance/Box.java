package properties.inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l=1;
        this.w=1;
        this.h=1;
    }
    Box (int side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(int l, int h, int w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
