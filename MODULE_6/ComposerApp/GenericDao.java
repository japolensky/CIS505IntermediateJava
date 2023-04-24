package MODULE_6.ComposerApp;
/*  Assignment 6.3 - ComposerApp - Implementation by Polensky(2023)  
 */
/*
 *   Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 *       Comprehensive Version (12th ed.). Pearson Education, Inc.
 */ 
/*
 *   Gold, P. (2023).  CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved
 *       Instructions for Assignment3.1.pdf
 */
/*
 * (The GenericDao interface #2). 
 * Design and interface named GenericDao to represent the operations in a data persistence layer. 
 * The interface contains:
 */
import java.util.List;

public interface GenericDao<E, K>{
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
} // end GenericDao interface
