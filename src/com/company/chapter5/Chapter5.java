package com.company.chapter5;

import java.util.*;

public class Chapter5 {


    public static void main(String[] args) {

        // Concatenation

        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12
        System.out.println();
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //(1+2+three) = 6 , 6+"4" = 64

        System.out.println();
        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123

        // Immutability

        System.out.println();
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2); // 12

        // Important String Methods

        String string = "animals";
        // 0 1 2 3 4 5 6
        // a n i m a l s
        System.out.println(string.length()); // 7

        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
        // System.out.println(string.charAt(7)); // throws exception

        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1 because after to 5 index does not have a string

        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        //    System.out.println(string.substring(3, 3)); // empty string
        //    System.out.println(string.substring(3, 2)); // throws exception
        //    System.out.println(string.substring(3, 8)); // throws exception

        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        System.out.println("  abc".strip()); // abc
        System.out.println("\t a b c\n".strip()); // a b c

        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4

        // Method Chaining

        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "AnimAl"
        System.out.println(result); // AnimAl

        result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

        String a = "abc";
        String b = a.toUpperCase(); // ABC
        b = b.replace("B", "2").replace('C', '3'); // A23
        System.out.println("a=" + a); // abc
        System.out.println("b=" + b); // A23

        // Using the StringBuilder Class

        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha); // abcdefghijklmnopqrstuvwxyz

        StringBuilder alphabeth = new StringBuilder();
        for(char current = 'a'; current<='z';current++)
            alphabeth.append(current);
        System.out.println(alphabeth); // abcdefghijklmnopqrstuvwxyz

        // Mutability and Chaining

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"

        StringBuilder a2 = new StringBuilder("abc");
        StringBuilder b2 = a2.append("de");
        b2 = b2.append("f").append("g");
        System.out.println("a=" + a2); // abcdefg
        System.out.println("b=" + b2); // abcdefg
        //A StringBuilder object has been created..
        // a2 and b2 refer to the object pointed to by a2.
        // Therefore, the changes made on a2 and b2 variables affect each other.

        // Important StringBuilder Methods

        StringBuilder sb2 = new StringBuilder("animals");
        String sub = sb2.substring(sb2.indexOf("a"), sb2.indexOf("al"));
        int len = sb2.length();
        char ch = sb2.charAt(6);
        System.out.println(sub + " " + len + " " + ch); // anim 7 s

        StringBuilder sb3 = new StringBuilder().append(1).append('c');
        sb3.append("-").append(true);
        System.out.println(sb3); // 1c-true

        StringBuilder sb4 = new StringBuilder("animals");
        sb4.insert(7,"-"); // animals-
        sb4.insert(0,"-"); // -animals-
        sb4.insert(4,"-"); // -ani-mals-
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("abcdef");
        sb5.delete(1,3); // sb5 = adef [1,3) -> {1,2}
        //sb5.deleteCharAt(5); // throws an exception

        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3,6,"sty"); // [3,6) -> {3,4,5}
        System.out.println(builder); // pigsty dirty
        builder.replace(3,100,"");
        System.out.println(builder); // pig

        StringBuilder sb6 = new StringBuilder("ABC");
        sb6.reverse();
        System.out.println(sb6); // CBA

        sb6.reverse();
        String s3 = sb6.toString();
        System.out.println(s3);

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three2 = one.append("a");
        System.out.println(one == two); // false - different object referring
        System.out.println(one == three2); // true - same object referring

        String x = "Hello World";
        String z = "    Hello World".trim();
        System.out.println(x.equals(z)); // true - same content having
        System.out.println(x==z); // false - different object referring

        String str = "a";
        StringBuilder build = new StringBuilder("a");
        //  System.out.println( str == build); // DOES NOT COMPILE - different types

        // The String Pool

        String m = "Hello World";
        String n = "Hello World";
        System.out.println(m==n); // true
        n = "  Hello World".trim();
        System.out.println(m==n); // false

        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = "hello ";
        concat+= "world";
        System.out.println(singleString == oneLine); // false
        System.out.println(singleString == concat); // false

        String h = "Hello";
        String k = new String("Hello");
        System.out.println(h == k); // false

        String name = "Tarık";
        String name2 = new String("Tarık").intern(); // Returns the reference where the string "Tarık" is in memory.
        System.out.println(name == name2); // true

        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); // true
        System.out.println(first == second.intern()); // true
        System.out.println(first == third); // false
        System.out.println(first == third.intern()); // true


        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true

        System.out.println(bugs.toString()); //[Ljava.lang.String;@160bc7c0
        System.out.println(Arrays.toString(bugs)); // [cricket, beetle, ladybug]

        String [] strings = {"stringValue"};
        Object [] objects = strings;
        String [] againStrings = (String[]) objects;
        //    againStrings[0] = new StringBuilder(); // DOES NOT COMPILE - StringBuilder is not a String !!!
        //    objects [0] = new StringBuilder(); // object referred String  - ArrayStoreException

        String[] mammals = {"monkey","chimp","donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey

        String [] birds = new String[6];
        System.out.println(birds.length); // 6

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i+5;
        }

        //    numbers[10] = 3; // Index 10 out of bounds for length 10
        //    numbers[numbers.length] = 5; // Index 10 out of bounds for length 10

        int[] numbers2 = { 6, 9, 1 };
        Arrays.sort(numbers2);
        for (int i = 0; i < numbers2.length; i++)
            System.out.print(numbers2[i] + " "); // 1 6 9

        String[] strings2 = { "10", "9", "100" };
        Arrays.sort(strings2);
        for (String string3 : strings2)
            System.out.print(string3 + " "); // 10 100 9 - Alphabetic Sort

        int[] numbers3 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers3, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers3, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers3, 1)); // -1 (0-1)
        System.out.println(Arrays.binarySearch(numbers3, 3)); // -2(-1-1)
        System.out.println(Arrays.binarySearch(numbers3, 9)); // -5 (-4-1)

        int[] numbers4 = {3,2,1}; // array isn't sorted
        System.out.println(Arrays.binarySearch(numbers4,2)); // 1
        System.out.println(Arrays.binarySearch(numbers4,3)); // -4 (-3-1)

        System.out.println(Arrays.compare(new int[] {1},new int[] {2})); // Negative
        System.out.println(Arrays.compare(new int[] {4},new int[] {2})); // Positive
        System.out.println(Arrays.compare(new int[] {4,1},new int[] {4,2})); // Positive
        System.out.println(Arrays.compare(new int[] {4,2},new int[] {2,1})); // Negative
        System.out.println(Arrays.compare(new int[] {2},new int[] {2})); // Zero
        System.out.println(Arrays.compare(new String[] {"a"},new String[] {null})); // Positive
        System.out.println(Arrays.compare(new String[] {"a"},new String[] {"A"})); // Positive
        System.out.println(Arrays.compare(new String[] {"a"},new String[] {"aa"})); // Negative
        System.out.println(Arrays.compare(new String[] {"aA"},new String[] {"a"})); // Positive
        //  System.out.println(Arrays.compare(new int[] {2},new String[] {"A"})); // DOES NOT COMPILE - different types

        System.out.println(Arrays.mismatch(new int[] {1},new int[] {1})); // -1 (equal)
        System.out.println(Arrays.mismatch(new String[] {"a"},new String[] {"A"})); // 0 or positive (different)
        System.out.println(Arrays.mismatch(new int[] {1},new int[] {1,2})); // 0 or positive (different)


        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array

        int [][] args2 = new int[4][];
        args2[0] = new int[5];
        args2[1] = new int[3];


        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

        // ArrayList

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        var str1 = new ArrayList<String>();
        str1.add("a");
        str1.add("b");
        str1.add("c");
        for (String i:str1) {
            System.out.println(i);
        }

        var list = new ArrayList<>(); // var is a Object
        list.add("x"); // DOES COMPILE
        // for (String i:list) // DOES NOT COMPILE - list is a Object, it is not String !!

        List<String> list6= new ArrayList<>();
        // ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE - List is a Interface


        ArrayList listA = new ArrayList();
        listA.add("hawk"); // [hawk]
        listA.add(Boolean.TRUE); // [hawk, true]
        System.out.println(listA); // [hawk, true]

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //  safer.add(Boolean.TRUE); // DOES NOT COMPILE - isn't String

        // Using an ArrayList

        List<String> birds1 = new ArrayList<>();
        birds1.add("hawk"); // [hawk]
        birds1.add(1, "robin"); // [hawk, robin]
        birds1.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds1.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds1); // [blue jay, cardinal, hawk, robin]

        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk"); // [hawk]
        birds2.add("hawk"); // [hawk, hawk]
        System.out.println(birds2.remove("cardinal")); // prints false
        System.out.println(birds2.remove("hawk")); // prints true
        System.out.println(birds2.remove(0)); // prints hawk
        System.out.println(birds2); // []

        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk"); // [hawk]
        System.out.println(birds3.size()); // 1
        birds3.set(0, "robin"); // [robin]
        System.out.println(birds3.size()); // 1
        //   birds3.set(1, "robin"); // IndexOutOfBoundsException

        List<String> birds4 = new ArrayList<>();
        System.out.println(birds4.isEmpty()); // true
        System.out.println(birds4.size()); // 0
        birds4.add("hawk"); // [hawk]
        birds4.add("hawk"); // [hawk, hawk]
        System.out.println(birds4.isEmpty()); // false
        System.out.println(birds4.size()); // 2

        List<String> birds5 = new ArrayList<>();
        birds5.add("hawk"); // [hawk]
        birds5.add("hawk"); // [hawk, hawk]
        System.out.println(birds5.isEmpty()); // false
        System.out.println(birds5.size()); // 2
        birds5.clear(); // []
        System.out.println(birds5.isEmpty()); // true
        System.out.println(birds5.size()); // 0

        List<String> birds6 = new ArrayList<>();
        birds6.add("hawk"); // [hawk]
        System.out.println(birds6.contains("hawk")); // true
        System.out.println(birds6.contains("robin")); // false

        List<String> oneList = new ArrayList<>();
        List<String> twoList = new ArrayList<>();
        System.out.println(oneList.equals(two)); // true
        oneList.add("a"); // [a]
        System.out.println(oneList.equals(twoList)); // false
        twoList.add("a"); // [a]
        System.out.println(oneList.equals(twoList)); // true
        oneList.add("b"); // [a,b]
        twoList.add(0, "b"); // [b,a]
        System.out.println(oneList.equals(twoList)); // false

        int primitive = Integer.parseInt("123"); // 123
        Integer wrapper = Integer.valueOf("123"); // 123

        //     int bad1 = Integer.parseInt("a"); // NumberFormatException - "a" is not int value
        //       Integer bad2 = Integer.valueOf("123.45"); // NumberFormatException - 123.45 is not Integer value

        List<Integer> weights = new ArrayList<>();
        Integer w = 50;
        weights.add(w); // [50]
        weights.add(Integer.valueOf(60)); // [50, 60]
        weights.remove(Integer.valueOf(50)); // [60]
        System.out.println(weights);
        double dbl = weights.get(0); // 60.0

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        //  int hei = heights.get(0); // NullPointerException

        List<Integer> numbers5 = new ArrayList<>();
        numbers5.add(1);
        numbers5.add(2);
        //  numbers5.remove(1); // .IndexOutOfBoundsException - index 1 not exist
        System.out.println(numbers5);

        List<String> list8 = new ArrayList<>();
        list8.add("hawk");
        list8.add("robin");
        Object[] objectArray = list8.toArray();
        String[] stringArray = list8.toArray(new String[0]);
        list8.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2

        String[] array = {"hawk","robin"}; // [hawk, robin]
        List<String> list7 = Arrays.asList(array); // returns fixed size list
        System.out.println(list7); // [hawk, robin]
        System.out.println(list7.size()); // 2
        list7.set(1,"test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        System.out.println(Arrays.toString(array)); // [new, test] - 'list7' pointing to the 'array' sequence
        //   list7.remove(1); // UnsupportedOperationException

        String[] array2 = {"hawk" ,"robin"}; // [hawk, robin]
        List<String> list9 = List.of(array2); // return immutable list
        //  list9.add("test"); // .UnsupportedOperationException
        //  list9.set(0,"new"); // immutable list
        array2[0] = "new"; // [new, robin]
        System.out.println(list9.size()); // 2
        System.out.println(list9+"  "+Arrays.toString(array2)); // [hawk, robin] - [new, robin]

        List<String> fixedSizeList = Arrays.asList("a","b","c");
        List<String> expandableList = new ArrayList<>(fixedSizeList);
        expandableList.add("d");
        expandableList.set(0,"A");
        //     fixedSizeList.add("d"); // fixed size
        fixedSizeList.set(0,"A"); // mutable
        System.out.println(expandableList); // [A, b, c, d]
        System.out.println(fixedSizeList); // [A, b, c]

        List<Integer> integers = new ArrayList<>();
        integers.add(99);
        integers.add(5);
        integers.add(81);
        Collections.sort(integers);
        System.out.println(integers); // [5, 81, 99]

        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false - same value not add
        System.out.println(set.size()); // 1
        set.remove(66);
        System.out.println(set.isEmpty()); // true

        Map<String, String> map = new HashMap<>();
        map.put("koala","bamboo"); // put(key,value)
        String food= map.get("koala"); // bamboo
        String other = map.getOrDefault("ant","leaf"); // leaf
        for (String  key: map.keySet()) {
            System.out.println(key+ " " + map.get(key)); // koala bamboo
        }

        // Calculating with Math APIs

        int max = Math.max(3,7); // 7
        int min = Math.min(7,-9); // -9
        System.out.println("max: "+max+" min: "+min);

        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123

        double squared = Math.pow(5,2); // 25.0

        double randNum = Math.random(); // return random value in the range of 0 to 1
        System.out.println(randNum);

    }
}