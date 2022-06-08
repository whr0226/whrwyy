<template>
    <div>
        <div class="category-list">
            <div v-for="category in categorys" v-bind:key="category" class="category">
                <div class="category-name">
                    {{category.categoryname}}
                </div>
                <div class="goods-mount">
                    <div>商品</div>
                    已有个数
                    <div class="mount">{{category.goodsmount}}</div>
                </div>
            </div>
            <div class="category">
                <a v-on:click="addCategory">
                    <div class="category-name">
                        <i class="fa fa-plus-square"></i>
                    </div>
                    <div>
                        <span  v-if="w">新增分类</span>
                        <input type="text" v-if="fw" v-model="newcategory.categoryname">
                    </div>
                </a>
            </div>
        </div>
        <div class="button">
            <a v-on:click="handleClick(1)" class="light">保存</a>
            <a v-on:click="handleClick(0)" class="light">取消</a>
        </div>
    </div>
</template>
<script>
module.exports = {
    data() {
        let localcategorys = JSON.parse(localStorage.getItem("categorys"));
        return {
            newcategory:{
                categoryname:"",
                goodsmount:0
            },
            categorys:localcategorys,
            w:true,
            fw:false
        }
    },
    methods: {
        addCategory () {
            this.w = false
            this.fw = true
            console.log("handle")
        },
        handleClick (e) {
            if (e === 1){
                console.log(e)
                this.categorys.push(this.newcategory);
                localStorage.setItem("categorys", JSON.stringify(this.categorys));
            }else{
                console.log(e)
            }
        },
    }
}
</script>

<style>
    .category-list {
        display: flex;
        justify-content: flex-start;
        flex-wrap: wrap;
        margin-left: 20px;
    }
    .category-list .category {
        margin: 10px;
        border-radius: 10px;
        border: 1px solid #ccc;
        display: flex;
        width: 200px;
        height: 100px;
        border-radius: 10px;
        background-color: aliceblue;
        flex-wrap: nowrap;
        align-items: center;
        justify-content: flex-start;
        align-content: center;
    }
    .category-list .category .category-name {
        text-align: center;
        border-radius: 10px;
        line-height: 100px;
        width:45%;
        background-color: cornflowerblue;
        margin-right: 10px;
    }
    .category-list .category i {
        font-size: larger;
    }
    .category-list .category:last-child a {
        display: flex;
        align-items: center;
    }
    .category-list .category:last-child a div:first-child {
        width: 80px;
        height: 100px;
        padding-right: 10px;
        background-color: aquamarine;
    }
    .category-list .category:last-child input{
        text-align: center;
        font-size: large;
        width: 100px;
        height: 100px;
        border: 1px solid #ccc;
        border-left: 0px;
        border-radius: 10px;
        padding: 0px;
        background-color: aliceblue;
    }
    .light {
        user-select: none;
        display: inline-block;
        width: 60px;
        height: 40px;
        line-height: 40px;
        text-align: center;
        margin-left: 20px;
        cursor:hand;
        border-radius: 5px;
        background-color: rgba(0, 191, 255, 0.44);
    }
    .light:hover {
        background-color: rgb(0, 191, 255);
    }
    .light:active {
        background-color: rgba(80, 17, 228, 0.627);
    }
</style>
