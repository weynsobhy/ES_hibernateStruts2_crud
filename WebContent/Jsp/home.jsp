<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Es_hibernateStruts2_crud</title>
</head>
<body>
<s:form action="DaftarPetaniBaru" method="post">
<table>
<thead>
<th colspan="2" align="left" style="background-color: #79BD29;color: white;">Input Biodata Petani</th></thead>
  <tr align="left">
    <th>Nama</th>
    <td><s:textfield name="nama_petani" required="true"/></td>
    <th>Umur</th>
       <td><s:textfield name="umur_petani" required="true"/></td></tr><tr>
    <th>Alamat</th>
    <td><textarea cols="35" rows="5" witdh="80px" name="alamat_petani"></textarea></td>
  </tr>
  
  <s:submit name="submit" value="Kirim"></s:submit><s:reset/>
   <s:a href="ViewList.action">View data</s:a>
</table>
</s:form>

<p>Penjelasan</p>
<iframe  src="penjelasan.action" frameborder="1" scrolling="auto" name="penjelasan" width="500px" height="50px"></iframe>
<p>Create by Erwin Sobirin</p>
</body>
</html>