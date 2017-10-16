# Examples on Recursion

## SumToInt
The ```SumToInt``` class contains two implementations of the following sumTo(n)
function.

Definition: sumTo(n) adds integers from 1 to n:
* if n is 1, sumTo(n) is 1
* otherwise, sumTo(n) is sumTo(n-1)+n

The iterative solution ```sumTo1()``` uses a for loop. The recursive solution
```sumTo1()``` has a shape similar to that of the definition.

Try increment n and you will encounter a "stack overflow" problem when n reaches
100000. This is because each recursive method call takes up stack space and
Java's default call stack is not deep enough.

The following command shows the default stack size:
```
java -XX:+PrintFlagsFinal -version | grep -iE 'ThreadStackSize'

     intx CompilerThreadStackSize                   = 0               {pd product}
     intx ThreadStackSize                           = 1024            {pd product}
     intx VMThreadStackSize                         = 1024            {pd product}
java version "1.7.0_151"
OpenJDK Runtime Environment (IcedTea 2.6.11) (7u151-2.6.11-0ubuntu1.14.04.1)
OpenJDK 64-Bit Server VM (build 24.151-b01, mixed mode)
```
Note: ```1024``` means 1024K (1M).

You can change the stack size to avoid the stack overflow problem:
```
java -Xss10M SumToInt
sumTo(100000)=705082704
```

You can also use the iterative method ```sumTo1()``` to compute
```sumTo1(100000)``` without a stack overflow error because the method doesn't
make recursive method calls.
But, you will encounter a different problem when ```n = 10000000``` --
the result becomes negative (-2004260032) because we are overflowing the
```int``` datatype we use to store the result.
When ```n``` reaches ```10000000000``` you will see a different error:
```
SumToInt.java:3: error: integer number too large: 10000000000
    int n = 10000000000;
            ^
1 error
sumTo(1000000000)=-243309312
```
Check out [this guide](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
for the nuts and bolts of Java primitive data types.

## SumToLong
The ```SumToInt``` class uses integers to store the result which fails when n
becomes to large. We can alleviate the problem by using the ```long``` integer
type as shown in ```SumToLong``` class.

The ```sumTo1(1000000000)``` should finish quickly with the correct result
```sumTo(1000000000)=500000000500000000```.

