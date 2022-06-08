<template>
    <div class="out-container">
        <!-- layout-side : 里面是左侧的菜单 -->
        <layout-side v-bind:goods="goods"></layout-side>
        <div class="main-container">
            <!-- layout-header : 里面是右侧的顶部 -->
            <layout-header></layout-header>
            <div class="body-container">
                <router-view></router-view>
                <!-- <button v-on:click="gethello">点击获取后端数据</button> -->
            </div>
        </div>
    </div>
    
</template>
<script> 
module.exports = {
    data() {
        return {
            goods:null
        }
    },
    methods:{
        sendSty(s) {
            console.log("APP",s)
        },
        gethello() {
            let p = axios.get("http://localhost:8080/hello");
            p.then(
                (r) => {
                    console.log(r.data);
                }
            );
        },
    },
};
</script>

<style scoped>
.out-container {
    display: flex;
    width: 1000px;
    margin: 0px auto;
}
.main-container {
    border: 0.5px solid #ccc;
    width: 100%;
}
</style>