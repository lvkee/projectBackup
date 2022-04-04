using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Chapter3
{
    public partial class _3__9_List控件选项单选多选 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if(!IsPostBack)
            {
lbx1.Items.Add("1");
            lbx1.Items.Add("2");
            lbx1.Items.Add("3");
            lbx1.Items.Add("4");
            lbx1.Items.Add("5");
            lbx1.Items.Add("6");
            lbx1.Items.Add("7");
            }
            
        }

        protected void button1_Click(object sender, EventArgs e)
        {
            int count = lbx1.Items.Count;
            Console.WriteLine(count.ToString());
            int index = 0;
            Console.WriteLine(index.ToString());
            for (int i = 0; i < count; i++)
            {
                ListItem item = lbx1.Items[index];
                lbx1.Items.Remove(item);
                lbx2.Items.Add(item);
            }
            index++;
        }

        protected void button3_Click(object sender, EventArgs e)
        {
            int count = lbx1.Items.Count;
            int index = 0;
            for (int i = 0; i < count; i++)
            {
                ListItem item = (ListItem)lbx1.Items[index];
                if (lbx1.Items[index].Selected == true)
                {
                    lbx1.Items.Remove(item);
                    lbx2.Items.Add((ListItem)item);
                    index--;
                }
                index++;
            }
        }
    }
}