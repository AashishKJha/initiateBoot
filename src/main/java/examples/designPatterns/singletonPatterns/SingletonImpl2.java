package examples.designPatterns.singletonPatterns;

/***********************************************************************************
 *    Problem with above implementation is when the class will be loaded it will   *
 *   create new Object by default (early instantiation) event we don`t required it *
 *                                                                                 *
 *                    Solution is to follow Lazy Loading Pattern.                  *
 *                                                                                 *
 ***********************************************************************************/
class SingletonImpl2 {
    private static SingletonImpl2 instance = null;

    private SingletonImpl2() {

    }

    public static SingletonImpl2 getInstance() {
        if (instance == null) {
            instance = new SingletonImpl2();
        }
        return instance;
    }
}
