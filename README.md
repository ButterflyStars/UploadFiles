# File-Upload

一个简单的网页文件上传

## 项目环境

+ SpringBoot 2.2.5
+ JDK 8
+ MySQL 5.7.29
+ Shiro 1.5.2
+ Thymeleaf  2.2.5.RELEASE

## 技术栈

SpringBoot + Mybatis + Shiro + Thymeleaf + Semantic UI + jQuery

## 快速入门

1. 执行resource目录下的uploadfiles.sql
2. 修改application.yml中数据库配置
3. 启动项目
   登录http://localhost:8081/user
4. 用户名：zhangsan
   密码：123456

![image-20200804013723018](https://gitee.com/butterflystars/blogsImages/raw/master/img/image-20200804013723018.png)

## 下一步完善

#### 功能：

* [ ] 添加验证码
* [ ] 开启Mybatis缓存
* [ ] 加入Redis作为缓存服务器
* [ ] 使用阿里云OSS作为文件存储服务器

