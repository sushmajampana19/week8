public class ImmutableMutable {
    public static void main(String[] args) {
        String a="sushma";
        System.out.println("value of a: "+a+"\naddress of a: "+System.identityHashCode(a));
        a="Jampana sushma";
        System.out.println("value of a: "+a+"\naddress of a: "+System.identityHashCode(a));
    }
}



