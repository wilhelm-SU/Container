public class JadonContainer
{
   //Attributes
   public int[] data;
   private int currentPosition;
 
   //Constructor
   public JadonContainer(int arraySize){
       data = new int[arraySize];
       currentPosition = 0;
   }
   
   //Getters
   public int getValueOf(int position){
       return data[position];
   }
   
   public int getSize(){
       return currentPosition;
   }
   
   public int getIndexOf(int value){
       for(int i = 0; i < currentPosition; i++){
               if(data[i] == value){
                   return i;
               }
           }
       return -1;
   }
   
   //Adding
   public void addValue(int value){
       if(currentPosition == data.length){
           int[] temp = new int[(data.length)*2];
           for(int i = 0; i < currentPosition; i++){
               temp[i]  = data[i];
           }
           data = temp;
       }
       data[currentPosition] = value;
       currentPosition++;
   }
   
   public void addValue(int position, int value){
       if(currentPosition == data.length){
           int[] temp = new int[currentPosition*2];
           for(int i = 0; i < currentPosition; i++){
               temp[i]  = data[i];
           }
           data = temp;
       }
      
       for(int i = currentPosition; i > position; i--){
          data[i] = data[i-1];
       }
       data[position] = value;
       currentPosition++;
   }
   
   public void addFirst(int value){
       for(int i = currentPosition; i > 0; i--){
          data[i] = data[i-1];
       }
       data[0] = value;
       currentPosition++;
    }
    
   //Removal
   public void removeValue(int position){
       data[position] = 0;
       for(int i = position+1; i <=currentPosition; i++){
           data[i-1] = data[i];
       }
       currentPosition--;
    }
   
   public void removeFirst(){
       data[0] = 0;
       for(int i = 1; i < currentPosition; i++){
           data[i-1] = data[i];
       }
       currentPosition--;
    }
   
   public void removeLast(){
       data[currentPosition] = 0;
       currentPosition--;
    
    }
    
   //True or false
   public boolean isEmpty(){
       int[] temp = new int[0];
       if(data == temp){
           return true;
        } else{
           return false;
        }
   }
   
   public boolean doesContain(int value){
       for(int i = 0; i < currentPosition; i++){
           if(data[i] == value){
               return true;
           } 
       }
       return false;
   }
   
   //Misc
   public void replace(int position, int value){
    data[position] = value;
    }
    
   @Override
   public String toString(){
       String x = "";
       for(int i = 0; i < currentPosition; i++){
           x = x + data[i] + " ";
       }
       return x + "}";
   }
   
   public void clear(){ 
       int temp[] = new int[0];
       data = temp;
    }//broken
   
   //write a toString to print something interesting
   
   //Ask program if it contains(value) returning true or false
   
   //Ask your program for the index of a given value
   
   //Write a method to return if empty
   
   
}
