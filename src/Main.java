public class Main
{
    int rollno;
    String name;
    String city;

    public Main(int newRollno, String newName, String newCity)
    {
        this.rollno = newRollno;
        this.name = newName;
        this.city = newCity;
    }
    public String toString()
    {
        return rollno+" "+ name +" "+ city;
    }

    public static void main(String[] args)
    {
        Main s1 = new Main(101, "Raj", "Luknow");
        Main s2 = new Main(102, "yadov", "ghaziabad");

        System.out.println(s1);
        System.out.println(s2);


    }
}
