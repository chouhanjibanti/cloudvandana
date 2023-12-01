// ShuffleArray 
package Program;

public class ShuffleArray {
    
    public static void shuffle(int[] array){
        int noOfEle = array.length;

        for(int i=0;i<noOfEle;i++)
        {
            int s = i+(int)(Math.random() * (noOfEle-i));
           
          // swapping the element
            int temp = array[s];
            array[s] = array[i];
            array[i] = temp; 
        }
    }
    public static void main(String[] args) {
         int[] number = {1,2,3,4,5,6,7};

         // call the shuffle method by the class name because (shuffle ) is static method
         ShuffleArray.shuffle(number);

         // loop print the shuffled array element
         for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
         }
    }
}

