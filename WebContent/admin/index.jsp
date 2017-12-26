<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
   <c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <title>楠爵科技 - 网站后台管理中心</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="楠爵科技专业的网站后台管理系统" />
    <meta name="keywords" content="楠爵,网站管理系统,企业网站" />
    <meta name="Author" content="RainMan" />
    <meta name="CopyRight" content="楠爵科技" />
</head>
<frameset rows="64,*"  frameborder="no" border="0" framespacing="0">
    <!--头部-->
    <frame src="admin/top.jsp" name="top" noresize="noresize" frameborder="0"  scrolling="no" marginwidth="0" marginheight="0" />
    <!--主体部分-->
    <frameset cols="185,*">
        <!--主体左部分-->
        <frame src="admin/left.jsp" name="left" noresize="noresize" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" />
        <!--主体右部分-->
        <frame src="admin/main.jsp" name="main" frameborder="0" scrolling="auto" marginwidth="0" marginheight="0" />
</frameset>
</html>