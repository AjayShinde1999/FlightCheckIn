<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Reservation</title>
</head>
<body>
<h2>Reservation Details</h2>
First Name = ${reservation.getPassenger().firstName }<br>
LastName = ${reservation.getPassenger().lastName }<br>
Email Id : ${reservation.getPassenger().email }<br>
Phone Number : ${reservation.getPassenger().phone }<br>
Operating Airlines : ${reservation.getFlight().operatingAirlines }<br>
Flight Number : ${reservation.getFlight().flightNumber }<br>
Departure City : ${reservation.getFlight().departureCity }<br>
Arrival City : ${reservation.getFlight().arrivalCity }<br>
Date Of Departure : ${reservation.getFlight().dateOfDepature }<br>
<form action="completeCheckIn" method="post">
Reservation Id : <input type="text" name="id" value=${reservation.id }>
Number of Bags : <input type="text" name="numberOfBags"/>
<input type="submit" value="Done"/>

</form>
</body>
</html>