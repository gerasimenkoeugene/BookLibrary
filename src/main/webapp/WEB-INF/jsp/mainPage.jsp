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
                <jsp:include page="component/userMenu.jsp"/>
            </div>
            <div id="content">
                <center>
                                <br>
                                <h1> <spring:message code="HELLO" text="default text" /></h1>
                                </center>
            </div>
            <div id="footer">
                &copy; <spring:message code="FOOTER" text="default text" />
            </div>
        </div>
    </body>
</html>