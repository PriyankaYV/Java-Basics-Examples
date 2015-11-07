import java.util.*;
	class Test{
	
		private static final int BEST_CASE = 1;
		private static final int AVERAGE_CASE = 2;
		private static final int WORST_CASE = 3;
		
		private static final int BUBBLE_SORT = 1;
		private static final int SELECTION_SORT = 2;
		private static final int INSERTION_SORT = 3;
		private static final int BENCHMRK_ALL= 4;
		private static final int START_OVER = 5;
		private static final int EXIT = 6;
		
		private static int[] array;
		
		public static void main(String[] args){
		
			Scanner sin = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size = sin.nextInt();
			System.out.println("choose complexity");
			System.out.println("1.BEST_CASE");
			System.out.println("2.AVERAGE_CASE");
			System.out.println("3.WORST_CASE");
			int complexity = sin.nextInt();
			
			switch(complexity){
				case BEST_CASE:
					array = Calculator.arrayNaturalNUmbers(size);
					System.out.println("The array of size" +array.length+"is created for Best_case scenario");
					break;
					
				case AVERAGE_CASE:
					array = Calculator.arrayRandomNumbers(size);
					System.out.println("The array of size" +array.length+"is created for Average_case scenario");
					break;
				
				case WORST_CASE:
					array = Calculator.arrayDecendingNumbers(size);
					System.out.println("The array of size" +array.length+"is created for Worst_case scenario");
					break;
					
				default:
					System.out.println("Wrong choice..!!");
					System.exit(0);
			}
			for(;;){
			
				System.out.println("choose Algorithm");
				System.out.println("1.BUBBLE_SORT");
				System.out.println("2.SELECTION_SORT");
				System.out.println("3.INSERTION_SORT");
				System.out.println("4.BENCHMRK_ALL");
				System.out.println("5.START_OVER");
				System.out.println("6.EXIT");
				
				int algorithm = sin.nextInt();
				
				switch(algorithm){
				
					case BUBBLE_SORT:
							dobubblesort();
							break;
							
					case SELECTION_SORT:
							doSelectionSort();
							break;
						
					case INSERTION_SORT:
							doInsertionSort();
							break;
					
					case BENCHMRK_ALL:
					
					break;
					case START_OVER:
							dobubblesort();
							doSelectionSort();
							doInsertionSort();
							break;
					case EXIT:
							System.exit(0);
							
					default:
					System.out.println("wrong choice...!!");
				}
			}
		}
			
		public static void dobubblesort(){
			if(array != null){
				int[] clone = Arrays.copyOf(array,array.length);
					
				long start = System.currentTimeMillis();
				Calculator.bubbleSort(clone);
				long end = System.currentTimeMillis();
				System.out.println("Bubble sort completed in" +(end-start)+"milliseconds");
			}
			else{
				System.out.println("array not initialized");
			}
		}
		
		public static void doSelectionSort(){
			if(array!=null){
				int[] clone = Arrays.copyOf(array, array.length);
				
				long start = System.currentTimeMillis();
				Calculator.selectionSort(clone);
				long end = System.currentTimeMillis();
				System.out.println("Selection sort completed in" +(end-start)+"milliseconds");
			}
			else{
				System.out.println("array not initialized");
			}
		}
		
		public static void doInsertionSort(){
			if(array!=null){
				int[] clone = Arrays.copyOf(array, array.length);
				
				long start = System.currentTimeMillis();
				Calculator.insertionSort(clone);
				long end = System.currentTimeMillis();
				System.out.println("Insertion sort completed in"+(end-start)+"milliseconds");
			}
			else{
				System.out.println("array not initialized");
			}
		}
		
	}
	
		
		
	
				
				
				
		
		