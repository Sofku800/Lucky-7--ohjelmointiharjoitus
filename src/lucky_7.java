import java.util.Random;
import java.util.Scanner;

//import java.util.Random;

public class lucky_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Random random = new Random();
		
		Scanner in = new Scanner(System.in);
		
		String vastaus;
		int money;
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		
		
//		System.out.println("Haluatko pelata Lucky7 peliä? (kyllä tai ei) ");
//		vastaus = in.nextLine();
		
		System.out.println("Syötä rahamäärä, jolla haluat pelata");
		String vastausRaha = in.nextLine();
		
		
        money = Integer.parseInt(vastausRaha);
            
		System.out.println("Rahaa " + money + "€");
		
		do {
			
		
		randomNumber1 = random.nextInt(10);
		randomNumber2 = random.nextInt(10);
		randomNumber3 = random.nextInt(10);
		
		
		
		
//		if (vastaus.equals("ei"))
//		{
//			break;
//		}
		
		

			money=(money-1);
			
			System.out.println();
			System.out.print(randomNumber1);
			System.out.print(randomNumber2);
			System.out.print(randomNumber3);
			System.out.println();
		
		
		
		if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7 ) 
		{
			System.out.println();
			System.out.println("Onneksi olkoon sinä voitit!");
		} 
		
		
		
		
		
		if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7 ) 
		{

			money = (money+7);
		}
		else if (randomNumber1 == 7 && randomNumber2 == 7 || randomNumber2 == 7 && randomNumber3 == 7 || randomNumber1 ==7 && randomNumber3 == 7) 
		{
			money = (money+5);
		}
		else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7 ) 
		{
			money = (money+3);
		}
		
		else 
		{
			System.out.println();
			System.out.println("Hävisit");
		}
		System.out.println("Rahaa: " + money + "€");
		
		System.out.println("Haluatko pelata uudestaan? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
		vastaus = in.nextLine();
//		
		
		if(vastaus.equals("e"))
		{
		 break;
		}

		if(money <= 0)
		{
			System.out.println("Rahat loppuivat");
			break;
		}
		
		
		
		
		
		}
		while (true);
		
		
		System.out.println("Kiitos pelaamisesta");

		}
	
		}

