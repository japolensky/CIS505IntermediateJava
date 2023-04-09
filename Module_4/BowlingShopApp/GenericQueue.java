package MODULE_4.BowlingShopApp;
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
*/ 
/*
    Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
        Instructions for Assignment3.1.pdf
 */

import java.util.LinkedList;

/*  Assignment 4.1 - Bowling Shop App - Implementation by Polensky (2023)
 */
/*
 * (The GenericQueue class #6). Design a generic queue named GenericQueue. The class contains:
 */
public class GenericQueue<E> {
    private LinkedList<E> list= new LinkedList<E>(); //1. A private generic link list data field named list.
        public void enqueue(E item){ // 2. A public method named enqueue with a generic argument named item that adds the item to the list using the addFirst method.
            list.addFirst(item);
        }
        public E dequeue(){         // 3. A public method named dequeue with a generic return type that removes the first object in the queue using the removeFirst method.
            return list.removeFirst();
        }
        public int size(){          // 4. A public method named size with a data return type of integer that specifies the size of the list using the size method.
            return list.size();
        }
}  //End GenericQueue class
 