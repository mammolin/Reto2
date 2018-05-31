package com.bancolombia.prueba.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {

	private static DBManager instance;
	private String url;
	private String user;
	private String password;

	/** Creates a new instance of DBManager */
	private DBManager() {
		inicialice();
	}

	public void inicialice() {
		try {
			Properties prop = new Properties();
			//D:\Proyecto Capacitacion\com.choucair.proyecto\com.choucair.base
			prop.load(new FileReader("D:/Proyecto Capacitacion/com.choucair.proyecto/com.choucair.base/dbconfig.properties"));
			this.url = prop.getProperty("db.url");
			this.user = prop.getProperty("db.user");
			this.password = prop.getProperty("db.password");
			Class.forName(prop.getProperty("db.driver"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// aplicando Singleton
	public static DBManager getInstance() {
		if (instance == null)
			instance = new DBManager();
		return instance;
	}

	public Connection getConection() throws SQLException {
		Connection con = DriverManager.getConnection(this.url, this.user, this.password);
		return con;
	}

}