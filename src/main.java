public class main {
    public static void main(String[] args) {
        Circle cir = new Circle(5,"red");
        System.out.println("Diện tích của hình tròn là:"+cir.area());
        Cylinder cyl = new Cylinder(5,"blue",5);
        System.out.println("Thể tích của hình trụ là: "+cyl.theTich());
        System.out.println(cyl.toString());
    }
}
