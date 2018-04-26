var navs = [{
	"title": "系统设置",
	"icon": "fa-cubes",
	"spread": true,//是否默认展开
	"children": [{
		"title": "个人设置",
		"icon": "&#xe614;",
		"href": "/user/toMyself.do"
	}, {
		"title": "部门信息",
		"icon": "&#xe63c;",
		"href": "/dept/toDeptInfo.do"
	}, {
		"title": "工作日志",
		"icon": "&#xe63c;",
		"href": "#"
	},]
}, {
	"title": "考勤审批",
	"icon": "&#xe63c",
	"spread": false,
	"children": [{
		"title": "打卡签到",
		"icon": "&#xe605;",
		"href": "/checkOnWork/toDoCheckSelf.do"
	}, {
		"title": "请假申请",
		"icon": "&#xe63f;",
		"href": "/approval/toAskToLeave.do",
	}, {
		"title": "加班申请",
		"icon": "&#xe63f;",
		"href": "/approval/toExtraWork.do"
	}, {
		"title": "我发起的",
		"icon": "&#xe609;",
		"href": "/approval/toMyApprovalSend.do"
	}, {
		"title": "我审批的",
		"icon": "&#xe609;",
		"href": "/approval/toMyAccept.do"
	}]
},{
	"title": "通讯系统",
	"icon": "&#xe611;",
	"spread": false,
	"children": [{
		"title": "我的群组",
		"icon": "&#xe613;",
		"href": "#"
	},{
		"title": "信息管理",
		"icon": "&#xe63b;",
		"href": "#"
	}]
}, {
	"title": "会议相关",
	"icon": "&#xe60f;",
	"spread": false,
	"children": [{
		"title": "预约会议",
		"icon": "&#xe608;",
		"href": "/meeting/toAddMeeting.do"
	},{
		"title":"我的会议",
		"icon":"&#xe60f;",
		"href":"/meeting/toMyMeeting.do"
	},{
		"title": "查询会议",
		"icon": "&#xe63f;",
		"href": "/meeting/toMeetingTable.do"
	},{
		"title": "会议室查询",
		"icon": "&#xe63f;",
		"href": "/meeting/MTRtableOnlyRead.do"
	}]
}, {
	"title": "聊天",
	"icon": "fa-address-book",
	"href": "",
	"spread": false,
	"children": [{
		"title": "电话本",
		"icon": "fa-wechat",
		"href": "/employee/toEmpPhone.do"
	}, {
		"title": "QQ",
		"icon": "fa-qq",
		"href": "http://web2.qq.com/"
	}]
},{
	"title": "管理员设置",
	"icon": "fa-cogs",
	"href": "#",
	"spread": false,
	"children": [{
		"title": "员工管理",
		"icon": "&#xe612",
		"href": "/employee/empTable.do"
	},{
		"title": "用户管理",
		"icon": "&#xe612",
		"href": "/user/userTable.do"
	},{
		"title": "部门管理",
		"icon": "&#xe62b",
		"href": "/dept/deptTable.do"
	},{
		"title":"会议室管理",
		"icon": "&#xe68e",
		"href": "/meeting/toMeetingRoomTable.do"
	},{
		"title":"审批组管理",
		"icon": "&#xe642",
		"href": "/approval/toApprovalGroupTable.do"
	},{
		"title":"审批管理",
		"icon": "&#xe642",
		"href": "/approval/toAllApprovalTable.do"	
	},{
		"title":"考勤统计",
		"icon": "&#xe612",
		"href": "/checkOnWork/toCheckTimeAll.do"
	}]
}];
if(sessionName == "zmj"){
	navs = navs;
}else{
	navs.pop();
}