package Day28_InheritanceAndAbstruction;

public class Topic3_Abstraction {
    public static void main(String[] args) {
        Cat MyCat = new Cat();
        MyCat.Walk();

        Dolphin MyDolphin = new Dolphin();
        MyDolphin.Swim();

        Lion Mylion = new Lion();
        Mylion.Walk();

        System.out.println("______________________");

        TerrestrialAnimals AnAnimal;
        AnAnimal = new Lion();
        AnAnimal.Walk();

    }
}
//The animals which live in water. Examples : Octopus, Fish, Shark
interface AquaticAnimals{
    void Swim();// this is an ABSTRACT Method
}
// The animal which live in land. Example: Cow, Lion, Deer
interface TerrestrialAnimals{
    void Walk();
}

class Cat implements TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("Cat is walking");
    }
}
// What is different between extends and implements keyword?
class Lion extends Cat{
    @Override
    public void Walk() {
        System.out.println("Line is walking");
    }
}

class Dolphin implements AquaticAnimals{
    @Override
    public void Swim() {
        System.out.println("Dolphin is Swimming");
    }
}
//Can you implement a class from more than one interface? so yesss you can as shown below
class Penguin implements AquaticAnimals, TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("Penguin is walking");

    }

    @Override
    public void Swim() {
        System.out.println("Penguin is swimming");
    }
}
/*
can you extend a class from more than one class? NOO as shown below uncomment and see
class tiger extend Cat,Lion{
}

 */