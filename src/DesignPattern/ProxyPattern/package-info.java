/**
 * @author Ethan
 * @desc 
 * 代理模式
 * 定义真实对象希望被代理的行为的接口Subject
 * 真实对象实现Subject接口
 * 代理对象实现Subject接口，并且在被代理的行为里面实现真实对象
 * 优点：
 * 代理对象作为客户端和目标对象间的中介，起到了保护目标对象的作用
 * 缺点：
 * 请求速度变慢；增加系统实现的复杂程度；
 */
package DesignPattern.ProxyPattern;
