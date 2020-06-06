public class Main{

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String:");
        String str = bf.readLine();

        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {

            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'
                    || c[i] == 'u') {

                System.out.println(str.replace(c[i], 'z'));

            }

        }

    }
}