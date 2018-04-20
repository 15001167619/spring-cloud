# Spring Cloud 系列学习

## Spring Cloud 示例
- [spring-cloud-single-eureka](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-single-eureka)：eureka server单机示例
- [spring-cloud-cluster-eureka](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-cluster-eureka)：eureka server集群示例
- [spring-cloud-eureka](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-eureka)：eureka 服务注册中心
- [spring-cloud-producer](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-producer)：spring-cloud-producer 服务提供者示例
- [spring-cloud-load-producer](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-load-producer)：spring-cloud-load-producer 服务提供者（负载均衡）示例
- [spring-cloud-consumer](https://github.com/15001167619/spring-cloud/tree/master/spring-cloud-consumer)：spring-cloud-consumer 服务消费者示例

## 学习文档

- [spring-cloud-cluster-eureka(本机集群启动方式)](https://weibo.com/ttarticle/p/show?id=2309404230835917206231#_0)

## Spring Cloud 示例调用

### eureka server 单机调用 启动spring-cloud-single-eureka即可
### eureka server 集群调用 启动spring-cloud-cluster-eureka 参考 - [spring-cloud-cluster-eureka(本机集群启动方式)](https://weibo.com/ttarticle/p/show?id=2309404230835917206231#_0)
### eureka server 服务提供与调用（一） 依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer三个项目
### eureka server 服务提供与调用-负载均衡（二） 依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-load-producer、spring-cloud-consumer四个项目
### eureka server 服务提供与调用-熔断器（三） 依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer-hystrix 三个项目 ；输入http://localhost:6084/sayHi/慕小谦，手动停止spring-cloud-producer项目再次访问



