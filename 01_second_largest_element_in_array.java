/*
 Input :
 5 #size
 10 20 50 40 30 #elements

 Output :
 40

 Edge Cases:
  Array size less than 2
  Duplicate elements
  Negative numbers
  Distinct second largest check

  code:
  let the first input be size of array
  if size < 2 : return not possible
  else
    input the array elements
    first assign Integer.MIN_VALUE for largest and second
    traverse the array if current > largest : update second = largest and then largest = current
                       else if current > second and largest != current then second = current
    if second = MIN_VALUE : return not possible (if all the values are equal)
    else return second 
*/

import java.util.Scanner;;
public class Slargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size < 2){
            System.out.println("Not possible");
            return;
        }
        int[] arr = new int[size];
        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 1; i < size ; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second && largest != arr[i]){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.print("Not available");
        }else{
            System.out.print(second);
        }
    }
}
