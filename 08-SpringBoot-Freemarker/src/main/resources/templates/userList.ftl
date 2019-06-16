<html>
    <title>展示产品名称</title>
    <meta charset="UTF-8" />

    <body>
        <table align="center" border="1" width="50%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
            </tr>
            <#list list as user>
                <tr>
                    <td>${user.userid}</td>
                    <td>${user.username}</td>
                    <td>${user.userage}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>