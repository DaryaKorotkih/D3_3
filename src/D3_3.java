import java.util.Scanner;

public class D3_3 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size = in.nextInt();

                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.println("Enter " + (size + 1) + " elements");
                    array[i] = in.nextInt();
                }
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int repeat5 = 0;

                for (int i = 0; i < size; i++) {
                    min = Math.min(min, array[i]);
                    max = Math.max(max, array[i]);
                    if (array[i]==5) repeat5++;
                }

                System.out.println("Min. element = " + min);
                System.out.println("Max. element = " + max);
                System.out.println("Repeat 5     = " + repeat5);

            }
        }
