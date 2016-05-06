<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>

<style>
table, th, td {
    border: 2px grey solid;
    border-collapse: collapse;
}
th {
    background-color: lightgreen;
}
.title {
    width: 160px;
}
.writer {
    width: 80px;
}
</style>

</head>
<body>

<h1>Board Main Page</h1>


<table>
    <tr>
        <th>No.</th>
        <th class="title">Title</th>
        <th class="writer">Writer</th>
        <th>Date</th>
    </tr>
    <c:forEach var="b" items="${hospital}">
    <tr>
        <td>${b.title}</td>
        <td class="title">
            <a href="read?bno=${b.address}">${b.phone}</a>
        </td>
        <td class="writer">${b.latitude}</td>
        <td>${b.longitude}</td>
    </tr>
    </c:forEach>
</table>

</body>
</html>