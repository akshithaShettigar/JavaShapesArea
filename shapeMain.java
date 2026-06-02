class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    double area() {
        return l * b;
    }
}

 class shapeMain {
    public static void main(String args[]) {

        Shape s1 = new Circle(5);
        System.out.println("Area of Circle = " + s1.area());

        Shape s2 = new Rectangle(5, 5);
        System.out.println("Area of Rectangle = " + s2.area());
    }
}