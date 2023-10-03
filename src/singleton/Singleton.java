package singleton;
// Garante que uma classe tenha apenas uma única instância
// Fornece um ponto de acesso global para aquela instância
// Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.
public class Singleton {
    private static Singleton instance;
    private Singleton() { } // construtor vazio

     public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
