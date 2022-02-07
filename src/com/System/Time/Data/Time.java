package com.System.Time.Data;

import com.System.Time.Time_Imp;
import com.System.print.List;

public class Time extends Time_Imp {
	public static String System_Time(String Time_Text) {
		//project.logs("Time.System_Time():获取时间:[" + SYS_TIM(Time_Text) + "]");
		return SYS_TIM(Time_Text);
	}

	public static String System_Time() {
		//project.logs("Time.System_Time():获取时间默认格式:[" + SYS_TIM(List.getHashMap(22)) + "]");
		return SYS_TIM(List.getHashMap(22));
	}
}
