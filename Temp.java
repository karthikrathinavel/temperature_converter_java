import java.util.Scanner;
public class Temp{
	public static void main(String[] args){
		float Farenheit, Celsius;
		Scanner in = new Scanner(System.in);
		System.out.println("1.Celsius to Farenheit");
		System.out.println("2.Farenheit to Celsius");
		System.out.println("Select 1 or 2:");
		int option = in.nextInt();
		if(option==1){
			System.out.println("Enter temperature in Celsius:");
			Celsius = in.nextInt();
			Farenheit = ((Celsius*9)/5)+32;
			System.out.println("Temperature in Farenheit: " + Farenheit);
		}
		else if(option==2){
			System.out.println("Enter temperature in Farenheit:");
			Farenheit = in.nextInt();
			Celsius = ((Farenheit-32)*5)/9;
			System.out.println("Temperature in Celsius: " + Celsius);
		}
		else{
			System.out.println("Enter valid input");
		}
	}
}