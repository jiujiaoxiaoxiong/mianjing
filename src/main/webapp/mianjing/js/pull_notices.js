﻿$(function(){var t=function(){$.get("/notices/unread_count.json",{ts:+new Date},function(t){count=t.count,count?$(".navbar-fixed-top #message .label").html(count).css("display","inline"):$(".navbar-fixed-top #message .label").css("display","none")})};setInterval(t,15e4),t()});