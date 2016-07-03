<jsp:directive.page contentType="text/html;charset=UTF-8"/>
<%@page language="java" session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/style_css.css" />" rel="stylesheet">
        <title> <spring:message code="HEADER" text="default text" /></title>
    </head>
    <body>
        <div id="container">
            <div id="header">
                <table width=1150px>
                    <tr> <td width = 45%> </td>
                        <td width = 15%><spring:message code="HEADER" text="default text" /></td>
                        <td width = 30%>  </td>
                        <td width = 10%>
                            <a href="?language=en_EN"><img src="<c:url value="/resources/images/eng.png"/>"/></a>|<a href="?language=ru_RU"><img src="<c:url value="/resources/images/rus.png"/>"/></a>
                        </td>
                    </tr>
                </table>
            </div>
            <div id="sidebar">
                <p><form action="login" method="post">
                <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="AUTHORIZATION" text="default text" />">
            </form>
                <form action="registration" method="post">
                    <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="REGISTRATION" text="default text" />">
                </form>
            </div>
            <div id="content">
                <center>
                    <h2><spring:message code="ENTER_INFO" text="default text" /></h2>
                    <img src="<c:url value="/resources/images/book.jpg"/>"/>
                </center>
            </div>
            <div id="footer">
               &copy; <spring:message code="FOOTER" text="default text" />
        </div>
    </body>
</html>
