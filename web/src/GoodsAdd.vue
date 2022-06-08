<template>
    <div>
        <div class="goodslist"></div>
        <div class="good-form">
            <input type="text" v-model="good.goodname"  placeholder="请输入商品名称">
            <input type="text" v-model="good.price" placeholder="请输入商品价格">
            <input type="file" >
            <button v-on:click="postgood">提交</button>
            <button v-on:click="login">测试登录</button>
            
        </div>
        <!-- 用户名：<input type="text" v-model="user.username" placeholder="输入用户名">
        密码：<input type="password" v-model="user.password" placeholder="输入密码">
        <button v-on:click="postDataToJava">提交</button> -->
    </div>
</template>
<script>
module.exports = {
    data() {
        return {
            good: {
                goodname:"???",
                price:10.00,
                imgurl:"src\\assets\\image\\favicon.png"
            },
        }
    },
    methods: {
        login() {
            axios.get("/auth/login",{
                params: {
                    user:this.good.goodname,
                    password:this.good.price
                }
            })
        },
        postgood() {

            console.log(this.good)
        }
    }
}
</script>