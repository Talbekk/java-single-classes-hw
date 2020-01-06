public class Printer {
    private int numberOfSheets;
    private int tonerLevel;

    public Printer(int numberOfSheets,int tonerLevel){
        this.numberOfSheets = numberOfSheets;
        this.tonerLevel = tonerLevel;
    }

    public int getSheets(){
        return this.numberOfSheets;
    }

    public void print(int pages, int copies){
        int total = pages * copies;
        if(total < numberOfSheets && tonerLevel > total){
            this.numberOfSheets -= total;
            this.tonerLevel-= total;
        }
    }

    public int getToner(){
        return this.tonerLevel;
    }



}
