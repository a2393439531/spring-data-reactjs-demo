1、
```
npm run-script watch # 在项目启动时(./mvnw spring-boot:run)执行的webpack build 不嗯能够满足开发实时监控js文件变化自动打包的需求
./mvnw spring-boot:run
```
2、注意文件较大，在网路较差环境使用的话会很大程度影响用户体验
./src/main/resources/static/built/bundle.js  1.13 MB
./src/main/resources/static/built/bundle.js.map  1.32 MB