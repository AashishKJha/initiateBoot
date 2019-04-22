package examples.designPatterns.singletonPatterns;

/***********************************************************************************
 *    Problem with early instantiation has been resolved but the solution is not   *
 *                   thread safe in multi-threaded environment                     *
 *                                                                                 *
 *               Solution is make getInstance method to synchronized.              *
 *                                                                                 *
 ***********************************************************************************/

class SingletonImpl3 {
    private static SingletonImpl3 instance = null;

    private SingletonImpl3() {

    }

    public static synchronized SingletonImpl3 getInstance() {
        if (instance == null) {
            instance = new SingletonImpl3();
            return instance;
        }
        return instance;
    }
}
