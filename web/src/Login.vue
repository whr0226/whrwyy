<template>
  <div>
    <div class="container">
        <div class="sign">
            <h2>电商后台管理系统</h2>
            <div class="user">
                <div class="fa fa-user"></div>
                <input type="text" class="kuang" v-model="user.username">
                <!-- <div class="kuang"></div> -->
            </div>
            <div class="lock">
                <div class="fa fa-lock"></div>
                <input type="text" class="kuang" v-model="user.password">
            </div>
            <div class="denglu">
                <!-- <div class="ying"></div> -->
                <a href="./index.html" class="button" v-on:click="login">登录</a>
            </div>
            <div onclick="handleClick()" class="fpasswd">忘记密码</div>
        </div>

        <div class="forget">
            <h2>忘记密码</h2>
            <div class="email">
                <div class="fa fa-envelope"></div>
                <input type="text" class="kuang">
            </div>
            <div class="yzm">
                <span class="ying"></span><input type="text" class="kuang1">
                <button class="send">发送验证码</button>
            </div>
            <div class="lock">
                <div class="fa fa-lock"></div>
                <input type="text" class="kuang">
            </div>
            <div class="xlock">
                <span class="ying"></span>
                <input type="text" class="kuang">
            </div>
            <div class="xlock">
                <span class="ying"></span>
                <div class="sure">确定</div>
            </div>
            <div class="xlock">
                <span class="ying"></span>
                <div  onclick="handleClick1()" class="return">返回登录</div>
            </div>
        </div>
    </div>
  </div>
</template>

<script>
module.exports = {
    data() {
        return {
            user:{
                username:"",
                password:""
            }
        }
    },
    methods: {
        login() {
            axios.get("/auth/login",{
                params: {
                    username:this.user.username,
                    password:this.user.password
                }
            })
        },
    }
}
</script>

<style scoped>
    body{
            background-color:rgb(94, 103, 110) ;
        }
        .container{
            width: 600px;
            height: 360px;
            background-color: #f0f8ff;
            border-radius: 20px;
            margin: 100px auto;
            text-align: center;
            user-select: none;
            position: relative;
        }

        
        .container .sign{
            width: 600px;
            height: 360px;
            position: absolute;
            margin: 40px auto;
            /* display: none; */
        }
        
        .container .forget{
            width: 600px;
            height: 360px;
            position: absolute;
            margin: 30px auto;
            display: none;
        }
        .container .sign .user{
            display: flex;
            justify-content: center;
        }
        .container .sign .lock{
            display: flex;
            justify-content: center;
            margin: 20px;
        }
        .kuang{
            width: 260px;
            height: 20px;
            border: 1px solid rgb(94, 103, 110);
        }
        .fa.fa-user,
        .fa.fa-lock{
            font-size: 25px;
            width: 28px;
        }

        .container .forget .email{
            display: flex;
            justify-content: center;
        }
        .container .forget .yzm{
            display: flex;
            justify-content: center;
        }
        .ying{
            width: 28px;
        }
        .kuang1{
            width: 166px;
            height: 20px;
            border: 1px solid rgb(94, 103, 110);
            margin: 15px 5px 15px 0px;
        }
        .send{
            width: 90px;
            height: 24px;
            border: 1px solid rgb(94, 103, 110);
            margin: 15px 0px 0px 0px;
        }
        .container .forget .lock{
            display: flex;
            justify-content: center;
        }
        .container .forget .xlock{
            display: flex;
            justify-content: center;
            margin: 15px;
        }
        .fa.fa-envelope{
            font-size: 20px;
            width: 28px;
        }
        .sure{
            width: 260px;
            height: 20px;
            border: 1px solid rgb(94, 103, 110);
            border-radius: 5px;
            background-color: rgb(66, 235, 198);
        }

        .denglu{
            background-color: rgb(97, 243, 243);
            margin: auto 180px ;
            width: 266px;
            height: 20px;
        }
        .button:active{
            color:aquamarine ;
            display: block;
            width: 266px;
            height: 20px;
            background-color:rgb(123, 164, 241) ;
            margin: auto ;
            border-radius: 3px;
        }
        .container .sign .fpasswd{
            width: 100px;
            background-color: rgb(200, 206, 206);
            margin: 20px 30%;
        }
</style>