<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="3.9 List控件选项单选多选.aspx.cs" Inherits="Chapter3._3__9_List控件选项单选多选" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:ListBox id="lbx1" SelectionMode="Multiple" runat="server" Width="200px"></asp:ListBox>
            <div>
<asp:Button ID="button1" Text="<<" runat="server" OnClick="button1_Click" /><br />
            <asp:Button ID="button2" Text=">>" runat="server" /><br />
            <asp:Button ID="button3" Text="<" runat="server" OnClick="button3_Click" /><br />
            <asp:Button ID="button4" Text=">" runat="server" /><br />
            </div>
            <asp:ListBox ID="lbx2" SelectionMode="Multiple" runat="server" Width="200px"></asp:ListBox>            
            
        </div>
    </form>
</body>
</html>
