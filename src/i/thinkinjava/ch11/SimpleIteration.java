package i.thinkinjava.ch11;

import net.mindview.ch14.pets.Pet;
import net.mindview.ch14.pets.Pets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        //迭代器用法，通过集合的iterator()方法，返回一个iteraotr
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + " : "+ p + " ");
        }
        System.out.println();
        for (Pet pet : pets) {
            System.out.println(pet.id() + " : " + pet + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
