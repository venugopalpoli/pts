<html>
<head>
<script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
<script type="text/javascript">
	var auto = setInterval(function() {
		$('#score').load('reload-window.jsp').fadeIn("slow");
	}, 5000); // refresh every 5000 milliseconds
</script>
</head>
<body>
	<center>
		<font face="verdana" size="4px">Auto Reload Part Of Webpage
			Every 10 Seconds In Java-Jsp-jQuery</font><br>
		<br> <img src="images/search.png"><br>
		<br>
		<div id="score"></div>
	</center>
</body>
</html>
