package Soal1;

public class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public double area() {
        return 0.0;
    }

    public String toString() {
        return shapeName;
    }
}