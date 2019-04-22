package examples.designPatterns.singletonPatterns;

/***********************************************************************************
 * Singleton Pattern says that just"define a class that has only one instance      *
 *                and provides a global point of access to it"                     *
 *                                                                                 *
 *                        Ways to create Object in Java.                           *
 *                         1. new Keyword                                          *
 *                         2. Using the New Instance (Reflection)                  *
 *                         3. Cloning of Object                                    *
 *                         4. Using Classloader                                    *
 *                         5. Using Object De-Serialization                        *
 *                                                                                 *
 * To make a singleton class we have to disable all these ways to create an object.*
 *                                                                                 *
 ***********************************************************************************/

class SingletonImpl1 {

    // creating an instance which is private static and final.
    private static final SingletonImpl1 instance = new SingletonImpl1();

    //constructor should be private so we can not create another instance using new.
    private SingletonImpl1() {

    }

    //public method to get the instance of the class.
    public static SingletonImpl1 getInstance() {
        return instance;
    }
}
