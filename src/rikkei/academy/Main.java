
package rikkei.academy;

//Tạo lớp
public class Main {
    public static void main(String[] args) {

        //Tạo đối tượng Circle1
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.5);
        //Truy cập đến các phương thức getRadius() và getArea() và run thử lần 1
        System.out.println("Bán kính hình tròn của bạn là: "+ circle1.getRadius());
        System.out.println("Diện tích hình tròn của bạn là: " + circle1.getArea());
        System.out.println("Bán kính hình tròn của bạn là: "+ circle2.getRadius());
        System.out.println("Diện tích hình tròn của bạn là: " + circle2.getArea());
        //Sang class Circle và thục hiện thay đổi access modifier thành private cho các phương thức getRadius() và getArea(), sau đó run lần 2.
        //Kết quả sau kho chạy: máy báo lỗi ngay =))


    }
}