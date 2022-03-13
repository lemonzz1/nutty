package com.help.console.code;

import com.System.print.cont;
import com.set.log;

public class help {

	public static class HelloHelp {
		public static void HelpServiceClass(HelpService helpService) {
			switch (helpService) {
				case help -> {
					cont.print(2, "帮助请查看:" + log.jarUrl);
				}
				case Text -> {
					cont.print(2, "包名称:\t\t" + log.jarName);
					cont.print(2, "包版本:\t\t" + log.jarVersion);
					cont.print(2, "包作者:\t\t" + log.jarAuthor);
					cont.print(2, log.jarAuthor + "联系方式:\t\t" + log.jarEmail);
					cont.print(2, "包网站:\t\t" + log.jarUrl);
					cont.print(2, "main位置:\t\t" + log.jarMainFile);
				}
				case thanks -> {
					cont.print(2, "鸣谢");
					cont.print(2, "nutty开发团队");
					cont.print(2, "团队:Lemon,ZsepecisIC");
					cont.print(2, "再此感谢ZsepecisIC为nutty作出的贡献");
				}
			}
		}

		public static void help() {
			HelpServiceClass(HelpService.help);
		}

		public static void Text() {
			HelpServiceClass(HelpService.Text);
		}

		public static void thanks() {
			HelpServiceClass(HelpService.thanks);
		}

		enum HelpService {
			help, Text, thanks
		}

	}

}
