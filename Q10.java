import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "monkey", "future", "hope"};
    public static String Kor2Eng(String word){
        for(int i =0; i<kor.length; i++){
            if(kor[i].equals(word))
                return eng[i];    
        }
        return null;
    }
}
public class Q10 {//DicApp
    public static void main(String[] args) {
        String inp;
        Scanner sc = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            inp = sc.nextLine();
            if(inp.equals("그만"))
                break;
            //if(Dictionary.Kor2Eng(inp).equals(null)) // null 값을 리턴해서 String의 메서드 사용하면 NullPointerException오류 발생
            if(Dictionary.Kor2Eng(inp) == null) //null 값을 리턴하면 == 사용
                System.out.println(inp + "는 저의 사전에 없습니다.");
            else
                System.out.println(inp + "는 " + Dictionary.Kor2Eng(inp));
        }
        sc.close();
    }
}
