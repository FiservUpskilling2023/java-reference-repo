package com.xpanxion.java.intro;

import com.xpanxion.java.intro.enums.Make;
import com.xpanxion.java.intro.enums.Transport;
import com.xpanxion.java.intro.enums.DaysOfWeek;
import com.xpanxion.java.intro.exceptions.PersonNotFoundException;
import com.xpanxion.java.intro.models.Person;

import java.util.*;

public class Worker {

    //
    // Data members
    //

    private String name;

    //
    // Constructors
    //

    public Worker() { } // No argument constructor.

    public Worker(String name) {
        this.name = name;
    }

    //
    // Accessors
    //

    public String getName() {
        return name;
    }

    //
    // Public methods
    //

    // A method is a function that belongs to a class.
    private Integer add() { // function/method signature, this returns an Integer
        // Not much here...
        return 5150;
    }

    // We can pass
    private Integer add(Integer num1, Integer num2) { // Overloaded, two Integer parameters.
        return num1 + num2;
    }

    // We can pass at most 255 arguments into a function.
    // Typically the max is 7-9.
    private Integer add(Integer num1, Integer num2, Integer num3) { // Overloaded, three Integer parameters.
        // A function stub.
        return 5150;  // Hardcoding, Hard coding is the software development practice of
        // embedding data directly into the source code of a program or other executable object.
    }

    private void doWork() { // Subroutine is a type of function that returns nothing.
        // Do something
        // Then we will exit
    }

    public void test() { // Functions/Methods
        // for < > <= <=

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextLine();

        // For loop
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        int myArray[] = {1, 2, 3};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);

