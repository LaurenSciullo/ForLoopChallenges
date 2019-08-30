import java.util.Scanner;

public class ForLoopChallenges
	{


		public static void main(String[] args)
			{
				//printDonutsLove();
				//ascendingToDescending();
				multiplesOfFive(0);
				totalOfMultiples();
				//sumNumbersInRange();
				drawRectangleAsterisks();
				printUsingTens();

			}

		private static void printDonutsLove()
			{
				for (int i = 0; i < 5; i++)
					{
				System.out.println("I love doughnuts!");
					}
			}

		private static void ascendingToDescending()
			{
					
				for (int i = 1; i <= 5;i++)
					{
				System.out.println("Ascending: " + i);
					}
				for (int i = 5; i >=1; i--)
					{
						System.out.println("\nDescending: " + i);
					}
			}

		public static int multiplesOfFive(int sum)
			{
				for (int i = 5; i<=100; i++ )
					{
						if (i%5 == 0)
							{
								System.out.println(i);
							}
					}
				return 0;
			}

		public static int totalOfMultiples()
			{
				
			//int numbers = multiplesOfFive();
				int sum = 0;
				 
							//{
							//	sum+=numbers;
							//}
				System.out.println("The sum is " + multiplesOfFive(sum));
					
				return 0;
			}

		private static void sumNumbersInRange()
			{
				System.out.println("Enter your lowerbound: ");
				Scanner userInput = new Scanner(System.in);
				int lowerBound = userInput.nextInt(); 
				
				System.out.println("Enter your upperbound: ");
				int upperBound = userInput.nextInt();
				
				int q;
				int w; 
				for ( q = 1; q >= lowerBound; q++)
					{
						System.out.println(q);
					}
				for ( w = 1; w <= upperBound; w++)
					{
						System.out.println(w);
					}
				int sum = 0;
				sum = q + w;
				System.out.println("Your sum is: " + sum);
			}

		private static void drawRectangleAsterisks()
			{
				
				
			}

		private static void printUsingTens()
			{
				
				
			}

	}
