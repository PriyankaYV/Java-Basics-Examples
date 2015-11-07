class Calculator{
	
	public static int[] arrayNaturalNUmbers(int size){
	
		int index = 0;
		int[] array = new int[size];
		for(int i=0;i<array.length;i++){
			array[index++]= i+1;
		}
		return array;
	}
	public static void printArray(int[] array){
	
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static double[] arrayRandomNumbers(int size){
		
		int index = 0;
		double[] array = new double[size];
		for(int i=0;i<array.length;i++){
			array[index++]= Math.random()*100;
		}
		return array;
	}
	public static void printdoubleArray(double[] array){
	
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static int summationOfArray(int[] array){
	
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum= sum + array[i];
		}
		return sum;
	}
	public static int[] evenNumbers(int from, int to){
	
		int index=0;
		int[] array = new int[(to-from)/2];
		for(int i=from;i<to;i++){
			if(i%2==0){
				array[index++]=i;
			}
		}
		return array;
	}
	public static int[] oddNumbers(int from, int to){
	
		int index=0;
		int[] array = new int[(to-from)/2];
		for(int i=from;i<to;i++){
			if(i%2!=0){
				array[index++]=i;
			}
		}
		return array;
	}
	public static void primeNumbers(int from, int to){
	
		for(int i=from;i<to;i++){
			int j;
			for(j=2;j<=i;j++){
				int n= i%j;
				if(n==0){
					break;
				}
			}
			if(i==j)
				System.out.print(i+" ");
		}
		System.out.println();
	}
	public static int[] fibinocci(int num){

		int[] fib = new int[num];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<num;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib;
	}
	public static char[] arrayRandomCharacters(int size){
		
		int index = 0;
		char[] array = new char[size];
		for(int i=0;i<array.length;i++){
			array[index++]=(char)(Math.random()*100);
		}
		return array;
	}
	public static void printcharArray(char[] array){
	
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public static int[] reverse(int[] array){
	
		int[] reversed= new int[array.length];
		for(int i=0;i<array.length;i++){
			reversed[i] = array[array.length-1-i];
		}
		return reversed;
	}
	
	
		
	
}
	
