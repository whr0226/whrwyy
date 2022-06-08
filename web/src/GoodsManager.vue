<template>
    <div>
        <!-- <h3>我是商品管理页面 goods-manager.vue</h3> -->
        <div class="manager-head">
            <div class="box">
                <div class="title">商品管理</div>
                <router-link to="/gm/add">
                    <i class="fa fa-plus-square"></i>
                    商品添加
                </router-link>
                <router-link to="/gm/category">
                    <i class="fa fa-tasks"></i>
                    分类管理
                </router-link>
            </div>
            <div class="box">
                <i class="fa fa-search"></i>
                <i class="fa fa-filter"></i>
                <div class="header-item">
                    <span>切换查看</span>
                    <div class="item-box">
                        <div class="sty">
                            <i class="fa fa-th-large"></i>
                            <router-link to="/gm/">
                                <span>样式一</span>
                            </router-link>
                        </div>
                        <div class="sty">
                            <i class="fa fa-bars"></i>
                            <router-link to="/gm/otherstyle">
                                <span>样式二</span>
                            </router-link>
                        </div>
                    </div>
                </div>
                
                <!-- <router-link to="/gm/otherstyle">
                    <i class="fa fa-th-large"></i>
                    切换查看{{sty === true ? "one" : "two"}}
                </router-link> -->
                <!-- <div v-bind:n="sty">
                    <i class="fa fa-th-large"></i>
                    切换查看{{sty === true ? "one" : "two"}}
                </div> -->
            </div>
        </div>
        <router-view></router-view>
    </div>
</template>
<script>
module.exports = {
    data() {
        return {
            sty:true
        }
    },
    methods: {
    }
}
</script>
<style>
.manager-head {
    display: flex;
    justify-content: space-between;
    background-color: beige;
}
.manager-head .box {
    margin:0px 5px;
    font-size: 14px;
    height: 30px;
    line-height: 25px;
    padding: 5px;
    display: flex;
}
.manager-head .box:last-child {
    margin-right: 40px;
}
.manager-head .box>i {
    margin: 0px 5px;
}
.manager-head .box:last-child i {
    line-height: 30px;
}
.manager-head .box:last-child i:last-child {
    padding-left: 5px;
    border-left: 1px solid #ccc;
}
.manager-head .box .title {
    padding-right: 5px;
    border-right: 1px solid #ccc;
    margin-right: 5px;
}
.manager-head .box:first-child i{
    margin-left: 10px;
}
.manager-head .box .header-item {
    position:relative;
}
.manager-head .box .header-item .item-box{
    position: absolute;
    top:-30px;
    left: 56px;
    display: none;
    width: 100px;
    height: 60px;
    text-align: center;
    background-color: rgba(233, 150, 122, 0.5);
}
.manager-head .box .header-item:hover .item-box {
    display: block;
}
</style>