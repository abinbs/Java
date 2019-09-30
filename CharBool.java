public class CharBool {

    public static void main(String[] args){

        char ucharac = '\u0126';

        char charac = 'W';

        boolean isprime = true;

        System.out.println("Unicode Character::" + ucharac);


        System.out.println("Normal Character::" + charac);

        System.out.println("Boolean::" +  isprime);
        
        /* The Boolean data type is used to store only two possible values: true and false.
        This data type is used for simple flags that track true/false conditions.
        
        The char data type is a single 16-bit Unicode character.
        Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
        The char data type is used to store characters
        */

    }
}
