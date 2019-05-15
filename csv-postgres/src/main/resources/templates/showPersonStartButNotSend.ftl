<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list 2</title>
</head>
<body>
<h1>Report 2</h1>
<table border="1">
    <caption><h2>The list of users who started activity on the form and did not reach the end</h2></caption>
    <tr>
        <th>Ssoid</th>
        <th>Subtype</th>
    </tr>
    <#list getPersonStartButNotSend as person>
        <tr>
            <td>${person.ssoid}</td>
            <td>${person.subtype}</td>
        </tr>
    </#list>
</table>

<a href="/startPage"><h2>Back</h2></a>
</body>
</html>