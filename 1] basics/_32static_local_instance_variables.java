public class _32static_local_instance_variables {
      //----------  instance variable (within class ,but outside methdos and contructors)
      int a =23; 
      // instance variable always get default value , 0
      // a=123; can not reinisilised within class 
      void meth(){
            a=123; // can be reinitilliesed inside method
      }

      //-------------static (within class )
      static int data =43;  // one copy for all obj of this class ,hwereas for instance diff copies for each obj
      
      public int sum(int a ,int b){

            


            // -------------local variables
            // declared in method and with its parametres
            // withing block{} wuithin loop
            //  not accesible outised method or block
      
            int z =223;
            int w; // local vrariles do not get default value 
            //must need to initilised before use of it
            // otherwise errora at used line(eg line 24) when we use without ,initised 
            // return a+b+z+w;
            w=23;
            return a+b+z+w;
            
      }
      public static void main(String[] args) {  // this is method inside class
            


            //  we wonder all time why it is not happening 
            // the reason is that , z is local variable 
            // they must have to initilised before use

            // int z;
            // System.out.println(z);  


            // -----------------
            //this is static area
            System.out.println(data); // sattic variable of clases can directly acces
            // -----------------
            // System.out.println(a); we cant direct use intance var in static area ( of  methdod)
            // need obj to use
            _32static_local_instance_variables int_access = new _32static_local_instance_variables();
            System.out.println(int_access.a);
      }
}

// ---local variable
//  **memory allocation when function call , deallocate when function ends
// stack memeory ,with function or contructor or block stack
//  scope - within block 

//----instance variable
// inside class outside method
// scope - withing class and inside any method block conrtuctor of thta calss all
//  intance area  ----- instance method have it 
// static area  ----- static methdos have it
//  ** memroy allocate when obje is created ,when obj destroyed memory deallocate
//  scope - is in any method , but  if method is intance method(non static) direct acces
// and if method is static in which we are going to use intance var of class , new obj inside that static method
// and then by using that obj we canuse intace var of class ( eg in man static method)
// heap 


// *********function and methods of class are dealllocation state untill we call them in main()


//----- static variables
//inside class outside methdo blocks and constructro , wiith static keywword
// memory allocation ,when loading of class (java A --- which loads then start execution(java interpreter of jvm))
//  why so , bcz sttaic are  by class name  and classes are in methdo arreas with inner codes
//  hepa mmeory takes (static variables)














