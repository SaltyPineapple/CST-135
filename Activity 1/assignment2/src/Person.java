public class Person {

    public String Name;
    public int Age;
    public int Weight;
    public int Height;


    public Person(String name, int age, int weight, int height) {
        super();
        Name = name;
        Age = age;
        Weight = weight;
        Height = height;
    }

    public void Walk(){
        System.out.println("They are walking.\n");
    }

    public void Run(int miles){
        System.out.printf("They ran %d miles\n", miles);
    }

    public void Jump(){
        System.out.println("They are jumping.\n");
    }


    public static void main(String[] args){
        Person person = new Person("Mark", 21, 175, 74);
        System.out.printf("Hello my name is %s\n", person.getName());
        person.Walk();
        person.Run(5);
        person.Jump();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
