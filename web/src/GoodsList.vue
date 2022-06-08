<template>
    <div>
        <div class="goodlist">
            <div v-for="(good, m) in goods" v-bind:key="m" class="goodone">
                <img v-bind:src="good.imgurl">
                <br>
                <div>
                    <i class="fa fa-jpy"></i>{{good.price}}
                    {{good.goodsname}}
                </div>
                <div>
                    <button><i class="fa fa-pencil" v-on:click="edit(m)"></i></button>
                    <a><i class="fa fa-trash" v-on:click="deletegood(m)"></i></a>  
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
    data(){
        let localgoods = JSON.parse(localStorage.getItem("goods"));
        return {
            goods:localgoods
        }
    },
    methods: {
        deletegood(m) {
            let localcategorys = JSON.parse(localStorage.getItem("categorys"));
            let localgoods = JSON.parse(localStorage.getItem("goods"));
            for (i in localgoods) {
                if (i*1 === m) {
                    console.log(localgoods[i].category)
                    for (j in localcategorys) {
                        
                        if (localgoods[i].category === localcategorys[j].categoryname) {
                            console.log(localcategorys[j].categoryname)
                            localcategorys[j].goodsmount -= 1
                        }
                    }
                    localgoods.splice(i,1)
                }
            }
            localStorage.setItem("categorys", JSON.stringify(localcategorys));
            localStorage.setItem("goods", JSON.stringify(localgoods));
            this.$forceUpdate();
        },
        edit(m) {

        }
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