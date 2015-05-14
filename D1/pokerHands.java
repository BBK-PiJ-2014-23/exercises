import java.util.Scanner;
public class pokerHands
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int numCards = 0;
int r1 = 0;
int r2 = 0;
int r3 = 0;
int r4 = 0;
int r5 = 0;
int s1 = 0;
int s2 = 0;
int s3 = 0;
int s4 = 0;
int s5 = 0;
int lowest = r1;
int lowest2nd = r2;
int medium = r3;
int highest2nd = r4;
int highest = r5;
int tmp;
String result = "";

while (numCards < 5) {
	System.out.print("Enter Rank: ");
	String r = System.console().readLine();
	System.out.print("Enter Suit: ");
	String s = System.console().readLine();
	
	int rValue = 0;
	int sValue = 0;
	boolean rCorrect = true;
	boolean sCorrect = true;
	
	if (r.equals("1") || r.equals("2") || r.equals("3") || r.equals("4") || r.equals("5") ||
		r.equals("6") || r.equals("7") || r.equals("8") || r.equals("9") || r.equals("10") ||
		r.equals("11")) {
		rValue = Integer.parseInt(r);
	} else if (r.equals("J")) {
		rValue = 11;
	} else if (r.equals("Q")) {
		rValue = 12;
	} else if (r.equals("K")) {
		rValue = 13;				
	} else {
		rCorrect = false;
	}
	if (numCards == 0) {
		r1 = rValue;
		lowest = rValue;
	} else if (numCards == 1) {
		r2 = rValue;
		lowest2nd = rValue;
	} else if (numCards == 2) {
		r3 = rValue;
		medium = rValue;
	} else if (numCards == 3) {
		r4 = rValue;
		highest2nd = rValue;
	} else {
		r5 = rValue;
		highest = rValue;
	}
	
	if (s.equals("spades") || s.equals("hearts") || s.equals("diamonds") || s.equals("clubs")) {
		if (s.equals("spades")) {
			sValue = 1;
		} else if (s.equals("hearts")) {
			sValue = 2;
		} else if (s.equals("diamonds")) {
			sValue = 3;
		} else {
			sValue = 4;
		}
	} else {
		sCorrect = false;
	}
	if (numCards == 0) {
		s1 = sValue;
	} else if (numCards == 1) {
		s2 = sValue;
	} else if (numCards == 2) {
		s3 = sValue;
	} else if (numCards == 3) {
		s4 = sValue;
	} else {
		s5 = sValue;
	}
	
	if (rCorrect && sCorrect) {
		numCards += 1;
	} else {
		System.out.println("Invalid input!");
	}		
}

// sort ranks
int loops = 0;
while (loops < 5) {
		if (lowest > lowest2nd) {
			tmp = lowest2nd;
			lowest2nd = lowest;
			lowest = tmp;
		}
		if (lowest2nd > medium) {
			tmp = medium;
			medium = lowest2nd;
			lowest2nd = tmp;
		}
		if (medium > highest2nd) {
			tmp = highest2nd;
			highest2nd = medium;
			medium = tmp;
		}
		if (highest2nd > highest) {
			tmp = highest;
			highest = highest2nd;
			highest2nd = tmp;
		}
	loops++;
}

// consecutive?
boolean consec = false;
if (lowest == lowest2nd - 1 && lowest2nd == medium - 1 && medium == highest2nd - 1 &&
	highest2nd == highest - 1) {
	consec = true;
}

// how many same rank?
int sameRank = 0;
if (lowest == lowest2nd) {
	sameRank = sameRank + 2;
}
if (lowest2nd == medium) {
	sameRank++;
}
if (medium == highest2nd) {
	sameRank++;
}
if (highest2nd == highest) {
	sameRank++;
}

// sort suits

lowest = s1;
lowest2nd = s2;
medium = s3;
highest2nd = s4;
highest = s5;

loops = 0;
while (loops < 5) {
		if (lowest > lowest2nd) {
			tmp = lowest2nd;
			lowest2nd = lowest;
			lowest = tmp;
		}
		if (lowest2nd > medium) {
			tmp = medium;
			medium = lowest2nd;
			lowest2nd = tmp;
		}
		if (medium > highest2nd) {
			tmp = highest2nd;
			highest2nd = medium;
			medium = tmp;
		}
		if (highest2nd > highest) {
			tmp = highest;
			highest = highest2nd;
			highest2nd = tmp;
		}
	loops++;
}
			
// same suits?
int sameSuits = 0;
if (s1 == s2 && s2 == s3 && s3 == s4 && s4 == s5) {
	sameSuits = 5;
} else if (s1 == s2 && s2 == s3 && s3 == s4 ||
		   s2 == s3 && s3 == s4 && s4 == s5) {
	sameSuits = 4;
} else if (s1 == s2 && s2 == s3 ||
		   s2 == s3 && s3 == s4 ||
		   s3 == s4 && s4 == s5) {
	sameSuits = 3;
} else if (s1 == s2 ||
		   s2 == s3 ||
		   s3 == s4 ||
		   s4 == s5) {
	sameSuits = 2;
}
	

// Result
if (sameSuits == 5 && consec) {
	result = "Straight flush";
} else if (sameRank == 4) {
	result = "Poker";
//} else if (
} else if (sameSuits == 5) {
	result = "Flush";
} else if (consec) {
	result = "Straight";
} else if (sameRank == 3) {
	result = "Three of a kind";
} else if (sameRank == 2) {
	result = "Two pairs";
}

	
System.out.print("Result: " + result);				
}}

