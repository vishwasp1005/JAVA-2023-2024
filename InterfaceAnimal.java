//4*

public class InterfaceAnimal {
    public static void main(String[] args) {
        Animals[] a = { new Camel(), new Tiger(), new Deer(), new Donkey() };

        for (Animals a1 : a) {
            if (a1 instanceof Transport) {
                Transport t1 = (Transport) a1;
                t1.Deliver();
            }
        }
    }
}

interface Transport {
    void Deliver();
}

abstract class Animals {

}

class Tiger extends Animals {

}

class Camel extends Animals implements Transport {
    public void Deliver() {
        System.out.println("unttttt");
    }
}

class Deer extends Animals {

}

class Donkey extends Animals implements Transport {
    public void Deliver() {
        System.out.println("Gadhedooooo");
    }
}