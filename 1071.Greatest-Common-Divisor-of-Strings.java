//Runtime: 0 ms, faster than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //Primeiro, iremos chegar se a segunda string consegue dividir a primeira.Caso não, o output será vazio.
        //Str1+str2 tem de ser igual a str2+str1, pois ele será igual se for o maior divisor comum.
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }
        //Agora que sabemos que ela consegue dividir, é só um problema normal de MDC! >:D
        int output = mdc(str1.length(),str2.length());
        
        //substring irá se iniciar do 0 da lista da string :>.
        return str1.substring(0,output);
    }
    
    private int mdc(int i,int j){
        //Algoritmo de Euclides representado de modo Iterativo.
        while(j != 0){
            int aux = j;
            j = i % j;
            i = aux;
        }
        return i;
    }
}
