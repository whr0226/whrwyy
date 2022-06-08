<template>
    <div class="header-container">
        <div class="header-item">
            <i class="fa fa-tasks"></i>
            <span>任务</span>
            <div class="dropdown-box">
                <div class="dropdown-notice">你有2个任务未完成</div>
                <div class="dropdown-list">
                    <div class="dropdown-item">
                        <i class="fa fa-plus"></i>
                        <span>添加属于你的第一个产品</span>
                        <b>未完成</b>
                    </div>
                    <div class="dropdown-item">
                        <i class="fa fa-lock"></i>
                        <span>设置管理员权限设置初始密码</span>
                        <b>未完成</b>
                    </div>
                </div>
            </div>
        </div>
        <div class="header-item">
            <i class="fa fa-comment"></i>
            <span>消息</span>
        </div>
        <div class="header-item">
            <i class="fa fa-user"></i>
            <span>张无忌</span>
        </div>
    </div>
</template>

<script>

</script>

<style scoped>
.header-container {
    display: flex;
    justify-content: end;
    height: 40px;
    background-color: darkgray;
}

.header-container .header-item {
    position: relative;
    line-height: 40px;
    margin: 0px 30px;
    padding: 0px 16px;
}

.header-container .header-item .dropdown-box {
    display: none;
    position: absolute;
    top: 102%;
    left: -120px;
    width: 300px;
    padding: 14px;
    border-radius: 0px 0px 20px 20px;
    border: 1px solid #CCC;
    overflow: auto;
    background-color: white;
}

.header-container .header-item:hover .dropdown-box {
    display: block;
}
</style>