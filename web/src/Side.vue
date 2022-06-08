<template>
    <div class="menu-container">
        <div class="logo">
            <img src="./src/assets/image/favicon.png" />
        </div>
        <!-- <button v-on:click="handleBtnClick">点击此处查看此时的路由对象</button> -->
        <div>
            <router-link to="/">
                <i class="fa fa-home"></i>
                首页
            </router-link>
        </div>
        <div v-bind:class="{show:isshow}">
            <router-link to="/gm">
                <div>
                    <i class="fa fa-tag"></i>
                    商品管理
                </div>
            </router-link>
        </div>
        <div>
            <router-link to="/om">
                <i class="fa fa-file-text-o"></i>
                订单管理
            </router-link>
        </div>
        <div>
            <router-link to="/fm">
                <i class="fa fa-percent"></i>
                财务管理
            </router-link>
        </div>
        <div>
            <router-link to="/da">
                <i class="fa fa-bar-chart"></i>
                数据分析
            </router-link>
        </div>
        <div>
            <router-link to="/sys">
                <i class="fa fa-cog"></i>
                系统设置
            </router-link>
        </div>
    </div>
</template>

<script>
module.exports = {
    data() {
        return {
            isshow:false
        }
    },
    methods: {
        handleBtnClick() {
            // $route ：值的是当前路由
            // 拓展 ：如何根据当前的路由来高亮显示左侧的菜单？
            // 思路 ：可以运用 watch 或者 computed 来监视 $route 的变化
            console.log(this.$route);
            console.log(this.$route.path);
        },
    },
    witch: {
        '$route.path': function(newVal,oldVal){
            if(newVal === "/gm"){
                this.isshow = true
            } else {
                this.isshow = false
            }
        }
    }
};
</script>

<style scoped>
.menu-container {
    width: 160px;
    height: 450px;
    padding: 20px 0px 40px 0px;
    background-color: #ECECEC;
}

.menu-container .logo {
    padding: 20px;
    text-align: center;
}

.menu-container .logo img {
    max-width: 80%;
    max-height: 80%;
    display: inline-block;
}

.menu-container>div>a {
    text-align: center;
    display: block;
    font-size: 16px;
    height: 30px;
    margin: 10px auto;
    line-height: 30px;
    user-select: none;
    cursor: default;
    text-decoration: none;
}

.menu-container>a:hover {
    background-color: #CCC;
}

/* 当前被激活的路由连接是具备特定的样式的 */
.router-link-exact-active {
    background-color: rgb(200, 255, 0);
}
a:-webkit-any-link {
    text-decoration: none;
}
.show {
    background-color: rgb(200, 255, 0);
}
</style>