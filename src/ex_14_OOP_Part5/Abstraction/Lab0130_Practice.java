package ex_14_OOP_Part5.Abstraction;

public class Lab0130_Practice {
}

interface A1{}
interface A2{}
class Test1 implements A1{}
class Test2 implements A1,A2{}
class B1{}
class B2{}
//class Test3 extends B1,B2{}
class Test4 extends B1 implements A1,A2{}
//class Test5 implements A1,B1 extends B1{}

interface A3 extends A1{}

