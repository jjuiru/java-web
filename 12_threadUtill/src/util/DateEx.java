package util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now= new Date();
		System.out.println(now);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분ss초");
		System.out.println(sdf.format(now));
		// 변수만 쓰면 해시코드 값이 나온다.
		
		//-------추천하는 방법
		LocalDateTime date= LocalDateTime.now();
		System.out.println(date);
		LocalDate date2= LocalDate.now();
		System.out.println(date2);
		LocalTime date3=LocalTime.now();
		System.out.println(date3);		
	}
}
