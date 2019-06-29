1.创建项目，在pom文件添加thymeleaf坐标
2.创建存放视图目录，在src/main/resources/templates
    templates:该目录是安全的，该目录下的文件是不允许外界访问，跟WEB-INF下一样

3.Thymeleaf特点：
    Thymeleaf是通过特定语法对html的标记做渲染；
        html标签具有严谨性，例：meta必须有结束标签，（高版本已支持，对语法没有那么严谨）

    Thymeleaf语法：
        变量输出与字符串操作：
            th:text 在页面中输出
            th:value 可以将值放到input框的value中
            th:text="${#strings.isEmpty(key)}" 判断字符串key是否为空，为空返回true,否则返回false
                (调用Thymeleaf中的内置对象，一定用#调
                大部分内置对象都已s结尾，例：strings、numbers、dates)
            th:text="${#strings.contains(key,'val')}" 判断字符串key是否包含val的子串，包含返回true,否则返回false
            th:text="${#strings.startsWith(key,'val')}" 判断当前字符串key是否以子串val开头，如果是返回true,否则返回false
            th:text="${#strings.endstartsWith(key,'val')}" 判断当前字符串key是否以子串val结尾，如果是返回true,否则返回false
            th:text="${#strings.length(key)}" 返回当前字符串key的长度
            th:text="${#strings.indexOf(key,'val')}" 返回当前字符串key的字串val的索引下标,如果没有返回-1
            th:text="${#strings.substring(key,startIndex)}" 截取字符串，从startIndex开始到结束，startIndex不能超过索引
            th:text="${#strings.substring(key,startIndex，endIndex)}" 截取字符串，从startIndex开始到endIndex结束
            th:text="${#strings.toUpperCase(key)}" 字符串转换大写
            th:text="${#strings.toLowerCase(key)}" 字符串转换小写
            th:text="${#dates.format(key)}" 格式化日期默认以浏览器语言为标准
            th:text="${#dates.format(key,'yyyy-mm-dd')}" 格式化日期按规定格式
            th:text="${#dates.year(key)}" 格式化日期显示年份
            th:text="${#dates.month(key)}" 格式化日期显示月份
            th:text="${#dates.day(key)}" 格式化日期显示天
4、thymeleaf条件判断
    使用th:if
        <span th:if="${sex} == '男'">性别：男</span>
        <span th:if="${sex} == '女'">性别：女</span>

    使用th:switch
        <div th:switch="${id}">
            <span th:case="1">ID:1</span>
            <span th:case="2">ID:2</span>
            <span th:case="3">ID:3</span>
        </div>
5、集合迭代遍历
    th:each类似Java里for(对象:集合) th:each="对象：${集合}"

    th:each="对象,属性状态：${集合}" 迭代集合下的状态变量index、count、size、even、odd、first、last
        index:当前迭代器索引，从0开始
        count:当前迭代器计数，从1开始
        size:被迭代对象的长度
        even/odd:返回布尔值，当前循环是奇数行还是偶数行，从0开始，是返回true
        first/last:返回布尔值，当前循环是第一行/随后一行,是返回true
6、map迭代遍历
        <tr th:each="maps:${map}">
            <td th:each="entry:${maps}" th:text="${entry.key}"></td> //迭代key
            <td th:each="entry:${maps}" th:text="${entry.value.userid}"></td> //迭代value
            <td th:each="entry:${maps}" th:text="${entry.value.username}"></td>
            <td th:each="entry:${maps}" th:text="${entry.value.userage}"></td>
        </tr>
7、域对象的操作
    HttpServletRequest如何取数据

            th:text="${#httpServletRequest.getAttribute('request')}" 通过内置对象httpServletRequest

    HttpSession如何取数据

            th:text="${session.session}" session.属性

    servletContext如何取数据

            th:text="${application.application}" application.属性
8、URL表达式

    th:href
    th:src
    url表达式语法
        基本语法：@{}

    url类型
        绝对路径
            th:href="@{http://www.baidu.com}"
        相对路径
            th:href="@{/show1}"     相对于项目的根，上下文的根路径
            th:href="@{~/project/resourcename}"     相对于当前服务器根路径（同一服务器下不同项目也能访问）

    在url中实现参数传递
        th:href="@{/show1(id=1,name='张三')}" 用/请求(参数=值...)

    在url中通过restful风格进行传参
        th:href="@{/psth/{id}/show1(id=1,name='张三')}"
