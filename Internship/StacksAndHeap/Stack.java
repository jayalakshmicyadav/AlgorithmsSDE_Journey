class Stack
{
    static void A()
    {
        B();
    }

    static void B()
    {
        C();
    }

    static void C()
    {
        System.out.println("Hello");
    }
    public static void main(String args[])
    {
        A();//constructor that are typing in the stack memory
    
    }
}