<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bookings</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<div style="padding: 20px">
	<h1>Bookings</h1>
	<a href="/add">Add Booking</a> 
	<p> Total Price of all bookings: £${price} </p>
	<c:forEach items="${bookings }" var="booking">
		<div style="padding: 20px;">
		<div class="Container card " style="width: 15%; padding: 5px;">
			<h3>Booking Number: ${booking.id}</h3>
			<p>Start Location: ${booking.startLocation}</p>
			<p>End Location: ${booking.endLocation}</p>
			<p>Distance: ${booking.distance}</p>
			<p>Cab type: ${booking.cabType}</p>
		</div>
		</div>
	</c:forEach>
	</div>
</body>
</html>