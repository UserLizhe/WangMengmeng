const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4co0k/",
            name: "springboot4co0k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4co0k/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园食堂外卖系统的设计与实现"
        } 
    }
}
export default base
