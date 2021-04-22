package com.example;

import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)  {

        MyIndexer my_indexer = new MyIndexer();

        int[] my_arr = { 1, 2, 3, 4 };
        //               0  1  2  3
        try {
            my_indexer.getElement(my_arr, 4);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        try {
            int elem = my_indexer.getElementAndThrow(my_arr, 10);
            System.out.println(elem);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        System.out.println(my_indexer.getElementAndThrow(my_arr, 2));

        try {
            int elem = my_indexer.getElementAndThrowCustom(my_arr, 12);
            System.out.println(elem);
        }
        catch (IndexTooBigException ex) {
            System.out.println(ex);
        }

    }


}
