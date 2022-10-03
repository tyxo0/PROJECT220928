class Rectangle_Q4{
    int x, y, width, height;

    public Rectangle_Q4(int inp1, int inp2, int inp3, int inp4){
        x = inp1;
        y = inp2;
        width = inp3;
        height = inp4;
    }
    public int square(){
        return width * height;
    }
    public void show(){
        System.out.println("(" + x +"," + y +")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    public boolean contains(Rectangle_Q4 r){
        if((x + width > r.x + r.width) && (y + height > r.y +  r.height))
            return true;
        else return false;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Rectangle_Q4 r = new Rectangle_Q4(2, 2, 8, 7);
        Rectangle_Q4 s = new Rectangle_Q4(5, 5, 6, 6);
        Rectangle_Q4 t = new Rectangle_Q4(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t은 s를 포함합니다.");
    }
}
