import java.awt.Color;

public class test {
   public static final int AMARILLO = new Color(250,201,20).getRGB();
   public static final int AZUL = new Color(17,13,99).getRGB();
   public static final int ROJO = new Color(196,0,15).getRGB();
   public static final int NEGRO = new Color(5,5,5).getRGB();
   public static final int BLANCO = new Color (255,255,255).getRGB();
   public static final int VERDE = new Color(35,138,51).getRGB();
    public static void main(String[] args) {
     
           int altura = 12; 
           int ancho = 20;
           JOptionPaneArrays.showColorArray2D(null, banderaCol(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaVEN(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaPOL(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaPAN(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaCHL(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaEEUU(altura, ancho));
           JOptionPaneArrays.showColorArray2D(null, banderaCZE(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaDNK(altura, ancho));
           JOptionPaneArrays.showColorArray2D(null, banderaFIN(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaNOR(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaKWT(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaZAF(altura, ancho)); 
           JOptionPaneArrays.showColorArray2D(null, banderaCHE(altura, ancho)); 
        }

    public static int [][] banderaCol(int altura, int ancho){ 

        int[][] bandera = new int[altura][ancho];
        int filaIni = 0, filaFin = 0, colIni = 0, colFin = 0;

        filaIni = (altura*0)/4; 
        filaFin = (altura*2)/4;
        colIni = (ancho*0)/1; 
        colFin = (ancho*1)/1;

        for (int r = filaIni; r < filaFin; r++)
         for (int c = colIni; c < colFin; c++){
            bandera[r][c] = AMARILLO;
         } 

        filaIni = (altura*2)/4; 
        filaFin = (altura*3)/4;
        for (int r = filaIni; r < filaFin; r++)
         for (int c = colIni; c < colFin; c++){
            bandera[r][c] = AZUL;
         } 
        
        filaIni = (altura*3)/4; 
        filaFin = (altura*4)/4;
        for (int r = filaIni; r < filaFin; r++)
         for (int c = colIni; c < colFin; c++){
            bandera[r][c] = ROJO;
         }    
         
    return bandera;

    }

    public static int [][] banderaVEN(int altura, int ancho){ 
        int[][] bandera = new int[altura][ancho];
        int filaIni = 0, filaFin = 0, colIni = 0, colFin = 0;

        filaIni = (altura*0)/3; 
        filaFin = (altura*1)/3;
        colIni = (ancho*0)/1; 
        colFin = (ancho*1)/1;

        for (int r = filaIni; r < filaFin; r++)
         for (int c = colIni; c < colFin; c++){
            bandera[r][c] = AMARILLO;
         } 

        filaIni = (altura*1)/3; 
        filaFin = (altura*2)/3;
        for (int r = filaIni; r < filaFin; r++)
         for (int c = colIni; c < colFin; c++){
            bandera[r][c] = AZUL;
         } 
      
        filaIni = (altura*2)/3; 
        filaFin = (altura*3)/3;
        for (int r = filaIni; r < filaFin; r++)
         for (int c = colIni; c < colFin; c++){
            bandera[r][c] = ROJO;
         }    
       
      return bandera;

    }

  
  public static int [][] banderaPOL(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
   int filaIni = 0, filaFin = 0, colIni = 0, colFin = 0;

   filaIni = (altura*0)/2; 
   filaFin = (altura*1)/2;
   colIni = (ancho*0)/1; 
   colFin = (ancho*1)/1;

   for (int r = filaIni; r < filaFin; r++)
    for (int c = colIni; c < colFin; c++){
       bandera[r][c] = BLANCO;
    } 

   filaIni = (altura*1)/2; 
   filaFin = (altura*2)/2;
   for (int r = filaIni; r < filaFin; r++)
    for (int c = colIni; c < colFin; c++){
       bandera[r][c] = ROJO;
    }    
    
return bandera;

}

public static int [][] banderaPAN(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
   int filaIni = 0, filaFin = 0, colIni = 0, colFin = 0;

   filaIni = (altura*0)/2; 
   filaFin = (altura*1)/2;
   colIni = (ancho*0)/2; 
   colFin = (ancho*1)/2; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = BLANCO;
   } 

   filaIni = (altura*0)/2; 
   filaFin = (altura*1)/2;
   colIni = (ancho*1)/2; 
   colFin = (ancho*2)/2; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = ROJO;
   } 
   
   filaIni = (altura*1)/2; 
   filaFin = (altura*2)/2;
   colIni = (ancho*0)/2; 
   colFin = (ancho*1)/2; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = AZUL;
   } 

   filaIni = (altura*1)/2; 
   filaFin = (altura*2)/2;
   colIni = (ancho*1)/2; 
   colFin = (ancho*2)/2; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = BLANCO;
   } 

   return bandera; 

}

public static int [][] banderaCHL(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
   int filaIni = 0, filaFin = 0, colIni = 0, colFin = 0;

   filaIni = (altura*0)/2; 
   filaFin = (altura*1)/2;
   colIni = (ancho*0)/20; 
   colFin = (ancho*6)/20; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = AZUL;
   }

   filaIni = (altura*0)/2; 
   filaFin = (altura*1)/2;
   colIni = (ancho*6)/20; 
   colFin = (ancho*20)/20; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = BLANCO;
   }

   filaIni = (altura*1)/2; 
   filaFin = (altura*2)/2;
   colIni = (ancho*0)/20; 
   colFin = (ancho*20)/20; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = ROJO;
   }
   return bandera;  
}

public static int [][] banderaEEUU(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
   int filaIni = 0, filaFin = 0, colIni = 0, colFin = 0;

   for (int i = 0; i < altura; i++) { 
      if (i % 2 == 0) {
          // Franjas blancas
          for (int c = 0; c < ancho; c++) { 
              bandera[i][c] = ROJO;
          }
      } else {
          // Franjas rojas
          for (int c = 0; c < ancho; c++) {
              bandera[i][c] = BLANCO;
          }
      }
  }
       
   filaIni = (altura*0)/2; 
   filaFin = (altura*1)/2;
   colIni = (ancho*0)/20; 
   colFin = (ancho*6)/20; 

   for (int r = filaIni; r < filaFin; r++)
   for (int c = colIni; c < colFin; c++){
      bandera[r][c] = AZUL;
   }
   return bandera; 
}

public static int [][] banderaCZE(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
  
   int ix = 0;
   for (int i = 0; i < altura; i++) { 
      if (i < altura/2) {
          for (int c = 0; c < ancho; c++) { 
              bandera[i][c] = BLANCO;
          }
      } else {
          for (int c = 0; c < ancho; c++) {
              bandera[i][c] = ROJO;
          }
      }

     
  }
 
  for (int i = 0; i < altura; i++) { 
   
  
  if (i < 6){
   ix ++;
   for (int c = 0; c < ix; c++) {
      bandera[i][c] = AZUL;
      
  } 
  } 
  else {
   ix--;
    for (int c = 0; c <= ix; c++) {
     
      bandera[i][c] = AZUL;
       
   } 
  }

}


      return bandera; 
      }      
     
  
public static int [][] banderaDNK(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
  
   for (int i = 0; i < altura; i++) { 
      
          
          for (int c = 0; c < ancho; c++) { 
            if(c == 5 || c == 6){
            bandera[i][c] = BLANCO;
         } else {
            bandera[i][c] = ROJO;
           
        }   
            if (i == 5 || i == 6) {
               bandera[i][c] = BLANCO;  
            } 

          }
    

     
  }
  return bandera;
}

public static int [][] banderaFIN(int altura, int ancho){ 
   int[][] bandera = new int[altura][ancho];
  
   for (int i = 0; i < altura; i++) { 
      
          
          for (int c = 0; c < ancho; c++) { 
            if(c == 5 || c == 6){
            bandera[i][c] = AZUL;
         } else {
            bandera[i][c] = BLANCO;
           
        }   
            if (i == 5 || i == 6) {
               bandera[i][c] = AZUL;  
            } 

          }
    

     
  }
  return bandera;
}

 //BANDERA NOR

 public static int [][] banderaNOR(int height, int width){ 
   int[][] flag = new int[height][width];
  
   for (int i = 0; i < height; i++) { 
      
          
          for (int c = 0; c < width; c++) { 
         
            if (c == 4 || c == 7) {
               flag[i][c] = BLANCO;
           } else if (c == 5 || c == 6) {
               flag[i][c] = AZUL;
           }else {
            //PARTE ROJA
            flag[i][c] = ROJO;
           
        }   
            if (i >= 4 && c != 5 && i <= 7 && c != 6) {
               flag[i][c] = BLANCO;
              
            } if (i == 5 || i ==6){
               flag[i][c] = AZUL;
            }  
           

          }
     
  }
  return flag;
   }



public static int [][] banderaKWT(int height, int width){ 
int[][] flag = new int[height][width];


int ix = 0;

for (int i = 0; i < height; i++) { 
   if (i < height/3) {
       
       for (int c = 0; c < width; c++) { 
           flag[i][c] = VERDE;
       } 
   }else if (i < height*2/3) {
      for (int c = 0; c < width; c++) { 
         flag[i][c] = BLANCO;
    } 
   } else {
       
       for (int c = 0; c < width; c++) {
           flag[i][c] = ROJO;
       }
   }

  
}

for (int i = 0; i < height; i++) { 


if (i < 6){
ix ++;
for (int c = 0; c < ix; c++) {
   flag[i][c] = NEGRO;
   
} 
} 
else {
ix--;
 for (int c = 0; c <= ix; c++) {
  
   flag[i][c] = NEGRO;
    
} 
}

}


   return flag; 
   }      
  


public static int [][] banderaZAF(int height, int width){ 
int[][] flag = new int[height][width];


int ix = 1;

for (int i = 0; i < height; i++) { 
   if (i < height/3) {
       
       for (int c = 0; c < width; c++) { 
           flag[i][c] = ROJO;
       } 
   }else if (i < height*2/3) {
      for (int c = 0; c < width; c++) { 
         flag[i][c] = BLANCO;
         if (i >= 5 && i <= 6) { 
            flag[i][c] = VERDE;
          }
    } 
   } else {
       // Franjas rojas
       for (int c = 0; c < width; c++) {
           flag[i][c] = AZUL;
       }
   }

  
}

for (int i = 0; i < height; i++) { 


if (i < 6){
ix ++;
for (int c = 0; c < ix; c++) {
   flag[i][c] = VERDE;
   if (c == ix-1 && c != 6) { 
      flag[i][c] = BLANCO;
    }
} 
}

else {
ix--;
 for (int c = 0; c <= ix; c++) {
  
   flag[i][c] = VERDE;
   if (c == ix && c != 6) { 
      flag[i][c] = BLANCO;
    }
    
} 
}

}



int ij = 0;

for (int i = 0; i < height; i++){

if (i < 6 && i > 1  ) {
ij ++;
for (int c = 0; c < ij && c < 4; c++) {
   flag[i][c] = NEGRO;
   if (c == ij-1 || c == 0 && i == 2 || c == 4) { 
      flag[i][c] = AMARILLO;
    }
} 
}else if (i > 5 && i < 10) {
for (int c = 0; c < ij && c < 4; c++) {
   flag[i][c] = NEGRO;
   if (c == ij-1 || c == 0 && i == 2 || c == 4) { 
      flag[i][c] = AMARILLO;
    }
}ij --;
}


}

   return flag; 
   }


   //BANDERA CHE

public static int [][] banderaCHE(int height, int width){ 
   int[][] flag = new int[height][width];
  
   for (int i = 0; i < height; i++) { 
      
          
          for (int c = 0; c < width; c++) { 
            //columanas 5 y 6 blancas
            if(i != 0 && i != 11 && c >= 8 && c <= 11){
            flag[i][c] = BLANCO;
         } else {
            //PARTE ROJA
            flag[i][c] = ROJO;
           
        }   // filas 5 y 6 blancas
            if (c >= 5 && c <= 14 && i >= 4 && i <= 7) {
               flag[i][c] = BLANCO;  
            } 

          }
     
  }
  return flag;
   }

}