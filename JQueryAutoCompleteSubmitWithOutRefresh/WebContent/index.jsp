<head>
<script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
<script type="text/javascript">    $(document).ready(
		function() {     
			$('#ibutton').click(function(e) {     
				e.preventDefault();     
				var ajaxdata = $("#country").val();     
				var value ='county='+ajaxdata;      
				$.ajax({     url: "saveIt",     
					//type: "post",     
					data: value,     
					cache: false,     
					success: function(data) {     
						$("#country").val('');     
						$("#message").html(data).slideDown('slow');     
						}     
				});
				});
			});</script>
<style>
#country {
	border: 1px solid #8707c2;
}
</style>
</head>
<body>
	<center>
		<font face="verdana" size="4">Submit Form With Out Page Refresh
			In Java/Servlets - jQuery<br>
		<br>
		</font>
		<form name="sub" action="saveIt" id="sub">
			<font face="verdana" size="2">Country:</font> <input type="text"
				name="country" id="country" size="30" /> <input type="button"
				id="ibutton" value="Save" />
		</form>
		<br>
		<font face="verdana" size="2"><div id="message"></div></font> <br>
		<br>
		<img src="images/java4s.png">
	</center>
</body>
</html>
