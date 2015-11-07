class Test{

	public static void main(String[] args){
		
		Calculator.printArray(Calculator.arrayNaturalNUmbers(10));
		Calculator.printdoubleArray(Calculator.arrayRandomNumbers(10));
		int sumofarray = Calculator.summationOfArray(Calculator.arrayNaturalNUmbers(10));
		System.out.println(sumofarray);
		Calculator.printArray(Calculator.evenNumbers(10,26));
		Calculator.printArray(Calculator.oddNumbers(10,26));
		Calculator.primeNumbers(20,30);
		Calculator.printArray(Calculator.fibinocci(10));
		Calculator.printcharArray(Calculator.arrayRandomCharacters(10));
		Calculator.printArray(Calculator.reverse(Calculator.arrayNaturalNUmbers(10)));
		
	}
}