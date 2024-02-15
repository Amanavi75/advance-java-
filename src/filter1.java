
import java.util.Arrays;
import java.util.List;
 class filter1 {
  
    public static void main(String[] args){
    //    ArrayList<Integer> numberList = new ArrayList<>();
    //    numberList.add(10);
    //    numberList.add(20);
    //    numberList.add(30);
    //    numberList.add(40);

    //* additional method to create list  */

    List<Integer>numberList = Arrays.asList(10,21,30,40);

    // List<Integer>evenNum= new ArrayList<Integer>();

    //first of all we have to add collection to the streams 

    // evenNum=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
    // System.out.println(evenNum);
    // numberList collection is added to list 


    /* we can also use for each method */

    numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));


    


       
    }
    
}