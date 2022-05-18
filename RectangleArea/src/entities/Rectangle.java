package entities;

public class Rectangle {

    public double width, height;

    public double Area() {

        return width * height;

    }

    public double Perimeter() {

        return (width * 2) + (height * 2);

    }

    public double Diagonal() {

        return Math.hypot(width, height);

    }

    @Override
    public String toString() {
        return "AREA: " + String.format("%.2f", Area()) + "\n" +
                "PERIMETER: " + String.format("%.2f", Perimeter()) + "\n" +
                "DIAGONAL: " + String.format("%.2f", Diagonal());
    }
}
