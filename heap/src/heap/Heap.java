/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap;


import java.util.Scanner;

/**
 *
 * @author melisaaslan
 */
public class Heap {

   public void heapify(int[]A,int i)
  {
        int largest = 0;
    int le=left(i);
    int ri=right(i);
    if((le<=heapsize) && (A[le]>A[i]))
        largest = le;
    else
        largest = i;
    if((ri<=heapsize) && A[ri]>A[largest])
        largest = ri;

    if (largest != i) {
      int tmp = A[i];
      A[i]= A[largest];
      A[largest] = tmp;
      heapify(A, largest);
   }
  }
  public static int left(int i ){
      return 2*(i+1)-1;
  }

  public static int right(int i){
      return 2*(i+1);
  }
public void BuildHeap(int[]A){

  heapsize=A.length-1;
  for(int i=0; i<Math.floor(A.length/2); i++)
  {
          heapify(A,i);
  }
}
}

 
    
  

