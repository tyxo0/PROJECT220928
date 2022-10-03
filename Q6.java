import java.util.Scanner;
class Circle_Q6{
    private double x, y;
    public int radius;
    public Circle_Q6(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show(){
        System.out.println("(" + x + "," + y + ")" + radius);
    }
    
}
public class Q6 {

    static int []max_radius = new int[2];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle_Q6 []c =  new Circle_Q6[3];

        for(int i =0; i<c.length; i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle_Q6(x, y, radius);
        }
        for(int i =0; i<c.length; i++){
            if(max_radius[1] < c[i].radius){
                max_radius[0] = i; // index 저장
                max_radius[1] = c[i].radius; //크기 최댓값 저장
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[max_radius[0]].show();
        scanner.close();
    }
}
