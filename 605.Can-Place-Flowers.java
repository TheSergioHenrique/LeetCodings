//Runtime: 1 ms, faster than 96.67% of Java online submissions for Can Place Flowers.
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        //Basicamente nós temos uma situação aqui: Vamos percorrer uma array; E essa array é preenchida por valores 0 e 1.
        //Com isso, queremos saber se tem, em um elemento qualquer, espaços adjacentes livres /0 na posição n-1, 0 na posição n+1/. E assim, podemos decrementar de N para descobrir se servirá ou não.
        int comparacao = flowerbed.length;
        int ultimoValor;
        int proximoValor;
        
        //para lidar com um possivel caso de erro.
        if (flowerbed.length == 0 || n <= 0) return true;
        
        
        for (int i = 0; i < flowerbed.length; i++){
            // Se o valor atual na array 'flowerbed' for 1, o loop continua para a próxima iteração.
            if (flowerbed[i]==1)continue;
            // A variável 'ultimoValor' armazena o valor anterior na array 'flowerbed' ou 0 se o índice atual for 0.
            if (i==0){
                ultimoValor=0;
            }else{
                ultimoValor = flowerbed [i-1];
            }
            // A variável 'proximoValor' armazena o próximo valor na array 'flowerbed' ou 0 se o índice atual for o último índice. fazemos o comparacao-1 para não lidar com um outOfBounds.
            if (i == comparacao-1){
                proximoValor=0;
            }else{
                proximoValor = flowerbed [i+1];
            }
            
            // Se tanto 'ultimoValor' quanto 'proximoValor' forem 0, o valor atual na array 'flowerbed' é definido como 1 e 'n' é decrementado.
            if (ultimoValor == 0 && proximoValor == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n <= 0) return true;
        }
            
        return false;
        }
}
