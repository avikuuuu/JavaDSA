package classObject;

// we can make only one class public in java
// we can create multiple class of without making them public
// and public class name must be same with the name of file name and it's case-sensitive
// until class get allocated memory  when object created
// till that before creation of object class will be store in metaSpace

/*
| Access Modifier | Within Same Class** | Within Same Package** | **In Subclass (Same Package)** | **In Subclass (Different Package)** | **Other Classes (Different Package)** |
|---------------------|-----------------------|-------------------------|--------------------------|-------------------------------------|---------------------------------------|
| **public**          | Yes                   | Yes                     | Yes                      | Yes                                 | Yes                                   |
| **protected**       | Yes                   | Yes                     | Yes                      | Yes (through inheritance)           | No                                    |
| **default** (no modifier) | Yes             | Yes                     | Yes                      | No                                  | No                                    |
| **private**         | Yes                   | No                      | No                       | No                                  | No                                    |

*/
public class baiscs {
    public static void main(String[] args) {


    }
}

class Greet{

    //default constructor that created automatically by default
    //a Constructor can't be final and static
    Greet(){

    }


    void greeting(){

    }

}


