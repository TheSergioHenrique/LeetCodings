class Solution {
    public int romanToInt(String s) {
        //acho que isso vai precisar de um hashmap
        HashMap<Character,Integer> numerais = new HashMap<Character,Integer>();
        numerais.put('I', 1);
        numerais.put('V', 5);
        numerais.put('X', 10);
        numerais.put('L', 50);
        numerais.put('C', 100);
        numerais.put('D', 500);
        numerais.put('M', 1000);
        /*Hashmap criado, agora vamos fazer o algoritmo que faz o decrescimo
        ou acrescimo, de acordo com o input :> */

        int numeralResultado=0;
        for (int i=0; i<s.length();i++){
            //clausula para Subtração
            if(i < s.length()-1 && numerais.get(s.charAt(i)) < numerais.get(s.charAt(i+1))){
                numeralResultado -= numerais.get(s.charAt(i));
            }
            //processo de somar, caso não precise subtrair :>
            else{
                numeralResultado += numerais.get(s.charAt(i));
            }
        }

        return numeralResultado;
    }
}
