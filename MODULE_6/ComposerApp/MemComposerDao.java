package MODULE_6.ComposerApp;
/*
 * (The MemComposerDao class #4). 
 * Design a class named MemComposerDao to represent the operations in a composer data persistence layer. 
 * The class contains:
 */
import java.util.List;
import java.util.ArrayList;

public class MemComposerDao implements ComposerDao {

// 1. A private List<Composer> data field named composers. The default is a list of composer objects.
    private List<Composer> composers;  
// 2. A no-argument constructor that creates a default list of five composer objects.
    public MemComposerDao(){
        composers = new ArrayList<Composer>();
        composers.add(new Composer(2525, "Aperature Science Corporation", "Folk"));
        composers.add(new Composer(3535, "Egon Schwartz", "Metal"));
        composers.add(new Composer(4545, "Cookie Monster", "Death Metal"));
        composers.add(new Composer(5555, "Ava Polensky", "Rock"));
        composers.add(new Composer(7510, "Leilani Polensky", "Hawaiian"));
    }// end no arguement constructor

// 3. An overridden findAll method that returns a list of composer objects.
    @Override
    public List<Composer> findAll() {
        return composers;
    }// end findAll method

// 4. An overridden findBy method that returns a single composer object matching the arguments id.
    @Override
    public Composer findBy(Integer key) {
        for(Composer composer : composers) {
            if(composer.getId().equals(key)) {return composer;}
        }
            return null;
    } // end findBy method

// 5. An overridden insert method that adds a new composer object to the list of composers.
    @Override
    public void insert(Composer entity) {
        composers.add(entity);
    } // end insert
}
