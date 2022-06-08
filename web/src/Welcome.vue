<template>
    <!-- 我是首页 welcome.vue -->
    <div class="container">
        <div class="box">
            <div class="item">
                <div class="one"><i class="fa fa-eye"></i></div>
                <div class="one1">浏览量</div>
                <div class="one2">239,456</div>
            </div>
            <div class="item">
                <div class="one3">订单量</div>
                <div class="one2">239,456</div>
            </div>
            <div class="item">
                <div class="one"><i class="fa fa-database"></i></div>
                <div class="one1">总金额</div>
                <div class="one2">239,456</div>
            </div>
        </div>
        <div class="box">
            <div class="item2">
                <div style="margin: 10px 0px 0px 10px;"><i class="fa fa-circle"></i>待办事项</div>
                <div class="two">
                    <i class="fa fa-tasks"></i>
                    <div class="t">
                        <div class="t1">共有30条待处理订单</div>
                        <div class="t2">
                              达内教育集团成立于2002年9月，由中国软件教育专家
                            韩少云先生创办，是目前中国IT职业教育集团领导品牌，
                            是IT职业教育的“黄埔军校”。
                        </div>
                    </div>
                    <button>立即处理</button>
                </div>
            </div>

            <div class="item3">
                <div style="margin: 10px 0px 0px 10px;"><i class="fa fa-circle"></i>商品零售量统计</div>
                <div class="three">
                    <div class="sh">
                        <div>商品数量</div>
                        <div>1500</div>
                    </div>
                </div>
                <div class="three1">
                    <div class="sh1"><img src="../6365.jpg" class="image1"></div>
                    <div class="sh2">
                        <div class="sh3">
                            <div>商品名称</div>
                            <div>500</div>
                        </div>
                        <div style="color:cadetblue">商品属性</div>
                    </div>            
                </div>
            </div>
        </div>

        <div class="box">
            <div class="item2">
                <div style="margin: 10px 0px 0px 10px;"><i class="fa fa-circle"></i>零售趋势图</div>
                <img src="../背景.jpg" class="image2">
            </div>
            <div class="item3">
                <div style="margin: 10px 0px 0px 10px;"><i class="fa fa-circle"></i>用户统计环形图</div>
                <img src="../背景.jpg" class="image3">
            </div>
        </div>

    </div>
</template>
<script>
module.exports = {
};
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
        width: 30%;
        height: 100px;
        background-color: rgb(139, 245, 245);
    }
    .one{
        font-size: 36px;
        display: flex;
        margin: 10px 20px;
        justify-content: flex-end;
    }
    .one1{
        font-size: 10px;
        margin: 0px 0px 0px 20px;
    }
    .one2{
        margin: 0px 0px 0px 20px;
    }
    .one3{
        font-size: 10px;
        margin: 56px 0px 0px 20px;
    }
    .two{
        width: 100%;
        display: flex;
        align-content: center;
        align-items: center;
        justify-content: space-around;
    }
    .t1{
        line-height: 40px;
    }
    .t2{
        width: 400px;
        height: 40px;
        font-size: 10px;
    }
    .container .box .item2 {
        border-radius: 5px;
        margin: 20px;
        background-color: blanchedalmond;
        height: 120px;
        width: 65%;
    }
    .container .box .item3 {
        border-radius: 5px;
        margin: 20px;
        background-color: blanchedalmond;
        height: 120px;
        width: 30%;
    }
    .three{
        display: flex;
        width: 100%;
        justify-content: space-around;
        line-height: 30px;
    }
    .sh{
        display: flex;
        width: 90%;
        justify-content: space-between;
        border-bottom: 1px solid slategrey;
        font-size: 13px;
    }
    .three1{
        display: flex;
        width: 100%;
        justify-content: space-evenly;
        margin: 5px 0px;
        line-height: 20px;
    }
    .sh1{
        width: 40px;
        height: 40px;
        background-color: darkgrey;
    }
    .sh2{
        font-size: 10px;
    }
    .sh3{
        display: flex;
        width: 160px;
        height: 20px;
        justify-content: space-between;
        font-size: 10px;
    }
    .image1{
        width: 40px;
        height: 40px;
    }
    .image2{
        margin: 10px 0px 0px 10px;
        width: 95%;
        height: 60%;
    }
    .image3{
        margin: 10px 0px 0px 10px;
        width: 90%;
        height: 60%;
    }

    /* .container .box .item2:first-child {
        width: 55%;
    } */
</style>