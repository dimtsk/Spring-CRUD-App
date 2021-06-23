
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer Form Page</title>
        <!-- link for the icons -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" 
              integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <script>
            $(document).ready(function(result){
                          $("#result").html(result);
                   });
        </script>
    </head>
    <style><%@include file="/WEB-INF/jsp/style.css"%></style>
    <body id="pic">
        <div class="container">
            <h4><i class='fas fa-chalkboard-teacher fa-2x'></i> INSERT TRAINERS INFORMATION</h4><br><br>
            <springForm:form method="POST" action="inserttrainer" modelAttribute="trainer">
                <table> 
                    <tr>
                        <td class="form-label">Firstname:</td>
                        <td><springForm:input path="firstname" cssClass="form-control"/></td>
                        <td><springForm:errors path="firstname" cssClass="error"/></td>
                    </tr><br>

                    <tr>
                        <td class="form-label">Lastname:</td>
                        <td><springForm:input path="lastname" cssClass="form-control"/></td>
                        <td><springForm:errors path="lastname" cssClass="error"/></td>
                    </tr><br>

                    <tr>
                        <td class="form-label">Course:</td>
                        <td><springForm:input path="course" cssClass="form-control"/></td>
                        <td><springForm:errors path="course" cssClass="error"/></td>
                    </tr><br>

                    <tr>
                        <td><input type="submit" value="Submit" class="btn"></td>
                        <div id="result">${messageoutput}</div>
                    </tr>
                    <tr>
                        <td><input type="reset" value="Reset" class="btn"></td>
                    </tr>                    
                </table>

                <a href="${pageContext.request.contextPath}/trainerlist">Trainers List</a>

            </springForm:form>
        </div>
    </body>
</html>
