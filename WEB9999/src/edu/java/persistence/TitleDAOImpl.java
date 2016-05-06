package edu.java.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import edu.java.nine.ConnectionManager;
import edu.java.sql.MySqlStatements;
import edu.java.title.TitleVO;



public class TitleDAOImpl implements TitleDAO {
	
	private static TitleDAOImpl instance = null;
	private TitleDAOImpl() {}
	public static TitleDAOImpl getInstance() {
		if (instance == null) {
			instance = new TitleDAOImpl();
		}
		
		return instance;
	}
	
	@Override
	public ArrayList<TitleVO> select() {
		ArrayList<TitleVO> list = new ArrayList<>();
		Connection conn = ConnectionManager.getConnection();
		String sql = "SELECT * FROM hospital ORDER BY title DESC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(MySqlStatements.SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String title = rs.getString("title");
				String address = rs.getString("address");
				String latitude = rs.getString("latitude");
				String longitude = rs.getString("longitude");
				String phone =  rs.getString("phone");
				
				TitleVO vo = new TitleVO(title, address, latitude, longitude, phone);

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn, pstmt, rs);
		}
		
		return list;
	} // end select()
	
	@Override
	public int insert(TitleVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(TitleVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
