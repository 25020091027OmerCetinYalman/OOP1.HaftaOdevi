
package pkg9.bolumodev;

public class TestRectangle {
    
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("1.Dikdortgenin genisligi : " + rectangle1.width);
        System.out.println("1.Dikdortgenin yuksekligi : " + rectangle1.height);
        System.out.println("1.Dikdortgenin alani : " + rectangle1.getArea());
        System.out.println("1.Dikdortgenin cevresi : " + rectangle1.getPerimeter());
        
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 3.5;
        rectangle2.height = 35.9;
        
        System.out.println("2.Dikdortgenin genisligi : " + rectangle2.width);
        System.out.println("2.Dikdortgenin yuksekligi : " + rectangle2.height);
        System.out.println("2.Dikdortgenin alani : " + rectangle2.getArea());
        System.out.println("2.Dikdortgenin cevresi : " + rectangle2.getPerimeter());
               
        }
    
    }
    
class Rectangle{
    double width = 1;
    double height = 1;
    
    Rectangle(){
        width = 1;
        height = 1;
    }
    
    Rectangle(double yeniwidth, double yeniheight){
        width = yeniwidth;
        height = yeniheight;
        
    }
    
    double getArea(){
        return width * height;
    }
    
    double getPerimeter(){
        return 2 * (width + height);
    }
    
}