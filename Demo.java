import java.util.*;


class Demo {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
       LinkedList<String> list = new LinkedList<String>();
       list.add("is");
       list.add("a");
       list.addLast("list");
       list.addFirst("this");
       list.add(3, "linked");
       System.out.println(list);


       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(3);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
       System.out.println(list.get(0));

       for(int i=0;i<list.size();i++)
       {
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
       LinkedList<Integer> userList=new LinkedList<>();
       System.out.println("Enter size");
       int n=sc.nextInt();
       System.out.println("Enter elements : ");
       for (int i = 0; i < n; i++) {
       
        int element = sc.nextInt();
        userList.add(element);
            }
            
        System.out.println(userList);
        }
}

