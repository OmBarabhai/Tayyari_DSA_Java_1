package OOP;

/*
========================================
STATIC VARIABLE - QUICK INTERVIEW NOTE
========================================

Definition:
A static variable belongs to the CLASS, not to objects.

Key Idea:
Only ONE copy exists in memory and it is shared by all objects.

Memory View

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

If one object changes region → ALL objects see the change.

Best Practice:
Use class name for static variables

Pokemon.region = "Johto";
*/

class Pokemon {

    // Static variable (shared by all objects)
    static String region = "Kanto";

    // Instance variables (separate for each object)
    String name;
    int level;

    // Constructor
    Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Display method
    void display() {
        System.out.println(name + " | Level: " + level + " | Region: " + region);
    }
}

public class Static {

    public static void main(String[] args) {

        // Creating objects
        Pokemon p1 = new Pokemon("Pikachu", 25);
        Pokemon p2 = new Pokemon("Eevee", 20);

        System.out.println("---- Initial State ----");
        p1.display();
        p2.display();

        // Changing static variable
        System.out.println("\n---- Changing Region ----");

        Pokemon.region = "Johto";

        p1.display();
        p2.display();
    }
}