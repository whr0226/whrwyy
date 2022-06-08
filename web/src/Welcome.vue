<template>
    <div>
        <!-- 我是首页 welcome.vue -->
        <div class="container">
            <div class="box">
                <div class="item"><i class="fa fa-eye"></i>浏览量</div>
                <div class="item">订单量</div>
                <div class="item"><i class="fa fa-database"></i>总金额</div>
            </div>
            <div class="box">
                <div class="item2"><i class="fa fa-circle"></i>待办事项</div>
                <div class="item2"><i class="fa fa-circle"></i>商品零售量统计</div>
            </div>
            <div class="box">
                <div class="item2"><i class="fa fa-circle"></i>零售趋势图</div>
                <div class="item2"><i class="fa fa-circle"></i>用户统计环形图</div>
            </div>
        </div>
    </div>
</template>
<script>
module.exports = {
};
</script>
<style scoped>
    .container {
            display: block;
            width: 100%;
            height: 400px;
        }
    .container .box{
        width: 100%;
        height: 140px;
        display: flex;
        justify-content: space-between
    }
    .container .box:first-child {
        height: 120px;
    }
    .container .box .item {
        margin: 20px;
        border-radius: 5px;
        text-align: center;
        width: 30%;
        height: 120;
        background-color: aqua;
        line-height: 80px;
    }
    .container .box .item2 {
        border-radius: 5px;
        margin: 20px;
        background-color: blanchedalmond;
        height: 120px;
        width: 40%;
    }
    .container .box .item2:first-child {
        width: 55%;
    }
</style>