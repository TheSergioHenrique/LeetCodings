class Solution {
    public int maximumWealth(int[][] accounts) {
      /*Nessa questão, recebemos uma Array MxN, onde Accounts[i][j] é a quantidade de dinheiro que o cliente I tem no banco J.
      Assim, devemos retornar quanto dinheiro o cliente mais rico tem.
      1.Sendo assim, podemos começar uma resolução satisfatória! definimos um int para o RESULTADO e um int de suporte, que decidi
      chamar de RUNNER.
      2.Criamos 2 'for'. O primeiro irá garantir que cada cliente seja visto pelo programa,
      e o segundo irá garantir que cada valor, em cada banco, seja verificado e somado a nosso RUNNER!
      3.Assim, caso o Runner tenha um montante maior do que o armazenado no int RESULTADO, este montante vira o novo resultado!
      4. Caso não tenham valores superiores nos próximos testcases, Bingo! acertamos a questão.
      */
        int resultado=0;
        int runner=0;
        for (int i=0;i<accounts.length;i++){
          runner=0;
          for(int j=0;j<accounts[i].length;j++){
            runner+=accounts[i][j];
          }
          if(resultado<runner){
            resultado=runner;
            }
        }
    return resultado;
    }
}
