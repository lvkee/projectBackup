using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Chapter3
{
    public partial class _3__2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            /*
             必须设置控件runat="server"才能通过ID访问控件
             */
            label1.InnerText = "ASP.NET";
        }
    }
}