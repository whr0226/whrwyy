<template>
  <div>
        <div class="goodlist">
            <div v-for="good in goods" v-bind:key="good" class="goodone">
                <div><img v-bind:src="good.imgurl"></div>
                <div>{{good.goodsname}}</div>
                <div>
                    <i class="fa fa-jpy"></i>{{good.price}}
                </div>
                <div>拣货中</div>
                <div>
                    <button><i class="fa fa-pencil"></i></button>
                    <button><i class="fa fa-trash"></i></button>  
                </div>
            </div>

        </div>
        <div class="buttom">
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
module.exports =  {
    data(){
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
        }
    },
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
        display: flex;
        text-align: center;
        margin: 10px;
        width: 90%;
        height: 150px;
        border-radius: 6px;
        background-color: bisque;
        align-items: center;
        justify-content: space-between;
    }
.goodlist img {
        width: 90px;
        height: 90px;
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
    .goodlist .goodone div:first-child {
        margin-left: 10px;
    }
    .goodlist .goodone div:last-child {
        /* padding-left: 10px; */
        margin-right: 10px;
    }
</style>