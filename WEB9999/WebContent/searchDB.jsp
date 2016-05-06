<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Context-Type" content="text/html; charset = UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("title");

Connection conn = null;
Statement stmt = null;

try {
// 드라이버 연결
Class.forName("com.mysql.jdbc.Driver");
// jspdb는 DB명 
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","1234");

if(conn == null){
	throw new Exception("데이터베이스 연결 실패");
}
	// 연결된 상태를 stmt로
	stmt = conn.createStatement();
	
// DB에 들어있는 정보를 가져와서 rs객체로 저장(출력)
ResultSet rs = stmt.executeQuery("select * from hospital where title =  " + name + " ");

if(!rs.next()){
	out.println("해당하는 정보가 없습니다");
} else {
	rs.previous();
}

// 객체의 값이 있으면 TRUE
while(rs.next()){
	String title = rs.getString("title");
	String address = rs.getString("address");
	String latitude = rs.getString("latitude");
	String longitude = rs.getString("longitude");
	String phone = rs.getString("phone");
	
	out.println("<br> title : " + title + "address : " + address + "latitude" + latitude + 
			"longitude : " + longitude + "phone : " + phone);
}
}finally{
}


%>

</body>
</html>