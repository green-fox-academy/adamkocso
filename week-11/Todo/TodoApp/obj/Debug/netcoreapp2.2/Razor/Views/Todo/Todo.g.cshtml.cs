#pragma checksum "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "a8ce9a3c34e9a20c654a2ff2e3610420f926622b"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Todo_Todo), @"mvc.1.0.view", @"/Views/Todo/Todo.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Todo/Todo.cshtml", typeof(AspNetCore.Views_Todo_Todo))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\_ViewImports.cshtml"
using TodoApp;

#line default
#line hidden
#line 2 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\_ViewImports.cshtml"
using TodoApp.Models;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"a8ce9a3c34e9a20c654a2ff2e3610420f926622b", @"/Views/Todo/Todo.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"d8e2dbb28b70bf695c03d3b691e2b5b46c2fecbf", @"/Views/_ViewImports.cshtml")]
    public class Views_Todo_Todo : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<User>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(13, 42, true);
            WriteLiteral("\r\n<h1>Things to Do</h1>\r\n\r\n<br />\r\n\r\n<form");
            EndContext();
            BeginWriteAttribute("action", " action=\"", 55, "\"", 93, 2);
            WriteAttributeValue("", 64, "todo/add?username=", 64, 18, true);
#line 7 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
WriteAttributeValue("", 82, Model.Name, 82, 11, false);

#line default
#line hidden
            EndWriteAttribute();
            BeginContext(94, 432, true);
            WriteLiteral(@" method=""post"">
    <div>
        <label for=""title"">Add Todo:</label>
    </div>
    <input type=""text"" name=""title"" value="""" />
    <button type=""submit"" class=""btn btn-success btn-sm"">Add</button>
</form>

<br />

<table class=""table table-striped"">
    <tr class=""thead-dark text-center font-weight-bold"">
        <th>Title</th>
        <th>Complete</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
");
            EndContext();
#line 24 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
     foreach (var todo in Model.Todos)
    {

#line default
#line hidden
            BeginContext(573, 30, true);
            WriteLiteral("        <tr>\r\n            <td>");
            EndContext();
            BeginContext(604, 10, false);
#line 27 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
           Write(todo.Title);

#line default
#line hidden
            EndContext();
            BeginContext(614, 292, true);
            WriteLiteral(@"</td>
            
            <td class=""text-center"">
                <form>
                    <button type=""submit"" class=""btn btn-success btn-sm"">Complete</button>
                </form>
            </td>
            
            <td class=""text-center"">
                <form");
            EndContext();
            BeginWriteAttribute("action", " action=\"", 906, "\"", 961, 4);
            WriteAttributeValue("", 915, "todo/edit?id=", 915, 13, true);
#line 36 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
WriteAttributeValue("", 928, todo.TodoId, 928, 12, false);

#line default
#line hidden
            WriteAttributeValue("", 940, "&username=", 940, 10, true);
#line 36 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
WriteAttributeValue("", 950, Model.Name, 950, 11, false);

#line default
#line hidden
            EndWriteAttribute();
            BeginContext(962, 222, true);
            WriteLiteral(" method=\"post\">\r\n                    <button type=\"submit\" class=\"btn btn-primary btn-sm\">Edit</button>\r\n                </form>\r\n            </td>\r\n            \r\n            <td class=\"text-center\">\r\n                <form");
            EndContext();
            BeginWriteAttribute("action", " action=\"", 1184, "\"", 1241, 4);
            WriteAttributeValue("", 1193, "todo/delete?id=", 1193, 15, true);
#line 42 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
WriteAttributeValue("", 1208, todo.TodoId, 1208, 12, false);

#line default
#line hidden
            WriteAttributeValue("", 1220, "&username=", 1220, 10, true);
#line 42 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
WriteAttributeValue("", 1230, Model.Name, 1230, 11, false);

#line default
#line hidden
            EndWriteAttribute();
            BeginContext(1242, 165, true);
            WriteLiteral(" method=\"post\">\r\n                    <button type=\"submit\" class=\"btn btn-danger btn-sm\">Delete</button>\r\n                </form>\r\n            </td>\r\n        </tr>\r\n");
            EndContext();
#line 47 "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\Todo\Todo.cshtml"
    }

#line default
#line hidden
            BeginContext(1414, 8, true);
            WriteLiteral("</table>");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<User> Html { get; private set; }
    }
}
#pragma warning restore 1591
