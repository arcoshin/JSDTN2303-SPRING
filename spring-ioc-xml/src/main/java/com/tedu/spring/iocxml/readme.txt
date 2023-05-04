iocxml包，演示bean的獲取方式
1. 通過id獲取：context.getBean("id屬性值")
2. 通過類型獲取：context.getBean(類名.class)
3. 通過id和類型獲取：context.getBean("id屬性值", 類名.class)