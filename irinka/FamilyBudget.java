package irinka;
import java.io.*;
public class FamilyBudget {
    private int money;

    public void Setmoney(int money){
        this.money=money;
    }
    public int Getmoney(int money){
        return money;
    }
    public void Changemoney(int m, boolean b){
        if (b) money -= m;
        else money += m;
    }

    public void MoneyInstance(){
        if(money>40000) System.out.println("You are rich :) ");
        if(money>10000 && money<40000) System.out.println("medium :| ");
        else System.out.println("You are poor :( ");
    }

    public void Writefile() {
        File file = new File("C:\Users\student\IdeaProjects\Formidterm\newfile.txt");
    }

}
//    განსაზღვრეთ კლასი FamilyBudget: მთელი ტიპის დახური money ცვლადით. ააგეთ მეთოდები
//
//        რომლებიც საშუალებას იძლევა money ცვლადში მნიშვნელობის მინიჭების, შეცვლის, მიღე-
//        ბის.
//
//        დაწერეთ მეთოდი, რომელიც დაადგენს FamilyBudget მდგომარეობას money თვისების
//        მიხედვით. (თუ money მეტია 40 000-ზე მდიდარი, თუ მოთავსებულია 10000-დან 40 000-
//        მდე საშუალო, წინააღმდეგ შემთხვევაში ღარიბი).
//        დაწერეთ მეთოდი, რომელიც budget.txt ფაილში შეინახავს მოთხოვნი FamilyBudget-ის
//        money თვისების მდგომარეობას, ყოველი მისი ცვლილების დროს.
//        განსაზღვრეთ კლასი FamilyMember ოთხი დახურული თვისებით: name, lastName, age, status.
//
//        დაწერეთ FamilyMember კონსტრუქტორი, რომელიც უზრუნველყოფს თვისებების ინი-
//        ციალიზაციას.
//
//        დაწერეთ მეთოდი, რომელიც family.txt ფაილში დაამატებს FamilyMember-ის ტიპის
//        ობიექტის ველების მნიშვნელობას ცალკე ხაზზე.
//        დაწერეთ მეთოდი, რომელიც FamilyMember ტიპის ობექტს საშუალებას მისცემს მიმართოს
//        FamilyBudget ტიპის ობიექტს და მოსთხოვოს თანხა, თანხის მიღება განხორციელდება იმ
//        შემთხვევაში თუ money ველში მოთხოვნილ თანხაზე მეტი თანხაა.