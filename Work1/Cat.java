public class Cat {

    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
         this.age = age;
    }

    void showDem() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " лет");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
    return name;
    }

    public int getAge() {
        return age;
    }
}

// class NameCat extends Cat {
        
//     NameCat(String name, int age) {
//         super(name, age);
//     }

//     void greet() {
//         System.out.println("Мяу! Меня зовут " + NameCat);
//     }
// }
