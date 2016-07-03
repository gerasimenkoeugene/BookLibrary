<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


    <c:if test="${user.idTypeUser == 0}">
        <p>
        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="USER_LIST" text="default text" />">
        </form>
        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="BOOK_LIST" text="default text" />">
        </form>
        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="ORDER_LIST" text="default text" />">
        </form>
        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="USER_MENU_LOGOUT" text="default text" />">
        </form>
    </c:if>

    <c:if test="${user.idTypeUser == 1}">
        <p>
        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="USER_MENU_PERSONAL" text="default text" />">
        </form>
        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="USER_MENU_BOOKS" text="default text" />">
        </form>

        <form action="controller" method="post">
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="USER_MENU_SEARCH" text="default text" />">
        </form>
        <form action="controller" method="post">
            <input type="hidden" name="command" value="logout"/>
            <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="USER_MENU_LOGOUT" text="default text" />">
        </form>
    </c:if>
    <c:if test="${user == null}">
                       <p><form action="login" method="post">
                       <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="AUTHORIZATION" text="default text" />">
                   </form>
                       <form action="registration" method="post">
                           <input class= myButton width = 200px type="submit" name="log" value="<spring:message code="REGISTRATION" text="default text" />">
                       </form>
    </c:if>