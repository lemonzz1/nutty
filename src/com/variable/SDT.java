/*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 | Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.                   |
 | Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.    |
 | Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.                               |
 | Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. |
 | Vestibulum commodo. Ut rhoncus gravida arcu.                                                   |
 |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/

package com.variable;

public class SDT {
	public static int String_int(String text) {
		//String转换成char
		char[] charsInt = text.toCharArray();
		//用来缓存标记的char单位int
		int charInt;
		//转换的int结果
		int number = 0;
		//位标记
		int position = 1;
		for (int i = charsInt.length; i > 0; i--) {
			//char与int的相互转化，联想ASCII码，字符‘0’对应的值为48，所以不能直接加减,要扣除‘0’
			charInt = (charsInt[i - 1] - '0');
			//大于9就有问题了
			if (charInt > 9) {
				System.out.println("输入的不是数字。");
				return 0;
			}
			//叠加计算
			number += (position * charInt);
			//计算当前数字的位
			position *= 10;
		}
		//System.out.println("转换成功：" + number);
		return number;
	}
}
