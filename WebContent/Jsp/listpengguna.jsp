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
<s:hidden name="id" id="id" />
	<s:if test="petanis.size > 0">
		<table border="1">
			<thead style="background-color: lime;">
				<th>Nama</th>
				<th>Alamat</th>
				<th>Umur</th>
				<th>Member</th>
				<th colspan="3">Action</th>
			</thead>

			<tbody>
				<s:iterator value="petanis">
					<tr id="row_<s:property value="id_petani"/>">
						<td><s:property value="nama_petani" /></td>
						<td><s:property value="alamat_petani" /></td>
						<td><s:property value="umur_petani" /></td>
						<td><s:date name="tgl_member_petani" format="dd-MM-yyyy" /></td>
						<s:url id="lihatdata" action="Lihatdata">
							<s:param name="id" value="id_petani" />
						</s:url>
						<td><s:a href="%{lihatdata}" theme="ajax" targets="main">View Data></s:a></td>

						<s:url id="editdata" action="editData">
							<s:param name="id_petani" value="id_petani" />
						</s:url>
						<td><s:a href="%{editdata}" theme="ajax" targets="main">Edit Data></s:a></td>
						
						<s:url id="lihatdata" action="lihatData">
							<s:param name="id_petani" value="id_petani" />
						</s:url>
						<td><s:a href="%{lihatdata}" theme="ajax" targets="main">Hapus Data></s:a></td>
					</tr>
				</s:iterator>
			</tbody>

		</table>
	</s:if>
	<a href="index.action">back</a>
	<a href=""></a>
</body>
</html>