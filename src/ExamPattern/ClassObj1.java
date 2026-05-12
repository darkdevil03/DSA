package ExamPattern;

import java.util.Scanner;

public class ClassObj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int medId;
//        String medName;
//        String medFormula;
//        double medPrice;
        System.out.print("Enter Medicine List Size : ");
        int size = sc.nextInt();
        sc.nextLine();
        MedRecord[] sat=new MedRecord[size];
        for (int i = 0; i < size; i++) {
            sat[i]=new MedRecord();

            System.out.print("Enter Medicine Id : ");
            sat[i].setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter Medicine Name : ");
            sat[i].setName(sc.nextLine());
            System.out.print("Enter Medicine Formula : ");
            sat[i].setFormula(sc.nextLine());
            System.out.print("Enter Medicine Price : ");
            sat[i].setPrice(sc.nextDouble());
            sc.nextLine();

        }

        System.out.print("Enter required search count of Medicine name or formula : ");
        String search = sc.nextLine();

        System.out.println("Count : "+medMatch(sat,search));
    }

    static int medMatch(MedRecord[] medRecords, String search)
    {
        int count=0;
        for(MedRecord medRecord:medRecords){
            if(medRecord.getName().toLowerCase().contains(search.toLowerCase()) || medRecord.getFormula().toLowerCase().contains(search.toLowerCase())){
                count++;
            }
        }

        return count;
    }
}


class MedRecord{
    private int id;
    private String name;
    private String formula;
    private double price;
//    ExamPattern.MedRecord(int id,String name,String formula,double price){
//        this.id=id;
//        this.name=name;
//        this.formula=formula;
//        this.price=price;
//    }

    void setId(int id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
    void setPrice(double price) {
        this.price = price;
    }
    void setFormula(String formula) {
        this.formula = formula;
    }

    int getId() {
        return id;
    }
    String getName() {
        return name;
    }
    String getFormula() {
        return formula;
    }
    double getPrice() {
        return price;
    }
}