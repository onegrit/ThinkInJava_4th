package i.thinkinjava.ch11;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        collection.add("pig");
        collection.add("cat");
        return  collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("pig","Cachie");
        return map;
    }

    public static void main(String[] args) {
        //List 容器：有序可重复
        System.out.println("List 容器：有序可重复=>");
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        //HashSet 容器：检索最快，无序不重复
        System.out.println("HashSet 容器：检索最快，无序不重复=>");
        System.out.println(fill(new HashSet<String>()));
        //TreeSet:按照比较结果的升序保存对象；如果存储顺序很重要，使用TreeSet
        System.out.println("TreeSet:按照比较结果的升序保存对象=>");
        System.out.println(fill(new TreeSet<String>()));
        //LinkedHashSet:按照添加的顺序保存对象
        System.out.println("LinkedHashSet:按照添加的顺序保存对象=>");
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println("--------------------");
        //Map容器：KV对，Key不重复
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
