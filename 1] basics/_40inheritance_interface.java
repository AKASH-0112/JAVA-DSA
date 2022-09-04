
interface i {
     void m();
}

interface n {
    void m();
}

interface P extends i ,n { // multiple inheritance in interface allowed
  

}

class E implements P {  ///  single method is there only , both methods are not come

    public void m(){
        System.out.println("hi");
    }

    public void m3(){
        System.out.println("hellow");
    }
}


class _40inheritance_interface {
    public static void main(String[] args) {
        

        i ref =new E();  // parent ref 
        ref.m();
        // ref.m3(); // error only parent meth can call

        E ref3 = new E();  //child ref
        ref3.m();
        ref3.m3();



    }
}


// bcz implemamtation class is gona provide  body so for unique method  so no abuigity problem , interface have multiple inheritance

// in new version interface can haev static default methods too , and mutliple inheritance will work there too 
// sol are there for it