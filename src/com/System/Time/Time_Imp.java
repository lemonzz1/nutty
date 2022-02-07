package com.System.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Imp {
	protected static String SYS_TIM(String TIME_TEX) {
		//project.logs("Time_Imp.SYS_TIM():获取时间时间格式:[" + TIME_TEX + "]");
		SimpleDateFormat formatter = new SimpleDateFormat(TIME_TEX);
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
}