        // Casting...
        String myString = "1";
        int myNumber = Integer.parseInt(myString); // static method

    }

    public void primitiveTypesAndWrappers() {
        // Primitive types
        // 1 Byte = 8 Bits (1111 1111)
        // 4 Bytes = 32 Bits (1111 1111 1111 1111 1111 1111 1111 1111)
        // Integer = 2 pow 31
        // -2,147,483,648 -- 2,147,483,647

        Byte myByte = -128;
        int smallInt = -2147483648;
        int largeInt = 2147483647;

        Integer i = 2147483647; // 2147483648 ???

        float l = 30000000000000F;

        // Integer i = new Integer(1); // Deprecated.

        int myNumber = 1;
        Integer myInteger = 1; // Wrapping similar "abstraction"
        Double myDouble = 1.1;
        Float myFloat = 1.2F;  // Tell the compiler to treat it as float explicitly -> it uses f or F (Double by Default)
        Short myShort = 1;
        Character d = 'd';
        char name[] = {'j', 'o', 'e'};
        System.out.println(String.valueOf(name));

        // Bit shifting...
        // Base(2) => Base(10)
        // 0000    =>   0
        // 0001    =>   1
        // 0010    =>   2
        // 0011    =>   3
        // 0100    =>   4
        // 1000    =>   8

        var num = Integer.rotateLeft(1, 3); // static method
        System.out.println(num);
    }


    public void variables() {
        // Strings...
        System.out.println("*** Strings ***");
        String myString1 = "This is my string";  // Camel case.
        var myString2 = "This is another string"; // var keyword indicates type inference.
        var thing = "This variable is poorly named"; // Do not do this.

        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(thing);

        // Backslash represents an escape character. \n => Newline \t ==> tab \r\n ==> for Windows.
        var mySpecialString = "----- Title -----\nLine one.\nLine two.\nLine three.\nLine four:\tone\ttwo\tthree";
        System.out.println(mySpecialString);

        // Numbers...
        System.out.println("*** Numbers ***");
        int myNumber1 = 1; // Primitive type
        Integer myNumber2 = 1; // Integer wrapper, extends the primitive type.

        double myNumber3 = 1.2; // Primitive type
        Double myNumber4 = 1.2; // Double wrapper, extends the primitive type.

        System.out.println(myNumber1);
        System.out.println(myNumber2);
        System.out.println(myNumber3);
        System.out.println(myNumber4);

        // Conversions...
        System.out.println("*** Conversions ***");
        // Int to String.
        int myNumber5 = 44;
        var myString = String.valueOf(myNumber5);
        System.out.println(myString);

        // String to Int.
        var myString3 = "45"; // "45abc"
        if (isNumeric(myString3)) { // If we don't check, Integer.parseInt() throws a NumberFormatException for non-numeric values.
            var myInteger = Integer.parseInt(myString3);
            System.out.println(myString3);
        }

        // Bitshifting...
        // 0000 = 0
        // 0001 = 1
        // 0010 = 2
        // 0100 = 4
        // 1000 = 8
        var bitShifting = Integer.rotateLeft(1,3);
        System.out.println(bitShifting);

        // Arrays...
        System.out.println("*** Arrays ***");
        int[] myArray1 = { 11, 22, 33 };
        System.out.println(myArray1[0]); // Zero based: first item in the array is 0, not 1.
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);

        String[] myArray2 = { "one", "two", "three" };
        System.out.println(myArray2[0]); // Zero based: first item in the array is 0, not 1.
        System.out.println(myArray2[1]);
        System.out.println(myArray2[2]);

        // Objects...
        System.out.println("*** Objects ***");
        Person person1 = new Person("Joe"); // Reference type.
        var person2 = new Person("Fred"); // person2 is a reference to an instance of a Person object.
        var car = new Person("Mary"); // Poorly named!  Do not do this.
        System.out.println(person1);
    }

    public void processInput() {
        Scanner inScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String inputString = inScanner.nextLine();

        System.out.print("Enter your age (years): ");
        Byte age = inScanner.nextByte();

        System.out.println(String.format("Hello %s, you are %s years old.", inputString, age)); // Implicit conversion: age is converted from a Byte to a String.
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
        // Single equals "=" is an assignment operator
        // Double equals "==" is equality for primitives types
        if (age == 25) {
            System.out.println("Age is equal to 25.");
        }

        // If else...
        if (age == 25) {
            System.out.println("Age is equal to 25.");
        } else {
            System.out.println("Age is not equal to 25.");
        }

        // if else if...
        if (age < 10) {
            System.out.println("Young");
        } else if (age >=11 && age < 20) { // && => and
            System.out.println("Child");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else {
            System.out.println("Unknown");
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
            // If you know for sure that you are going to do something
            // ONCE before you check, use a do while loop.
            System.out.println(k);
            k++;
        }
        while (k < 3);

        // Foreach.
        int[] array = { 1, 2, 3 };
        for (int n : array) {
            System.out.println(n);
        }
    }

    public void megaList() { // Do not do this.
        // Poorly named function.
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

        // Primitives...
        int magicNumber = getMagicNumber();
        int magicNumber2 = getMagicNumber(2);
        System.out.println(magicNumber);
        System.out.println(magicNumber2);

        // Primitives are passed by value (AKA passed by copy), their value will not persisted after returning from the function.
        System.out.println("*** Pass by Value ***");
        System.out.println(magicNumber);

        // int magicNumber = 42;
        incrementMagicNumber(magicNumber);
        System.out.println(magicNumber);

        var students = getStudents();
        for (String studentName : students) {
            System.out.printf(String.format("%s\n", studentName));
        }

        var p2 = createPerson("Billy");
        System.out.println(p2);
    }

    public void passByValuePassByReference() {
        int number = 42;
        Integer number2 = 52;
        String message = "Hello World";
        Person person = new Person("Jon");

        //update(number, number2, message, person);

        System.out.println(number);
        System.out.println(number2);
        System.out.println(message);
        System.out.println(person);
    }

    private void update(int number, Integer number2, String message, Person person) {
        number = 4200;
        number2 = 5200;
        message = "Goodbye World";
        person.setName("Fred");
    }

    public void equalityVersusIdentityTest() {
        // Identity: Are these object references (pointers) pointing to the same place (object) in memory?
        // Equality: Are these two objects equal to each other as specified in our domain/context.

        //
        // PRIMITIVE TYPES (AKA VALUE TYPES): byte, short, int, long, float, double, char, boolean
        // NOTE: == is used for EQUALITY for PRIMATIVE TYPES.
        //

        int a = 5;
        int b = 5;

        if (a == b) {
            System.out.println("The value of a is equal to the value of b.");
        } else {
            System.out.println("The value of a is not equal to the value of b.");
        }

        //
        // REFERENCE TYPES
        // NOTE: == is used for IDENTITY for REFERENCE TYPES.
        //

        var p2 = new Person("Joe");
        var p3 = new Person("Joe");
        var p4 = p3;

        // Identity.
        if (p2 == p3) {
            // Unreachable code here: p2 and p3 point to different objects in memory.
        }

        if (p3 == p4) {
            System.out.println("p3 and p4 point to the same object in memory.");
        }

        // Equality.
        if (p2.equals(p3)) { // Two people are equal if they have the same name, because we built this logic in the Person class.
            System.out.println("p2 and p3 are considered to be equal but are different objects in memory.");
        }
    }

    public void optionals() {
        // Help elminate NullPointerException errors, introduced in Java 8.
        // Empty optionals throw NoSuchElementException.
        // https://youtu.be/PlOSuPVNy7k

        //
        // Examples...
        //

        var integerValue = Optional.<Integer>empty();
        //integerValue = Optional.of(null); // Throws NullPointerException (do not do this)
        integerValue = Optional.ofNullable(null);
        //integerValue = Optional.of(5150);

        if (integerValue.isPresent()) {
            System.out.println(integerValue.get());
        }

        System.out.println(integerValue.orElse(-1));
        System.out.println(integerValue.orElseGet(() -> 100));

        try {
            System.out.println(integerValue.orElseThrow(() -> new PersonNotFoundException("Your Person was not found.")));
        }
        catch (PersonNotFoundException pnfe) {
            System.out.println(pnfe.getMessage());
        }

        System.out.println(integerValue.map( x -> x + 1).orElse(-100));
        System.out.println(integerValue.map( x -> x + " lines.").orElse("no lines"));
        System.out.println(integerValue.filter(x-> x > 5000).orElse(-11));

        //
        // Optionals...
        //

        var p2 = getPersonOptional(123);
        System.out.println(p2.orElseGet(() -> new Person("none")));
        p2.ifPresent((p) -> System.out.println(p.name)); // This line is executed only if there is a value present.
    }

    public void enums() { // Enumerated constant.
        var m = Make.CHEVY;
        System.out.println(m);

        var firstDay = DaysOfWeek.MONDAY;

        if (firstDay == DaysOfWeek.MONDAY) {
            System.out.println("Today is Monday.");
        }
        else {
            System.out.println("Today is not Monday.");
        }

        // Print..
        var enumList = Make.values(); // var ==> type inference.
        for (Make make: enumList) { // For each.
            System.out.println(make);
        }

        // Enums can be like very simple classes.
        var t = Transport.AUTOMOBILE.speed;
        System.out.println(t);
    }

    public void constants() {
        final int MEANING_OF_LIFE = 42; // In this context, final means this cannot be changed.
        // BTW - Final has another meaning in OOP.
        //MEANING_OF_LIFE = 1; // Will not compile.
    }

    public void casting() {
        // Implicit casting...
        byte s = 1;
        double d = 1;
        var total = s + d;  // s is implicity cast (up or promoted) to a double (GENERAL term is casting)
        System.out.println(total);

        int a = 3;
        double b = 5.0;
        var result = a + b; // a is implicty cast (up) to a double (wide cast) (widden/up casted/promoted)
        System.out.println(result);

        // Explicit casting...
        int c = (int)b; // c is explicity cast (down) to an integer. // Could be potentially bad, we might lose info.
        System.out.println(c);
    }

    public void precendence() {
        // Full version: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        // () <== Highest
        // *
        // /
        // +
        // - <== Lowest
        int result1 = 4 * 2 / 1 + 1;
        int result2 = (4 * 2) / 1 + 1;
        int result3 = 4 * (2 / 1 + 1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    //
    // Private methods
    //

    private boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

    private Optional<Person> getPersonOptional(int personId) {
//        Optional<Person> retval = Optional.empty();
//        //retval = Optional.of(new Person("Joe"));
//        return retval;

        Person retval = null;
        //retval = new Person("Joey Jr.");
        return Optional.ofNullable(retval);
    }

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
        number = 5150;
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
