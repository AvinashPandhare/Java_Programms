package testing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SImpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy_hh:mm:ss");
		String date1=date.format(new Date());
		
		System.out.println(date1);

	}

}
