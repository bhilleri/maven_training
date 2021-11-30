package fr.lernejo;

import org.junit.jupiter.api.Assertions;


class SampleTest {
    Sample sample = new Sample();
    @org.junit.jupiter.api.Test
    void op() {
        Assertions.assertEquals(3 ,sample.op(Sample.Operation.ADD, 1, 2));
        Assertions.assertEquals(6 ,sample.op(Sample.Operation.MULT, 2, 3));
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Assertions.assertEquals(1, sample.fact(1));
        Assertions.assertEquals(2, sample.fact(2));
        Assertions.assertEquals(6, sample.fact(3));
        Assertions.assertThrowsExactly(IllegalArgumentException.class,()-> sample.fact(-1));
    }
}
