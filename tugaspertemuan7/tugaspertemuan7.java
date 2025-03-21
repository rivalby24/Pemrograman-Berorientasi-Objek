/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.tugaspertemuan7;
import java.util.Random;
/**
 *
 * @author BlazeBy
 */
public class tugaspertemuan7 {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();
        
        
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100000); 
        }

        StopWatch stopwatch = new StopWatch(); 
        stopwatch.start();

        selectionSort(numbers);

        stopwatch.stop();
        
        System.out.println("Waktu eksekusi selection sort: " 
                + stopwatch.getElapsedTime() + " milidetik");
    }
}
