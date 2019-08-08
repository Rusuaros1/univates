package univates;

/**
 *
 * @author gustavo.schwan
 /teste
 */
public class ClassePrincipal {
    public static void main(String[] args){
        
    soma(2,3); //imprima o resultado na tela
    subtrai(3,3); //mesma coisa
     
    //teste condiocional (verdade ou falso)
    String var1 = "Juca";
    String var2 = "Bala";
    
    //equalsIgnoreCase = comparatexto ignorando o CaseSensitive
    if(var1.equals(var2) && 1 ==1){
        System.out.println("IF");
    } else{
        System.out.println("ELSE");
    }
     
    }
    public static void soma(int var1, int var2){
        int result = var1 + var2;
        System.out.println("Resultado = " + result);
    }
    public static void subtrai(int num1, int  num2){
        int result = num1 - num2;
        System.out.println(result + "Resultado = ");
        
    }
}
    
