public class Main{
    public static void main(String[]args){
        Person p= new Person("Mani");
        Student1 s=new Student("Rita",85);
        Teacher t = new Teacher("Ramya,25000,"Chemistry");
        CollegeStudent cs = new CollegeStudent("Kiran",7020,3,"CSE");
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cs);
    }