package i.thinkinjava.ch11;

import java.util.*;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}

class Heavy extends Powder { }
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInfence {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(),new Powder()
        );
        /*
        * 书中说，下列代码不合法，会出现编译错误；但是在java8下可以编译通过
        * */
        List<Snow> snow2 = Arrays.asList(
                new Light(),new Heavy()
        );

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3,new Light(),new Heavy());

        List<Snow> snow4 = Arrays.asList(
                new Light(),new Heavy()
        );
    }


}
