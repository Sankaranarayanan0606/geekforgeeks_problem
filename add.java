public class add {

    public static void main(String[] args) {
        int i = 4;
        System.out.println(sum(i));
    }

    public static int sum(int i)
    {
        if(i == 0)
            return 0;

        return i + sum(i - 1);
    }
}