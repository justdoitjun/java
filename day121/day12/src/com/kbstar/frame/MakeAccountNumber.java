package com.kbstar.frame;

import java.util.Calendar;

public class MakeAccountNumber {
	public static int cnt = 100;
	public static int cnt2 = 100;
	public static String makeTrNum() {
		String trNum = "";
		Calendar cal = Calendar.getInstance();
		trNum = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cal.get(Calendar.MILLISECOND)
		            + cnt2;
		cnt2++;
		return trNum;
	}
	public static String makeAccNum() {
		String accNum = "";
		Calendar cal = Calendar.getInstance();
		accNum = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cnt;
		cnt++;
		return accNum;
	}
}
