import java.util.*;

class Main {
  public static void main(String[] args) {
    int array[]=new int[10];
    for(int x=0;x>=array.length;x++){
      int min = 1;
      int max = 75;
      int random_int = (int)(Math.random() * (max - min + 1) + min);
      array[x]=random_int;
    }
    System.out.println("The unsorted array is: "+array);
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