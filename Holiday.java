public class Holiday {
    private String name;
    private int day;
    private String month;
// your code goes here
    Holiday(String name,int day,String month)
    {
        this.name = name;
        this.day = day;
        this.month= month;
    }
    public static void main(String[] args){
        Holiday h1 = new Holiday("Dusshera",20,"October");
        System.out.println(h1.name+" "+h1.day +" "+h1.month);
    }
}

