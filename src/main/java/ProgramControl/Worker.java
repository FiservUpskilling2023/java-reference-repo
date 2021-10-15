package ProgramControl;

public class Worker {

    public Worker() { } // Constructor

    public void variables() {
        System.out.println("*** Variables ***");

        // Strings...
        String myString1 = "This is my string";  // Camel case.
        var myString2 = "This is another string"; // Type inference.
        var thing = "This variable is poorly named";

        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(thing);

        var mySpecialString = "---Title---\nline one\nline two\nline three";  // Backslash represents an escape character.
        System.out.println(mySpecialString);

        // Numbers...
        int myNumber1 = 1;
        Integer myNumber2 = 1;

        double myNumber3 = 1.2;
        Double myNumber4 = 1.2;

        System.out.println(myNumber1);
        System.out.println(myNumber2);
        System.out.println(myNumber3);
        System.out.println(myNumber4);

        // Arrays...
        int[] myArray1 = { 11,22,33 };
        System.out.println(myArray1[0]); // Zero based: first item in the array is 0, not 1.
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);

        String[] myArray2 = { "one", "two", "three" };
        System.out.println(myArray2[0]); // Zero based: first item in the array is 0, not 1.
        System.out.println(myArray2[1]);
        System.out.println(myArray2[2]);

        // Objects...
        Person person1 = new Person("Joe"); // Reference type.
        var person2 = new Person("Fred"); // person2 is a reference to an instance of a Person object.
        var car = new Person("Mary"); // Poorly named!

        System.out.println(person1);
    }

    public void scope() {
        // Function scope.
        int myNumber1 = 1; // Does not conflict with "myNumber1" in the varaibles() function.
        int myNumber2 = 2; // Does not conflict with "myNumber2" in the varaibles() function.
    }

    public void ifElse() {
        System.out.println("*** If Else ***");

        int age = 25;

        // Single if...
        if (age == 25) {
            System.out.println("Age is equal to 25.");
        }

        // If else...
        if (age == 25) {
            System.out.println("Age is equal to 25.");
        } else {
            System.out.println("Age is not equal to 25.");
        }

        // Else if...
        if (age < 10) {
            System.out.println("Young");
        } else if (age >=11 && age < 20) {
            System.out.println("Child");
        } else if (age >= 20) {
            System.out.println("Adult");
        }
    }

    public void switchKeyword() {

        // Switching using integers.
        int dayOfWeek = 1;
        String weekday = switch (dayOfWeek) { // Enhanced switch statement.
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day of the week";
        };
        System.out.println(weekday);

        // Switching using Strings.
        String dayOfWeekArg = "Monday";
        String typeOfDay = switch (dayOfWeekArg) {
            case "Monday" -> "Start of work week";
            case "Tuesday", "Wednesday", "Thursday" -> "Midweek";
            case "Friday" -> "End of work week";
            case "Saturday", "Sunday" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        };
        System.out.println(typeOfDay);
    }

    public void loops() {
        System.out.println("*** Loops ***");

        // For loop.
        for (int i = 0; i < 3; i++) { // Loop three times.
            System.out.println(i);
        }

        // While loop.
        int i = 0; // Scope: This variable does not conflict with the "i" above.
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        // Do While loop.
        int k = 0;
        do {
            System.out.println(k);
            k++;
        }
        while (k < 3);

        // Foreach.
        int[] array = { 1, 2, 3 };
        for (int num : array) {
            System.out.println(num);
        }
    }

    public void functions() {
        System.out.println("*** Functions ***");

        // Objects are passed by reference, they can be mutated in the function.
        Person p = new Person("Beth");
        System.out.println(p);

        updatePersonName(p, "Mary Beth");
        System.out.println(p);

        p = updatePersonName2(p, "Mary");
        System.out.println(p);

        // Primatives...
        int magicNumber = getMagicNumber();
        int magicNumber2 = getMagicNumber(2);
        System.out.println(magicNumber);
        System.out.println(magicNumber2);

        // Primatives are passed by value (AKA passed by copy), their value will not persisted after returning from the function.
        System.out.println(magicNumber);
        incrementMagicNumber(magicNumber);
        System.out.println(magicNumber);

        var students = getStudents();
        for (String studentName : students) {
            System.out.printf(String.format("%s\n", studentName));
        }

        var p2 = createPerson("Billy");
        System.out.println(p2);
    }

    //
    // Private helper functions.
    //

    private String[] getStudents() {
        String[] retval = new String[3];
        retval[0] = "Joe";
        retval[1] = "Fred";
        retval[2] = "Mary";
        return retval;
    }

    private int getMagicNumber() { // getMagicNumber() is overloaded.
        return 42;
    }

    private int getMagicNumber(int multiplier) { // getMagicNumber() is overloaded.
        return 42 * multiplier;
    }

    private void incrementMagicNumber(int number) {
        number++;
    }

    private void updatePersonName(Person p, String newName) { // Awkward: Not encouraged.
        p.name = newName;
    }

    private Person updatePersonName2(Person p, String newName) {  // Awkward: Not encouraged.
        p.name = newName;
        return p;
    }

    private Person createPerson(String name) {
        return new Person(name);
    }
}
