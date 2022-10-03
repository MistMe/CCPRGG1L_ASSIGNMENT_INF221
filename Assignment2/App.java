public class App {
    public static void main(String[] args) throws Exception {

       
        //For Loop
        for (int firstnameCount = 5; firstnameCount != 0; firstnameCount--) {
           
            
            //BREAK
            
            if (firstnameCount == 3) {
                System.out.println("Break time");
                break;
            }
             System.out.println("Lyod Rhussel");
        }
        
        //While Loop
        int nicknameCount = 5;
        while (nicknameCount != 0) {
            System.out.println("lyod");
            nicknameCount--;
  
        //Continue
         if (nicknameCount == 3) {
                System.out.println("Go ahead i will skip this third loop. i will ride on the next loop!");
                continue;
         }
         System.out.println("lyod");
        }
        
        //Do-While Loop
        int surnameCount = 5;
        do {
            System.out.println("Torrenueva");
            surnameCount--;
        } while (surnameCount != 0);
    }
}
