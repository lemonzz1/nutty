# nutty
# nutty.jar
# 用法:
# 代替Scanner的方法
#  1.根据你要输入的内容接受返回值
#  2.Scanner.input.[数据类型(首字母大写)]();
#  3.Scanner类暂时不支持char
# log记录方法
#  1.Project.logs("内容");
#  2.log位置在[项目文件夹]/logs/*.log
#  3.记录格式:["本机名称"@"用户名"|"当前日期" "当前时间"]:打印内容
# FileCD.get_CD();获取项目路径
#  1.需要[String]接收返回值
#  2.FileCD.get_CD()会返回当前项目所在路径
#  3.形同功能方法名FileCD.get_CD_File()
# terminal.set_terminal();运行当前系统终端代码
# 1.请根据当前系统输入终端指令
# get_locat类，获取本机信息
#  get_locat.get_user();获取本机用户名
#   1.get_locat.get_user();会返回String值
#  get_locat.get_computer();获取本机名
#   2.get_locat.get_computer();会返回String值
# console.Print();
#  1.console.Print(int,String);有两个参数int,String
#   1.第1个参数int:1-4整数
#    1.数值1=System.out.print("Hello World!");
#    2.整数2=System.out.println("Hello World");
#    3.整数3=System.err.print("Error");
#    4.整数4=System.err.println("Error");
#    5.如果整数>4并<0会自动转回为整数2,或者你可以不输入int参数(反正只要不是1-4都会转换为整数2😂)
#   2.低2个参数String
#    1.String输入你想要的输出的字符串
#  2.另外，cont类跟console一样(就是变短了而已😶‍🌫️)
# Time.System_Time();
#  1.Time.System_Time("时间格式");只能输入时间格式不然会报错
#  2.时间格式，列如:yyyy-mm-dd hh:mm:ss
# TAC.integration();
#  1.TAC.integration("任意数组");可以吧你出入的任意输入转换集合到一个字符串上并返回
# SDT.STring_int();

# 1.SDT.String_int();会把你输入的字符串强转为int类型并返回,比如:a1b1c2,转换后:123(此功能还在开发中)
