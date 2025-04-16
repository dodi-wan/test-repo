
class sales{
    String  men,
            women;
}
public class salesPerson{

    public static void main(String [] args) {
        sales Sales = new sales();

        Sales.men = "Andy = 00001";
        Sales.women = "Catrina = 00002";

        System.out.println(Sales.men + "\n" + Sales.women);

    }
}
