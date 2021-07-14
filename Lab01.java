package training;
import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		//Q1 SIMPLE INTEREST
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount: ");
		float p = sc.nextFloat();
		
		System.out.println("Enter the rate of interest: ");
		float r = sc.nextFloat(); 
		
		System.out.println("Enter time: ");
		float t = sc.nextFloat();
		
		simpleInterest(p,r,t);
		
		//Q2 SWAP TWO NUMBERS
		System.out.println("Enter the number 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the number 2: ");
		int n2 = sc.nextInt();
		
		swapNumbers(n1,n2);
		
		//Q3 ODD OR EVEN
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		oddEven(n);
		
		//Q4 SEPERATE WHOLE AND DECIMAL NUMBERS
		System.out.println("Enter the number: ");
		double doub = sc.nextDouble();
		
		seperateDouble(doub);
		
		//Q5 EXPRESSION
		int a=2, b=2, c=1, d=3, e=10;
		System.out.println(a+b-c*d/e);
		
		//Q6 DISPLAY BINARY NUMBER
		System.out.println("Enter the decimal number: ");
		int dec = sc.nextInt();
		System.out.println (decimalToBinary(dec));
		
		//Q7 BINARY TO DECIAML
		System.out.println("Enter the decimal number: ");
		int bin = sc.nextInt();
		System.out.println (binaryToDeciaml(bin));
		
		//Q8 LCM
		System.out.println("Enter how many numbers to find LCM: ");
		int N = sc.nextInt();
		int[] lcm= new int[N];
		System.out.println("Enter the numbers: ");
		for (int i=0;i<N;i++) {
			lcm[i]=sc.nextInt(); 
		}
		System.out.println (getLcm(lcm,N));
		
		//Q9 TO FIND POWER
		System.out.println("Enter the base:");
		int base = sc.nextInt();
		
		System.out.println("Enter the power:");
		int power = sc.nextInt();
		getPower(base,power);
		
		//Q10 TO CHECK IF A STRING IS PALINDROME OR NOT
		System.out.println("Enter the string:");
		String word = sc.toString();
		checkPalindrome(word);
		 
		
	}
	
		private static char[] getLcm(int[] lcm, int n) {
		// TODO Auto-generated method stub
		return null;
	}

		public static void simpleInterest(float p,float r,float t) 
		{
		    float si=(p*r*t)/100;
		    System.out.println("Simple interest :" + si);
		}
		
		public static void swapNumbers(int n1, int n2) {
			int temp;
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("swapped number1 and number2 are:"+ n1 + n2);
		}
		public static void oddEven(int number){
			String res = (number%2==0)? "even": "odd";
			System.out.println("The number is:"+ res);
		}
		public static void seperateDouble(double num) {
			int wholeNumber=(int)num;
		    double deciNumber=(10 * num - 10 * wholeNumber)/10;
			System.out.println("Interger part is:"+ wholeNumber);
			System.out.println("Decimal part is:"+ deciNumber);
		}
		public static int decimalToBinary(int deciNumber)
		{
			int BinNumber = 0;
		    int count = 0;
		    while (deciNumber != 0)
		    {
		        int rem = deciNumber % 2;
		        double c = Math.pow(10, count);
		        BinNumber += rem * c;
		        deciNumber /= 2;
		 
		        // Count used to store exponent value
		        count++;
		    }
		 
		    return BinNumber;
		}
		public static int binaryToDeciaml(int bin) {
			int decimal = 0;  
		    int n = 0;  
		    while(true){  
		      if(bin == 0){  
		        break;  
		      } else {  
		          int temp = bin%10;  
		          decimal += temp*Math.pow(2, n);  
		          bin = bin/10;  
		          n++;  
		       }  
		    }  
		    return decimal; 
		}
		public static int getLcm(int LCM,int n) {
			int count, result=1;
			for(count=0;count<n;count++) {
				//taking 2 numbers at a time
				result= lcmOfnumber(result,LCM[count]);
		}
		}
		//for finding lcm for 2 numbers
		public static int lcmOfnumber(int n1,int n2) {
			int gcd= gcdOfnumbers(n1,n2);
			return (n1 * n2)/gcd;
		}
		//for finding gcd of 2 numbers
		public static int gcdOfnumbers(int num1,int num2) {
			int ans=0;
			for (int i = 1; i <= num1 && i <= num2; i++) {
		        // check if i is a factor of both integers
		        if (num1 % i == 0 && num2 % i == 0)
		             ans=i;
		        return ans;
			}
		}
		public static void getPower(int b,int p) {
			int res = 0;
			for (int i=1;i<=p;i++) {
				res=res*b;
			}
			System.out.println("The result is:" + res);
		}
		public static void checkPalindrome(String str) {
			int i=1;
			int j= str.length()-1;
			if (str.charAt(i)!=str.charAt(j)) {
				boolean temp= false;
				System.out.println("Not a palindrome");
			}
			i++;
			j--;
			boolean temp=true;
			System.out.println((temp==true)?"Is a palindrome":"Not a palindrome");
		}
		
}

