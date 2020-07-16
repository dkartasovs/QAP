import org.junit.jupiter.api.Test;

public class QASL {

    @Test
    public void javaBasic() {
        int a = 76;
        Integer b = 34;
        int f = 34;
        int g = someSum(76, 56);
        int h = someSum(a, b);
        System.out.println("Sum = " + g);
        System.out.println("Sum = " + h);
    }

    private Integer someSum(int a, int f) {
        return a + f;

    }


}
