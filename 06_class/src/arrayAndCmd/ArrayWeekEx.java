package arrayAndCmd;

import java.util.Calendar;

public class ArrayWeekEx {

	public static void main(String[] args) {
// 열거타입은 한정된 값인 열거상수 중 하나의 상수를 저장하는 타입  ex) week
		ArrayWeek today = null;

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH+1);
		System.out.println(month);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지의 숫자를 리턴

//		System.out.println(today);

		switch (week) {
		case 1:
			today = ArrayWeek.SUNDAY;
			break;
		case 2:
			today = ArrayWeek.MONDAY;
			break;
		case 3:
			today = ArrayWeek.TUESDAY;
			break;
		case 4:
			today = ArrayWeek.WEDNESDAY;
			break;
		case 5:
			today = ArrayWeek.THURSDAY;
			break;
		case 6:
			today = ArrayWeek.FRIDAY;
			break;
		case 7:
			today = ArrayWeek.SATURDAY;
			break;
		}
		System.out.println("오늘 요일: " + today);
		if (today == ArrayWeek.SUNDAY) {

			System.out.println("일요일에는 수영을 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}

//		int year =cal.get(Calendar.YEAR);
//		int month =cal.get(Calendar.MONTH);
//		int day =cal.get(Calendar.DAY_OF_MONTH);
//		int week =cal.get(Calendar.DAY_OF_WEEK);
//		int hour =cal.get(Calendar.HOUR);
//		int minute =cal.get(Calendar.MINUTE);
//		int second =cal.get(Calendar.SECOND);

	}

}
