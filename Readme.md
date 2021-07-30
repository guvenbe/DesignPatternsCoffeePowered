SOLID

Single responsibility principle: 
    focused, single functionality that addresses a specific concern

Open close principle:
    (Classes, Modules, Methods etc.) should be open for extension, but closed for modification

Liskov Substitution Principle:
    We should be able to substitute base class object with child class object and this should not alter
    characteristics of program

Intrerface Segragation principle:
    Problem:Interface polution: Large interface, unrelated methods, force clases to implement unused methods
            Method implementation return null or default dummy values
    Solution: Keep interfaces small
              Highly cohesive 

Dependency inversion principle:
    A. High level modules should not depend on low level modules. Both should depend on abstractions
    B. Abstraction should not depend upon details Details should depend on abstractions