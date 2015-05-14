import java.util.Scanner;
public class mailServer
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean finished = false;
boolean validSender = false;
boolean validRecipient = false;
String sender = "";
String recipient = "";

System.out.println("Welcome to My Mail Server!");
while (!finished) {
	System.out.print(">>> ");
	String str = System.console().readLine();
	
	if (str.equals("QUIT")) {
		finished = true;
	} else if (!validSender && str.length() > 10 && str.substring(0, 11).equals("MAIL FROM: ")) {
		sender = str.substring(11, str.length());
		int at = 0;
		for (int i = 1; i < sender.length() - 1; i++) {
			if (sender.charAt(i) == '@') {
				at += 1;
			}
		}
		if (at == 1) {
			validSender = true;
			System.out.println("OK");
		} else {
			System.out.println("Invalid email address");
		}
	} else if (validSender && !validRecipient && str.length() > 8 && str.substring(0, 9).equals("RCPT TO: ")) {
		recipient = str.substring(9, str.length());
		int at = 0;
		for (int i = 1; i < recipient.length() - 1; i++) {
 			if (recipient.charAt(i) == '@') {
 				at += 1;
			}
		}
		if (at == 1) {
			validRecipient = true;
			System.out.println("OK");
		} else {
			System.out.println("Invalid email address");
		}
	} else if (validRecipient && str.equals("DATA")) {
		boolean bodyFinished = false;
		str = "";
		String line = "";
		while (!bodyFinished) {
			line = System.console().readLine();
			if (line.equals(".")) {
				bodyFinished = true;
			} else {
				str = str + line + '\n';
			}
		}
		System.out.println("Sending email...");
		System.out.println("from: " + sender);
		System.out.println("to: " + recipient);
		System.out.print(str);
		System.out.println("...done!");
	} else {
		System.out.println("Invalid command.");
	}
}
System.out.println("Bye!");

}}

