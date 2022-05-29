package cn.lijunhaoit.javacode.util.function;


/**
 * 我们可以把耗资源运算放到get方法里，在程序里，我们传递的是Supplier对象，直到调用get方法时，运算才会执行。这就是所谓的惰性求值。
 * @param <T>
 */
public interface Supplier<T> {
    T get();
}
