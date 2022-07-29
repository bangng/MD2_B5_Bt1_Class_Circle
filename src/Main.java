public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle = new Circle(7);
        Circle circle2 = new Circle(9,"white");
        System.out.println("bán kính lúc trước khi gán: " +circle1.getRadius());
        System.out.println("diện tích lúc trước khi gán: " +circle1.getArea());
        System.out.println("bán kính lúc sau khi gán: " +circle.getRadius());
        System.out.println("diện tích lúc sau khi gán: " +circle.getArea());
        System.out.println("thông số hình tròn 3: " +circle2.getRadius() +" " +circle2.getArea() + " " +circle2.getColor() );
    }
}
