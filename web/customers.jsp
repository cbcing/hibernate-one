<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 3/29/17
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>All Customers</title>
</head>
<body>
    <table>
        <s:iterator value="#session.allCustomers">
            <s:url id="queryOrders" action="queryCustomers">
                <s:param name="customerID" value="customerID"/>
            </s:url>
            <tr>
                <td>
                    <s:a href="%{queryOrders}">
                        <s:property value="customerID"></s:property>
                    </s:a>
                </td>
                <td><s:property value="companyName"></s:property></td>
                <td><s:property value="contactTitle"></s:property></td>
                <td><s:property value="contactName"></s:property></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
