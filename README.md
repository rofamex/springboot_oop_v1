# OOP (Objective Oriented Programming) like Inheritance, Polymorphism, Encapsulation, Exception handling, collections.

  1. Inheritance  
  * extends  
  * super  

  2. Polymorphism  
  * abstract  
  * interface  

  3. Encapsulation - access modifiers  
  * private - accessible to the class only.  
  * [default] - accessible to the class and package  
  * protected - accessible to class, package, and subclasses  
  * public - accessible to everything  

  4. Exception handling  
  * try{}catch(Exception e){}finally{}  
  * throw new ArithmeticException("Access Denied");  
  * public void methodName() throws Exception  

  5. Collections
  * set  
    It is fast and does not repeat values  
    * Set<Integer> set = new HashSet<Integer>();   
    Is not ordered  
    * TreeSet<Integer> treeSet = new TreeSet<Integer>(set);  
     Is ordered  
  
  * list  
    Slower then Set but it saves the order  
    * List<Integer> arrayList = new ArrayList<Integer>();  
    ArrayList is better for storing and accessing data - internally uses a dynamic array to store the elements.  
    * List<Integer> linkedList = new LinkedList<Integer>();  
    LinkedList is better for manipulating data - internally uses a doubly linked list to store the elements.   
  
  * deque  
  Deque is better than List - but can't get something inside the middle of the list.  
    * ArrayDeque<Integer> deque = new ArrayDeque<Integer>();  
    a list where every end supports insertion and removal. 
    * PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();  
    a list where does not have any ends.  


Dequeue is a list where every end supports insertion and removal.
With this feature, it is possible to use the dequeue as a list and a stack at the same time as required by the application.

Priority queue does not have any ends.
In a priority queue, elements can be inserted in any order but removal of the elements is in a sorted order.
Due to this behavior, a priority queue can be used to sort the elements.


# Project Dependencies

## Developer Tools  
###### Spring Boot DevTools

## Web  
###### Spring Web
