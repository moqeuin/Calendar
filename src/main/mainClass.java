package main;

import java.util.Calendar;

public class mainClass {

	public static void main(String[] args) {
		
		 Calendar cal = Calendar.getInstance();
		 // 2021년 6월 1일로 날짜를 준비.
		 cal.set(Calendar.YEAR, 2021);
		 cal.set(Calendar.MONTH, 7 -1 ); 
		 cal.set(Calendar.DATE, 1);
		 
		 int year = cal.get(Calendar.YEAR);
		 int month = cal.get(Calendar.MONTH);
		 // 현재날짜의 요일의 수
		 int weekFirstDay = cal.get(Calendar.DAY_OF_WEEK);
		 // 현재날짜의 월의 마지막 날
		 int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		 // 요일 입력 데이터, 일수출력 중 요일이 넘어가면 개행해주기 위한 변수.
		 int date = 1;
		 
		 // 달력 정보
		 System.out.println(year + "년  " + month + "월");
		 System.out.println("=====================================================");		 
		 String weekDay = "일월화수목금토";
		 for (int i = 0; i < weekDay.length(); i++) {
			 char c = weekDay.charAt(i);
			 System.out.print(c+"\t");
		 }		 
		 System.out.println();
		 System.out.println("=====================================================");
		 
		 
		 // 첫 번째 요일의 수(일 ~ 토 , 1 ~ 7)의 전까지 모두 빈 칸 취급을 해서 x을 채워넣는다.
		 for (int i = 1; i < weekFirstDay; i++) {
			System.out.print("x"+"\t");
		}
		 // 1부터 수를 채워넣는다.
		 for (int i = 0; i < lastDay; i++) {
			 System.out.print(date + "\t");
		 // weekFirstDay - 1는 빈 칸의 수이고 date는 증가한 일수이고 
		 // 두 수의 합이 토요일(7, 14, 21, 28, 35)을 넘어가면 개행해준다. 
			 if(( date + weekFirstDay - 1) % 7 == 0 ) {
				 System.out.println();
			 }	 
			 date++;
		}
		 // 첫 번째 요일의 수 (weekFirstDay)에서 마지막날(lastDay) 세고 자기자신(weekFirstDay) 뺀다.
		 // 그리고 7로 나눠 나머지 구하면  마지막날(lastDay)의 요일의 위치가 도출된다.
		 // 7을 빼주면 남은 채울 빈칸이 나오고 그 수 만큼 채워준다.
		 for (int i = 0; i <( 7 - (lastDay + weekFirstDay - 1) % 7); i++) {
			 System.out.print("x"+"\t");
		}		 
	}
}
