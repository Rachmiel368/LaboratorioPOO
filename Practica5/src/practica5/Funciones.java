/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;


/**
 *
 * @author rachm
 */
public class Funciones {
    
    
    public int getVocales(String cad)
    {
        
        char[] vocales = {'a','e','i','o','u'};
        int v=0;
        int j;
        for(int i=0;i<cad.length();i++){
            for(j=0;j<5;j++)
            {
                if(cad.charAt(i)==vocales[j]){
                v++;
                }
            }
        }
        return v;
    }
    
  
    public int contarMayusculas(String cad) {
      int contador = 0;
      for (int i = 0; i < cad.length(); i++) {
        char c = cad.charAt(i);
        if (Character.isUpperCase(c)) {
          contador++;
        }
      }
      return contador;
    }

    public int contarMinusculas(String cad) {
      int contador = 0;
      for (int i = 0; i < cad.length(); i++) {
        char c = cad.charAt(i);
        if (Character.isLowerCase(c)) {
          contador++;
        }
      }
      return contador;
    }
    
    
    public void reverseStr(String cad)
    {
        
        for(int i=cad.length()-1;i>=0;i--)
            System.out.print(cad.charAt(i));
    }
    
    
    public int incidenciaStr(String cad, String valor)
    {
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) 
        {
            if (cad.charAt(i) == valor.charAt(0))
            cont++;
        }
        return cont;
    }
    
    
    public void dividirStr(String cad, String valor)
    {
        int i=0;
        System.out.print("\"");
        while(cad.charAt(i)!=valor.charAt(0))
        {
            System.out.print(cad.charAt(i));
            i++;
        }
        System.out.print("\" ");
        i++;
        System.out.print(" \"");
        
        while(i<cad.length())
        {
            System.out.print(cad.charAt(i));
            i++;
        }
        System.out.print("\"");
    }
    
    
    public String reemplazarValorEnCadena(String cadena, String valor1, String valor2) 
    {
        String resultado = cadena.replace(valor1, valor2);
        return resultado;
    }
    
    
}
