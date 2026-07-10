public class TestCircle {
    private double radius = 1.0;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        TestCircle circle = new TestCircle();

        System.out.println("radius = " + circle.getRadius());
        System.out.println("area = " + circle.getArea());
        System.out.println("color: " + circle.getColor());
    }
}
