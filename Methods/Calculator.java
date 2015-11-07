class Calculator{
	
	public static int add(int num1, int num2){
		
		int sum = num1 + num2;
		return sum;
	}
	public static double addDouble(double num1, double num2){
		
		double sum = num1+num2;
		return sum;
	}
	public static double speed(double time, double distance){
	
		double speed = distance/time;
		return speed;
	}
	public static double area(double radius){
	
		double area = radius*radius*3.14;
		return area;
	}
	public static int factorial(int num){
	
		int fact = 1;
		for(int i=num;i>=2;i--){
			fact = fact*i;
		}
		return fact;
	}
	public static boolean isEven(int num){
	
		if(num%2 == 0)
		return true;
		else 
		return false;
	}
	
	public static boolean isOdd(int num){
		
		if(num%2 != 0)
		return true;
		else
		return false;
	}
	
	public static boolean isPrime(int num){
		
		for(int i=2;i<num/2;i++){
			if(num%i == 0)
			return true;
		}
			return false;
	}
	public static boolean palindrome(int num){
		
		int rev = 0, temp = num;
		while(num!= 0)
		{
		
			rev = rev*10+num%10;
			num = num/10;
		}
		if(rev == temp){
			return true;
		}
		else{
			return false;
		}
	}
	public static int[] fibonaci(int num){
	
		int[] fib= new int[num];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<num;i++){
		
			fib[i]=fib[i-1]+fib[i-2];
			
		}
		return fib;
		
	}
	public static boolean isDivBySix(int num){
	
		if(num%6 == 0)
		return true;
		else
		return false;
	}
	public static double timeInHours(double num){
		
		double hours=num/3600;
		return hours;
	}
	public static int noOfIntegers(int num){
	
		int count=0;
		while(num!=0){
			num=num/10;
			count++;
		}
		return count;
	}
	public static String repeatedTwice(int num){
		
		String str1=""+num;
		String str2=str1.concat(str1);
		return str2;
	}
	public static int digitAtHundred(int num){
	
		int num1 = num/100;
		int num2 = num1%10;
		return num2;
	}
	public static double requiredRunRate(int target, int maxOvers, int currentScore, int oversBowled){
		
		double remainingTarget = target-currentScore;
		double remainingOvers = maxOvers - oversBowled;
		double requiredrunrate = remainingTarget/remainingOvers;
		
		return requiredrunrate;
	}
	public static double makeDecimal(int num1,int num2,int num3){
	
		num1 = num1*100;
		num2 = num2*10;
		double sum = num1 + num2 + num3;
		double deci = sum/100;
		
		return deci;
	}
	public static int sumDigits(int num){
	
		int num1 = num%10;
		int num2 = num/10;
		
		int sum = num1+num2;
		
		return sum;
	}
	public static boolean andBooleans(boolean a,boolean b,boolean c){
		
		boolean result = a && b && c;
		return result;
	}
	public static boolean largerThanOne(int num, int num1, int num2){
	
		boolean result = (num>num1 || num>num2)?true:false;
		return result;
	}
	public static boolean numberInAscending(int num1, int num2, int num3){
	
		boolean result = (num1<num2 && num2<num3)?true:false;
		return result;
	}
	public static int sumOfFourDigits(int num){
	
		int num1 = num%10000;
		String str1 = ""+num1;
		int sum=0;
		
		for(int i=0;i<str1.length();i++){
			sum = sum + str1.charAt(i) - '0';
		}
		return sum;
	}
	public static double areaOfSquare(double x1,double y1,double x2,double y2){
		
		double xdiff = x1-x2;
		double xsqr = Math.pow(xdiff,2);
		double ydiff = y1-y2;
		double ysqr = Math.pow(ydiff,2);
		
		double d = Math.sqrt(xsqr+ysqr);
		double area = Math.pow(d,2)/2;
		
		return area;
	}
	public static boolean mutipleTreeSevn(int num){
	
		boolean d = (num%3==0 || num%7==0)?true:false;
		return d;
	}
	public static int largestOfThree(int num1, int num2, int num3){
	
		if(num1>num2 && num1>num3)
			return num1;
		else if(num2>num1 && num2>num3)
			return num2;
		else
			return num3;
	}
	public static int daysInMonth(int num){
	
		int days=0;
		switch(num){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
					days = 31;
					break;
			case 2:
					days = 28;
					break;
			case 4:
			case 6:
			case 9:
			case 11:
					days = 30;
					break;
			default: System.out.println("invalid month");
					break;
			}
			return days;
	}
	public static char lowerCase(char ch){
		
		char a = Character.toLowerCase(ch);
		return a;
	}
	
	public static char upperCase(char ch){
		
		char a = Character.toUpperCase(ch);
		return a;
	}
	public static boolean isigit(char ch){
	
		boolean a = Character.isDigit(ch);
		return a;
	}
	public static boolean sameLastDigit(int num1,int num2){
	
		num1 = num1%10;
		num2 = num2%10;
		if(num1==num2)
			return true;
		else
			return false;
	}
	public static boolean addThird(int num1,int num2,int num3){
	
		if(((num1+num2)==num3) ||((num2+num3)==num1)||((num1+num3)==num2))
		return true;
		else
		return false;
	}
	public static int lastThreeSum(int num){

		num = num%1000;
		String str =""+num;
		int sum = 0;
		
		for(int i=0;i<str.length();i++){
			sum = str.charAt(i) + sum - '0';
		}
		return sum;
	}
	public static int lotteryReward(int num){
		
		if(num%4==0 && num%7==0)
			return 20;
		else if(num%4==0)
			return 6;
		else if(num%7==0)
			return 10;
		else 
		return 0;
	}
	public static int reverseNum(int num){
		
		int rev = 0;
		while(num!=0){
			rev = rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	public static boolean perfectNumber(int num){
		
		int sum = 0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0)
				sum = sum+i;
		}
		if(num==sum)
		return true;
		else
		return false;
	}
	/*public static blackJack(int num1, int num2){
		
		if((num1!=0 && num2!=0))
			if(num1<=21 && num2<=21) 
				if(num1 != num2))
					if(num1>num2)
			          return num2;
					  else
					  return num1;
				else
					return -1;
			else 
				return -2;
		else 
			return 0;
	
	}*/
			
			
	
		
			
	
	
	
	
	
			
		
			
		
}
