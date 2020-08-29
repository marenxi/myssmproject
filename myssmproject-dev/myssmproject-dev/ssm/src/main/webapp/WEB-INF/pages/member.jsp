<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8",content="text/html">
    <title>会员管理</title>
    <style>
        body{ font-family: "微软雅黑"; background-color: #EDEDED; }
        h2{ text-align: center;}
        table{ width:96%; margin: 0 auto; text-align: center; border-collapse:collapse; font-size:16px;}
        td, th{ padding: 5px;}
        th{ background-color: #DCDCDC; width:120px; }
        th.width-40{ width: 40px; }
        th.width-70{ width: 70px; }
        th.width-80{ width: 80px; }
        hr{ margin-bottom:20px; border:1px solid #aaa; }
    </style>
</head>


<script type="text/javascript">
</script>
<body>
<h2>会员管理</h2>

<hr/>
<table border="1">
    <tr>
        <th class="width-20">序号</th>
        <th class="width-20">姓名</th>
        <th class="width-20">年龄</th>
        <th class="width-20">工种</th>
        <th class="width-20">电话</th>
        <th class="width-20">注册日期</th>
        <th class="width-20">状态</th>
    </tr>

    <!-- 模版数据 -->
    <c:forEach items="${ list }" var="member"
               varStatus="status">
        <tr>
            <td>${ status.count }</td>
            <td>${ member.name }</td>
            <td>${ member.age }</td>
            <td>${ member.workType }</td>
            <td>${ member.telephone}</td>
            <td>${ member.registTime}</td>
            <td>${ member.status }</td>
            <td>
                <a href="memberInfo?id=${ member.id }">修改</a>
                <a href="memberReview?id=${ member.id }">审核</a>
                <a href="memberDelete?id=${ member.id }">删除</a>

            </td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
