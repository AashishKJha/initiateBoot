package examples;

public class App {
    public static void main(String[] args) {
        //System.out.print("Enter String to process : ");
        //App myapp = new App();
        //Reverse reverse = new Reverse();
        //CountElement count = new CountElement();
        //Scanner sc = new Scanner(System.in);
        //String data = sc.nextLine();
        //myapp.Reverese(data);
        //reverse.reverse(data);
        //System.out.println("Count Of Characters in given string");
        //countNumber(data);

        Basic basic = new Basic();
        basic.Idebtifires();
        basic.dataTypes();
        basic.enumTut();
        basic.enumWithCustomizeValues();
        basic.variables();
    }

    public void Reverese(String data) {
        System.out.println(data);

        String newData = new String(data).replace('s', 'p');

        System.out.println((newData));
    }
}
