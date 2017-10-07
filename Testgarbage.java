package Garbagecollector;
//package defines a name space in which classes are stored
//Garbage collector reclaiming the runtime unused memory automatically
public class Testgarbage {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
	
		public void finalize()
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

		{
			System.out.println("Object is garbage collector");//print the value
		}

	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Testgarbage s1=new Testgarbage();
		//TestGarbage is name of the class
		//s1 is a reference variable
		//new is operator that which allocates memory to an object
		//TestGarbage is constructor call
		Testgarbage s2=new Testgarbage();
		//TestGarbage is name of the class
				//s2 is a reference variable
				//new is operator that which allocates memory to an object
				//TestGarbage is constructor call
		s1=null;//s1 and s2 is value null
		s2=null;
		System.gc();//prints garbage collector

	
		// TODO Auto-generated method stub

	}

}


