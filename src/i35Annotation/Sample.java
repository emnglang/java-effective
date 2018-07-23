package i35Annotation;

// Program containing marker annotations - Page 170
public class Sample {
    @Test
    public static void m1() {
    }  // MyTest should pass

    public static void m2() {
    }

    @Test
    public static void m3() {    // MyTest Should fail
        throw new RuntimeException("Boom");
    }

    public static void m4() {
    }

    @Test
    public void m5() {
    } // INVALID USE: nonstatic method

    public static void m6() {
    }

    @Test
    public static void m7() {    // MyTest should fail
        throw new RuntimeException("Crash");
    }

    public static void m8() {
    }
}