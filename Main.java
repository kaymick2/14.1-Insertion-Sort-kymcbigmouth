import java.util.*;

class Main {
  public static void main(String[] args) {
    int array[]=new int[10];
    for(int element:array){
a
    }
    for(int element:array){

    
    System.out.println("The unsorted array is: "+array[element]);
    }
    for(int i=0;i<=(array.length)-1;i++){
      int element=array[i];
      int j=i;
      System.out.println("Progress: "+array);
      while(j>0&&array[j-1]>element){
        array[j]=array[j-1];
        j=j-1;
      }
      array[j]=element;
    }


    
  }
}