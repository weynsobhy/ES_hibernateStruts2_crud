<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border=1>
<thead><th colspan="4" align="left" style="background-color: #79BD29;color: white;">Metadata</th></thead>
  <tr align="left">
    <th>Nama petani</th>
       <td ><s:text name="nama_petani"/></td>
    <th>Alamat</th>
       <td><s:text name="alamat_petani"/></td>
  </tr>
  <tr align="left">
    <th>Umur</th>
       <td><s:text name="umur_petani"></s:text></td>
       <th>Terdaftar</th>
    <td><s:text name="tgl_member_petani"/></td>
  </tr>
   <tr align="left">
    <th>Nama sawah</th>
       <td><s:text name="nama_sawah"/></td>
        <th>Alamat_sawah</th>
    <td><s:text name="alamat_sawah"/></td>
  </tr>
</table>

</body>
</html>