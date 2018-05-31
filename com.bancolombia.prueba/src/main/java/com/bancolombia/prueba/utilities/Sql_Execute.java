package com.bancolombia.prueba.utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bancolombia.prueba.utilities.DBManager;

public class Sql_Execute {

	DBManager manager = null;

	/** Creates a new instance of DAOResultSet */
	public Sql_Execute() {
		manager = DBManager.getInstance();		
	}

	public ResultSet sql_Execute(String Query) throws SQLException {
		manager = DBManager.getInstance();
		Connection con = manager.getConection();
		PreparedStatement ps = con.prepareStatement(Query);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}