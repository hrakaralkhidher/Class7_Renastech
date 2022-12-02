package Day28_InheritanceAndAbstruction;

import java.util.ArrayList;

public class Topic2_Polymorphism {
    public static void main(String[] args) {
        Animal MyAnimal = new Animal();
        Animal MyDog = new Dog();
        Animal MyPig = new Pig();

        ArrayList<Animal> MyZoo = new ArrayList<>();
        MyZoo.add(MyAnimal);
        MyZoo.add(MyDog);
        MyZoo.add(MyPig);

        for (int i = 0; i < MyZoo.size(); i++) {
            Animal AnAnimal = MyZoo.get(i);
            AnAnimal.AnimalSound();
            //below code is same with code above
//            MyZoo.get(i).AnimalSound();
        }
        /*
        PolyMorphism means "Many Forms"
        In Java, Polymorphism means same object performing different operations according to the requirement.
(in Java all classes inherit from Object.)
in other words Polymorphism is simply the ability of an object to specialize its behavior based on its type.
 Polymorphism can be achieved by using two ways, those are
Method overriding
Method overloading
         */
    }
}
///the bottom is what happens behind the scens in java>>>> so everything comes from Object theat why we called everthin OOP
///class int extend Object <----this is is not true
//class Integer extend Object
//class String extend Object
//class Animal extend Object
class Animal{ ///====> behind the scen java is class Animal Object
    public void AnimalSound(){
        System.out.println("The Animal makes a sound");
    }
    public void AnimaSound(String param1){//======>>>> this is Polymorphism basically same as the class just differnt action
        System.out.println(param1+" makes a sound");
    }
}

class Dog extends Animal{
    @Override
    public void AnimalSound(){
        System.out.println("the dog days: woof woof");
    }
}

class Pig extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("The pig says : oink oink");
    }
}