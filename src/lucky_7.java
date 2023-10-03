import java.util.Random;
import java.util.Scanner;

//import java.util.Random;

public class lucky_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Random random = new Random();
		int money;
		money = 5;
		
		do {
			
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		
		randomNumber1 = random.nextInt(10);
		randomNumber2 = random.nextInt(10);
		randomNumber3 = random.nextInt(10);
		
		
		
		Scanner in = new Scanner(System.in);
		String vastaus;
		
		
		
		System.out.println("Haluatko pelata Lucky7 peliä? (kyllä tai ei) ");
		System.out.println("Rahaa " + money + "€");
		
		vastaus = in.nextLine();
		
		
		if (vastaus.equals("ei"))
		{
			break;
		}
		
		
		
		if (vastaus.equals("kyllä")) 
		{ 
			money=(money-1);
			
			System.out.println();
			System.out.print(randomNumber1);
			System.out.print(randomNumber2);
			System.out.print(randomNumber3);
			System.out.println();
		}
		
		
		
		if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7 ) 
		{
			System.out.println();
			System.out.println("Onneksi olkoon sinä voitit!");
		}
		
		
		
		if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7 ) 
		{
//			System.out.println("Rahaa" + (money+7) + "€");
			money = (money+7);
		}
		if (randomNumber1 == 7 && randomNumber2 == 7 || randomNumber2 == 7 && randomNumber3 == 7) 
		{
			money = (money+5);
		}
		if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7 ) 
		{
			money = (money+3);
		}
		
		
		else 
		{
			System.out.println();
			System.out.println("Hävisit");
		}
		if(money <= 0) 
		{
			System.out.println("Rahat loppuivat");
			break;
		}
		
		System.out.println(money);
		
		}
		while (true);
		
		
		
		
		
		
		

		}
	
		}

