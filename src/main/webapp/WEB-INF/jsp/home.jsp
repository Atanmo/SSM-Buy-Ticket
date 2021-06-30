<%--
  Created by IntelliJ IDEA.
  User: ATanmo
  Date: 2021/6/29
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AT影院--首页</title>


    <style type="text/css">
        body {
            background: #2E323B;
        }

        .piao {
            text-align: center;
            border-bottom-left-radius: 20px;
            border-bottom-right-radius: 20px;
            width: 238px;
            padding: 6px;
            line-height: 20px;
            background: #5f5f6d;
        }
    </style>
<body>


<table bgcolor="0" align="center">
    <tr>
        <c:forEach items="${allFilmVoList}" var="film" begin="0" end="3">
            <td>
                <div style="width: 250px; margin:10px;">
                    <a href="filmInfo?filmId=${film.filmId}">
                        <img src="${pageContext.request.contextPath}${film.filmImgPath}"
                             style="width: 250px;height: 380px"/>
                    </a>

                    <div class="piao">
                        <p style="color: white; top: 50px;">${film.filmName}</p>

                        <p style="color: white; top: 50px;">导演:${film.filmDirector}</p>
                    </div>
                </div>
            </td>
        </c:forEach>
    </tr>

    <tr>
        <c:forEach items="${allFilmVoList}" var="film" begin="4" end="7">
            <td>
                <div style="width: 250px; margin:10px;">
                    <a href="filmInfo?filmId=${film.filmId}">
                        <img src="${pageContext.request.contextPath}${film.filmImgPath}"
                             style="width: 250px;height: 380px"/>
                    </a>
                    <div class="piao">
                        <p style="color: white; top: 50px;">${film.filmName}</p>
                        <p style="color: white; top: 50px;">导演:${film.filmDirector}</p>
                    </div>
                </div>
            </td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
