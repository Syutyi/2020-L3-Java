public class MyClass<T> {

    /** préciser l'encapsulation est important !
     * Dans notre cas, les attibuts peuvent être de type private
     */
    private T x ;
    private T[] table1 ;
    private T[] table2 ;

    /** Le type de variable T ne peut pas être statitique,
     * Il dépend de l'initialisation initiale, il peut être un int etc, donc ça ne peut être statitique
     */

    // public static T aField ;
    public static int account ;

    /** Encore une fois, l'encapsulation est importante ici
     * On va décider de rendre publique
     */
    public void myMethod() {
        /** Il n'y pas de constructeur par défaut et de constructeur tout simplement donc il n'est pas possible
         * d'appler la fonction de cette manière, de plus nous ne précisons pas du tout le type de varible
         * T ne peut pas être instancié directement
         */
        //x = new T () ;
        table2 = table1 ;

        /** Pas de tableau de type générique !
         * Donc c'est complètement faux
         */
        // table2 = new T [5] ;
    }

    /** On ne peut pas vérifier la correspondance des variables de type T et V
     *
     */
    //<V> void setMyField(T x) {
    //   this.x = x;
    //}


    <U> void setMyField(T... x) {
        this.table1 = x;
    }

    /**
     * Idem pour les erreurs corrigées juste auparavant
     * @param x
     * @param table1
     * @param table2
     * @param <V>
     */
    <V> MyClass(V x, V[] table1, T[] table2) {
        // this.x = x;
        // this.table1 = table1;
        this.table2 = table2;
    }

}
