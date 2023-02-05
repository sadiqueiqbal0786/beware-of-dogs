package com.epam.rd.autotasks.house;

import java.util.ArrayList;
import java.util.List;

public class House <T> {

    private final List<T> residents = new ArrayList<>();

    public void enter(T resident) {
        residents.add(resident);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
/*
*
* The class House has been changed to use generics, denoted by the <T> syntax.
* This means that when creating an instance of House,
*  you must specify the type of resident that the house is meant to hold,
*  such as House<Dog> or House<Cat>.

The enter method has been altered to check the class of the incoming resident and
* compare it to the class of the current resident. If the current resident is null or
* the classes match, then the new resident is allowed to enter.
*  Otherwise, an IllegalArgumentException is thrown to indicate that residents of different
* types cannot enter the same house.

In the Main class, two instances of House are created, one for dogs and one for cats.
* When a new resident of the appropriate type is entered into each house,
*  it succeeds because the resident classes match.
*  However, if you uncomment the two lines that try to enter a cat into a dog house or
*  a dog into a cat house, they will not compile because the classes are different
* from the resident type specified when the House instance was created.*/