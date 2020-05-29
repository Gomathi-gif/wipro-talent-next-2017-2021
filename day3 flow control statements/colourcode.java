public class Main{ 
      public static void main(String args[]){
          if(args.length==0)
          {
              System.out.println("Enter the colour code");
             return;
          }
          String s=args[0];
          char ch=s.charAt(0);
          switch(ch){
                case 'R': 
                    System.out.println("R->red");
                    break;
                case 'B': 
                    System.out.println("B->blue");
                    break;
                case 'G': 
                    System.out.println("G->green");
                    break;
                case 'O': 
                    System.out.println("O->orange");
                    break;
                case 'Y': 
                    System.out.println("Y->yellow");
                    break;
                case 'W': 
                    System.out.println("W->white");
                    break;
                default:
                    System.out.println("Invalid");
                    break;                  
          }
           
      }
}
