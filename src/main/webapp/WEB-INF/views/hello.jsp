<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
</head>
<body onload="load();">
<input type="hidden" id= user_id value = "-1">
	Name: <input type="text" id="name" required="required" name="user_name" value="Allen"><br>
	Email: <input type="email" id="email" required="required" name="email" value ="lhf552004@163.com"><br>
	<button onclick="submit();">Submit</button>
	

	<table id="table" border=1>
		<tr>
		<th> Name </th>
		<th> Email </th>
		<th> Edit </th>
		<th>Delete</th>
		
		</tr>
		
	</table>
<!-- 	contentType : "application/json; charset=utf-8",/ -->
	<script type="text/javascript">
		data = "";
		submit = function(){
			$.ajax({
				url:"saveOrUpdate",
				type: "POST",
				data: {userName:$("#name").val(),email: $("#email").val()},
				
				dataType: "json",
				success: function(response){
					alert(response.message);
					load();
				}
			})
		}
		delete_ = function(id){
			$.ajax({
				url: 'delete',
				type: 'POST',
				data: {user_id: id},
				success: function(response){
					alert(response.message);
					load();
				}
			});
		}
		edit = function(index){
			$("#user_id").val(data[index].user_id);
			$("#user_name").val(data[index].user_name);
			$("#email").val(data[index].email);
		}
		
		load = function(){
			$.ajax({
				url: 'list',
				type: 'POST',
				success: function(response){
					data = response.data;
					$('.tr').remove();
					for(var i=0; i<response.data.length; i++){
						$('#table').append("<tr class='tr'> <td> " + response.data[i].userName + "</td> <td>" + response.data[i].email + "</td> <td><a onclick='edit(" + i + ");'> Edit </a></td> <td><a onclick='delete_(" + response.data[i].user_id  + ");'> Delete </a></td> </tr>");
					}
				}
			})
		}
	</script>
</body>

</html>