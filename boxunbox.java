class Box_Unbox{
    public static void main(String[] args) {
        //unboxed value(primitive type)
        int a=30;
        System.out.println("Auto boxing example \n");
        System.out.println("unBoxed value: "+a);
        Integer a1=new Integer(a);//boxed value
        System.out.println("Boxed value: "+a1);
        System.out.println("Unboxing example \n");
        a=a1;
        System.out.println("after unboxing the value is: "+a);
         }
}

