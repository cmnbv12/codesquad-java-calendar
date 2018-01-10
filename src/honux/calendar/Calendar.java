package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private final int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int MaxDaysOfMonth(int month)
	{
		return Max_Days[month-1];
	}
	
	public void Print()
	{
		System.out.println("일  월  화  수  목  금  토\r\n" + 
				"--------------------\r\n" + 
				" 1  2  3  4  5  6  7\r\n" + 
				" 8  9 10 11 12 13 14\r\n" + 
				"15 16 17 18 19 20 21\r\n" + 
				"22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		cal.Print();
		
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.MaxDaysOfMonth(month));
		
		scanner.close();
		

	}

}
