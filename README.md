# Jacoco + Spring boot + Maven 

## 用法

在项目目录下，执行如下命令
```bash
$  ./mvnw clean verify 
```

浏览器 `target/site/jacoco/index.html`，在浏览器中即可见到

![](./images/jacoco-1.png)

点击 package `afar.jacoco.demo`，跳转到 package 内，查看其测试覆盖率情况

![](./images/jacoco-2.png)

点击 class `User`，跳转到 class 内，查看其测试覆盖率情况

![](./images/jacoco-3.png)

可以看到，总共有 4 个方法，而 `greet` 方法的测试覆盖率不足

![](./images/jacoco-4.png)

点击进入 class 文件内部，可以查看每一行代码的测试覆盖情况


  