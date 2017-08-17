<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<sx:head />
</head>
<body>
	<s:form action="/cadastrar" namespace="/aluno" method="post" enctype="multipart/form-data">
		<s:textfield name="aluno.nome" label="Nome" />
		<s:textfield name="aluno.rg" label="RG" />
		<sx:datetimepicker name="aluno.dataNasc"  label="Format (dd-MMM-yyyy)"
			displayFormat="dd-MMM-yyyy"  />
		<s:textfield name="aluno.email" label="E-mail" />
		
		<s:submit />
	</s:form>
</body>
</html>