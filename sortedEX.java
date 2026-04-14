import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// class sortedEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(23,1,34,55,78,90,87,54,32,12);
//         System.out.println(list);
//         //List<Integer> sortedListt=list.stream().sorted().toList();  // assending order
//         List<Integer> sortedListt=list.stream().sorted((a,b)->a-b).toList();
//         System.out.println(sortedListt);
//         // List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList(); //decinding order
//         List<Integer> sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();
//         System.out.println(sortedList);
//     }
// }




// class sortedEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,5,33,9,21,1);
//         System.out.println(list);
//         //List<Integer> sortedListt=list.stream().sorted().toList();  // assending order
//         List<Integer> sortedListt=list.stream().sorted((a,b)->a-b).toList();
//         System.out.println(sortedListt);
//     }
// }



// class sortedEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(45,11,78,2,90,34);
//         System.out.println(list);
//         // List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList(); //decinding order
//         List<Integer> sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();
//         System.out.println(sortedList);
//     }
// }



// class sortedEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(18,42,7,91,33,25,60);
//         System.out.println(list);
//         List<Integer> top3 = list.stream()
//                 .sorted(Comparator.reverseOrder()) // descending
//                 .limit(3) // kitne rakhne hai
//                 .toList();
//         System.out.println(top3);
//     }
// }




// class sortedEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(18,42,7,91,33,25,60);
//         System.out.println(list);
//         List<Integer> top3 = list.stream()
//                 .sorted(Comparator.reverseOrder()) // descending
//                 .skip(list.size()-3)// kitne chhorne hai
//                 .toList();
//         System.out.println(top3);
//     }
// }



// class sortedEX {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);

//         List<Integer> newList = list.stream()
//                 .sorted()
//                 .toList();

//         System.out.println("Original: " + list);
//         System.out.println("Sorted (new list): " + newList);
//     }
// }



// class sortedEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(18,42,7,91,33,25,60);
//         System.out.println(list);
//         Integer secondMax = list.stream()
//                 .sorted(Comparator.reverseOrder()) // descending
//                 .toList().get(1);
//         System.out.println(secondMax);
//     }
// }





// class sortedEX {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);

//         List<Integer> newList = list.stream()
//                 .filter(n -> n > 20)   // sirf 20 se bade
//                 .sorted()              // sort
//                 .toList();             // new list

//         System.out.println(newList);
//     }
// }




// class sortedEX {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("ravi", "zoya", "meena", "kunal");

//         List<String> sortedList = list.stream()
//                 .sorted()   // alphabetical
//                 .toList();

//         System.out.println(sortedList);
//     }
// }


// class sortedEX {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("ravi", "zoya", "meena", "kunal");

//         List<String> sortedList = list.stream()
//                 .sorted((a,b)->b.compareTo(a))   // alphabetical
//                 .toList();

//         System.out.println(sortedList);
//     }
// }



// class sortedEX {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("ravi", "zoya", "meena", "kunal");

//         // List<String> sortedList = list.stream()
//         //         .sorted((a,b)->b.length()-a.length())
//         //         .toList();
//         List<String> sortedList = list.stream()
//                 .sorted((a,b)->a.length()-b.length())
//                 .toList();

//         System.out.println(sortedList);
//     }
// }


// class sortedEX {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);
//         List<Integer> result = list.stream()
//         .filter(n -> n % 5 == 0)
//         .sorted()
//         .toList();
//         System.out.println(result);
//     }
// }



// class sortedEX {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);

//         int smallest = list.stream()
//                 .sorted()
//                 .findFirst()
//                 .get();

//         System.out.println(smallest);
//     }
// }




// class sortedEX {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);

//         List<Integer> result = list.stream()
//                 .sorted(Comparator.reverseOrder()) // highest first
//                 .limit(2)                          // top 2
//                 .toList();

//         System.out.println(result);
//     }
// }



// class sortedEX {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(18, 42, 7, 91, 33, 25, 60);
//             List<Integer> result = list.stream()
//                     .filter(n -> n >= 10 && n <= 50) // range
//                     .sorted()
//                     .toList();
//         System.out.println(result);
//     }
// }



class Employee{
    public Employee(int i, String string, String string2, int j) {
        //TODO Auto-generated constructor stub
    }
    public Employee(int i, String string, int j, int k, String string2) {
        //TODO Auto-generated constructor stub
    }
    int eid;
    String dep;

    
}
class sortedEX {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Rahul","it",20000));
        List<>
    }
}