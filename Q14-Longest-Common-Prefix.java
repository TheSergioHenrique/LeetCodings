class Solution {
    public String longestCommonPrefix(String[] strs) {       
        //Array de suporte, a que dará a resposta da questão.
        String sup= strs[0];
        for(int i=0;i<strs.length;i++){
            //Entramos nos valores das arrays agora! se temos a array ["potigua","ponto","porta"], se i for 2, ele entrará em "porta"!
            while (strs[i].indexOf(sup) != 0){
                //a nossa array de suporte pega, digamos, "potigua" e  vai iterar com todas as arrays. caso todas elas tenham o mesmo prefixo, perfeito! será potigua! porém, caso seja "ponto", ele só irá encontrar "po" de prefixo comum. e essa linha abaixo é responsável por esse funcionamento.Bacana né?
                sup = sup.substring(0,sup.length() - 1);
            }
        }
        return sup;
    }
}
