package Chapter5;

public class DeMorgansLaw {
    public static void main(String[] args) {
        //(De Morgan’s Laws) In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !.
        // De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
        // These laws state that the expression !(condition1 && condition2) is logically equivalent to the expres
        //sion (!condition1 || !condition2). Also, the expression !(condition1 || condition2) is logically
        // equivalent to the expression (!condition1 && !condition2). Use De Morgan’s laws to write equivalent
        // expressions for each of the following, then write an application to show that both the original ex
        //pression and the new expression in each case produce the same value:
        // a) !(x < 5) && !(y >= 7)
        //b) !(a == b) || !(g != 5)
        //c) !((x <= 8) && (y > 4))
        //d) !((i > 4) || (j <= 6))

        //!(condition1 && condition2)=(!condition1 || !condition2)
        //!(condition1 || condition2)=(!condition1 && !condition2)
        int x=1; int y=2; int a=3; int b=4; int g=5; int i=6; int j=7;
        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println(!((x<5)||(y>=7)));

        System.out.println(!(a == b) || !(g != 5));
        System.out.println(!((a == b) && (g != 5)));

        System.out.println(!((x <= 8) && (y > 4)));
        System.out.println(!(x <= 8) || !(y > 4));

        System.out.println(!((i > 4) || (j <= 6)));
        System.out.println(!(i > 4) && !(j <= 6));

    }
}
