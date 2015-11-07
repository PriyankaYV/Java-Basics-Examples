class Test{

		public static void main(String[] args){
		
			int result1 = Calculator.add(10,10);
			int result2 = Calculator.add(4,2);
			System.out.println("The sum of numbers is"+result1);
			System.out.println("The sum of numbers is"+result2);
		
			double result3 = Calculator.addDouble(1.1,100.5);
			double result4 = Calculator.addDouble(5.1,20.5);
			System.out.println("The sum double numbers is "+result3);
			System.out.println("the sum of doubke numbers is" +result4);
			
			double spd = Calculator.speed(350, 10);
			System.out.println("speed is" + spd);
			
			double areaa = Calculator.area(3.4);
			System.out.println("area of the circle is"+ areaa);
			 
			int factoril = Calculator.factorial(5);
			System.out.println("the factorial of num is"+ factoril);
			
			System.out.println(Calculator.isEven(9));
			
			
			System.out.println(Calculator.isOdd(9));
			
			System.out.println(Calculator.isPrime(9));
			
			System.out.println(Calculator.palindrome(1221));
			
			int arr[]=Calculator.fibonaci(20);
			for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			System.out.println();
				
			System.out.println(Calculator.isDivBySix(36));
			
			System.out.println(Calculator.timeInHours(3660));
			
			System.out.println(Calculator.noOfIntegers(1345));
			
			System.out.println(Calculator.repeatedTwice(123));
			
			System.out.println(Calculator.digitAtHundred(4567896));
			
			System.out.println(Calculator.requiredRunRate(326,49,210,33));
			
			System.out.println(Calculator.makeDecimal(4,8,1));
				
			System.out.println(Calculator.sumDigits(89));
			
			System.out.println(Calculator.andBooleans(true,true,true));
			
			System.out.println(Calculator.largerThanOne(200,100,300));
			
			System.out.println(Calculator.numberInAscending(2,4,5));
			
			System.out.println(Calculator.sumOfFourDigits(45672));
			
			System.out.println(Calculator.areaOfSquare(2,3,8,15));
			
			System.out.println(Calculator.mutipleTreeSevn(15));
			
			System.out.println(Calculator.largestOfThree(2,5,4));
			
			System.out.println(Calculator.daysInMonth(7));
			
			System.out.println(Calculator.lowerCase('A'));
			
			System.out.println(Calculator.upperCase('a'));
			
			System.out.println(Calculator.isigit('A'));
			
			System.out.println(Calculator.sameLastDigit(123453,123));
			
			System.out.println(Calculator.addThird(13,12,25));
			
			System.out.println(Calculator.lastThreeSum(123456));
			
			System.out.println(Calculator.lotteryReward(20));
			
			System.out.println(Calculator.reverseNum(123));
			
			System.out.println(Calculator.perfectNumber(23));
			
			//System.out.println(Calculator.blackJack(23, 24));
			
			
			
			
			
			
			
			
			
			
			
			
		}
}