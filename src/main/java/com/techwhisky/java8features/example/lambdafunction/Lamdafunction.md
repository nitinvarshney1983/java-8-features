lambda functions were introduced in java 8

it used to reduce boilerplate code that we mostly wrote 
to implement an interface with a single abstract function.

In java 8 interfaces with one abstract method are called
functional interface. You can also use Document annotation
on top of interface. This enables other developers to let know
the purpose of the interface so that they should be aware about 
not to introduce new abstract method in functional interface.

Developers are always free to add n numbers of default and static
functions in a functional interface. 

Default functions were added to Interfaces in java 8 to support 
backward functionality.

Before java 8 to implement a function defined in an Interface, either
you had to write an abstract or concrete class(to implement the function
and then call function implementation using concrete class object in a
caller class) or you could use anonymous classes directly in the caller class.

Lambda functions reduces all such boilerplate code for you.
If you have 1-2 linear small functions you can use them.

There are multiple variation of lambda function. 
1- Defining types are optional.
2- Parameters passed in lambda function should be either final or effectively final
3- return statement are optional for 1 line of code.
4- curly braces are optional for 1 line of code.