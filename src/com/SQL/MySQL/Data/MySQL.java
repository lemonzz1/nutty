package com.SQL.MySQL.Data;

import com.SQL.MySQL.SQL;
import com.System.print.List;
import com.System.print.cont;
import com.project.log.Project;

import java.sql.*;

import static com.System.print.console.Class_Print_logs;

//此类仅限于JDBC8.0
public class MySQL extends SQL {
	static {
		try {
			Class.forName(getDriver());
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(2));
			Class_Print_logs(2, List.getHashMap(2));
		} catch (ClassNotFoundException ignored) {
			//System.out.println("JDBC加载错误(JDBC loading error)");
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(1));
			Class_Print_logs(4, List.getHashMap(1));
		}
	}

	{
		try {
			Class.forName(getDriver());
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "()" + List.getHashMap(2));
			Class_Print_logs(2, List.getHashMap(2));
		} catch (ClassNotFoundException ignored) {
			//System.out.println("JDBC加载错误(JDBC loading error)");
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "()" + List.getHashMap(1));
			Class_Print_logs(4, List.getHashMap(1));
		}

	}

	public MySQL() {
		try {
			Class.forName(getDriver());
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(2));
			Class_Print_logs(2, List.getHashMap(2));
		} catch (ClassNotFoundException ignored) {
			//System.out.println("JDBC加载错误(JDBC loading error)");
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(1));
			Class_Print_logs(4, List.getHashMap(1));
		}

	}

	public MySQL(String url, String name, String password) {
		setUrl(url);
		setName(name);
		setPassword(password);
		Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "()" + ":写入Url[" + url + "]写入Name[" + name + "]写入password[]");
	}

	/*public Connection start_connection_start_con(String url,String name,String password)throws ClassNotFoundException,SQLException {
		Class.forName(getDriver());
		return DriverManager.getConnection(url,name,password);
	}*/

	private static void GET_CLASS_PEINR_SY(ResultSet RESULTS, int MySQL_i) throws SQLException {
		while (RESULTS.next()) {
			for (int get_MySQL_i = 1; get_MySQL_i <= MySQL_i; get_MySQL_i++) {
				//System.out.print(resultSet.getString(get_MySQL_i) + "\t\t");
				cont.print(1, RESULTS.getString(get_MySQL_i) + "\t\t");
			}
			//System.out.print("\n");
			cont.print(1, "\n");
		}
	}

	public static class set {

		protected static int MySQL_SQL_STATE(Connection connection, String SQL, Object... objects) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			int set_MySQL_SQL_STATE_int_i = 0;
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			if (objects != null) {
				for (int i = 0; i < objects.length; i++) {
					preparedStatement.setObject((i + 1), objects[i]);
				}
				set_MySQL_SQL_STATE_int_i = preparedStatement.executeUpdate();
			}
			preparedStatement.close();
			return set_MySQL_SQL_STATE_int_i;
		}

		protected static int MySQL_SQL_STATE(Connection connection, String SQL) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			int set_MySQL_SQL_STATE_int_i = 0;
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			return set_MySQL_SQL_STATE_int_i;
		}

		public static String MySQL_String(Connection connection, String SQL, Object... objects) throws ClassNotFoundException, SQLException {
			int i = MySQL_SQL_STATE(connection, SQL, objects);
			if (i > 0) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7));
				return List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7);
			} else {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7));
				return List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7);
			}
		}

		public static String MySQL_String(Connection connection, String SQL) throws ClassNotFoundException, SQLException {
			int i = MySQL_SQL_STATE(connection, SQL);
			if (i > 0) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7));
				return List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7);
			} else {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7));
				return List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7);
			}
		}

		public static int MySQL_int(Connection connection, String SQL, Object... objects) throws ClassNotFoundException, SQLException {
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():运行成功");
			return MySQL_SQL_STATE(connection, SQL, objects);
		}

		public static int MySQL_int(Connection connection, String SQL) throws ClassNotFoundException, SQLException {
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():运行成功");
			return MySQL_SQL_STATE(connection, SQL);
		}


		public static void Class_Print_logs(Connection connection, String SQL, Object... objects) throws ClassNotFoundException, SQLException {
			int i = MySQL_SQL_STATE(connection, SQL, objects);
			if (i > 0) {
				//System.out.println("执行成功\t[" + i + "]行受影响");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7));
				cont.print_logs(2, List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7));
			} else {
				//System.out.println("执行失败\t[" + i + "]行受影响");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7));
				cont.print_logs(2, List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7));
			}
		}


		public static void Class_Print_logs(Connection connection, String SQL) throws ClassNotFoundException, SQLException {
			int i = MySQL_SQL_STATE(connection, SQL);
			if (i > 0) {
				//System.out.println("执行成功\t[" + i + "]行受影响");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7));
				cont.print_logs(2, List.getHashMap(5) + "\t[" + i + "]" + List.getHashMap(7));
			} else {
				//System.out.println("执行失败\t[" + i + "]行受影响");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7));
				cont.print_logs(2, List.getHashMap(6) + "\t[" + i + "]" + List.getHashMap(7));
			}
		}

	}

	public static class link {

		public static void MySQL_Driver_Print() {
			try {
				Class.forName(getDriver());
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(2));
				Class_Print_logs(2, List.getHashMap(2));
			} catch (ClassNotFoundException ignored) {
				//System.out.println("JDBC加载错误(JDBC loading error)");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(1));
				Class_Print_logs(4, List.getHashMap(1));
			}
		}

		/**
		 * @param connection 测试connection值是否可用
		 * @return 直接输出
		 */
		public static void connection_print(Connection connection) {
			if (connection != null) {
				//System.out.println("链接成功!(Link successful!)");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(4));
				Class_Print_logs(2, List.getHashMap(4));
			} else {
				//System.out.println("链接失败!(Link failed!)");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(3));
				Class_Print_logs(2, List.getHashMap(3));
			}
		}

		/**
		 * @param connection 测试connection值是否可用
		 * @return String
		 */
		public static String connection_string(Connection connection) {
			if (connection != null) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(3));
				return List.getHashMap(3);
			} else {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(4));
				return List.getHashMap(4);
			}
		}

		/**
		 * @param connection 测试connection值是否可用
		 * @return boolean
		 */
		public static boolean connection_boolean(Connection connection) {
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "值:" + (connection != null));
			return connection != null;
		}

	}

	public static class get {


		public static void Class_Print_logs(Connection connection, String SQL) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			ResultSetMetaData resultSetMetaData = preparedStatement.getMetaData();
			ResultSet resultSet = preparedStatement.executeQuery();
			int getMySQL_i_int = resultSetMetaData.getColumnCount();
		/*while (resultSet.next()) {
			for (int get_MySQL_i = 1; get_MySQL_i <= getMySQL_i_int; get_MySQL_i++) {
				//System.out.print(resultSet.getString(get_MySQL_i) + "\t\t");
				Class_Print_logs(1, resultSet.getString(get_MySQL_i) + "\t\t");
			}
			//System.out.print("\n");
			Class_Print_logs(1, "\n");
		}*/
			GET_CLASS_PEINR_SY(resultSet, getMySQL_i_int);
			preparedStatement.close();
			resultSet.close();
			connection.close();
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
		}

		public static void Class_Print_logs(Connection connection, String SQL, Object... objects) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			for (int i = 0; i < objects.length; i++) {
				preparedStatement.setObject((i + 1), objects[i]);
			}
			ResultSetMetaData resultSetMetaData = preparedStatement.getMetaData();
			ResultSet resultSet = preparedStatement.executeQuery();
			int getMySQL_i_int = resultSetMetaData.getColumnCount();
		/*while (resultSet.next()) {
			for (int get_MySQL_i = 1; get_MySQL_i <= getMySQL_i_int; get_MySQL_i++) {
				//System.out.print(resultSet.getString(get_MySQL_i) + "\t\t");
				Class_Print_logs(1, resultSet.getString(get_MySQL_i) + "\t\t");
			}
			//System.out.print("\n");
			Class_Print_logs(1, "\n");
		}*/
			GET_CLASS_PEINR_SY(resultSet, getMySQL_i_int);
			preparedStatement.close();
			resultSet.close();
			connection.close();
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
		}

		public static ResultSet MySQL_ResultSet(Connection connection, String SQL) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
			return preparedStatement.executeQuery();

		}

		public static ResultSet MySQL_ResultSet(Connection connection, String SQL, Object... objects) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			for (int i = 0; i < objects.length; i++) {
				preparedStatement.setObject((i + 1), objects[i]);
			}
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
			return preparedStatement.executeQuery();
		}

		public static void Class_Print_logs(Connection connection, ResultSet resultSet) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			int get_MySQL_i_int = resultSetMetaData.getColumnCount();
		/*while (resultSet.next()) {
			for (int get_MySQL_i = 1; get_MySQL_i <= get_MySQL_i_int; get_MySQL_i++) {
				//System.out.print(resultSet.getString(get_MySQL_i) + "\t\t");
				Class_Print_logs(1, resultSet.getString(get_MySQL_i) + "\t\t");
			}
			//System.out.print("\n");
			Class_Print_logs(1, "\n");
		}*/

			GET_CLASS_PEINR_SY(resultSet, get_MySQL_i_int);
			resultSet.close();
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
		}

		public static void Class_Print_logs(ResultSet resultSet) throws ClassNotFoundException, SQLException {
			Class.forName(getDriver());
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			int get_MySQL_i_int = resultSetMetaData.getColumnCount();
		/*while (resultSet.next()) {
			for (int get_MySQL_i = 1; get_MySQL_i <= get_MySQL_i_int; get_MySQL_i++) {
				//System.out.print(resultSet.getString(get_MySQL_i) + "\t\t");
				Class_Print_logs(1, resultSet.getString(get_MySQL_i) + "\t\t");
			}
			//System.out.print("\n");
			Class_Print_logs(1, "\n");
		}*/
			GET_CLASS_PEINR_SY(resultSet, get_MySQL_i_int);
			resultSet.close();
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
		}

		//get set方法
		public static String Url_Name_Password_String(String password) {
			if (password.equals(getPassword())) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(11) + getUrl() + "]," + List.getHashMap(12) + ":[" + getName() + "]," + List.getHashMap(13) + ":[" + getPassword() + "]}");
				return List.getHashMap(11) + getUrl() + "]," + List.getHashMap(12) + ":[" + getName() + "]," + List.getHashMap(13) + ":[" + getPassword() + "]}";
			} else {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(10) + "!");
				return List.getHashMap(10) + "!";
			}
		}

		public static void Url_Name_Password_print(String password) {
			if (password.equals(getPassword())) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(11) + getUrl() + "]," + List.getHashMap(12) + ":[" + getName() + "]," + List.getHashMap(13) + ":[" + getPassword() + "]}");
				cont.print_logs(2, List.getHashMap(11) + ":{" + List.getHashMap(12) + ":[" + getUrl() + "]," + List.getHashMap(12) + ":[" + getName() + "]," + List.getHashMap(13) + ":[" + getPassword() + "]}");
			} else {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + List.getHashMap(10) + "!");
				cont.print_logs(4, List.getHashMap(10) + "!");
			}
		}

	}

	public static class start {

		//创建get_connection方法,以url,name,password作为参数实现链接MySQL的功能
		public static Connection connection_con(String url, String name, String password) throws ClassNotFoundException, SQLException {
			setUrl(url);
			setName(name);
			setPassword(password);
			SQL sql = new SQL();
			sql.setConnection(DriverManager.getConnection(url, name, password));
			Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "运行成功");
			return sql.getConnection();
		}

	}
}
