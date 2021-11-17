<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <title>Форум job4j</title>
</head>
<body>
<div class="container pt-3">
    <c:import url="../header.jsp"/>
    <div class="row">
        <div class="card card-margin border mb-3" style="width: 100%">
            <div class="card-header">
                Тема: <c:out value="${post.name}"/>
            </div>
            <div class="card-body">
                <c:out value="${post.description}"/>
            </div>
            <div class="card-footer">
                <c:out value="${post.user.username}, "/>
                <fmt:formatDate value="${post.created.time}" pattern="yy.MM.dd HH:mm:ss"/>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="card card-margin border mb-3" style="width: 100%">
            <div class="card-header">
                Пользователь 2, 10.10.21
            </div>
            <div class="card-body">
                Сколько стоит?
            </div>
        </div>
    </div>
    <div class="row">
        <div class="card card-margin border mb-3" style="width: 100%">
            <div class="card-header">
                Пользователь 3, 10.10.21
            </div>
            <div class="card-body">
                Беру!
            </div>
        </div>
    </div>
</div>
</body>
</html>