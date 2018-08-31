package com.itminds;

abstract class SomeObject {

}

class ConcreteSomeObject extends SomeObject {
}

abstract class PatternB {
    public abstract SomeObject Create();
}

class ConcretePatternB extends PatternB {

    @Override
    public SomeObject Create() {
        return new ConcreteSomeObject();
    }
}

/* Write your answers and comments below this line

 */