import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Array with firstnames
        String first[] = {"Iolas",
                "Aelrindel",
                "Sythaeryn",
                "Purtham",
                "Illitran",
                "Durlan",
                "Reluraun",
                "Laiex",
                "Aquilan",
                "Aywin",
                "Paeral",
                "Alanis",
                "Adorellan",
                "Artin",
                "Elanil",
                "Bialaer",
                "Saelethil",
                "Darunia",
                "Inchel",
                "Mirthal"};

        // Array with lastnames
        String last[] = {"Crabella",
                "Orimenor",
                "Zumcyne",
                "Ravawenys",
                "Loraqirelle",
                "Sarrie",
                "Rokrana",
                "Quistina",
                "Farjor",
                "Daeralei",
                "Lorathyra",
                "Miaxalim",
                "Arajyre",
                "Gilran",
                "Fencan",
                "Biran",
                "Dorra",
                "Qinqen",
                "Eilleth",
                "Wysamys"};

        Random rand = new Random();

        // Inserts a random name from the array to the strings
        String firstName = first[rand.nextInt(first.length)];
        String lastName = last[rand.nextInt(last.length)];

        // Outputs a random name to the console
        System.out.println(firstName + " " + lastName);

    }
}