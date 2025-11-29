package NotAIModel;
import java.util.*;
import NotAIModel.Time;

public class Model {
    public static void main(String[] args) {
        ArrayList<Float> petalInfo = new ArrayList<Float>();
        ArrayList<String> flowers = new ArrayList<String>();
        
        float closestLength= 99999;
        float closestWidth = 99999;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("""
                1: Train
                2: Test
                3: View Data
                """);
        
            System.out.print("Choose an option: ");
            
            int optionInput = scanner.nextInt();
            scanner.nextLine();

            if (optionInput == 1) {
                System.out.print("Petal Length: ");
                float inputLength = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Petal Width: ");
                float inputWidth = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Flower Type: ");
                String flowerType = scanner.nextLine();
                flowers.add(flowerType);

                petalInfo.add(inputLength);
                petalInfo.add(inputWidth);
                
                System.out.println("Training...");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    System.out.println("error");
                }
                System.out.println("Trained Successfully!");
                
            }

            else if (optionInput == 2) {
                System.out.print("Petal Length: ");
                float inputLength = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Petal Width: ");
                float inputWidth = scanner.nextFloat();
                scanner.nextLine();

                for (int i = 0; i < petalInfo.size(); i+=2) {
                    if (Math.abs(inputLength - petalInfo.get(i)) < closestLength) {
                        closestLength = petalInfo.get(i);
                    }
                }
                
                for (int i = 1; i < petalInfo.size(); i+=2) {
                    if (Math.abs(inputWidth - petalInfo.get(i)) < closestWidth) {
                        closestWidth = petalInfo.get(i);
                    }
                }


                int flowerIndex = petalInfo.indexOf(closestLength) / 2;
                String flower = flowers.get(flowerIndex);
                
                System.out.println("Getting data...");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    System.out.println("error");
                }
                System.out.println(flower);
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    System.out.println("error");
                }





            }
            else if (optionInput == 3) {
                System.out.println(petalInfo);
            }
            

        }
        

        
    }
}
