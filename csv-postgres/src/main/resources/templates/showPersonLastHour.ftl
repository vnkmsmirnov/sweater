<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list 1</title>
</head>
<body>
<h1>Report 1</h1>
<table border="1">
    <caption><h2>Persons list for last hour</h2></caption>
    <tr>
        <th>Ssoid</th>
        <th>Formid</th>
    </tr>
    <#list getPersonLastHour as person>
        <tr>
            <td>${person.ssoid}</td>
            <td>${person.formid}</td>
        </tr>
    </#list>
</table>

<a href="/startPage"><h2>Back</h2></a>
</body>
</html>