import java.util.Scanner;
public class BlackJack {

	public static void main(String[] args) {
		System.out.println("Welcome to BlackJack game");
		Scanner input = new Scanner(System.in);
		String playerchose;
		String replay= "yes";
		boolean check = true;
		boolean checkwin=false;
		while( replay.toLowerCase().equals("yes"))
		{
			twocard dealer = new twocard();
			twocard player = new twocard();
			dealer.drawcard();
			player.drawcard();
			System.out.println("Dealer draws 2 cards.");
			System.out.println("Player draws 2 cards.");
			if(( dealer.getvalue()== 21)&&(player.getvalue()==21))
			{
				System.out.println("Both Dealer and Player have BlackJack, Ties!!\n");
				checkwin=true;
			}
			while((check==true)&&(checkwin!=true))
			{
			System.out.println("Your value is "+ player.getvalue());
			System.out.println("Do Player want to Stand or Hit??(Stand/Hit):");
			playerchose = input.next();
			if( playerchose.toLowerCase().equals("stand"))
			{
				System.out.println(" Player Stands.");
				break;
			}
			else if(playerchose.toLowerCase().equals("hit"))
			{
				System.out.println("Player hits.");
				player.addcard();
				System.out.println("Player draws 1 card.");
				if(player.getvalue()>21)
				{
					System.out.println("Player value is "+ player.getvalue());
					System.out.println("Player value is over 21. You lose !!\n");
					System.out.println("Dealer value is "+dealer.getvalue());
					check = false;
					checkwin=true;
					
				}
			}
			}
			while(( dealer.getvalue()<=16)&&(checkwin!=true))
			{
				dealer.addcard();
				System.out.println("Dealer draws 1 card.");
				if(dealer.getvalue()>21)
				{
					System.out.println("Dealer value is "+ dealer.getvalue());
					System.out.println("Dealer value is over 21. You Win !!\n");
					System.out.println("Player value is "+ player.getvalue());
					checkwin=true;
				}
			}
			while(checkwin !=true)
			{
			System.out.println("Player Value is "+ player.getvalue());
			System.out.println("Dealer value is "+ dealer.getvalue());
			if(dealer.getvalue() == player.getvalue())
				System.out.println("It's a tie!!\n");
			else if(dealer.getvalue() > player.getvalue())
				System.out.println("Dealer wins!!\n");
			else if(dealer.getvalue() < player.getvalue())
				System.out.println("Player wins!!\n");
			checkwin = true;
			}
			checkwin=false;
			System.out.println("Do you want to play again??(yes/no)");
			replay=input.next();
			

	}

}
}
