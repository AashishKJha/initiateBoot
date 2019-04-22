package examples.designPatterns.singletonPatterns;

/***************************************************************************************
 *    Now the getInstance method is synchronized for all thread whether the object is  *
 *  created or not that will cause an performance issue for multi-threaded environment *
 *                                                                                     *
 *    Solution is make only creation of object of getInstance method to synchronized.  *
 *                                                                                     *
 ***************************************************************************************/

class SingletonImpl4 {
    private static SingletonImpl4 instance = null;

    private SingletonImpl4() {

    }

    public static SingletonImpl4 getInstance() {
        if (instance == null) {
            synchronized (SingletonImpl4.class) {
                if (instance == null) {
                    instance = new SingletonImpl4();
                    return instance;
                }
            }
        }
        return instance;
    }
}
