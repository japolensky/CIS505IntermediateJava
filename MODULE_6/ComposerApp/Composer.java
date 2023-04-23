package MODULE_6.ComposerApp;
/*
 * (The Composer class #1). Design a class named Composer to represent a composer. This class contains:
 */
public class Composer {
private Integer id;     // 1. A private integer data field named id. The default is an empty string.
private String name;    // 2. A private string data field named name. The default is an empty string.
private String genre;   // 3. A private string data field named genre. The default is an empty string.

                        // 4. A no-argument constructor that creates a default composer.
    public Composer() {
        this.id=0;
        this.name="";
        this.genre="";
    } // end Composer no argument constructor
                        // 5. An argument constructor that creates a composer using all three data fields.
    public Composer(Integer Id, String Name, String Genre){

    }
                        // 6. Accessor methods for all three data fields.
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
                        // 7. Override the toString method. 
    @Override
    public String toString() {
        return String.format("  ID:    "+this.id+"\n"+
                             "  Name:  "+this.name+"\n"+
                             "  Genre: "+this.genre+"\n");//Return a string description of a composer with all three data fields, on separate lines.
    }
} // end composer class