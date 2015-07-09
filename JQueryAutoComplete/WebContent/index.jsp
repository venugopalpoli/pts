<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
	<script src="JS/jquery.autocomplete.js"></script>	
	
	<script>
	jQuery(function(){
		$("#name").autocomplete("list.jsp");
	});
   </script>
	
</head>
<body>
<br><br><center>
<font face="verdana" size="2">
<font size="4">Java(jsp)/jQuery Autocompleter Example ::: <font color="#809e02">Java4s.com</font></font>
<br><br><br><br>

	Select Name   :	
	<input type="text" id="name" name="name" class="input_text"/>
	
</font>
</body>
</html>