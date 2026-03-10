package OOP;

/*
=============================================
STATIC VARIABLE & STATIC METHOD - REVISION
=============================================

Static Variable
- Belongs to the class, not objects
- Only ONE copy exists in memory
- Shared by all objects

Static Method
- Belongs to the class
- Called using ClassName.method()
- Can access only static variables directly

Instance Variable
- Belongs to objects
- Each object has its own copy

Instance Method
- Works with instance variables and static variables

Memory Concept

        CLASS AREA
        -------------------------
        | Pokemon.region=Kanto |
        -------------------------

        HEAP (OBJECTS)

        p1 object              p2 object
      ----------------      ----------------
      | name = Pikachu |    | name = Eevee |
      | level = 25     |    | level = 20   |
      | region ------->|----|------------->|
      ----------------      ----------------

Changing region once will affect all objects.
*/

class Pokemon {

    // Static variable (shared by all objects)
    static String region = "Kanto";

    // Instance variables
    String name;
    int level;

    // Constructor
    Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Static method
    static void showRegion() {
        System.out.println("Current Pokemon Region: " + region);
    }

    // Instance method
    void display() {
        System.out.println(name + " | Level: " + level + " | Region: " + region);
    }
}

public class Static {

    public static void main(String[] args) {

        // Call static method using class name
        Pokemon.showRegion();
        Pokemon.region =  "keptown";

        // Create objects
        Pokemon p1 = new Pokemon("Pikachu", 25);
        Pokemon p2 = new Pokemon("Eevee", 20);

        System.out.println("\n---- Initial State ----");
        p1.display();
        p2.display();

        // Change static variable
        System.out.println("\n---- Changing Region ----");
        Pokemon.region = "Johto";

        // Static method shows updated region
        Pokemon.showRegion();

        // Display object details again
        p1.display();
        p2.display();
    }
}