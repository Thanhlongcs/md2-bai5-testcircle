package rikkei.academy;

public class Circle {
    //public static void main(String[] args) {
        // Khởi tạo hai thuộc tính raius và color có access modifier là private
        // radius (double) có giá trị khởi tạo là 1.0,
        private double radius = 1.0;
        // color (String) có giá trị khởi tạo là "red".
        private String color = "red";


        //Viết 2 constructor: một không có tham số và một có tham số là radius.
    public Circle() {
        }

    public Circle(double radius) {
            this.radius = radius;
        }

        //Viết 2 phương thức getRadius và getArea, có access modifier là public, kiểu dữ liệu trả về double
        public double getRadius(){
            return this.radius;
        }

        public double getArea(){
            return this.radius*this.radius*Math.PI;
        }
    }


//}