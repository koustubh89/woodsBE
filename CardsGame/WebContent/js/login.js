function intCheck()
{
	alert("in intCheck");
	var userNameId= document.getElementById("userNameId").value;
	var pattern = [0-9];  
	  if(userNameId.match(pattern))  
		        {  
		  console.log(userNameId);
		      return true;  
		        }  
		      else  
		        {  
		        alert("Please enter numbers only");  
		        return false;  
		        }  
		}  
function login()
{
alert("in login js");
	if(intCheck())
	{
	var userNameId= document.getElementById("userNameId").value;
	var pswdId= document.getElementById("pswdId").value;
	alert("name: "+userNameId);
	alert("password: "+pswdId);
	// if submit made by giving path to controller in jsp form 
	//itself(no js function used) no need to give parameters in url
	document.location.href='/CardsDemo/LoginController?userNameId='+userNameId+'&pswdId='+pswdId;
	}
}
