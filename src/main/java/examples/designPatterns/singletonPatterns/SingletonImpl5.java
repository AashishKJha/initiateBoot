package examples.designPatterns.singletonPatterns;

/***************************************************************************************
 *    Now all the problems of object creation in multi-threaded environment has been   *
 *               resolved but still synchronized key word is there.                    *
 *                                                                                     *
 *              Solution is to follow Instantiation on Demand Pattern                  *
 *                                                                                     *
 ***************************************************************************************/

class SingletonImpl5 {

    private static class InstantCreator {
        private static final SingletonImpl5 instance = new SingletonImpl5();
    }

    static SingletonImpl5 getInstance() {
        return SingletonImpl5.InstantCreator.instance;
    }
}
