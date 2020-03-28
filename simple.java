import java.util.*;
class Sample
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
String word=scanner.nextLine();
for(int i=word.length()-1;i>=0;i--)
{
System.out.print(word.charAt(i));
}
System.out.println("Your statement is successfull reversed");
}
}