public class WIFIDiagnosis {import java.util.Scanner;

public void troubleShootWiFi()
{
Scanner sc = new Scanner(System.in);

//1st step
System.out.println("First step: reboot your computer");
System.out.print("can you connect with the wifi? (yes or no): ");
String choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("can you join the wifi connection? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your computer is working");
return;
}


System.out.println("Second step: reboot your router");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your router seemed to work");
return;
}

//3rd step
System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Checking the router's cables seemed to work");
return; }
