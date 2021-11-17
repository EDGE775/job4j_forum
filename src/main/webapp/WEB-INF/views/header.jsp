<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta charset="utf-8">
<!doctype html>
<div class="row">
    <ul class="nav">
        <li class="nav-item">
            <a class="nav-link" href="<c:url value='/index'/>">Главная</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<c:url value='/create'/>">Добавить пост</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<c:url value='/logout'/>">${user.username} | Выйти</a>
        </li>
    </ul>
</div>
