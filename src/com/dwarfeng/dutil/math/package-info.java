/**
 * 数学包。
 * <p> 这个包来源于之前我写过的math包。由于之前我是初步接触java，因此math包写的很是不好，中途只得放弃。
 * 现在，我打算将以前的工作重新整合起来，整合在我的工具包中，并且用dmath这个包进行封装。
 * <br> dmath包涉及代数、几何、统计、线性代数四大方面的内容，每个方面的内容都来自相对应的数学学科。
 * 
 * <p> <b>同步问题：</b>
 * 
 * <p> 基本上，所有的数学对象都不是线程安全的，如果要将其用在多线程中，请注意外部同步。如果
 * 其中的某个数学类是线程安全的，会在文档中指明，除此之外，其余的类都是线程不安全的。
 * 
 * <p><b>几个概念：</b>
 * 
 * <p><b>该包是不可变的：</b>
 * <br> 该包中的所有对象都是不可变的对象，一旦初始化之后，不能更改任何值。
 * 不可变对象虽然牺牲了算式以及变量赋值、函数等功能，但是在运算速度上大大领先。
 * <br> 如果想要创建能够保留结构并且可以给其中变量赋值的数学对象，
 * 则应该使用{@linkplain com.dwarfeng.dutil.foth}包中的对象。
 * 
 * <p><b>该包以double为基础：</b>
 * <br> 该包中的所有的与值有关的字段都用double进行存储，因此该包的运算能力与double相同。
 * 
 * @author DwArFeng
 * @since 1.8
 */
package com.dwarfeng.dutil.math;