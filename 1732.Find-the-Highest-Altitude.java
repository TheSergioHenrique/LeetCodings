//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Highest Altitude.
class Solution {
    public int largestAltitude(int[] gain) {
        //A altitude inicial do Ciclista é 0;E nósTemos de armazenar qual foi a maior altura que ele alcançou.
        int alturaAtual=0;
        int maiorAltura = alturaAtual;
        
        //vamos usar um for-each para iterar todos os valores da array gain.
        for (int ganhoDeAltura : gain){
            alturaAtual+=ganhoDeAltura;
            //Atualiza a maior altura.
           if (alturaAtual > maiorAltura) {
                maiorAltura = alturaAtual;
            }
        }
        return maiorAltura;
        //Fim! :D
    }
}
