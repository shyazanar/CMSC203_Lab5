# CMSC203 Lab5

## Overview: 

In the Graphical User Interface (GUI) Lab we will construct a simple GUI step by step.

## Data Manager: (Provided to the student) 

It is good programming practice to separate functionality into distinct classes.  To accomplish this, GUI functionality is kept separate from the management of the application.  The DataManager does not interact with the user.  Rather, the GUI collects any user input like mouse-clicks and calls methods of the DataManager, and the DataManager reports results to the GUI which may be displayed to the user.  Within the DataManager, there are usually one or more Data Structures, which are populated with one or more types of Data Elements.  This DataManager has only simple functionality which does not require data structures other than simple fields.

## FXDriver: (Initial version provided to the student) 

The class called FXDriver is the starting point for the FX version of the GUI.  FX is the framework we will use, and is available beginning with Java 8.  There are many ways to organize the GUI, but one way is to hold the basic startup features in a single simple file, which calls an instance of the main panel.
In FX, the main method (as in any Java application) is the starting point.  In FX it calls only the method launch(args), where args is the array of data passed in to the application, usually null.  This launch method executes various setup code, hidden from the programmer, including creating a so-called “stage”, and calls the method start(Stage stage);  Everything that the programmer wants to execute must be placed in start.  

## FXMainPane: (Initial version provided to the student) 

In this approach to GUI building, an instance of the class FXMainPane does all the programmer’s work of creating the GUI.  The initial version is simply a stub with a constructor, so that FXDriver will compile and run.  
