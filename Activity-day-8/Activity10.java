public class Main{
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two Strings");
    String s1=sc.nextLine();
    String s2=sc.nextLine();

    String s3=new StringBuilder(s1).append(new StringBuilder(s2).reverse()).toString();
    System.out.println(s3);

}
}