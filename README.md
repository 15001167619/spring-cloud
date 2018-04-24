# Spring Cloud 系列学习

## Spring Cloud 示例
- [spring-cloud-single-eureka](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-single-eureka)：eureka server单机示例
- [spring-cloud-cluster-eureka](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-cluster-eureka)：eureka server集群示例
- [spring-cloud-eureka](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-eureka)：eureka 服务注册中心
- [spring-cloud-producer](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-producer)：spring-cloud-producer 服务提供者示例
- [spring-cloud-load-producer](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-load-producer)：spring-cloud-load-producer 服务提供者（负载均衡）示例
- [spring-cloud-consumer](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-consumer)：spring-cloud-consumer 服务消费者示例
- [spring-cloud-consumer-hystrix](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-consumer)：spring-cloud-consumer-hystrix 服务消费者熔断器示例
- [consumer-hystrix-dashboard](https://github.com/15001167619/spring-cloud/tree/master/consumer-hystrix-dashboard)：consumer-hystrix-dashboard 熔断器单个应用监控示例
- [hystrix-dashboard-turbine](https://github.com/15001167619/spring-cloud/tree/master/hystrix-dashboard-turbine)：hystrix-dashboard-turbine 熔断器多个应用的熔断监控示例
- [spring-boot-admin-server](https://github.com/15001167619/spring-cloud/tree/master/spring-boot-admin-server)：spring-boot-admin-server SpringBootAdmin监控示例

## 学习文档

- [spring-cloud-cluster-eureka(本机集群启动方式)](https://weibo.com/ttarticle/p/show?id=2309404230835917206231#_0)
- [spring-cloud-consumer-hystrix-dashboard(单个应用监控访问)](https://weibo.com/ttarticle/p/show?id=2309404230895295941078#_0)
- [spring-cloud-hystrix-dashboard-turbine(Turbine多个应用的熔断监控Dashboard展示)](https://weibo.com/ttarticle/p/show?id=2309404231927354780772#_0)

## Spring Cloud 示例调用

### eureka server 单机调用 启动spring-cloud-single-eureka即可
### eureka server 集群调用 启动spring-cloud-cluster-eureka 参考 - [spring-cloud-cluster-eureka(本机集群启动方式)](https://weibo.com/ttarticle/p/show?id=2309404230835917206231#_0)
### eureka server 服务提供与调用（一） 依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer三个项目
### eureka server 服务提供与调用-负载均衡（二） 依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-load-producer、spring-cloud-consumer四个项目
### eureka server 服务提供与调用-熔断器（三） 依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer-hystrix 三个项目 ；输入http://localhost:6084/sayHi/慕小谦，- 手动停止spring-cloud-producer项目再次访问
### eureka server 服务提供与调用-熔断器单个应用监控（三） 依次启动spring-cloud-eureka、spring-cloud-producer、consumer-hystrix-dashboard 三个项目 参考 - [spring-cloud-consumer-hystrix-dashboard(单个应用监控访问)](https://weibo.com/ttarticle/p/show?id=2309404230895295941078#_0)
### eureka server 服务提供与调用-熔断器多个服务节点应用监控（四） 依次启动spring-cloud-eureka、spring-cloud-producer、server-producer、consumer-hystrix-one、consumer-hystrix-two、hystrix-dashboard-turbine 六个项目 参考 - [spring-cloud-hystrix-dashboard-turbine(Turbine多个应用的熔断监控Dashboard展示)](https://weibo.com/ttarticle/p/show?id=2309404231927354780772#_0)
### spring cloud SpringBootAdmin监控 依次启动spring-cloud-eureka、admin-producer、spring-boot-admin-server 三个项目 



