package com.variableinjava;

//* Types and types convertion 

import java.util.Calendar;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // * declar variables
        String string = "a";
        int age =30,
            temperature = 2_100_000_000;

        System.out.printf("Age is %d and the tempreture is %d" + age, temperature, temperature);

        //* Int -hole number

        //*Primetive Type */
        /* * Types table
        *   _________________________________________________________
        *  |   Type     |    Bytes    |  Range     |  description    |
        *  |____________|_____________|____________|_________________|
        *  |  byte             1        [-128-127]         Hole numbers    |
        *  |  short            2        [-32,768-32,767]   Hole numbers    |
        *  |  Int              4        [-2,147,483,648-2,147,483,647]     Hole numbers    |
        *  |  Long             8                     Hole numbers    |
        *  |  float            4                    decimal numbers  |
        *  |  Double           8                    decimal numbers  |
        *  |  char             2         A,B,C ...  include international letters
        *  |  Bool             1         True/False                  |
        *  |_________________________________________________________|
        */

        //* Section 2 Converting Types

            //* Section 2.1 Numeric primitive casting

            /*
             * Numeric primitives can be cast in two ways.
             *
             * Implicit casting happens when  the source type has smaller range than the target type.
            */

            //* Implicit casting

            byte byteVar = 42;
            short shortVar = byteVar;
            int intVar = shortVar;
            long longVar = intVar;
            float floatVar = longVar;
            double doubleVar = floatVar;

            /*
             * Explicit casting has to be done when the source type has larger range than the targe type
            */

            double doubleVar2 = 42.5d;
            float floatVar2 = (float) doubleVar2;
            long longVar2 = (long)floatVar2; //* When casting floating point primitives (float, double) to whole number primitives, the number is rounded down e.g., 42.5 -> 42, 48.9 -> 48
            int intVar2 = (int)longVar2;
            short shortVar2 = (short) intVar2;
            byte byteVar2 = (byte) shortVar2;
    }

            //* Section 2.2 Basic Numeric Promotion
            public static void testNumericPromotion(){
                char character1 = 1, character2 = 2;
                short short1 = 1, short2 = 2;
                int int1 = 1, int2 = 2;
                float float1 = 1.0f, float2 = 2.0f;

                //* character1 = character1 + character2; //incompatible types: possible lossy conversion from int to char
                //* short1 = short1 + short2; //incompatible types: possible lossy conversion from int to short

                int1 = character1 + character2; //* Char is promoted to int
                int1 = short1 + short2;         //* Short is promoted to int.
                int1 = character1 + short1;     //* Both char and short are promoted to float;
                float1 = short1 + float2;       //* Short is promoted to float
                int1 = int1 + int2;             //* Int is unchange
            }

            //* Section 2.3 Non-numeric primitive casting

            /*
             * The boolean type cannot be cast to/from any other primitive type
             *
             * A char can be cast to/from any numeric type by using the code-point mappings specified by Unicode. A char is 
             * represented in memory as an usingned 16-bit integer value (2 value), so casting to byte (1 byte) will drop 8 of those
             * bits(this is safe for ASCII characters. The utility methods of the Charactes class use int(4 bytes) to transfer to/from
             * code-point values, but a short (2 bytes) would also suffice for storing a Unicode code-point.
             * 
            */

            //* int badInt = (int) true; // Compile Erro: Incompatible types

            char char1 = (char) 65;      //* this gonna be equal to A
            byte byte1 = (byte) 'A';     //* this gonna be equal to 65
            short shorts1 = (short) 'A'; //* Like the byte this gonna be equal to 65
            short inter1 = (int) 'A';    //* Like the byte this gonna be equal to 65

            char char2 = (char) 8253;    //* This gonna be equal to ‽
            byte byte2 = (byte) '‽';     //* 61 (Truncated code-point into the ASCII range)
            short shorts2 = (short) '‽'; //* This gonna be equal to 8253
            int inter2 = (int) '‽';      //* This gonna be equal to 8253


            //* Section 2.4 Object Casting

            /*
             * As with primitives, objects can be cast both explicitly and implicitly
             *
             * Implicit casting happens when the source type extends or implements the target type (casting to super class or
             * interface)
             *
             * Explicit casting has to be done when the source type is extended or implemented by the target type (casting to a
             * subtype). This can produce a runtime exception (ClassCastException) when the object being cast is not of the target
             * type (or target's subtype).
            */

            Float floatVariable = new Float(42.0f);
            Number num = floatVariable;        //* Implicit (Float implements Number)
            Float floatVaFloat2 = (Float) num; //* Explicit whay
            Double doubleVariable = (Double) num; //* Throws exception (the objects is not Double)

            //* Section 2.5 Testing is an object can be cast using instanceof

            /*
             * Java provides the intanceof operator to test if an object is of a certain type, or a subclass of that type. The program
             * can then choose to cast or not cast that object accordingly
             * 
            */

            Object obj = Calendar.getInstance();
            int time = 0;

            if(obj instanceof  Calendar)
            {
                time = ((Calendar)obj).getTime();
            }
            if(obj intanceof Date)
            {
                time = ((Date)obj).getTime()
            }

}
