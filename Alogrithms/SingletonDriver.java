
class Singleton{
    private static Singleton obj;
    private Singleton(){
        
    }
    public static Singleton getSingleton(){
        if(obj==null)
            obj = new Singleton();
        return obj;
    }
}
class SingletonDriver {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingleton();
        System.out.println(obj1);
        Singleton obj2 = Singleton.getSingleton();
        System.out.println(obj2);
    }
}