package tes.edu.module3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Collections
 * @since 04.04.2021 - 22.09
 **/

public class Collections {
    public static void main(String[] args) {
        //================INSERT=================
        List<Integer> arrayList =  new ArrayList<>();
        List<Integer> linkedList =  new LinkedList<>();

        //------------CREATE-------
        System.out.println("====================INSERT=================");
        System.out.println("------------------==CREATE==--------\n");

        // -ArrayList
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i);
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for create 100_000 elements = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(i);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for create 100_000 elements = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        //------------BEGINNING----------
        System.out.println("------------------==BEGINNING==------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0,42);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for insert 1000 elements from the beginning = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,42);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for insert 1000 elements from the beginning = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        //----------MIDDLE-------
        System.out.println("-------------------==MIDDLE==---------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size()/2, 42);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for insert 1000 elements from the middle = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size()/2, 42);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for insert 1000 elements from the middle = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        //-----------END---------
        System.out.println("--------------------==END==----------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() - 42, 23);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for insert 1000 elements from the end = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() - 42, 23);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for insert 1000 elements from the end = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");


        //===================UPDATE==============

        //------------BEGINNING----------
        System.out.println("======================UPDATE=================");
        System.out.println("-------------------==BEGINNING==-------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(0,5009);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for update 1000 elements from the beginning = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(0,5009);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for update 1000 elements from the beginning = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        //--------MIDDLE------
        System.out.println("--------------------==MIDDLE==-------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size()/2, 5009);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for update 1000 elements from the middle = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size()/2, 5009);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for update 1000 elements from the middle = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        //--------END------
        System.out.println("--------------------==END==-----------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 13, 5009);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for update 1000 elements from the end = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 13, 5009);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for update 1000 elements from the end = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");


        //==============DELETE==============

        //------------BEGINNING----------
        System.out.println("====================DELETE=================");
        System.out.println("-----------------==BEGINNING==-------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for delete 1000 elements from the beginning = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for delete 1000 elements from the beginning = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");


        //----------MIDDLE------
        System.out.println("-------------------==MIDDLE==-------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size()/2);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for delete 1000 elements from the middle = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for delete 1000 elements from the middle = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        //----------END--------
        System.out.println("--------------------==END==----------------\n");

        // -ArrayList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 20);
        }
        finish = LocalDateTime.now();
        System.out.println("ArrayList :\n\tTime for delete 1000 elements from the end = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");

        // -LinkedList
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 20);
        }
        finish = LocalDateTime.now();
        System.out.println("LinkedList :\n\tTime for delete 1000 elements from the end = "
                + ChronoUnit.MILLIS.between(start,finish) + "\n");
    }
}


/*====================INSERT=================
------------------==CREATE==--------

ArrayList :
	Time for create 100_000 elements = 45

LinkedList :
	Time for create 100_000 elements = 14

------------------==BEGINNING==------------

ArrayList :
	Time for insert 1000 elements from the beginning = 16

LinkedList :
	Time for insert 1000 elements from the beginning = 0

-------------------==MIDDLE==---------------

ArrayList :
	Time for insert 1000 elements from the middle = 5

LinkedList :
	Time for insert 1000 elements from the middle = 102

--------------------==END==----------------

ArrayList :
	Time for insert 1000 elements from the end = 0

LinkedList :
	Time for insert 1000 elements from the end = 0

======================UPDATE=================
-------------------==BEGINNING==-------------

ArrayList :
	Time for update 1000 elements from the beginning = 0

LinkedList :
	Time for update 1000 elements from the beginning = 0

--------------------==MIDDLE==-------------

ArrayList :
	Time for update 1000 elements from the middle = 0

LinkedList :
	Time for update 1000 elements from the middle = 98

--------------------==END==-----------------

ArrayList :
	Time for update 1000 elements from the end = 0

LinkedList :
	Time for update 1000 elements from the end = 1

====================DELETE=================
-----------------==BEGINNING==-------------

ArrayList :
	Time for delete 1000 elements from the beginning = 22

LinkedList :
	Time for delete 1000 elements from the beginning = 0

-------------------==MIDDLE==-------------

ArrayList :
	Time for delete 1000 elements from the middle = 3

LinkedList :
	Time for delete 1000 elements from the middle = 84

--------------------==END==----------------

ArrayList :
	Time for delete 1000 elements from the end = 0

LinkedList :
	Time for delete 1000 elements from the end = 0


Process finished with exit code 0
*/