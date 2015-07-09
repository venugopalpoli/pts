<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String [] array = { "Anna","Brittany","Cinderella","Diana","Eva","Fiona","Gunda","Hege","Inga","Johanna","Kitty","Linda","Nina","Ophelia","Petunia","Amanda","Raquel","Cindy","Doris","Eve","Evita","Sunniva","Tove","Unni","Violet","Liza","Elizabeth","Ellen","Wenche","Vicky"};

String val = request.getParameter("name").trim();
String hint ="";
if(val.length()>0){
  for(int i=0 ; i< 30; i++){
	  String data = array[i].substring(0, val.length());
	if(data.trim().equalsIgnoreCase(val)){
		if(hint.equals("")){
			hint = array[i];
		}else{
			hint = hint + "," + array[i];
		}
	}
  }
}

if(hint.equals("")){
  out.println("No Suggestion");
}else{
	out.println(hint);
}
%>
