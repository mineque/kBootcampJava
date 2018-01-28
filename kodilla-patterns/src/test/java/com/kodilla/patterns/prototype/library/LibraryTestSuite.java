package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {


    @Test
    public void testGetBooks() {
        //GIVEN
        Library lib = new Library("The Library");
        Book book1 = new Book("Title1","Author1", LocalDate.of(2000,01,01));
        Book book2 = new Book("Title2","Author2", LocalDate.of(2000,01,01));
        Book book3 = new Book("Title3","Author3", LocalDate.of(2000,01,01));

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        //When

        int size = lib.libSize();
        System.out.println("Library has size: " + size);

        //Then

        Assert.assertEquals(3,size);

        Library libshallow = null;

        try {
            libshallow = lib.shallowCopy();
        } catch(CloneNotSupportedException c){}

        System.out.println("Library shallow has size: " + libshallow.libSize());
        System.out.println("Books in Shallow:");
        libshallow.getBooks();

        Assert.assertEquals(3,libshallow.libSize());


        Library libDeep = null;
        try {
            libDeep = lib.deepCopy();
        } catch (CloneNotSupportedException c) {
            System.out.println("Exception");
        }

        int size2 = libDeep.libSize();
        System.out.println("LibraryDeep has size: " + size2);

        Assert.assertEquals(3,libDeep.libSize());

        lib.remBook(book1);

        Assert.assertEquals(2,lib.libSize());
        Assert.assertEquals(2,libshallow.libSize());


        System.out.println("Library has size: " + lib.libSize());
        System.out.println("Books in library:");
        lib.getBooks();

        size2 = libDeep.libSize();
        System.out.println("LibraryDeep has size: " + size2);


        Assert.assertEquals(3,size2);
    }

}
