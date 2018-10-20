package i.thinkinjava.ch11;

import java.util.*;

/**
 * 11.3 添加一组元素
 * Arrays.asList():参数接受一个数组或是一个用逗号分隔的元素列表，并将其转换为一个List对象
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
         collection.addAll(Arrays.asList(moreInts));//collection.addAll方法接收一个Collection对象，或数组或用逗号分隔的列表
        //Collection工具类
        collection.add(100);
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        /*
        * 使用Arrasy.asList产生的数组，底层还是数组，因此size是固定的，不能再继续添加元素
        * */
        List<Integer> intList = Arrays.asList(20, 21, 22, 23, 24);
        intList.set(1,99);
//        intList.add(1000); //产生 UnsupportedOperationsException

        System.out.println("print collection:");
        for (Integer ele : collection) {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("print intList");
        for (Integer intEle : intList) {
            System.out.print(intEle + " ");
        }
    }
}
