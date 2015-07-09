<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="org.json.simple.JSONObject"%>
<%
    JSONObject json = new JSONObject();
    json.put("title", "TITLE_TEST");
    json.put("link", "LINK_TEST");
    out.print(json);
    out.flush();
%>