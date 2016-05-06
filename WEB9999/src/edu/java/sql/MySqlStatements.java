package edu.java.sql;

public interface MySqlStatements {
	
	public static final String HOSPITAL = "hospital";
	public static final String COL_TITLE = "title";
	public static final String COL_ADDRESS = "address";
	public static final String COL_LATITUDE = "latitude";
	public static final String COL_LONGITUDE = "longitude";
	public static final String COL_PHONE = "phone";
	
	public static final String SQL_SELECT_ALL = 
			"SELECT * FROM " + HOSPITAL + " ORDER BY " + COL_TITLE + " DESC";
	public static final String SQL_SELECT_BY_BNO = 
			"SELECT * FROM " + HOSPITAL + " WHERE " + COL_TITLE + " = ? ";
	public static final String SQL_INSERT = 
			"INSERT INTO " + HOSPITAL + "("
			+ COL_TITLE + ", "
			+ COL_ADDRESS + ", "
			+ COL_LATITUDE + ", "
			+ COL_LONGITUDE + ", "
			+ COL_PHONE + ") "
			+ " VALUES(?, ?, ?, ?, ?)";
}