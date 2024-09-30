
public class JadonContainerTester
{
   public static void main(String[] args){
    
       JadonContainer test = new JadonContainer(3);
       test.addValue(3);
       test.addValue(1);
       test.addValue(8);
       test.addValue(66);
       test.addValue(5);
       test.addValue(17);
       test.addValue(0, 2);
       test.addValue(7);
       test.removeValue(1);
       test.addValue(4);
       test.addFirst(1);
       test.removeFirst();
       test.replace(0, 43);
       test.removeLast();
       test.addValue(12);
       //test.clear();
       
       System.out.print("{");
       test.toString();
       
       System.out.println();
       System.out.println("Is array empty?: " + test.isEmpty());
       System.out.println("Size of array: " + test.getSize());
       System.out.println("Contains 4?: " + test.doesContain(4));
       System.out.println("Contains 12?: " + test.doesContain(12));
       System.out.println("Index of 66?: " + test.getIndexOf(66));
       System.out.println("Index of 203(DNE)?: " + test.getIndexOf(203));
       System.out.println("Value of position 3?: " + test.getValueOf(3));
       
       
       
   
    
   }
}
