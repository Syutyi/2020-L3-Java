class Singletons {

    /** Tests avec des classes internes **/
    static class SingletonA
    {
        private static SingletonA instance = null;
        private int donnee;
        static synchronized SingletonA instance()
        {
            if (instance == null) instance = new SingletonA();
            return instance;
        }
        private SingletonA() { donnee = 0; }
        int getDonnee() {return donnee; }
        void setDonnee(int d) { donnee = d; }
    }

    static class SingletonB
    {
        static final SingletonB instance =
                new SingletonB();
        private int donnee;
        private SingletonB() { donnee =0;}
        int getDonnee() {return donnee; }
        void setDonnee(int d) { donnee =d; }
    }

    public static class SingletonC
    {
        private int donnee;
        private static final SingletonC instance = new
                SingletonC();
        private SingletonC() { donnee =0; }
        static SingletonC instance() { return
                instance; }
        int getDonnee() { return donnee; }
        void setDonnee(int d) { donnee = d; }
    }

    static class SingletonD
    {
        private int donnee;
        private SingletonD() { donnee = 0; }
        private static class SingletonHolder
        {
            private static final SingletonD INSTANCE =
                    new SingletonD();
        }
        static SingletonD getInstance()
        {
            return SingletonHolder.INSTANCE;
        }
        int getDonnee(){return donnee;}
        void setDonnee(int d){ donnee = d;}
    }

}
