import java.util.Scanner;

class SitLevel{
    public String name [];
    String sitName;
    public void init(){
        name = new String[10];
        for(int i =0; i<name.length; i++){
            name[i] = "---";
        }
    }
    public void show(){
        System.out.print(sitName +">> ");
        for(int i =0; i<name.length; i++){
            System.out.print(name[i] + " ");
        }
        System.out.println();
    }
    public void reserve(int i, String inpName){
        name[i] = inpName;
    }
    public void cancelRes(String inpName){
        for(int i =0; i<name.length; i++){
            if(name[i].equals(inpName)){
                name[i] = "---";        
                break;
            }
            else if(i == name.length -1)
                System.out.println("없는 이름입니다.");
        }
    }
}

public class Q12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        int inp =0;
        String inpStr;
        SitLevel sitLevel[] = new SitLevel[3];
        for(int i =0; i<sitLevel.length; i++){
            sitLevel[i] = new SitLevel();
            sitLevel[i].init();
        }
        sitLevel[0].sitName ="S";
        sitLevel[1].sitName ="A";
        sitLevel[2].sitName ="B";

        while(true)
        {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            inp = sc.nextInt();
            switch(inp){
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    inp = sc.nextInt() -1;
                    sitLevel[inp].show();
                    System.out.print("이름>>");
                    inpStr = sc.next();
                    System.out.print("번호>>");
                    int sitNum;
                    sitNum = sc.nextInt() -1;
                    sitLevel[inp].reserve(sitNum, inpStr);
                    break;
                case 2:
                    for(int i =0; i<sitLevel.length; i++)
                        sitLevel[i].show();
                    System.out.println("<<조회를 완료하였습니다.>>");
                    break;
                case 3:
                    System.out.print("좌석 S:1, A:2, B:3>>");
                    int inpNum = sc.nextInt() -1;
                    sitLevel[inpNum].show();
                    System.out.print("이름>>");
                    inpStr = sc.next();
                    sitLevel[inpNum].cancelRes(inpStr);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error");

            }
            if(inp == 4) break;
        }
        sc.close();
    }
}
