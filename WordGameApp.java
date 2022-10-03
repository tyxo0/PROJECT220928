import java.util.Scanner;
class Player{
    Scanner sc = new Scanner(System.in);
    public Player(String inpName){
        name = inpName;
    }; //생성자

    String name;
    String word;
    int lastIndex;
    char lastChar ='지';
    char firstChar;

    public void GetWordFromUser(){
        
        System.out.print(name + ">>");
        word = sc.nextLine();
        lastIndex = word.length() -1;
        lastChar = word.charAt(lastIndex);
        firstChar = word.charAt(0);
        
    }
    public boolean CheckSuccess(char previLast){
        
        if(previLast != firstChar){
            System.out.println(name+ "이 졌습니다.");
            sc.close();
            return false;
        }
        else return true;
    }
}
public class WordGameApp {
    Scanner sc = new Scanner(System.in);

    public WordGameApp(){}; //생성자

    int userNum =0;
    Player []player;

    public void run(int userNum){
        
        player = new Player[userNum];
        for(int i =0; i<userNum; i++){
            String tempName;
            System.out.print("참가자의 이름을 입력하세요>>");
            tempName = sc.nextLine();
            player[i] = new Player(tempName);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordGameApp game_0 = new WordGameApp(); // 게임 객체 생성
        
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇 명입니까>>");
        game_0.userNum = sc.nextInt();
        
        game_0.run(game_0.userNum);
        System.out.println("시작단어는 아버지입니다");
        
        int i =0;
        char previLast;
        do{
            if( i == game_0.userNum)
                i=0;
            if(i ==0)
                previLast =game_0.player[game_0.userNum-1].lastChar;
            else
                previLast = game_0.player[i-1].lastChar;
            
            game_0.player[i].GetWordFromUser();
            
        }while(game_0.player[i++].CheckSuccess(previLast));
        sc.close();
    }   
}
