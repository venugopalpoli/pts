<%@ taglib prefix="s" uri="/struts-tags"%><html>
<body>
	<s:form action="verify">
		<s:textfield name="employee.name" label="Enter Username" />
		<br>
		<s:textfield name="employee.age" label="Enter Age" />
		<br>
		<s:textfield name="employee.sex" label="sex" />
		<br>
		<s:submit value="Click" align="center" />
	</s:form>
</body>
</html>
