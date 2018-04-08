## 注释

```java
//  单行注释

/* 多行注释 */

/** 文档注释 */
```



## Java程序基本结构

```java
	package Mr 									//定义包
    
    public class Exp {
        static int ONE = 1;
        
        public static void main(String[] args) {
			String var = "Hello";
            
             System.out.println(ONE)''
        }
    }
```



## 数据类型

### 内置数据类型

Java存在四种数据类型：

1. 整数类型
   1. byte: 8位 1字节  -128-127
   2. short： 16位2字节  -32768-32767
   3. int: 32位 4字节
   4. long： 64位  8字节
2. 浮点类型
   1. float: 32位 4字节
   2. fouble： 64位 8字节
3. 字符类型: 用于存储单个字符，用单引号， 多了就是字符串类型，用双引号
4. 布尔类型

### 引用数据类型

在Java中，引用类型指向一个对象，指向对象的变量就是引用变量。

对象、数组都是引用数据类型

所有的引用数据类型默认值都是null

### 数据类型转换

```java
// 低  ------------------------------------>  高

byte,short,char—> int —> long—> float —> double 
```

三种转换方式，规定为：数据从占用存储空间大小的判断

1. 自动类型转换： 低级向高级的转换
2. 强制类型转换： 高级向低级转换必须强制
3. 隐含强制类型转换





## 流程控制

主要区别for循环语句中的foreach



## 编码规范

