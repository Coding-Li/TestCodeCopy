package cn.lijunhaoit.javacode.util;

public interface ConcurrentMap<K,V> extends Map<K,V> {

    default V getOrDefault(Object key,V defaultValue;){
        V v;
        return ((v = get(key)) != null) ? v :defaultValue;
    }
}
