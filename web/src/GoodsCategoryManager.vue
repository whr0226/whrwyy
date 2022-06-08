<template>
    <div>
        <h4>这里是商品分类管理页面</h4>
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
                        新增分类
                    </div>
                </a>
                
            </div>
        </div>
    </div>
</template>
<script>
module.exports = {
    data() {
        return {
            // categorys:["百货","美妆","男装","女装","数码","母婴"]
            categorys:[
                {categoryname:"百货",goodsmount:123},
                {categoryname:"美妆",goodsmount:234},
                {categoryname:"男装",goodsmount:345},
                {categoryname:"女装",goodsmount:456},
                {categoryname:"数码",goodsmount:567},
                {categoryname:"母婴",goodsmount:789},
            ]
        }
    },
    methods: {
        addCategory () {
            
        }
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
        margin-right: 20px;
    }
    .category-list .category i {
        font-size: larger;
    }
    .category-list .category:last-child {
        font-size: larger;
        text-align: center;
        line-height: 100px;
    }
</style>