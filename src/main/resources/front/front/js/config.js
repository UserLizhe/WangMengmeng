
var projectName = '校园食堂外卖系统的设计与实现';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '商家',
	url: './pages/shangjia/list.html'
}, 
{
	name: '菜品信息',
	url: './pages/caipinxinxi/list.html'
}, 
{
	name: '订单评价',
	url: './pages/dingdanpingjia/list.html'
}, 

{
	name: '系统公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot4co0k/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"菜品分类","menuJump":"列表","tableName":"caipinfenlei"}],"menu":"菜品分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"骑手","menuJump":"列表","tableName":"qishou"}],"menu":"骑手管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"配送任务","menuJump":"列表","tableName":"peisongrenwu"}],"menu":"配送任务管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"配送订单","menuJump":"列表","tableName":"peisongdingdan"}],"menu":"配送订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"订单评价","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"帮助中心","tableName":"chat"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"商家列表","menuJump":"列表","tableName":"shangjia"}],"menu":"商家模块"},{"child":[{"buttons":["查看","购物车购买"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"订单评价列表","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","审核","发布任务"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","修改"],"menu":"配送任务","menuJump":"列表","tableName":"peisongrenwu"}],"menu":"配送任务管理"},{"child":[{"buttons":["查看"],"menu":"配送订单","menuJump":"列表","tableName":"peisongdingdan"}],"menu":"配送订单管理"},{"child":[{"buttons":["查看","审核","删除"],"menu":"订单评价","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"商家列表","menuJump":"列表","tableName":"shangjia"}],"menu":"商家模块"},{"child":[{"buttons":["查看","购物车购买"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"订单评价列表","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"商家","tableName":"shangjia"},{"backMenu":[{"child":[{"buttons":["查看","修改","支付","删除"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","订单评价"],"menu":"配送订单","menuJump":"列表","tableName":"peisongdingdan"}],"menu":"配送订单管理"},{"child":[{"buttons":["查看","修改","查看评论"],"menu":"订单评价","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"商家列表","menuJump":"列表","tableName":"shangjia"}],"menu":"商家模块"},{"child":[{"buttons":["查看","购物车购买"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"订单评价列表","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","抢单"],"menu":"配送任务","menuJump":"列表","tableName":"peisongrenwu"}],"menu":"配送任务管理"},{"child":[{"buttons":["查看","修改"],"menu":"配送订单","menuJump":"列表","tableName":"peisongdingdan"}],"menu":"配送订单管理"},{"child":[{"buttons":["查看"],"menu":"订单评价","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"商家列表","menuJump":"列表","tableName":"shangjia"}],"menu":"商家模块"},{"child":[{"buttons":["查看","购物车购买"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"订单评价列表","menuJump":"列表","tableName":"dingdanpingjia"}],"menu":"订单评价模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"骑手","tableName":"qishou"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
