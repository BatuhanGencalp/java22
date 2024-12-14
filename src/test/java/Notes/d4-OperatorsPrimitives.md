# Char Data Type
- In java a `char` is a short for 'character'.
- This primitive data type is used to store single character.
- Unlike other data type char can only hold single character.
- Size of this data type is 16-bit.
```java
char letter = 'T';
char num = '5';
char symbol = '&';
```
## Is `char` still used?
* **Less Common Today**: It is still part of Java, however
  it is not necessary for modern applications. Nowadays
  string(text type) are more popular because it can hold
  multiple characters and more versatile.
## Why the `char` data type created?
* When Java first created, `memory resources were 
very limited`, and it was efficient to store a single character
  as a `char` data type, which only took 16 bits(2byte).

## How is `char` related to ASCII and Unicode?
1. ASCII(American Standard Code for Information Interchange)
    * ASCII is a 7-bit character encoding standard that represents
      128 characters, including letters, digits and special symbols.
    * Each `char` in Java can represent characters from the ASCII
      table. For example, `A` has an ASCII value of `65`, and `a`
      has a value of 97.
2. Unicode
    * Java char is based on `Unicode`, which is a more comprehensive
      version of ASCII table.
    * Unlike ASCII, which is limited to 128 characters, Unicode
      supports 143000 characters, including symbols, emojis ...

#
**NOTE!**: `char` data type can be assigned with numerical value
or can be assigned with a value within single quotation. `''`
When `char` data type is assigned with a numerical value, it
finds the matching numerical value from `Unicode` or `ASCII` table
and then assigns itself with that character.
```java
char ch = 122;
System.out.println(ch); // This line will print letter `z`.
```