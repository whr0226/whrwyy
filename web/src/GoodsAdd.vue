<template>
    <div>
        <div class="tip">
            <div class="success" v-if="ts">
                <div>添加成功！</div>
                <a v-on:click="closets" class="light">确定</a>
            </div>
        </div>
        <form action="" class="good-form">
            <div class="item">
                商品分类：
                <select v-model="good.category">
                    <option v-for="i in categorys" v-bind:key="i">
                        {{i.categoryname}}
                    </option>
                </select>
            </div>
            <div class="item">
                商品名称：
                <input type="text" v-model="good.goodsname" placeholder="请输入商品名称">
            </div>
            <div class="item">
                商品价格：
                <input type="text" v-model="good.price" placeholder="请输入商品价格">
            </div>
            <div class="item">
                商品图骗：
                <i class="fa fa-plus-square-o"></i>
                <input type="file" v-bind:src="good.imgurl" v-on:change="imgChange"  placeholder="请输入商品图片">
            </div>
            <div class="item">商品详情：<br>
                <textarea v-model="good.comment" cols="60" rows="4"  placeholder="请对商品进行描述"></textarea>
            </div>
            <div class="item">
                <a v-on:click="handleClick(1)" class="light">保存</a>
                <a v-on:click="handleClick(0)" class="light">取消</a>
            </div>
        </form>
    </div>
</template>
<script>
module.exports = {
    data() {
        let localcategorys = JSON.parse(localStorage.getItem("categorys"));
        return {
            ts:false,
            // categorys:["百货","美妆","男装","女装","数码","母婴"],
            categorys:localcategorys,
            good: {
                category:"",
                goodsname:"",
                price:null,
                imgurl:"/src/assets/image/yidou.png",
                comment:""
            },
        }
    },
    methods: {
        closets() {
            this.ts = false
        },
        imgChange() {

        },
        handleClick(e) {
            // console.log(localgoods)
            // console.log(localgoods)
            // this.$route.path = "/gm";
            // console.log(this.$route.path);
            if (e === 1) {
                let localcategorys = JSON.parse(localStorage.getItem("categorys"));
                let localgoods = JSON.parse(localStorage.getItem("goods"));
                localgoods.push(this.good);
                for (i in localcategorys) {
                    if (this.good.category === localcategorys[i].categoryname) {
                        localcategorys[i].goodsmount += 1
                    }
                }
                localStorage.setItem("categorys", JSON.stringify(localcategorys));
                localStorage.setItem("goods", JSON.stringify(localgoods));
                this.ts = true
            } else {

            }
            
        }
    }
}
</script> 
<style scoped>
    .good-form {
        width: 850px;
        height: 350px;
        margin: 15px;
    }
    .good-form div {
        width: 800px;
        padding: 15px 10px;
    }
    .light {
        user-select: none;
        cursor:hand;
        border-radius: 5px;
        background-color: rgba(0, 191, 255, 0.44);
    }
    .light:hover {
        background-color: deepskyblue;
    }
    .light:active {
        background-color: rgba(80, 17, 228, 0.627);
    }
    .tip {
        position: relative;
    }
    .tip .success {
        width: 120px;
        height: 60px;
        border: 1px solid #ccc;
        text-align: center;
        position: absolute;
        top: 100px;
        left: 35%;
    }
</style>
