<html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<form action="add.action"  method="post">
    <table width="200dp" >
        <tr>学号：<input type="text" name="id"></tr></br>
        <tr>姓名：<input type="text" name="name"></tr></br>
        <tr>性别：<label><input type="radio" name="sex" value="男">男</label>
            <label><input type="radio" name="sex" value="女">女</label></tr></br>
        <tr>专业：<input type="text" name="major"></tr></br>
        <tr>出生日期：<input type="date" name="birth" ></tr></br>
        <tr>备注：<input type="text" name="remark"></tr></br></br>

        <input type="submit" value="提交"  />&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置"  />
    </table>


</form>

</body>
</html>
