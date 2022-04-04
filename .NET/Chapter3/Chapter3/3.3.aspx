<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="3.3.aspx.cs" Inherits="Chapter3._3__3" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            会员登录<br />
            用户名：<asp:TextBox TextMode="SingleLine" runat="server"></asp:TextBox><br />
            密码：<asp:TextBox TextMode="Password" MaxLength="6" runat="server"></asp:TextBox><br />
            <asp:Button Text="登录" runat="server"/>
        </div>
    </form>
</body>
</html>
