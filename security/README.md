1、
```
npm run-script watch # 在项目启动时(./mvnw spring-boot:run)执行的webpack build 不嗯能够满足开发实时监控js文件变化自动打包的需求
./mvnw spring-boot:run
```
2、注意文件较大，在网路较差环境使用的话会很大程度影响用户体验
./src/main/resources/static/built/bundle.js  1.13 MB
./src/main/resources/static/built/bundle.js.map  1.32 MB

3、
```shell
curl -v -u greg:turnquist localhost:8080/api/employees/1
```

4、
With these changes in the frontend, restart the application and navigate to http://localhost:8080.
You are immediately redirected to a login form. This form is supplied by Spring Security, though you can create your own if you wish. Login as greg / turnquist.

5、要是缺少一些node模块，则自行安装即可正常运行。如：npm install ms -S。
-S is used for set dependency on package JSON for next time use.