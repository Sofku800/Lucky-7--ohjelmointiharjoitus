import java.util.Random;
import java.util.Scanner;

//import java.util.Random;

public class lucky_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Random random = new Random();
		
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		
		randomNumber1 = random.nextInt(10);
		randomNumber2 = random.nextInt(10);
		randomNumber3 = random.nextInt(10);
		
		Scanner in = new Scanner(System.in);
		String vastaus;
		
		
		do {
		System.out.println("Haluatko pelata Lucky7 peliä? (kyllä tai ei) ");
		vastaus = in.nextLine();
			
		
		
		if (vastaus.equals("kyllä")) 
		{ 
			System.out.print(randomNumber1);
			System.out.print(randomNumber2);
			System.out.print(randomNumber3);
		}
		
		if(vastaus.equals("ei")) 
		{
			break;
		}
		
		if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7 ) 
		{
			System.out.println();
			System.out.println("Onneksi olkoon sinä voitit!");
		}
		else 
		{
			System.out.println();
			System.out.println("Hävisit");
		}
		
		}
		while (true);
		
		
		
		
		
		

		}
	
		}

