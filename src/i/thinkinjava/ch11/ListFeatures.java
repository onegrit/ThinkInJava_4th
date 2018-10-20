package i.thinkinjava.ch11;

import net.mindview.ch14.pets.*;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        ArrayList<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);//向ArrayList中添加一个元素
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));//Collection中是否包含元素
        Pet p = pets.get(2);//通过索引index获取Collection中的一个元素
        System.out.println("4: " + p + " " + pets.indexOf(p) );//获取元素在Collection中的索引值
        Cymric cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));//如果Collection中不包含元素，indeOf方法返回-1
        System.out.println("6: " + pets.remove(cymric));//如果Collection中不包含该元素，remove方法返回false
        System.out.println("7: " + pets.remove(p));//如果Collection中包含该元素，remove方法移除一个元素，并不是全部移除，返回true,
        System.out.println("8: " + pets);
        pets.add(3,new Mouse());
        System.out.println("9: " + pets);

        List<Pet> sub = pets.subList(1, 4);//不包含end
        System.out.println("subList: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted sublist: " + sub);
        System.out.println("11: " + pets.containsAll(sub));//与sub是否排序无关
        Collections.shuffle(sub,rand);//混排
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));

        ArrayList<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " +sub);
        copy.retainAll(sub);//两个集合的交际，此处sub最少，只保留了2个元素
        System.out.println("13: " + copy);

    }
}
