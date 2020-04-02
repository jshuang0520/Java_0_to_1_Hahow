/**

usage of keyword "final" in Java :


1. class    - can't be inherited
ex. public final class TestDemo{...} --> you can't "extends" TestDemo


2. method   - can't be overwritten
ex. public fianl void TestFunction(){...} --> you can't "overwrite" TestFunction


3. variable - can't be changed after init
ex. static final int i = 123; --> you can't "assign" i = 456; after that
// note. Using "static" for this variable is because, we use this variable in main() method

 */