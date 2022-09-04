class _42conversion{

    public static void main(String[] args) {
        

        // int to obj 
        int i =34;
        Integer obj = Integer.valueOf(i);

        // obj to int
        Integer obj2 = Integer.valueOf(34);
        int j = obj2.intValue();


        // instance of method to check obj ref is of which class

        if (obj instanceof Integer) {
            System.out.println("yes");
        }
    }
}