<b>Inbuilt functional interfaces</b>

Java 8 comes with multiple functional interfaces. Some common interfaces
which are ver handy and needs to be used everywhere are:

<ul type="disk">
    <li>
        Consumer: This interface has only one method accept. It takes one argument and has void return type.
        There are multiple variant of this consumer. i.e. IntConsumer, LongConsumer etc.
    </li>
    <li>
        BiConsumer: This interface also has accept method, but it takes two parameters.
    </li>
    <li>Predicate: It has test method that returns boolean. varients are
        IntPredicate, LongPredicate etc. It has other functions i.e. and 
        (short-circuit logical AND), or (short circuit OR), negate
    </li>
    <li>
        Function: it has apply function. takes one arguement and returns some value.
                  andThen function is to chain one function to another.
    </li>
</ul>

