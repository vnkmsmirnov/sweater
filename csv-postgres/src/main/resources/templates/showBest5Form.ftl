<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list 3</title>
</head>
<body>
<h1>Report 3</h1>
<table border="1">
    <caption><h2>Best 5 form</h2></caption>
    <tr>
        <th>Formid</th>
    </tr>
    <#list getBest5Form as person>
        <tr>
            <td>${person.formid}</td>
        </tr>
    </#list>
</table>

<a href="/startPage"><h2>Back</h2></a>
</body>
</html>