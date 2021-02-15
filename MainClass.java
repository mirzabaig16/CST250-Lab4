package edu.ru.lab4;

public class MainClass {

 // Method to find maximum in 2D array 
 public static void printMaxOfEachRow(int[][] inputArray){
//Treverse in each row of 2D array
  for (int row = 0; row < inputArray.length; row++) {
 // Initialize maximum element 
         int max = inputArray[row][0]; 
  // Traverse array elements from second and 
for (int col = 1; col < inputArray[row].length; col++) {
         // compare every element with current max  
 if (inputArray[row][col] > max) {
// if current max is less then reassign value of current element to max
                 max = inputArray[row][col];
}
}
// after all the column treversal, print the max (Which is the max value in current row)
 System.out.println("Maximum Value in row "+ row +" is : " + max);
}
       
      
 }
 public static void main(String args[]){
		int[][] arr = {{10,20,30,40,50},{5,6,7},{2,4,6}};
                printMaxOfEachRow(arr);
                               
    }
    
}
