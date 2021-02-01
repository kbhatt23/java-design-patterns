package com.learning.oopscocepts.basics;
//cyclic inheritance is not allowed in jaa
public class CyclicInheritance extends AnotherClass{

}

class AnotherClass /* extends CyclicInheritance */{}
