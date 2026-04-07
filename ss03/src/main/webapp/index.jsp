<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Danh sach nhan vien" %>
</h1>
<br/>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <c:forEach var="item" items="${employees}">

        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.department}</td>
            <td>${item.salary}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>