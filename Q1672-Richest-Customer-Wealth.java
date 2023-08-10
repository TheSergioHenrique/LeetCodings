class Solution {
    public int maximumWealth(int[][] accounts) {
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
