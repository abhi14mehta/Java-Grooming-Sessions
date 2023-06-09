import java.util.Scanner;

// 2.6 find the maximum occurring character in a given String and try to use exception handling for edge cases?

class EmptyStringException extends Exception{
    EmptyStringException(String msg){
        super(msg);
    }
}

public class MaxOccuringCharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            if(str == null || str.equals(""))  {
                throw new EmptyStringException("String is empty enter a valid string");
            }
            int[] arr = new int[256];

            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)]++;
            }
            int maxOccurIndex = 0;
            int value = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i] > value){
                    value = arr[i];
                    maxOccurIndex = i;
                }
            }            

            System.out.println("Max occuring character is " + (char)maxOccurIndex + " and have occuredd " + arr[maxOccurIndex] + " times");
        }catch(EmptyStringException e){
            System.out.println(e.getMessage());
        }
    }    
}

