<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charest=EUC-KR" pageEncoding="euc-kr" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>기운팜팜_약사ver._회원가입</title>
</head>

<body>
    <table border="1">
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>opentime</th>
                <th>closetime</th>
                <th>약국이름</th>
                <th>주소</th>
                <th>사업자등록번호</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pharmacyList}" var="pharmacy">
                <tr>
                    <td>${pharmacy.pharm_id}</td>
                    <td>${pharmacy.pharm_pw}</td>
                    <td>${pharmacy.opentime}</td>
                    <td>${pharmacy.closetime}</td>
                    <td>${pharmacy.pharm_name}</td>
                    <td>${pharmacy.pharm_adr}</td>
                    <td>${pharmacy.regi_no}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>