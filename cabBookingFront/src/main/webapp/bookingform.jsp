<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add New Booking</h2>
	<form action="add" method="post">
		<div>
			start location: <input type="text" name="startLocation">
		</div>
		<div>
			end location: <input type="text" name="endLocation">
		</div>
		<div>
			distance: <input type="text" name="distance">
		</div>
		<div>
			cab type: <input type="text" name="cabType">
		</div>
		<div>
			<input type="submit">
		</div>
	</form>
</body>
</html>