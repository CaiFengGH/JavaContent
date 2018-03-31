/**
 * @author Ethan
 * @desc 懒汉式，需要时自动创建
 * 线程不安全
 * 1-类加载时不自动创建 + 私有构造函数 + 手动创建
 * 2-同步方法 + 同步代码块
 * 3-双重校验锁(懒汉式改进)
 * 4-静态内部类
 */
package DesignPattern.SingletonPattern.Slacker;