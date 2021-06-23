<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <style><%@include file="/WEB-INF/jsp/style.css"%></style>
    <body id="pic">
        <div id="underline">
            <h1>Schools Database</h1>
        </div><br>
        <div class="row">
            <!--TABLE-->
            <div class="col-md-12">

                <div class="panel-body">
                    <table id="tbl-student" class="table table-responsive table-bordered" cellpadding="0" width="100%">
                        <thred>
                            <tr>
                                <th>Id</th>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>Course</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach var="trainer" items="${trainers}">
                                <tr>
                                    <td>${trainer.id}</td>
                                    <td>${trainer.firstname}</td>
                                    <td>${trainer.lastname}</td>
                                    <td>${trainer.course}</td>
                                    <td><a href="${pageContext.request.contextPath}/update/${trainer.id}">Edit</a></td>
                                    <td><a href="${pageContext.request.contextPath}/deletetrainer/${trainer.id}" onclick="return confirm('Are you sure?')">Delete</a></td>
                                </tr>  
                            </c:forEach>
                        </thred>
                    </table>
                </div>
            </div>

        </div>
    </body>
</html>
