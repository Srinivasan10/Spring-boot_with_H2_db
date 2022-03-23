<!DOCTYPE html>
<html>
<head>
<title>Welcome to Spring Boot</title>
<body>
<h1 style="text-align:center;background-color:powderblue;font-size:50px;color:red;">Spring Boot with H2 Database</h1><br></br>
<form action="addUser">
<p style = "font-family:verdana;">Enter User ID :  <input type="text" name = "id"></p>
<p style = "font-family:verdana;">Enter User Name:<input type="text" name = "name"></p>
<script>
function welcome() { 
window.open("http://localhost:8085/h2-console/");
} 
</script> 
</head> 
<body style = "text-align:center"> 
<button onclick="welcome()"> Submit </button> 
</form>
</body>
</html>
