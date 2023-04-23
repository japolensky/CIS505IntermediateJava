package MODULE_6.ComposerApp;
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
