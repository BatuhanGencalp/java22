# Static
- `static` keyword, makes methods/objects belong to a class.
## Static Variable
* A static variable belongs to the class, not to any specific object.
* It is shared among all instances(objects) of the class
* **Key Points**
    * Declared using the `static` keyword.
    * Memory is allocated once the class is loaded.
    * Can be accessed using the **class name**.(e.g., `ClassName.variableName`).
    * Useful for constants or data shared across all objects.
## Non-Static Variable
* A non-static variable belongs to a specified object.
* Each object has its own copy of the variable.
* **Key Points**
    * Declared without the `static` keyword
    * Memory is allocated once the object is created.
    * **Can ONLY** be accessed using an object of the class.(e.g., `objectName.variableName`)
    * Useful for storing data unique to each object. 