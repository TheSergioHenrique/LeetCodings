//Runtime: 2 ms, faster than 98.92% of Java online submissions for Reverse Vowels of a String.
//Primeiro, Irei converter a string de entrada s em um array de caracteres para facilitar a manipulação dos caracteres. Strings em java são imutáveis.
class Solution {
    public String reverseVowels(String s) {
        char[] resultadoVogais = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j){
            //vamos rodar duas leituras ao mesmo tempo. Dentro do loop, Verificamos se o caractere na posição i é uma vogal com a função TestarVogal(resultadoVogais[i]). Se não for uma vogal,incremento i e passo para a próxima iteração do loop.
            //Você faz o mesmo para o caractere na posição j. Se não for uma vogal, você decrementa j e passa para a próxima iteração do loop.
                i++;
                continue;
            }
            if(!TestarVogal(resultadoVogais[j])){
                j--;
                continue;
            }
            //Se ambos os caracteres nas posições i e j são vogais, troco esses caracteres. Declaro uma variável temporária temp para guardar o valor de resultadoVogais[i], atribuo resultadoVogais[j] a resultadoVogais[i], e então atribuo temp a resultadoVogais[j]. Depois disso, incremento i e decremento j para mover para a próxima posição.
            if(!TestarVogal(resultadoVogais[i])){
            char temp = resultadoVogais[i];
            resultadoVogais[i++] = resultadoVogais[j];
            resultadoVogais[j--] = temp;
        }
        return new String(resultadoVogais);
    }
    
    private static boolean TestarVogal(char c) {  
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';  
    }  
}
