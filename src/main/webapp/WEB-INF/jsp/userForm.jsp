<!DOCTYPE html>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<h1>User Create Form</h1>
<form:form modelAttribute="userForm"
           action="${pageContext.request.contextPath}/user/create">
  <form:label path="name">Name: </form:label>
  <form:input path="name"/>
  <br>
  <form:label path="age">Age: </form:label>
  <form:input path="age"/>
  <br>
  <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
