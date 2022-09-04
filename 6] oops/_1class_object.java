
class Pen { // class for pen ,blueprint
    String color ;
    String tyep ; // ballpoint pen , gel

    public void write(){
        System.out.println("writting...");
    }
    public void getcolor(){
        System.out.println(this.color); // this ,keyword
        // this is ref to obj which is calling getcolor method
    }
}
 class _1class_object {
    public static void main(String[] args) {
        
        //  why classes and obj introduced in lang
        // to solve real world problem  by coding

        //  obj is gaddi (obj have propoerty and have ability to do work)
        // class is bluprint

        Pen p1 = new Pen();
        // each obj have its class properties and methods
        // data -  property , members -fmethods
        p1.color = "red";
        p1.tyep = "ballpoint"; // gefining or assigning
        p1.write();


        //pen and color accesing method
        //get() methods 
        // this keyword
        p1.getcolor(); // getcolor ahve this ,which ref to p1

        Pen p2 =new Pen();
        p2.color ="black";
        p2.tyep =" get ";

        p1.getcolor();
        p2.getcolor();



    }
}
