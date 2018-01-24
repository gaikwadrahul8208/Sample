<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.2.1.js"
  integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
  crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css" />
</head>
<body>

<form action="loginServlet" method="post">
<input type="text"> 
<input type="submit" value="Load_Logs">
</form>
<div id="demo"></div>


		<c:if test="<%=request.getHeader(\"User-Agent\").indexOf(\"Chrome\") >= 0 %>">
		
	      You are using Chrome<br>
	      <script type="text/javascript">
	    	function showCookieFail(){
	    	  alert("Please Enable Cookies");
	    	  $("#demo").html('Enable Cookies follow following steps - <br>1.Click the icon depicting three horizontal lines in the top-right corner:<br>2. Click Settings.<br>3. Click Show advanced settings.<br>4. In the section entitled "Privacy" click the button Content settings.<br>5. In the section entitled "Cookies" select the option Allow local data to be set.');
			 }
	      </script>
	    <noscript>
	      JavaScript is off. Please enable to view full site.<br>
			Follow following steps to enable it-<br>
		    1.Open a window in Google Chrome.<br>
		    2.At the top right, click More More and then Settings.<br>
		    3.At the bottom, click Show advanced settings.<br>
		    4.In the "Privacy" section, click Content settings.<br>
		    5.Select Allow all sites to run JavaScript (recommended) in the "JavaScript" section.<br>
		    6.Click Done.<br>
		 </noscript>
      </c:if>
      <c:if test="<%=request.getHeader(\"User-Agent\").indexOf(\"Firefox\") >= 0 %>">
      You are using Firefox<br>
      	      <script type="text/javascript">
	    	function showCookieFail(){
	    	  alert("Please Enable Cookies");
	    	  $("#demo").html('Enable Cookies follow following steps - <br>1.Click the menu button and choose Option.<br>2. Select the Privacy & Security panel and go to the History section.<br>3. In the drop-down menu next to Firefox will choose "Use custom settings for history".<br>4. Check mark Accept cookies from websites to enable cookies.<br>5. Save and close it.');	    	  
	    	}
	      </script>
      <noscript>
      JavaScript is off. Please enable to view full site.<br>
		Follow following steps to enable it-<br>
	    1.Click the Tools drop-down menu and select Options.<br>
	    2.Select the Content section from the options at the top of the pop-up page.<br>
	    3.Check the boxes next to Block pop-up windows, Load images automatically, and Enable JavaScript.<br>
	    4.Click OK.<br>
	    5.Refresh your browser by right-clicking anywhere on the page and selecting Reload, or by using the Reload button in the toolbar.<br>
      </noscript>
      </c:if>
      <c:if test="<%=request.getHeader(\"User-Agent\").indexOf(\"MSIE\") >= 0 %>">
	      You are using Internet Explorer
	      <script type="text/javascript">
	    	function showCookieFail(){
	    	  alert("Please Enable Cookies");
	    	  $("#demo").html('Enable Cookies follow following steps - <br>1.In Internet Explorer, select the Tools button, and then select Internet options.<br>2. Select the Privacy tab, and under Settings, select Advanced and choose if you want to allow, block or be prompted for first and third party cookies.<br>3. Save and close it.');
	    	}
	      </script>
	       <noscript>
	       JavaScript is off. Please enable to view full site.<br>
			Follow following steps to enable it-<br>
	          	1.Select the "Tools" menu.<br>
			    2.Select "Internet Options".<br>
			    3.Select the "Security" tab.<br>
			    4.Click the "Custom Level".<br>
			    5.Scroll down and change the Active Scripting setting.<br>
			    6.Confirm the change.<br>
			    7.Close "Internet Options".<br>
     </noscript>
     </c:if>
     
     <c:if test="<%=request.getHeader(\"User-Agent\").indexOf(\"Safari\") >= 0 &&  request.getHeader(\"User-Agent\").indexOf(\"Chrome\") <= 0%>">
	      You are using Safari<br>
	     	      <script type="text/javascript">
	     	     
	    	function showCookieFail(){
	    	  alert("Please Enable Cookies");
	    	  $("#demo").html('Enable Cookies follow following steps - <br>1.Open Safari and click on the Safari menu and go down to "preferences".<br>2. Click on Privacy Tab.<br>3. Make sure the  "Accept Cookies" option is selected.<br>4. Close and refresh browser.');
	    	}
	      </script>
	     <noscript>
	     <div class="container">
	     <div class="row">
	     <div class="col-md-3"></div>
	     <div class="col-md-6">
	      JavaScript is off. Please enable to view full site.<br>
			Follow following steps to enable it-<br>
			1. Go to Preferences <br>
			2. Select Security Tab<br>
			3. Click on Enable Javascript<br>
			4. Save it and Close<br>
			</div>
			<div class="col-md-3"></div>
			</div>
			</div>
      </noscript>
      </c:if>
      <script type="text/javascript">
      function checkCookie(){
    	    var cookieEnabled = navigator.cookieEnabled;
    	    if (!cookieEnabled){ 
    			//alert("in if");
    			document.cookie = "testcookie";
    	        cookieEnabled = document.cookie.indexOf("testcookie")!=-1;
    	    }
    	    return cookieEnabled || showCookieFail();
    	}

      checkCookie();
      </script>

</body>
</html>