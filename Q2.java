import java.util.Scanner;
class Grade{
    int sub_0, sub_1, sub_2;
    
    public Grade(int inp_0, int inp_1, int inp_2){
        sub_0=inp_0;
        sub_1=inp_1;
        sub_2=inp_2;
   };
   
   public int average(){
       return (sub_0 + sub_1 + sub_2)/3;
   }
}  
public class Q2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = sc.nextInt();
        int science =sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());
        sc.close();
    } 
}
