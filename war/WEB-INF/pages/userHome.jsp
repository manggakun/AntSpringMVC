<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resources" value="/resources/theme1" scope="request" />
<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <h3>Welcome, Enter The User Details</h3>
    <form:form method="POST" 
      action="/helloproject/addUser" modelAttribute="user">
         <table>
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><input type="text" name="name" placeholder="enter name" required="required"></td>
            </tr>
            <tr>
                <td><form:label path="id">Id</form:label></td>
                <td><input type="text" name="id" placeholder="enter name" required="required"></td>
            </tr>
            <tr>
                <td><form:label path="contactNumber">Contact Number</form:label></td>
                <td><<input type="text" name="contactNumber" placeholder="enter name" required="required"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>