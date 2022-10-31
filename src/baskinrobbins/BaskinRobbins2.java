package baskinrobbins;

import java.util.Scanner;

public class BaskinRobbins2 extends BaskinRobbinsGame {
    
    static Scanner s = new Scanner(System.in);
 
    public static void main(String[] args) {
    	BaskinRobbinsGame brGame = new BaskinRobbinsGame();
        
        while(true)
        {
            System.out.println("==== Baskin Robbins31 게임 ====");
            System.out.println();
            System.out.println("1. 게임 시작");
            System.out.println("2. 게임 점수");
            System.out.println("3. 게임 종료");
            System.out.println("4. 다른 숫자로 게임 시작");
            System.out.print("\n> ");
            
            int menuSelect = s.nextInt();
            
            if(menuSelect == 1) {
            	brGame.realgame();
            } else if(menuSelect == 2) {
                System.out.println("\n=== SCORE ====\n");    
                System.out.println("Me Win: " + meWin);
                System.out.println("Com Win: " + comWin);
                if (meWin == 0 && comWin == 0)
                    System.out.println("아직 게임을 시작하지 않으셨군요? 게임을 먼저 해보세요!");
                System.out.println();
            } else if(menuSelect == 3) {
                System.out.println("\nThank you for playing!");
                System.exit(0);
            }else if(menuSelect == 4) {
            	System.out.println("어떤 숫자로 게임을 하실껀가요?");
            	playnumber = s.nextInt();
            	brGame.baskingame();
            }
            else {
                System.out.println("Enter correct number please! (1~4)\n");
            }                        
        }
    }
}
