<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency_Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="get" action="/converter">
    <label>Rate: </label>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type="submit" id="submit" value="Converter"/>
    <h2>Result</h2>
    <div>${result}</div>
</form>
</body>
</html>