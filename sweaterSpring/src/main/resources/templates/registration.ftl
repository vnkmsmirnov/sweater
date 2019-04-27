<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
Add new
    ${message?if_exists}
<@l.login "/registration"/>
</@c.page>