#pragma checksum "C:\Users\Hp i7 Pro\Desktop\greenfox\adamkocso\week-11\Todo\TodoApp\Views\User\RenderLogin.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "5caa7eb386746afc9f854dd152a0c003d7812857"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_User_RenderLogin), @"mvc.1.0.view", @"/Views/User/RenderLogin.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/User/RenderLogin.cshtml", typeof(AspNetCore.Views_User_RenderLogin))]
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
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"5caa7eb386746afc9f854dd152a0c003d7812857", @"/Views/User/RenderLogin.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"d8e2dbb28b70bf695c03d3b691e2b5b46c2fecbf", @"/Views/_ViewImports.cshtml")]
    public class Views_User_RenderLogin : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(0, 262, true);
            WriteLiteral(@"<h1>Login to your Todos</h1>
<form action=""/login"" method=""post"">
    <div>
        <label for=""username"">Username</label>
    </div>
    <input type=""text"" name=""username"" />
    <button type=""submit"" class=""btn btn-primary btn-sm"">Login</button>
</form>");
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
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; }
    }
}
#pragma warning restore 1591
