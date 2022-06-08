<template>
    <div>
        <div class="goodslist"></div>
        <h4>这里是商品新增页面</h4>
        <div class="good-form">
            <input type="text" v-model="good.goodname"  placeholder="请输入商品名称">
            <input type="text" v-model="good.price" placeholder="请输入商品价格">
            <input type="file" >
            <button v-on:click="postgood">提交</button> -->
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
            // user:{
            //     username:"",
            //     password:""
            // }
        }
    },
    methods: {
        postgood() {

            console.log(this.good)
        }
        // getGoods() {
        //     axios.get("/getGoods").then((r) => {
        //         this.goods = r;
        //     })
        // },
        // postDataToJava() {
        //     axios.get("/hello",{
        //         params:this.user
        //     }).then((r) => {
        //         console.log(r.data);
        //         if(r.data == "hello") {
        //             this.$router.push({path:"/"});
        //         } else {
        //             alert("错了错了！")
        //         }
        //     })
        // }
    }
}

</script>