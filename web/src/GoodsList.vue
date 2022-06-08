<template>
    <div>
        <div class="goodlist">
            <div v-for="good in goods" v-bind:key="good" class="goodone">
                <img v-bind:src="good.imgurl">
                <br>
                <div>
                    <i class="fa fa-jpy"></i>{{good.price}}
                    {{good.goodsname}}
                </div>
                <div>
                    {{n}}
                    <button><i class="fa fa-pencil"></i></button>
                    <button><i class="fa fa-trash"></i></button>  
                </div>
            </div>
 
        </div>
        <div class="buttom" v-on:click="move(0)">
            <div class="subs"><i class="fa fa-chevron-left"></i></div>
            <div class="subs">1</div>
            <div class="subs">2</div>
            <div class="subs">3</div>
            <div class="subs">4</div>   
            <div class="subs">5</div>
            <div class="subs"><i class="fa fa-chevron-right"></i></div>
        </div>
    </div>
</template>
<script>   
module.exports = {
    props: ["n"],
    data(){
        // let p = axios.get("/sendGoods");
        // p.then((r) => {
        //     this.goods = r;
        // })
        return {
            goods:[
                {goodsname:"魈",price:120,imgurl:"/src/assets/image/xiao.png"},
                {goodsname:"夜兰",price:648,imgurl:"/src/assets/image/yelan.png"},
                {goodsname:"一斗",price:86,imgurl:"/src/assets/image/yidou.png"},
                {goodsname:"魈",price:120,imgurl:"/src/assets/image/xiao.png"},
                {goodsname:"夜兰",price:648,imgurl:"/src/assets/image/yelan.png"},
                {goodsname:"一斗",price:86,imgurl:"/src/assets/image/yidou.png"},
                {goodsname:"魈",price:120,imgurl:"/src/assets/image/xiao.png"},
                {goodsname:"夜兰",price:648,imgurl:"/src/assets/image/yelan.png"},
                {goodsname:"一斗",price:86,imgurl:"/src/assets/image/yidou.png"},
                {goodsname:"魈",price:120,imgurl:"/src/assets/image/xiao.png"},
                {goodsname:"夜兰",price:648,imgurl:"/src/assets/image/yelan.png"},
                {goodsname:"一斗",price:86,imgurl:"/src/assets/image/yidou.png"},
                {goodsname:"魈",price:120,imgurl:"/src/assets/image/xiao.png"},
                {goodsname:"夜兰",price:648,imgurl:"/src/assets/image/yelan.png"},
                {goodsname:"一斗",price:86,imgurl:"/src/assets/image/yidou.png"},
            ],
            one:true,
            two:false
        }
    },
    methods: {
        
    }
}
</script>

<style scoped>
    .goodlist{
        position: relative;
        width: 100%;
        height: 350px;
        display: flex;
        flex-wrap: wrap;
        align-content: flex-start;
        justify-content: space-around;
        overflow: hidden;
    }
    .goodone {
        text-align: center;
        margin: 10px;
        width:125px;
        height: 150px;
        border-radius: 6px;
        background-color: bisque;
    }
    .goodlist img {
        width: 90px;
        height: 90px;
    }
    .goodlist .goodone div:first-child {
        text-align: left;
    }
    .goodlist .goodone div:last-child {
        text-align: right;
        border: 5px;
        padding-right: 10px;
    }
    .buttom{
        position: absolute;
        width: 100%;
        top: 480px;
        left: 50px;
        display: flex;
        justify-content: center;
    }
    .buttom .subs{
        width: 20px;
        height: 20px;
        border: 1px solid silver;
        text-align: center;
        margin: 0px 10px;
    }
    .goodtwo{
        display: flex;
        width: 90%;
        height: 150px;
    }
</style>   