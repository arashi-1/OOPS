class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Main {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name ="Aman";
        s1.age =24;
        s1.getInfo();
        Student s2 = new Student();
        s2.name ="Shradha";
        s2.age = 22;
        s2.getInfo();
    }
}