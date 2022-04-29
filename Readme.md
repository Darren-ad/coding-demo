商品
    评论
        用户

商品：
    1、ID
    2、TITLE 标题
    3、IMG_URL   图片地址
    4、PRICE 价格
    5、BALANCE   余量
    6、CONTENT   内容

评论：
    1、ID
    2、SID   商品ID
    3、CONTENT   留言内容
    4、COMMENT_TIME  评论时间
    5、UID   用户ID

用户：
    1、ID
    2、NICKNAME
    3、GENDER 性别
    4、AGE   年龄
    5、TELEPHONE 联系方式
    6、ADDRESS   家庭住址
    7、REGISTER_TIME 注册时间
    8、LAST_LOGIN_TIME   上次登录时间



Demo背景：展示一个商品下的所有用户评论

Demo目的：
    1、查看后台返回的对象转JSON格式
    2、封装统一返回对象
    3、BeanUtils.copyProperties(src, target)的使用
    4、Spring Boot 与 Mybatis 的整合
    5、Mapper.xml中 resultMap的使用