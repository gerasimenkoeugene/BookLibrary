<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link href="<c:url value="/resources/css/style_css.css" />" rel="stylesheet">
        <title><spring:message code="HEADER" text="default text" /></title>
    <style type="text/css">
</style></head>
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
                <br>
                <h1><spring:message code="ENTER_SYSTEM" text="default text" /></h1>
                <c:if test="${errorMessage != null}">
                    <font color="red"><spring:message code="${errorMessage}" text="default text" /></font>
                </c:if>

                <form action="login_enter" method="post" >
                <input type="hidden" name="command" value="login"/>
                    <table>
                        <tr>
                            <td> <spring:message code="LOGIN" text="default text" /></td> <td> <input type="text" name="login" size="20" maxlength="35"> </td>
                        </tr>
                        <tr>
                            <td> <spring:message code="PASSWORD" text="default text" /></td> <td> <input type="password" name="password" size="20" maxlength="35"></td>
                        </tr>
                        <tr>
                            <td></td><td> <input class= myButton type="submit" name="log" value="<spring:message code="ENTER_SYSTEM" text="default text" />"> </td>
                        </tr>
                    </table>
                </form>
                </center>
            </div>
            <div id="footer">
                &copy; <spring:message code="FOOTER" text="default text" />
            </div>
        </div>
    </body>
</html>