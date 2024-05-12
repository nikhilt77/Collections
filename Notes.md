# JAVA Collections Notes

## TreeMap
- [ ] Insertion order not preserved
- [ ] Duplicate keys not allowed
- [ ] Defaultsorting order:keys should be homogenous and comparable
- [ ] Customised Order:Need not be homogenous
- [ ] Null is not allowed


## Concurrent Collection
- [ ] Synchronisation to prevent data consistency
- [ ] List and Linked list are not synchronised
- [ ] Collections have methods to make these synchronised :
- [ ] Collections.synchronizedList(ist);
- [ ] Collections.synchronizedMap(map);


## Concurrenthashmap
- [ ] Provides ultimate concurrency
- [ ] More helpful in multithreading
- [ ] By default has 16 divisions called concurrency level ,do not change it
- [ ] It locks only a portion of code
- [ ] It is better than hash table and synchronised map
- [ ] Null not allowed
- [ ] Fail safe supports iteration and modification simultaneously  

## Copy on write ArrayList
- [ ] Read is done on main object and write on cloned object, this is how thread safety is achieved

## Lambda
- [ ] Functional programming is achieved
- [ ] To write clean code
- [ ] To use parallel processing
- [ ] Function without any name, modifier or return type
- [ ] It can guess the value’s datatype

## Functional Interface
- [ ] Interface contains only a single abstract method

## Predicate
- [ ] It is a predefined functional interface
- [ ] Interface Predicate<T>{
		  boolean test(T t);
      }

## Generics
- [ ] Type checking at compile time
- [ ] We tell the compiler the datatype we are using and if a mistake is made a compile time error is asked to be raised
- [ ] Public class Data<T>(T is the type parameter)
- [ ] Generic class and interfaces
 -[ ] Type parameter is only for generic classes, methods and constructors only

## Restrictions with WildCards
- [ ] We cannot use them as type parameter in class level, I.e at the header
       Eg: public class Box<?>->This is not allowed
- [ ] Does not support multiple bounds
	eg:<? Extends Number &Runnable>
- [ ] No restrictions on Read operations
- [ ] When upper bound is used we cannot add anything
- [ ] But lower bound when used we can add elements
- [ ] You cannot add anything to a list of unknown type
