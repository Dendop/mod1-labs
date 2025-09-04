

public class uMaxNum {

    public int add(int a, int b )
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }

    public static void greeting()
    {
        System.out.println("Hello");
    }
    public static void greeting(String name)
    {
        System.out.println("Hello " + name);
    }

    public static int max_number(int[] list){
        int max = list[0];

        try
        {
            for(int i = 0; i < list.length; i++) {
                if (list[i] > max) {
                    max = list[i];
                }
            }

        }
        catch(Exception e)
        {
            System.out.println("The list must be integers, Error msg: " + e);
        }

        return max;
    }

    public static void main(String[] args) {

//        Main obj = new Main();
//
//        var first = obj.add(4,3);
//        var second = obj.sub(5,1);
//        var third = obj.mul(3,2);
//        var fourth = obj.div(12,4);
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        System.out.println(fourth);

        uMaxNum.greeting();
        uMaxNum.greeting("Mark");

        int[] arr_numbers = {1,14,43,332,-2,99};

        int max_from_list = uMaxNum.max_number(arr_numbers);
        System.out.println("Max value from the list is " + max_from_list);
    }
}