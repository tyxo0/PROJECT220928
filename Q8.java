import java.util.Scanner;

class Phone{
    String name;
    String tel;
}
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num;
        System.out.print("인원수>>");
        num = sc.nextInt();
        Phone []phone = new Phone[num];
        for(int i =0; i<num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            phone[i] = new Phone();
            phone[i].name = sc.next();
            phone[i].tel = sc.next();
        }
        System.out.println("저장 되었습니다...");
        
        String inp ="";
        while(true){
            System.out.print("검색할 이름>>");
            inp = sc.next();
            if(inp.equals("그만"))
                break;
            for(int i =0; i<phone.length; i++){
                if(phone[i].name.equals(inp)){
                    System.out.println(phone[i].name + "의 전화번호는 " + phone[i].tel + " 입니다.");
                    break;
                }
                else if( i == phone.length -1)
                    System.out.println(inp + "이 없습니다.");
            }
        }
        sc.close();
    }
}
