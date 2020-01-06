public class Printer {
    private int numberOfSheets;

    public Printer(int numberOfSheets){
        this.numberOfSheets = numberOfSheets;
    }

    public int getSheets(){
        return this.numberOfSheets;
    }

    public void print(int pages, int copies){
        int total = pages * copies;
        this.numberOfSheets -= total;
    }


}
