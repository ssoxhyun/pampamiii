<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <TITLE>약국 추가하기</TITLE>
</head>
<body>
<form name="inputBoard" id="inputBoard" method="post" action="/insert">
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
            <tr>
                <td><label for="pharm_id"></label><input type="text" id="pharm_id" name="pharm_id" /></td>
                <td><label for="pharm_pw"></label><input type="text" id="pharm_pw" name="pharm_pw" /></td>
                <td><label for="opentime"></label><input type="text" id="opentime" name="opentime" /></td>
                <td><label for="closetime"></label><input type="text" id="closetime" name="closetime" /></td>
                <td><label for="pharm_name"></label><input type="text" id="pharm_name" name="pharm_name" /></td>
                <td><label for="pharm_adr"></label><input type="text" id="pharm_adr" name="pharm_adr" /></td>
                <td><label for="regi_no"></label><input type="text" id="regi_no" name="regi_no" /></td>
            </tr>
        </tbody>
    </table>
    <input type="submit" name="추가하기" value="추가하기" id="insert" />
</form>
</body>
</html>